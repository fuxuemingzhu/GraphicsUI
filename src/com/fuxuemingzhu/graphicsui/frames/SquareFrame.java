/**
 * <p>Title: SquareFrame.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014��12��21��  ����2:34:26
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

import com.fuxuemingzhu.graphicsui.alerts.SquareAnswerAlert;
import com.fuxuemingzhu.graphicsui.draws.SquareDraw;
import com.fuxuemingzhu.graphicsui.io.SquareIO;

/**
 * <p>
 * Title: SquareFrame
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014��12��21�� ����2:34:26
 */
public class SquareFrame extends JFrame {

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
	 * lbl_input ·����ʾ
	 */
	public JLabel lbl_input;
	/**
	 * txt_input �ı�·������
	 */
	public JTextField txt_input;
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
	public static String path = new String("E:/ѧϰ/java/square.txt");

	/**
	 * txt_r �����εı߳�
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
	public SquareFrame() {
		pnl_mian = new JPanel();
		lbl_help = new JLabel();
		lbl_input = new JLabel();
		txt_input = new JTextField();
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
		this.lbl_input.setText("�����εı߳�:");
		this.btn_sub.setText("ȷ��");
		this.btn_reset.setText("����");
		this.lbl_help.setBounds(120, 40, 150, 20);// ���ñ�ǩx����120,y����20,��60,��20
		this.lbl_input.setBounds(40, 100, 100, 20);
		this.txt_input.setBounds(130, 100, 200, 20);
		this.btn_sub.setBounds(105, 160, 60, 20);
		this.btn_sub.addActionListener(new ActionListener()// ������ʵ��ActionListener�ӿ�
				{
					public void actionPerformed(ActionEvent e) {
						btnsub_ActionEvent(e);
					}
				});
		this.btn_reset.setBounds(195, 160, 60, 20);
		this.btn_reset.addActionListener(new ActionListener()// ������ʵ��ActionListener�ӿ�
				{
					public void actionPerformed(ActionEvent e) {
						btnreset_ActionEvent(e);
					}
				});
		this.pnl_mian.add(lbl_help);// ���ر�ǩ�����
		this.pnl_mian.add(lbl_input);
		this.pnl_mian.add(txt_input);
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
		txt_r = txt_input.getText();
		if (txt_r.equals("")) {
			JOptionPane.showMessageDialog(null, "ͼ�εı߳�����Ϊ�գ�", "����",
					JOptionPane.ERROR_MESSAGE);
			return;
		} else {
			SquareAnswerAlert circleAnswerAlert = new SquareAnswerAlert(
					Float.parseFloat(txt_r));// ��������ʾ��
			SquareDraw circleDraw = new SquareDraw(Float.parseFloat(txt_r));// ����ͼ�λ��ƿ�
			SquareIO squareIO = new SquareIO(path, Float.parseFloat(txt_r));
			// /////////////////���������
			try {
				squareIO.writeFile();
			} catch (Exception e1) {
				System.err.println("�ļ��洢����");
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
		txt_input.setText("");

	}

}
