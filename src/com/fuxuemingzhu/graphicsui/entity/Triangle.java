package com.fuxuemingzhu.graphicsui.entity;

import com.fuxuemingzhu.graphicsui.graphs.Graphs;

/**
 * <p>
 * Title: Triangle
 * </p>
 * <p>
 * Description: 三角形类
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014年10月27日 下午11:47:38
 */
public class Triangle extends Graphs {

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
	 * <p>
	 * Title: Triangle
	 * </p>
	 * <p>
	 * Description:正三角形的的构造器
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
	 * Description:一般三角形的构造方法，传入三边的边长
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
	 * （非 Javadoc）
	 * <p>
	 * Title: calculateLenth
	 * </p>
	 * <p>
	 * Description:计算三角形的周长
	 * </p>
	 * 
	 * @return 图形周长
	 * @see com.fuxuemingzhu.graphs.graphs.Graphs#calculateLenth()
	 */
	public float calculateLenth() {
		// 三角形的周长公式
		float lenth = a + b + c;
		return lenth;
	}

	/**
	 * （非 Javadoc）
	 * <p>
	 * Title: calculateSize
	 * </p>
	 * <p>
	 * Description:计算三角形的面积
	 * </p>
	 * 
	 * @return 图形面积
	 * @see com.fuxuemingzhu.graphs.graphs.Graphs#calculateSize()
	 */
	public float calculateSize() {
		// 三角形的面积公式（海伦公式）
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
