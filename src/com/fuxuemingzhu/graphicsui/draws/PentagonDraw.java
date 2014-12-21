/**
 * <p>Title: PentagonDraw.java</p>
 * <p>Description:五边形绘制 </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014年12月21日  下午2:42:01
 * @version 1.0
 */
package com.fuxuemingzhu.graphicsui.draws;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * <p>
 * Title: PentagonDraw
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014年12月21日 下午2:42:01
 */
public class PentagonDraw extends JFrame {

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
	public PentagonDraw(float r) {
		super("图形的绘制");
		setSize((int) r + 400, (int) r + 400);
		this.setLocation(420, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置关闭框架的同时结束程序
		PentagonDraw.r = r;
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
		int bianshu = 5;
		int bianshuMax = 5;
		int[] x = new int[bianshuMax];
		int[] y = new int[bianshuMax];
		MyPolygon mplg = new MyPolygon(x, y);

		g.clearRect(0, 0, this.getWidth(), this.getHeight());// 因为repaint不调用update，所以自己清空面板
		if (bianshu <= bianshuMax) {
			mplg.posOfPoint(bianshu);
			g.drawPolygon(x, y, bianshu);
		} else {
			bianshuMax += 5;
			x = new int[bianshuMax];
			y = new int[bianshuMax];
			mplg = new MyPolygon(x, y);
			paint(g);
		}
	}

	/**
	 * <p>
	 * Title: MyPolygon
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author caifugui
	 * 
	 * @email fuxuemingzhu@163.com
	 * 
	 * @date 2014年12月21日 下午4:21:37
	 */
	class MyPolygon {// 求正多边形的顶点坐标
		private int[] x;
		private int[] y;
		private int startX;// 顶点的X坐标
		private int startY;// 顶点的Y坐标

		public MyPolygon(int[] x, int[] y) {
			this.x = x;
			this.y = y;
			startX = (int) (r / 2 + 200);
			startY = (int) (r / 2 + 50);
		}

		public void posOfPoint(int bianshu) {
			x[0] = startX;
			y[0] = startY;
			Point p = new Point();
			for (int i = 1; i < bianshu; i++) {
				p = nextPoint(((2 * Math.PI) / bianshu) * i);
				x[i] = p.x;
				y[i] = p.y;
			}
		}

		public Point nextPoint(double arc) {// arc为弧度，在顶点处建立直角坐标系，用r和arc确定下一个点的坐标
			Point p = new Point();
			p.x = (int) (x[0] - r * Math.sin(arc));
			p.y = (int) (y[0] + r - r * Math.cos(arc));
			return p;
		}
	}
}
