/**
 * <p>Title: PentagonDraw.java</p>
 * <p>Description:����λ��� </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014��12��21��  ����2:42:01
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
 * @date 2014��12��21�� ����2:42:01
 */
public class PentagonDraw extends JFrame {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * r �뾶r
	 */
	public static float r;

	/**
	 * <p>
	 * Title:GraphicsDraw
	 * </p>
	 * <p>
	 * Description:ͼ�εĻ���
	 * </p>
	 * 
	 * @param r
	 */
	public PentagonDraw(float r) {
		super("ͼ�εĻ���");
		setSize((int) r + 400, (int) r + 400);
		this.setLocation(420, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ���ùرտ�ܵ�ͬʱ��������
		PentagonDraw.r = r;
		setVisible(true);
	}

	/**
	 * ���� Javadoc��
	 * <p>
	 * Title: paint
	 * </p>
	 * <p>
	 * Description:����ͼ��
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

		g.clearRect(0, 0, this.getWidth(), this.getHeight());// ��Ϊrepaint������update�������Լ�������
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
	 * @date 2014��12��21�� ����4:21:37
	 */
	class MyPolygon {// ��������εĶ�������
		private int[] x;
		private int[] y;
		private int startX;// �����X����
		private int startY;// �����Y����

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

		public Point nextPoint(double arc) {// arcΪ���ȣ��ڶ��㴦����ֱ������ϵ����r��arcȷ����һ���������
			Point p = new Point();
			p.x = (int) (x[0] - r * Math.sin(arc));
			p.y = (int) (y[0] + r - r * Math.cos(arc));
			return p;
		}
	}
}
