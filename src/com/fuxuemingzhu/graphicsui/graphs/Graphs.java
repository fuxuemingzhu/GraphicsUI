package com.fuxuemingzhu.graphicsui.graphs;

/**
 * <p>
 * Title: Graphs
 * </p>
 * <p>
 * Description:抽象类，是所有图形类的基类
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014年10月28日 上午12:04:28
 */
public abstract class Graphs {

	/**
	 * <p>
	 * Title: calculateLenth
	 * </p>
	 * <p>
	 * Description:抽象方法，计算图形的周长
	 * </p>
	 * 
	 * @return 图形周长
	 * 
	 */
	public abstract float calculateLenth();

	/**
	 * <p>
	 * Title: calculateSize
	 * </p>
	 * <p>
	 * Description:抽象方法，计算图形的面积
	 * </p>
	 * 
	 * @return 图形面积
	 * 
	 */
	public abstract float calculateSize();

}
