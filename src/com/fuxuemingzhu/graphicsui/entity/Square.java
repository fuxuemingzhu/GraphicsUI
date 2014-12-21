package com.fuxuemingzhu.graphicsui.entity;

import com.fuxuemingzhu.graphicsui.graphs.Graphs;

/**
 * <p>
 * Title: Square
 * </p>
 * <p>
 * Description:正方形类
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014年10月27日 下午11:48:49
 */
public class Square extends Graphs {

	/**
	 * a 正方形的边长
	 */
	private float a;

	/**
	 * <p>
	 * Title: Square
	 * </p>
	 * <p>
	 * Description:构造方法，根据正方形的边长构造正方形
	 * </p>
	 * 
	 * @param a
	 */
	public Square(float a) {
		super();
		this.a = a;
	}

	/**
	 * （非 Javadoc）
	 * <p>
	 * Title: calculateLenth
	 * </p>
	 * <p>
	 * Description:计算正方形的周长
	 * </p>
	 * 
	 * @return 图形周长
	 * @see com.fuxuemingzhu.graphs.graphs.Graphs#calculateLenth()
	 */
	public float calculateLenth() {
		// 正方形的周长公式
		float lenth = 4 * a;
		return lenth;
	}

	/**
	 * （非 Javadoc）
	 * <p>
	 * Title: calculateSize
	 * </p>
	 * <p>
	 * Description:计算正方形的面积
	 * </p>
	 * 
	 * @return 图形面积
	 * @see com.fuxuemingzhu.graphs.graphs.Graphs#calculateSize()
	 */
	public float calculateSize() {
		// 正方形的面积公式
		float size = (float) Math.pow(a, 2);
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
