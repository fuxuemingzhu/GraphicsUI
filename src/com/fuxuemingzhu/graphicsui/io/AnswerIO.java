/**
 * <p>Title: AnswerIO.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014年12月18日  下午11:55:05
 * @version 1.0
 */
package com.fuxuemingzhu.graphicsui.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

import com.fuxuemingzhu.graphicsui.entity.Circle;

/**
 * <p>
 * Title: AnswerIO
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014年12月18日 下午11:55:05
 */
public class AnswerIO {
	/**
	 * path 文件路径字符串
	 */
	public static String path;
	/**
	 * r 半径r
	 */
	public static float r;

	/**
	 * circle 对象圆
	 */
	public static Circle circle;

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
	public AnswerIO(String path, float r) {
		super();
		AnswerIO.path = path;
		AnswerIO.r = r;
		circle = new Circle(r);
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
		String str = "圆的半径为:" + circle.getR() + "\n圆的周长为:"
				+ circle.calculateLenth() + "\n圆的面积为:" + circle.calculateSize();
		System.out.println(str + "\n");
		System.out.println("txt保存路径是：" + path);
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		System.out.println("txt创建成功！");
		bw.write(str);
		System.out.println("文本内容存储到txt中成功！");
		bw.close();

	}
}
