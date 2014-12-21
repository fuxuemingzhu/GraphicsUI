/**
 * <p>Title: Triangle.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014年12月21日  下午2:34:36
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
 * @date 2014年12月21日 下午2:34:36
 */
public class TriangleFrame extends JFrame {

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
	 * lbl_input_a 路径提示
	 */
	public JLabel lbl_input_a;
	/**
	 * txt_input_a 文本路径输入
	 */
	public JTextField txt_input_a;
	/**
	 * lbl_input_a 路径提示
	 */
	public JLabel lbl_input_b;
	/**
	 * txt_input_a 文本路径输入
	 */
	public JTextField txt_input_b;
	/**
	 * lbl_input_a 路径提示
	 */
	public JLabel lbl_input_c;
	/**
	 * txt_input_a 文本路径输入
	 */
	public JTextField txt_input_c;
	/**
	 * btn_sub 确定按键
	 */
	public JButton btn_sub;
	/**
	 * btn_reset 重置按键
	 */
	public JButton btn_reset;

	/**
	 * path 文件路径字符串
	 */
	public static String path = new String("E:/学习/java/triangle.txt");

	/**
	 * txt_a 三角形的半径
	 */
	public static String txt_a;
	/**
	 * txt_a 三角形的半径
	 */
	public static String txt_b;
	/**
	 * txt_a 三角形的半径
	 */
	public static String txt_c;

	/**
	 * <p>
	 * Title:Main
	 * </p>
	 * <p>
	 * Description:构造方法
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
	 * Description:用户界面设置
	 * </p>
	 * 
	 */
	public void userInit() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置关闭框架的同时结束程序
		this.setSize(400, 250);// 设置框架大小为长500,宽200
		this.setLocation(0, 0);
		this.setResizable(false);// 设置框架不可以改变大小
		this.setTitle("图形属性计算与绘制");// 设置框架标题
		this.pnl_mian.setLayout(null);// 设置面板布局管理
		this.pnl_mian.setBackground(Color.cyan);// 设置面板背景颜色
		this.lbl_help.setText("图形属性计算与绘制");// 设置标签标题
		this.lbl_help.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 14));// 设置标签字体
		this.lbl_help.setForeground(Color.RED);// 设置标签字体颜色
		this.lbl_input_a.setText("三角形的第一边:");
		this.lbl_input_b.setText("三角形的第二边:");
		this.lbl_input_c.setText("三角形的第三边:");
		this.btn_sub.setText("确定");
		this.btn_reset.setText("重置");
		this.lbl_help.setBounds(120, 40, 150, 20);// 设置标签x坐标120,y坐标20,长60,宽20
		this.lbl_input_a.setBounds(40, 60, 100, 20);
		this.txt_input_a.setBounds(140, 60, 200, 20);
		this.lbl_input_b.setBounds(40, 100, 100, 20);
		this.txt_input_b.setBounds(140, 100, 200, 20);
		this.lbl_input_c.setBounds(40, 140, 100, 20);
		this.txt_input_c.setBounds(140, 140, 200, 20);
		this.btn_sub.setBounds(105, 180, 60, 20);
		this.btn_sub.addActionListener(new ActionListener()// 匿名类实现ActionListener接口
				{
					public void actionPerformed(ActionEvent e) {
						btnsub_ActionEvent(e);
					}
				});
		this.btn_reset.setBounds(195, 180, 60, 20);
		this.btn_reset.addActionListener(new ActionListener()// 匿名类实现ActionListener接口
				{
					public void actionPerformed(ActionEvent e) {
						btnreset_ActionEvent(e);
					}
				});
		this.pnl_mian.add(lbl_help);// 加载标签到面板
		this.pnl_mian.add(lbl_input_a);
		this.pnl_mian.add(txt_input_a);
		this.pnl_mian.add(lbl_input_b);
		this.pnl_mian.add(txt_input_b);
		this.pnl_mian.add(lbl_input_c);
		this.pnl_mian.add(txt_input_c);
		this.pnl_mian.add(btn_sub);
		this.pnl_mian.add(btn_reset);
		this.add(pnl_mian);// 加载面板到框架
		this.getRootPane().setDefaultButton(btn_sub);// 设置缺省按钮
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
		txt_a = txt_input_a.getText();
		txt_b = txt_input_b.getText();
		txt_c = txt_input_c.getText();
		float a = Float.parseFloat(txt_a);
		float b = Float.parseFloat(txt_b);
		float c = Float.parseFloat(txt_c);
		float p = (Float.parseFloat(txt_a) + Float.parseFloat(txt_b) + Float
				.parseFloat(txt_c)) / 2;
		if (txt_a.equals("") || txt_b.equals("") || txt_c.equals("")) {
			JOptionPane.showMessageDialog(null, "图形的边长输入不完整！", "错误",
					JOptionPane.ERROR_MESSAGE);
			return;
		} else if ((p - a) <= 0 || (p - b) <= 0 || (p - c) <= 0) {
			JOptionPane.showMessageDialog(null, "输入的三边无法构成三角形！", "错误",
					JOptionPane.ERROR_MESSAGE);
			return;
		} else {
			TriangleAnswerAlert circleAnswerAlert = new TriangleAnswerAlert(
					Float.parseFloat(txt_a), Float.parseFloat(txt_b),
					Float.parseFloat(txt_c));// 构造结果显示框
			TriangleDraw circleDraw = new TriangleDraw(Float.parseFloat(txt_a),
					Float.parseFloat(txt_b), Float.parseFloat(txt_c));// 构造图形绘制框
			TriangleIO triangleIO = new TriangleIO(path,
					Float.parseFloat(txt_a), Float.parseFloat(txt_b),
					Float.parseFloat(txt_c));
			// /////////////////构造结果输出
			try {
				triangleIO.writeFile();
			} catch (Exception e1) {
				System.err.println("文件存储错误！");
				e1.printStackTrace();
			}
		}
	}

	/**
	 * <p>
	 * Title: btnreset_ActionEvent
	 * </p>
	 * <p>
	 * Description:点击重置键的操作
	 * </p>
	 * 
	 * @param e
	 * 
	 */
	public void btnreset_ActionEvent(ActionEvent e) {
		txt_input_a.setText("");

	}

}
