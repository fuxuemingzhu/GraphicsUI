/**
 * <p>Title: SquareIO.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014��12��21��  ����4:22:43
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
 * @date 2014��12��21�� ����4:22:43
 */
public class SquareIO {

	/**
	 * path �ļ�·���ַ���
	 */
	public static String path;
	/**
	 * r �߳�r
	 */
	public static float r;

	/**
	 * square ����������
	 */
	public static Square square;

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
		String str = "�����εı߳�Ϊ:" + square.getA() + "\n�����ε��ܳ�Ϊ:"
				+ square.calculateLenth() + "\n�����ε����Ϊ:"
				+ square.calculateSize();
		System.out.println(str + "\n");
		System.out.println("txt����·���ǣ�" + path);
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		System.out.println("txt�����ɹ���");
		bw.write(str);
		System.out.println("�ı����ݴ洢��txt�гɹ���");
		bw.close();

	}

}
