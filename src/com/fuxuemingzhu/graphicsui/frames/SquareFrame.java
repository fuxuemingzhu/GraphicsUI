/**
 * <p>Title: SquareFrame.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014年12月21日  下午2:34:26
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
 * @date 2014年12月21日 下午2:34:26
 */
public class SquareFrame extends JFrame {

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
	 * lbl_input 路径提示
	 */
	public JLabel lbl_input;
	/**
	 * txt_input 文本路径输入
	 */
	public JTextField txt_input;
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
	public static String path = new String("E:/学习/java/square.txt");

	/**
	 * txt_r 正方形的边长
	 */
	public static String txt_r;

	/**
	 * <p>
	 * Title:Main
	 * </p>
	 * <p>
	 * Description:构造方法
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
		this.lbl_input.setText("正方形的边长:");
		this.btn_sub.setText("确定");
		this.btn_reset.setText("重置");
		this.lbl_help.setBounds(120, 40, 150, 20);// 设置标签x坐标120,y坐标20,长60,宽20
		this.lbl_input.setBounds(40, 100, 100, 20);
		this.txt_input.setBounds(130, 100, 200, 20);
		this.btn_sub.setBounds(105, 160, 60, 20);
		this.btn_sub.addActionListener(new ActionListener()// 匿名类实现ActionListener接口
				{
					public void actionPerformed(ActionEvent e) {
						btnsub_ActionEvent(e);
					}
				});
		this.btn_reset.setBounds(195, 160, 60, 20);
		this.btn_reset.addActionListener(new ActionListener()// 匿名类实现ActionListener接口
				{
					public void actionPerformed(ActionEvent e) {
						btnreset_ActionEvent(e);
					}
				});
		this.pnl_mian.add(lbl_help);// 加载标签到面板
		this.pnl_mian.add(lbl_input);
		this.pnl_mian.add(txt_input);
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
		txt_r = txt_input.getText();
		if (txt_r.equals("")) {
			JOptionPane.showMessageDialog(null, "图形的边长不能为空！", "错误",
					JOptionPane.ERROR_MESSAGE);
			return;
		} else {
			SquareAnswerAlert circleAnswerAlert = new SquareAnswerAlert(
					Float.parseFloat(txt_r));// 构造结果显示框
			SquareDraw circleDraw = new SquareDraw(Float.parseFloat(txt_r));// 构造图形绘制框
			SquareIO squareIO = new SquareIO(path, Float.parseFloat(txt_r));
			// /////////////////构造结果输出
			try {
				squareIO.writeFile();
			} catch (Exception e1) {
				System.err.println("文件存储错误！");
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
		txt_input.setText("");

	}

}
