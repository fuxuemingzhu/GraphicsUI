/**
 * <p>Title: Triangle.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014��12��21��  ����2:34:36
 * @version 1.0
 */
package com.fuxuemingzhu.graphicsui.frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.fuxuemingzhu.graphicsui.alerts.TriangleAnswerAlert;
import com.fuxuemingzhu.graphicsui.draws.TriangleDraw;
import com.fuxuemingzhu.graphicsui.io.TriangleIO;

/**
 * <p>
 * Title: Triangle
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014��12��21�� ����2:34:36
 */
public class TriangleFrame extends JFrame {

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
	 * lbl_input_a ·����ʾ
	 */
	public JLabel lbl_input_a;
	/**
	 * txt_input_a �ı�·������
	 */
	public JTextField txt_input_a;
	/**
	 * lbl_input_a ·����ʾ
	 */
	public JLabel lbl_input_b;
	/**
	 * txt_input_a �ı�·������
	 */
	public JTextField txt_input_b;
	/**
	 * lbl_input_a ·����ʾ
	 */
	public JLabel lbl_input_c;
	/**
	 * txt_input_a �ı�·������
	 */
	public JTextField txt_input_c;
	/**
	 * btn_sub ȷ������
	 */
	public JButton btn_sub;
	/**
	 * btn_reset ���ð���
	 */
	public JButton btn_reset;

	/**
	 * path �ļ�·���ַ���
	 */
	public static String path = new String("E:/ѧϰ/java/triangle.txt");

	/**
	 * txt_a �����εİ뾶
	 */
	public static String txt_a;
	/**
	 * txt_a �����εİ뾶
	 */
	public static String txt_b;
	/**
	 * txt_a �����εİ뾶
	 */
	public static String txt_c;

	/**
	 * <p>
	 * Title:Main
	 * </p>
	 * <p>
	 * Description:���췽��
	 * </p>
	 */
	public TriangleFrame() {
		pnl_mian = new JPanel();
		lbl_help = new JLabel();
		lbl_input_a = new JLabel();
		txt_input_a = new JTextField();
		lbl_input_b = new JLabel();
		txt_input_b = new JTextField();
		lbl_input_c = new JLabel();
		txt_input_c = new JTextField();
		btn_sub = new JButton();
		btn_reset = new JButton();
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
		this.lbl_help.setText("ͼ�����Լ��������");// ���ñ�ǩ����
		this.lbl_help.setFont(new Font("����", Font.BOLD | Font.ITALIC, 14));// ���ñ�ǩ����
		this.lbl_help.setForeground(Color.RED);// ���ñ�ǩ������ɫ
		this.lbl_input_a.setText("�����εĵ�һ��:");
		this.lbl_input_b.setText("�����εĵڶ���:");
		this.lbl_input_c.setText("�����εĵ�����:");
		this.btn_sub.setText("ȷ��");
		this.btn_reset.setText("����");
		this.lbl_help.setBounds(120, 40, 150, 20);// ���ñ�ǩx����120,y����20,��60,��20
		this.lbl_input_a.setBounds(40, 60, 100, 20);
		this.txt_input_a.setBounds(140, 60, 200, 20);
		this.lbl_input_b.setBounds(40, 100, 100, 20);
		this.txt_input_b.setBounds(140, 100, 200, 20);
		this.lbl_input_c.setBounds(40, 140, 100, 20);
		this.txt_input_c.setBounds(140, 140, 200, 20);
		this.btn_sub.setBounds(105, 180, 60, 20);
		this.btn_sub.addActionListener(new ActionListener()// ������ʵ��ActionListener�ӿ�
				{
					public void actionPerformed(ActionEvent e) {
						btnsub_ActionEvent(e);
					}
				});
		this.btn_reset.setBounds(195, 180, 60, 20);
		this.btn_reset.addActionListener(new ActionListener()// ������ʵ��ActionListener�ӿ�
				{
					public void actionPerformed(ActionEvent e) {
						btnreset_ActionEvent(e);
					}
				});
		this.pnl_mian.add(lbl_help);// ���ر�ǩ�����
		this.pnl_mian.add(lbl_input_a);
		this.pnl_mian.add(txt_input_a);
		this.pnl_mian.add(lbl_input_b);
		this.pnl_mian.add(txt_input_b);
		this.pnl_mian.add(lbl_input_c);
		this.pnl_mian.add(txt_input_c);
		this.pnl_mian.add(btn_sub);
		this.pnl_mian.add(btn_reset);
		this.add(pnl_mian);// ������嵽���
		this.getRootPane().setDefaultButton(btn_sub);// ����ȱʡ��ť
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
		txt_a = txt_input_a.getText();
		txt_b = txt_input_b.getText();
		txt_c = txt_input_c.getText();
		float a = Float.parseFloat(txt_a);
		float b = Float.parseFloat(txt_b);
		float c = Float.parseFloat(txt_c);
		float p = (Float.parseFloat(txt_a) + Float.parseFloat(txt_b) + Float
				.parseFloat(txt_c)) / 2;
		if (txt_a.equals("") || txt_b.equals("") || txt_c.equals("")) {
			JOptionPane.showMessageDialog(null, "ͼ�εı߳����벻������", "����",
					JOptionPane.ERROR_MESSAGE);
			return;
		} else if ((p - a) <= 0 || (p - b) <= 0 || (p - c) <= 0) {
			JOptionPane.showMessageDialog(null, "����������޷����������Σ�", "����",
					JOptionPane.ERROR_MESSAGE);
			return;
		} else {
			TriangleAnswerAlert circleAnswerAlert = new TriangleAnswerAlert(
					Float.parseFloat(txt_a), Float.parseFloat(txt_b),
					Float.parseFloat(txt_c));// ��������ʾ��
			TriangleDraw circleDraw = new TriangleDraw(Float.parseFloat(txt_a),
					Float.parseFloat(txt_b), Float.parseFloat(txt_c));// ����ͼ�λ��ƿ�
			TriangleIO triangleIO = new TriangleIO(path,
					Float.parseFloat(txt_a), Float.parseFloat(txt_b),
					Float.parseFloat(txt_c));
			// /////////////////���������
			try {
				triangleIO.writeFile();
			} catch (Exception e1) {
				System.err.println("�ļ��洢����");
				e1.printStackTrace();
			}
		}
	}

	/**
	 * <p>
	 * Title: btnreset_ActionEvent
	 * </p>
	 * <p>
	 * Description:������ü��Ĳ���
	 * </p>
	 * 
	 * @param e
	 * 
	 */
	public void btnreset_ActionEvent(ActionEvent e) {
		txt_input_a.setText("");

	}

}
