/**
 * <p>Title: TriangleIO.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014��12��21��  ����4:22:53
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
 * @date 2014��12��21�� ����4:22:53
 */
public class TriangleIO {

	/**
	 * path �ļ�·���ַ���
	 */
	public static String path;
	/**
	 * a �����εĵ�һ����
	 */
	private float a;
	/**
	 * b �����εĵڶ�����
	 */
	private float b;
	/**
	 * c �����εĵ�������
	 */
	private float c;
	/**
	 * triangle ����������
	 */
	public static Triangle triangle;

	/**
	 * <p>
	 * Title:AnswerIO
	 * </p>
	 * <p>
	 * Description:�ļ������
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
	 * Description:д���ļ�
	 * </p>
	 * 
	 * @param str
	 *            Ҫ���������
	 * @param savePath
	 *            ������ļ�·��
	 * @throws Exception
	 *             �Ҳ���·��
	 * 
	 */
	public void writeFile() throws Exception {
		String str = "�����εı߳��ֱ�Ϊ:" + triangle.getA() + "," + triangle.getB()
				+ "," + triangle.getC() + "\n�����ε��ܳ�Ϊ:"
				+ triangle.calculateLenth() + "\n�����ε����Ϊ:"
				+ triangle.calculateSize();
		System.out.println(str + "\n");
		System.out.println("txt����·���ǣ�" + path);
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		System.out.println("txt�����ɹ���");
		bw.write(str);
		System.out.println("�ı����ݴ洢��txt�гɹ���");
		bw.close();

	}

}
