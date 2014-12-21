/**
 * <p>Title: SquareDraw.java</p>
 * <p>Description:正方形绘制 </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014年12月21日  下午2:42:12
 * @version 1.0
 */
package com.fuxuemingzhu.graphicsui.draws;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * <p>
 * Title: SquareDraw
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014年12月21日 下午2:42:12
 */
public class SquareDraw extends JFrame {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * r 半径r
	 */
	public static float r;

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
	public SquareDraw(float r) {
		super("图形的绘制");
		setSize((int) r + 200, (int) r + 200);
		this.setLocation(420, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置关闭框架的同时结束程序
		SquareDraw.r = r;
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

		g.setColor(Color.green);
		g.drawRect(100, 100, (int) r, (int) r);

	}// end method paint

}
