/**
 * <p>Title: TriangleAnswerAlert.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014��12��21��  ����2:46:00
 * @version 1.0
 */
package com.fuxuemingzhu.graphicsui.alerts;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.fuxuemingzhu.graphicsui.entity.Triangle;

/**
 * <p>
 * Title: TriangleAnswerAlert
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014��12��21�� ����2:46:00
 */
public class TriangleAnswerAlert extends JFrame {

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
	 * lbl_lenth ����������ʾ
	 */
	public JLabel lbl_lenth;
	/**
	 * lbl_size �滻������ʾ
	 */
	public JLabel lbl_size;
	/**
	 * lbl_r ·����ʾ
	 */
	public JLabel lbl_r;
	/**
	 * txt_r �ı�·������
	 */
	public JTextField txt_r;
	/**
	 * txt_lenth ������������
	 */
	public JTextField txt_lenth;
	/**
	 * txt_size �滻��������
	 */
	public JTextField txt_size;
	/**
	 * btn_sub ȷ������
	 */
	public JButton btn_sub;

	/**
	 * path �ļ�·���ַ���
	 */
	public static String path;
	/**
	 * find ���������ַ���
	 */
	public static String find;
	/**
	 * replace �滻�����ַ���
	 */
	public static String replace;
	/**
	 * a �����εĵ�һ����
	 */
	private float a;
	/**
	 * b �����εĵڶ�����
	 */
	private float b;
	/**
	 * c �����εĵ�������
	 */
	private float c;
	/**
	 * triangle ����������
	 */
	public static Triangle triangle;

	/**
	 * <p>
	 * Title:ShowAnswerAlert
	 * </p>
	 * <p>
	 * Description:���췽��
	 * </p>
	 */
	public TriangleAnswerAlert(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
		triangle = new Triangle(a, b, c);
		pnl_mian = new JPanel();
		lbl_help = new JLabel();
		lbl_lenth = new JLabel();
		lbl_size = new JLabel();
		lbl_r = new JLabel();
		txt_r = new JTextField();
		txt_lenth = new JTextField();
		txt_size = new JTextField();
		btn_sub = new JButton();
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
		this.setLocation(0, 300);
		this.setResizable(false);// ���ÿ�ܲ����Ըı��С
		this.setTitle("ͼ�����Լ���");// ���ÿ�ܱ���
		this.pnl_mian.setLayout(null);// ������岼�ֹ���
		this.pnl_mian.setBackground(Color.cyan);// ������屳����ɫ
		this.lbl_help.setText("ͼ�����Լ���");// ���ñ�ǩ����
		this.lbl_help.setFont(new Font("����", Font.BOLD | Font.ITALIC, 14));// ���ñ�ǩ����
		this.lbl_help.setForeground(Color.RED);// ���ñ�ǩ������ɫ
		this.lbl_r.setText("�����ε����߳�Ϊ:");
		this.lbl_lenth.setText("�����ε��ܳ�Ϊ:");
		this.lbl_size.setText("�����ε����Ϊ:");
		this.btn_sub.setText("ȷ��");
		this.lbl_help.setBounds(150, 25, 150, 20);// ���ñ�ǩx����120,y����20,��60,��20
		this.lbl_r.setBounds(40, 60, 120, 20);
		this.lbl_lenth.setBounds(40, 100, 100, 20);
		this.lbl_size.setBounds(40, 140, 100, 20);
		this.txt_r.setBounds(160, 60, 200, 20);
		this.txt_r.setText(triangle.getA() + "," + triangle.getB() + ","
				+ triangle.getC());
		this.txt_lenth.setBounds(160, 100, 200, 20);
		this.txt_lenth.setText(triangle.calculateLenth() + "");
		this.txt_size.setBounds(160, 140, 200, 20);
		this.txt_size.setText(triangle.calculateSize() + "");
		this.btn_sub.setBounds(120, 180, 90, 20);
		this.btn_sub.addActionListener(new ActionListener()// ������ʵ��ActionListener�ӿ�
				{
					public void actionPerformed(ActionEvent e) {
						btnsub_ActionEvent(e);
					}
				});
		this.pnl_mian.add(lbl_help);// ���ر�ǩ�����
		this.pnl_mian.add(lbl_r);
		this.pnl_mian.add(lbl_lenth);
		this.pnl_mian.add(lbl_size);
		this.pnl_mian.add(txt_r);
		this.pnl_mian.add(txt_lenth);
		this.pnl_mian.add(txt_size);
		this.pnl_mian.add(btn_sub);
		this.add(pnl_mian);// ������嵽���
		this.setVisible(true);// ���ÿ�ܿ���
	}

	/**
	 * <p>
	 * Title: btnsub_ActionEvent
	 * </p>
	 * <p>
	 * Description:���ȷ�����Ĳ���
	 * </p>
	 * 
	 * @param e
	 * 
	 */
	public void btnsub_ActionEvent(ActionEvent e) {
		this.dispose();
	}

}
