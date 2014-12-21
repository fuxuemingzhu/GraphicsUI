/**
 * <p>Title: Graphics.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014��12��18��  ����11:29:59
 * @version 1.0
 */
package com.fuxuemingzhu.graphicsui.draws;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * <p>
 * Title: Graphics
 * </p>
 * <p>
 * Description:ͼ�εĻ���
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014��12��18�� ����11:29:59
 */
public class CircleDraw extends JFrame {
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
	public CircleDraw(float r) {
		super("ͼ�εĻ���");
		setSize((int) r + 200, (int) r + 200);
		this.setLocation(420, 180);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ���ùرտ�ܵ�ͬʱ��������
		CircleDraw.r = r;
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

		g.setColor(Color.pink);
		g.drawOval(100, 100, (int) r, (int) r);// ���ƿ�����Բ

	}// end method paint

}
