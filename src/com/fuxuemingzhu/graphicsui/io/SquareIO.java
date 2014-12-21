/**
 * <p>Title: SquareIO.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014年12月21日  下午4:22:43
 * @version 1.0
 */
package com.fuxuemingzhu.graphicsui.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

import com.fuxuemingzhu.graphicsui.entity.Square;

/**
 * <p>
 * Title: SquareIO
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014年12月21日 下午4:22:43
 */
public class SquareIO {

	/**
	 * path 文件路径字符串
	 */
	public static String path;
	/**
	 * r 边长r
	 */
	public static float r;

	/**
	 * square 对象正方形
	 */
	public static Square square;

	/**
	 * <p>
	 * Title:AnswerIO
	 * </p>
	 * <p>
	 * Description:文件的输出
	 * </p>
	 * 
	 * @param path
	 * @param r
	 */
	public SquareIO(String path, float r) {
		super();
		SquareIO.path = path;
		SquareIO.r = r;
		square = new Square(r);
	}

	/**
	 * <p>
	 * Title: writeFile
	 * </p>
	 * <p>
	 * Description:写入文件
	 * </p>
	 * 
	 * @param str
	 *            要保存的内容
	 * @param savePath
	 *            保存的文件路径
	 * @throws Exception
	 *             找不到路径
	 * 
	 */
	public void writeFile() throws Exception {
		String str = "正方形的边长为:" + square.getA() + "\n正方形的周长为:"
				+ square.calculateLenth() + "\n正方形的面积为:"
				+ square.calculateSize();
		System.out.println(str + "\n");
		System.out.println("txt保存路径是：" + path);
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		System.out.println("txt创建成功！");
		bw.write(str);
		System.out.println("文本内容存储到txt中成功！");
		bw.close();

	}

}
