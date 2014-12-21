/**
 * <p>Title: PentagonAnswerAlert.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014年12月21日  下午2:45:26
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
 * @date 2014年12月21日 下午2:45:26
 */
public class PentagonAnswerAlert extends JFrame {

	/**
	 * serialVersionUID
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * pnl_mian 主面板
	 */
	public JPanel pnl_mian;
	/**
	 * lbl_help 提示面板
	 */
	public JLabel lbl_help;
	/**
	 * lbl_lenth 查找内容提示
	 */
	public JLabel lbl_lenth;
	/**
	 * lbl_size 替换内容提示
	 */
	public JLabel lbl_size;
	/**
	 * lbl_r 路径提示
	 */
	public JLabel lbl_r;
	/**
	 * txt_r 文本路径输入
	 */
	public JTextField txt_r;
	/**
	 * txt_lenth 查找内容输入
	 */
	public JTextField txt_lenth;
	/**
	 * txt_size 替换内容输入
	 */
	public JTextField txt_size;
	/**
	 * btn_sub 确定按键
	 */
	public JButton btn_sub;

	/**
	 * path 文件路径字符串
	 */
	public static String path;
	/**
	 * find 查找内容字符串
	 */
	public static String find;
	/**
	 * replace 替换内容字符串
	 */
	public static String replace;
	/**
	 * r 边长r
	 */
	public static float r;
	/**
	 * pentagon 对象五边形
	 */
	public static Pentagon pentagon;

	/**
	 * <p>
	 * Title:ShowAnswerAlert
	 * </p>
	 * <p>
	 * Description:构造方法
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
	 * Description:用户界面设置
	 * </p>
	 * 
	 */
	public void userInit() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置关闭框架的同时结束程序
		this.setSize(400, 250);// 设置框架大小为长500,宽200
		this.setLocation(0, 300);
		this.setResizable(false);// 设置框架不可以改变大小
		this.setTitle("图形属性计算");// 设置框架标题
		this.pnl_mian.setLayout(null);// 设置面板布局管理
		this.pnl_mian.setBackground(Color.cyan);// 设置面板背景颜色
		this.lbl_help.setText("图形属性计算");// 设置标签标题
		this.lbl_help.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 14));// 设置标签字体
		this.lbl_help.setForeground(Color.RED);// 设置标签字体颜色
		this.lbl_r.setText("五边形的边长为:");
		this.lbl_lenth.setText("五边形的周长为:");
		this.lbl_size.setText("五边形的面积为:");
		this.btn_sub.setText("确定");
		this.lbl_help.setBounds(150, 25, 150, 20);// 设置标签x坐标120,y坐标20,长60,宽20
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
		this.btn_sub.addActionListener(new ActionListener()// 匿名类实现ActionListener接口
				{
					public void actionPerformed(ActionEvent e) {
						btnsub_ActionEvent(e);
					}
				});
		this.pnl_mian.add(lbl_help);// 加载标签到面板
		this.pnl_mian.add(lbl_r);
		this.pnl_mian.add(lbl_lenth);
		this.pnl_mian.add(lbl_size);
		this.pnl_mian.add(txt_r);
		this.pnl_mian.add(txt_lenth);
		this.pnl_mian.add(txt_size);
		this.pnl_mian.add(btn_sub);
		this.add(pnl_mian);// 加载面板到框架
		this.setVisible(true);// 设置框架可显
	}

	/**
	 * <p>
	 * Title: btnsub_ActionEvent
	 * </p>
	 * <p>
	 * Description:点击确定键的操作
	 * </p>
	 * 
	 * @param e
	 * 
	 */
	public void btnsub_ActionEvent(ActionEvent e) {
		this.dispose();
	}

}
