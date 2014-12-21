/**
 * <p>Title: PentagonAnswerAlert.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014��12��21��  ����2:45:26
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

import com.fuxuemingzhu.graphicsui.entity.Pentagon;

/**
 * <p>
 * Title: PentagonAnswerAlert
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014��12��21�� ����2:45:26
 */
public class PentagonAnswerAlert extends JFrame {

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
	 * r �߳�r
	 */
	public static float r;
	/**
	 * pentagon ���������
	 */
	public static Pentagon pentagon;

	/**
	 * <p>
	 * Title:ShowAnswerAlert
	 * </p>
	 * <p>
	 * Description:���췽��
	 * </p>
	 */
	public PentagonAnswerAlert(float r) {
		PentagonAnswerAlert.r = r;
		pentagon = new Pentagon(r);
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
		this.lbl_r.setText("����εı߳�Ϊ:");
		this.lbl_lenth.setText("����ε��ܳ�Ϊ:");
		this.lbl_size.setText("����ε����Ϊ:");
		this.btn_sub.setText("ȷ��");
		this.lbl_help.setBounds(150, 25, 150, 20);// ���ñ�ǩx����120,y����20,��60,��20
		this.lbl_r.setBounds(50, 50, 100, 20);
		this.lbl_lenth.setBounds(50, 80, 100, 20);
		this.lbl_size.setBounds(50, 110, 100, 25);
		this.txt_r.setBounds(150, 50, 200, 20);
		this.txt_r.setText(pentagon.getA() + "");
		this.txt_lenth.setBounds(150, 80, 200, 20);
		this.txt_lenth.setText(pentagon.calculateLenth() + "");
		this.txt_size.setBounds(150, 110, 200, 20);
		this.txt_size.setText(pentagon.calculateSize() + "");
		this.btn_sub.setBounds(120, 160, 90, 20);
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
