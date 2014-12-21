/**
 * <p>Title: PentagonIO.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014年12月21日  下午4:22:33
 * @version 1.0
 */
package com.fuxuemingzhu.graphicsui.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

import com.fuxuemingzhu.graphicsui.entity.Pentagon;

/**
 * <p>
 * Title: PentagonIO
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014年12月21日 下午4:22:33
 */
public class PentagonIO {

	/**
	 * path 文件路径字符串
	 */
	public static String path;
	/**
	 * r 边长r
	 */
	public static float r;

	/**
	 * pentagon 对象五边形
	 */
	public static Pentagon pentagon;

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
	public PentagonIO(String path, float r) {
		super();
		PentagonIO.path = path;
		PentagonIO.r = r;
		pentagon = new Pentagon(r);
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
		String str = "五边形的边长为:" + pentagon.getA() + "\n五边形的周长为:"
				+ pentagon.calculateLenth() + "\n五边形的面积为:"
				+ pentagon.calculateSize();
		System.out.println(str + "\n");
		System.out.println("txt保存路径是：" + path);
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		System.out.println("txt创建成功！");
		bw.write(str);
		System.out.println("文本内容存储到txt中成功！");
		bw.close();

	}

}
