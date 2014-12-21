package com.fuxuemingzhu.graphicsui.entity;

import com.fuxuemingzhu.graphicsui.graphs.Graphs;

/**
 * <p>
 * Title: Triangle
 * </p>
 * <p>
 * Description: ��������
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014��10��27�� ����11:47:38
 */
public class Triangle extends Graphs {

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
	 * <p>
	 * Title: Triangle
	 * </p>
	 * <p>
	 * Description:�������εĵĹ�����
	 * </p>
	 * 
	 * @param a
	 */
	public Triangle(float a) {
		super();
		this.a = a;
		this.b = a;
		this.c = a;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:һ�������εĹ��췽�����������ߵı߳�
	 * </p>
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public Triangle(float a, float b, float c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * ���� Javadoc��
	 * <p>
	 * Title: calculateLenth
	 * </p>
	 * <p>
	 * Description:���������ε��ܳ�
	 * </p>
	 * 
	 * @return ͼ���ܳ�
	 * @see com.fuxuemingzhu.graphs.graphs.Graphs#calculateLenth()
	 */
	public float calculateLenth() {
		// �����ε��ܳ���ʽ
		float lenth = a + b + c;
		return lenth;
	}

	/**
	 * ���� Javadoc��
	 * <p>
	 * Title: calculateSize
	 * </p>
	 * <p>
	 * Description:���������ε����
	 * </p>
	 * 
	 * @return ͼ�����
	 * @see com.fuxuemingzhu.graphs.graphs.Graphs#calculateSize()
	 */
	public float calculateSize() {
		// �����ε������ʽ�����׹�ʽ��
		float p = (a + b + c) / 2;

		float size = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
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

	/**
	 * @return the b
	 */
	public float getB() {
		return b;
	}

	/**
	 * @param b
	 *            the b to set
	 */
	public void setB(float b) {
		this.b = b;
	}

	/**
	 * @return the c
	 */
	public float getC() {
		return c;
	}

	/**
	 * @param c
	 *            the c to set
	 */
	public void setC(float c) {
		this.c = c;
	}

}
