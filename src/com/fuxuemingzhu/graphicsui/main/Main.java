/**
 * <p>Title: Main.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014��12��18��  ����10:44:51
 * @version 1.0
 */
package com.fuxuemingzhu.graphicsui.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.fuxuemingzhu.graphicsui.frames.CicleFrame;
import com.fuxuemingzhu.graphicsui.frames.PentagonFrame;
import com.fuxuemingzhu.graphicsui.frames.SquareFrame;
import com.fuxuemingzhu.graphicsui.frames.TriangleFrame;

/**
 * <p>
 * Title: Main
 * </p>
 * <p>
 * Description:����ͼ�εĻ��ƺ�ʹ��
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014��12��18�� ����10:44:51
 */
public class Main extends JFrame {

	/**
	 * serialVersionUID
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * pnl_mian �����
	 */
	public JPanel pnl_mian;
	/**
	 * lbl_help ��ʾ���
	 */
	public JLabel lbl_help;
	/**
	 * btn_circle ȷ������
	 */
	public JButton btn_circle;
	/**
	 * btn_pentagon ���ð���
	 */
	public JButton btn_pentagon;
	/**
	 * btn_circle ȷ������
	 */
	public JButton btn_square;
	/**
	 * btn_pentagon ���ð���
	 */
	public JButton btn_triangle;
	/**
	 * path �ļ�·���ַ���
	 */
	public static String path = new String("E:/ѧϰ/java/result.txt");

	/**
	 * txt_r Բ�İ뾶
	 */
	public static String txt_r;

	/**
	 * <p>
	 * Title:Main
	 * </p>
	 * <p>
	 * Description:���췽��
	 * </p>
	 */
	public Main() {
		pnl_mian = new JPanel();
		lbl_help = new JLabel();
		btn_circle = new JButton();
		btn_pentagon = new JButton();
		btn_square = new JButton();
		btn_triangle = new JButton();
		userInit();
	}

	/**
	 * <p>
	 * Title: userInit
	 * </p>
	 * <p>
	 * Description:�û���������
	 * </p>
	 * 
	 */
	public void userInit() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ���ùرտ�ܵ�ͬʱ��������
		this.setSize(400, 250);// ���ÿ�ܴ�СΪ��500,��200
		this.setLocation(0, 0);
		this.setResizable(false);// ���ÿ�ܲ����Ըı��С
		this.setTitle("ͼ�����Լ��������");// ���ÿ�ܱ���
		this.pnl_mian.setLayout(null);// ������岼�ֹ���
		this.pnl_mian.setBackground(Color.cyan);// ������屳����ɫ
		this.lbl_help.setText("��ѡ����Ҫ�����ͼ��");// ���ñ�ǩ����
		this.lbl_help.setFont(new Font("����", Font.BOLD | Font.ITALIC, 14));// ���ñ�ǩ����
		this.lbl_help.setForeground(Color.RED);// ���ñ�ǩ������ɫ
		this.btn_circle.setText("Բ");
		this.btn_pentagon.setText("�������");
		this.btn_square.setText("������");
		this.btn_triangle.setText("������");
		this.lbl_help.setBounds(120, 40, 150, 20);// ���ñ�ǩx����120,y����20,��60,��20
		this.btn_circle.setBounds(60, 100, 120, 20);
		this.btn_pentagon.setBounds(60, 160, 120, 20);
		this.btn_square.setBounds(200, 100, 120, 20);
		this.btn_triangle.setBounds(200, 160, 120, 20);
		this.btn_circle.addActionListener(new ActionListener()// ������ʵ��ActionListener�ӿ�
				{
					public void actionPerformed(ActionEvent e) {
						btn_circle_Action(e);
					}
				});
		this.btn_pentagon.addActionListener(new ActionListener()// ������ʵ��ActionListener�ӿ�
				{
					public void actionPerformed(ActionEvent e) {
						btn_pentagon_Action(e);
					}
				});
		this.btn_square.addActionListener(new ActionListener()// ������ʵ��ActionListener�ӿ�
				{
					public void actionPerformed(ActionEvent e) {
						btn_square_Action(e);
					}
				});
		this.btn_triangle.addActionListener(new ActionListener()// ������ʵ��ActionListener�ӿ�
				{
					public void actionPerformed(ActionEvent e) {
						btn_triangle_Action(e);
					}
				});
		this.pnl_mian.add(lbl_help);// ���ر�ǩ�����
		this.pnl_mian.add(btn_circle);
		this.pnl_mian.add(btn_pentagon);
		this.pnl_mian.add(btn_square);
		this.pnl_mian.add(btn_triangle);
		this.add(pnl_mian);// ������嵽���
		this.getRootPane().setDefaultButton(btn_circle);// ����ȱʡ��ť
		this.setVisible(true);// ���ÿ�ܿ���
	}

	/**
	 * <p>
	 * Title: btn_triangle_Action
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param e
	 * 
	 */
	protected void btn_triangle_Action(ActionEvent e) {
		TriangleFrame triangleFrame = new TriangleFrame();
		this.dispose();
	}

	/**
	 * <p>
	 * Title: btn_square_Action
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param e
	 * 
	 */
	protected void btn_square_Action(ActionEvent e) {
		SquareFrame squareFrame = new SquareFrame();
		this.dispose();
	}

	/**
	 * <p>
	 * Title: btn_circle_Action
	 * </p>
	 * <p>
	 * Description:���ȷ�����Ĳ���
	 * </p>
	 * 
	 * @param e
	 * 
	 */
	public void btn_circle_Action(ActionEvent e) {
		CicleFrame cicleFrame = new CicleFrame();
		this.dispose();
	}

	/**
	 * <p>
	 * Title: btn_pentagon_Action
	 * </p>
	 * <p>
	 * Description:������ü��Ĳ���
	 * </p>
	 * 
	 * @param e
	 * 
	 */
	public void btn_pentagon_Action(ActionEvent e) {
		PentagonFrame pentagonFrame = new PentagonFrame();
		this.dispose();
	}

	/**
	 * <p>
	 * Title: main
	 * </p>
	 * <p>
	 * Description:main��������������
	 * </p>
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		new Main();
	}
}
