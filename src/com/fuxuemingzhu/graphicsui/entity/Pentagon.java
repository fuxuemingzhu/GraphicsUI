package com.fuxuemingzhu.graphicsui.entity;

import com.fuxuemingzhu.graphicsui.contants.Contants;
import com.fuxuemingzhu.graphicsui.graphs.Graphs;

/**
 * <p>
 * Title: Pentagon
 * </p>
 * <p>
 * Description:���������
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014��10��27�� ����11:51:00
 */
public class Pentagon extends Graphs {

	/**
	 * ������α߳�
	 */
	private float a;

	/**
	 * <p>
	 * Title: Pentagon
	 * </p>
	 * <p>
	 * Description:���췽��������������εı߳����������
	 * </p>
	 * 
	 * @param a
	 */
	public Pentagon(float a) {
		super();
		this.a = a;
	}

	/**
	 * ���� Javadoc��
	 * <p>
	 * Title: calculateLenth
	 * </p>
	 * <p>
	 * Description:����������ε��ܳ�
	 * </p>
	 * 
	 * @return ͼ���ܳ�
	 * @see com.fuxuemingzhu.graphs.graphs.Graphs#calculateLenth()
	 */
	public float calculateLenth() {
		/* ������ε��ܳ���ʽ */
		float lenth = 5 * a;
		return lenth;
	}

	/**
	 * ���� Javadoc��
	 * <p>
	 * Title: calculateSize
	 * </p>
	 * <p>
	 * Description:����������ε����
	 * </p>
	 * 
	 * @return ͼ�����
	 * @see com.fuxuemingzhu.graphs.graphs.Graphs#calculateSize()
	 */
	public float calculateSize() {
		// ������ε������ʽ
		float size = (float) (Contants.MULTIPLES * Math.pow(a, 2));
		return size;
	}

	/**
	 * @return the a
	 */
	public float getA() {
		return a;
	}

	/**
	 * @param a
	 *            the a to set
	 */
	public void setA(float a) {
		this.a = a;
	}

}
