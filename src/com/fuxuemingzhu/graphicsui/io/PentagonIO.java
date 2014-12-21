/**
 * <p>Title: PentagonIO.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014��12��21��  ����4:22:33
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
 * @date 2014��12��21�� ����4:22:33
 */
public class PentagonIO {

	/**
	 * path �ļ�·���ַ���
	 */
	public static String path;
	/**
	 * r �߳�r
	 */
	public static float r;

	/**
	 * pentagon ���������
	 */
	public static Pentagon pentagon;

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
		String str = "����εı߳�Ϊ:" + pentagon.getA() + "\n����ε��ܳ�Ϊ:"
				+ pentagon.calculateLenth() + "\n����ε����Ϊ:"
				+ pentagon.calculateSize();
		System.out.println(str + "\n");
		System.out.println("txt����·���ǣ�" + path);
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		System.out.println("txt�����ɹ���");
		bw.write(str);
		System.out.println("�ı����ݴ洢��txt�гɹ���");
		bw.close();

	}

}
