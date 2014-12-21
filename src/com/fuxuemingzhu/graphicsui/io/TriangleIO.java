/**
 * <p>Title: TriangleIO.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014年12月21日  下午4:22:53
 * @version 1.0
 */
package com.fuxuemingzhu.graphicsui.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

import com.fuxuemingzhu.graphicsui.entity.Triangle;

/**
 * <p>
 * Title: TriangleIO
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014年12月21日 下午4:22:53
 */
public class TriangleIO {

	/**
	 * path 文件路径字符串
	 */
	public static String path;
	/**
	 * a 三角形的第一条边
	 */
	private float a;
	/**
	 * b 三角形的第二条边
	 */
	private float b;
	/**
	 * c 三角形的第三条边
	 */
	private float c;
	/**
	 * triangle 对象三角形
	 */
	public static Triangle triangle;

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
	public TriangleIO(String path, float a, float b, float c) {
		super();
		TriangleIO.path = path;
		this.a = a;
		this.b = b;
		this.c = c;
		triangle = new Triangle(a, b, c);
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
		String str = "三角形的边长分别为:" + triangle.getA() + "," + triangle.getB()
				+ "," + triangle.getC() + "\n三角形的周长为:"
				+ triangle.calculateLenth() + "\n三角形的面积为:"
				+ triangle.calculateSize();
		System.out.println(str + "\n");
		System.out.println("txt保存路径是：" + path);
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		System.out.println("txt创建成功！");
		bw.write(str);
		System.out.println("文本内容存储到txt中成功！");
		bw.close();

	}

}
