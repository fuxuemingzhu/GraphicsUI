/**
 * <p>Title: TriangleDraw.java</p>
 * <p>Description: 三角形绘制</p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014年12月21日  下午2:42:26
 * @version 1.0
 */
package com.fuxuemingzhu.graphicsui.draws;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * <p>
 * Title: TriangleDraw
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014年12月21日 下午2:42:26
 */
public class TriangleDraw extends JFrame {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

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
	 * Title:GraphicsDraw
	 * </p>
	 * <p>
	 * Description:图形的绘制
	 * </p>
	 * 
	 * @param r
	 */
	public TriangleDraw(float a, float b, float c) {
		super("图形的绘制");
		setSize((int) max(a, b, c) + 200, (int) max(a, b, c) + 200);
		this.setLocation(420, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置关闭框架的同时结束程序

		this.a = max(a, b, c);
		this.b = middle(a, b, c);
		this.c = min(a, b, c);

		setVisible(true);
	}

	/**
	 * （非 Javadoc）
	 * <p>
	 * Title: paint
	 * </p>
	 * <p>
	 * Description:绘制图形
	 * </p>
	 * 
	 * @param g
	 * @see java.awt.Window#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g) {
		super.paint(g);// call superclass's paint method
		double x2, y2, m;
		m = (a * a + b * b - c * c) / (2 * a * b);
		if (m >= 0) {
			x2 = m * b;
			y2 = Math.sqrt(c * c - (x2 - a) * (x2 - a));
		} else {
			x2 = m * b + a;
			y2 = Math.sqrt(c * c - (x2 - a) * (x2 - a));
		}
		int z = (int) a;
		int x20 = (int) x2;
		int y20 = (int) y2;
		int[] xpt = { (int) (100), (int) (100 + z), (int) (100 + x20) };
		int[] ypt = { (int) (100), (int) (100), (int) (100 + y20) };

		g.setColor(Color.green);
		g.drawPolygon(xpt, ypt, 3);
	}// end method paint

	/**
	 * <p>
	 * Title: max
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * 
	 */
	private float max(float a, float b, float c) {
		float max;
		max = a > b ? a : b;
		max = max > c ? max : c;
		return max;
	}

	/**
	 * <p>
	 * Title: max
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * 
	 */
	private float min(float a, float b, float c) {
		float min;
		min = a < b ? a : b;
		min = min < c ? min : c;
		return min;
	}

	/**
	 * <p>
	 * Title: max
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * 
	 */
	private float middle(float x, float y, float z) {
		float middle;
		if (x >= y) {
			if (z <= x)
				middle = z;
			else
				middle = x;
		} else {
			if (z <= y)
				middle = z;
			else
				middle = y;
		}
		return middle;
	}
}
