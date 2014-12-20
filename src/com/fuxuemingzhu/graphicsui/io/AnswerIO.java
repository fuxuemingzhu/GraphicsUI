/**
 * <p>Title: AnswerIO.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014��12��18��  ����11:55:05
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
 * @date 2014��12��18�� ����11:55:05
 */
public class AnswerIO {
	/**
	 * path �ļ�·���ַ���
	 */
	public static String path;
	/**
	 * r �뾶r
	 */
	public static float r;

	/**
	 * circle ����Բ
	 */
	public static Circle circle;

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
		String str = "Բ�İ뾶Ϊ:" + circle.getR() + "\nԲ���ܳ�Ϊ:"
				+ circle.calculateLenth() + "\nԲ�����Ϊ:" + circle.calculateSize();
		System.out.println(str + "\n");
		System.out.println("txt����·���ǣ�" + path);
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		System.out.println("txt�����ɹ���");
		bw.write(str);
		System.out.println("�ı����ݴ洢��txt�гɹ���");
		bw.close();

	}
}
