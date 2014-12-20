package com.fuxuemingzhu.graphicsui.entity;

import com.fuxuemingzhu.graphicsui.contants.Contants;
import com.fuxuemingzhu.graphicsui.graphs.Graphs;

/**
 * <p>
 * Title: Circle
 * </p>
 * <p>
 * Description:Բ����
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014��10��27�� ����11:49:53
 */
public class Circle extends Graphs {

	/**
	 * Բ�İ뾶
	 */
	private float r;

	/**
	 * <p>
	 * Title: Circle
	 * </p>
	 * <p>
	 * Description:���췽��������Բ�İ뾶����Բ
	 * </p>
	 * 
	 * @param r
	 */
	public Circle(float r) {
		super();
		this.r = r;
	}

	/**
	 * ���� Javadoc��
	 * <p>
	 * Title: calculateLenth
	 * </p>
	 * <p>
	 * Description:����Բ���ܳ�
	 * </p>
	 * 
	 * @return ͼ���ܳ�
	 * @see com.fuxuemingzhu.graphicsui.graphs.Graphs#calculateLenth()
	 */
	public float calculateLenth() {
		// Բ���ܳ���ʽ
		float lenth = (float) (2 * Contants.PI * r);
		return lenth;
	}

	/**
	 * ���� Javadoc��
	 * <p>
	 * Title: calculateSize
	 * </p>
	 * <p>
	 * Description:����Բ�����
	 * </p>
	 * 
	 * @return ͼ�����
	 * @see com.fuxuemingzhu.graphicsui.graphs.Graphs#calculateSize()
	 */
	public float calculateSize() {
		// Բ�������ʽ
		float size = (float) (Contants.PI * Math.pow(r, 2));
		return size;
	}

	/**
	 * @return the r
	 */
	public float getR() {
		return r;
	}

	/**
	 * @param r
	 *            the r to set
	 */
	public void setR(float r) {
		this.r = r;
	}

}
