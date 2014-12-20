package com.fuxuemingzhu.graphicsui.entity;

import com.fuxuemingzhu.graphicsui.contants.Contants;
import com.fuxuemingzhu.graphicsui.graphs.Graphs;

/**
 * <p>
 * Title: Circle
 * </p>
 * <p>
 * Description:圆形类
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014年10月27日 下午11:49:53
 */
public class Circle extends Graphs {

	/**
	 * 圆的半径
	 */
	private float r;

	/**
	 * <p>
	 * Title: Circle
	 * </p>
	 * <p>
	 * Description:构造方法，根据圆的半径构造圆
	 * </p>
	 * 
	 * @param r
	 */
	public Circle(float r) {
		super();
		this.r = r;
	}

	/**
	 * （非 Javadoc）
	 * <p>
	 * Title: calculateLenth
	 * </p>
	 * <p>
	 * Description:计算圆的周长
	 * </p>
	 * 
	 * @return 图形周长
	 * @see com.fuxuemingzhu.graphicsui.graphs.Graphs#calculateLenth()
	 */
	public float calculateLenth() {
		// 圆的周长公式
		float lenth = (float) (2 * Contants.PI * r);
		return lenth;
	}

	/**
	 * （非 Javadoc）
	 * <p>
	 * Title: calculateSize
	 * </p>
	 * <p>
	 * Description:计算圆的面积
	 * </p>
	 * 
	 * @return 图形面积
	 * @see com.fuxuemingzhu.graphicsui.graphs.Graphs#calculateSize()
	 */
	public float calculateSize() {
		// 圆的面积公式
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
