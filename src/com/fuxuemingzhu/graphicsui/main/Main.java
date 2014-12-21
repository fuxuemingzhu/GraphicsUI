/**
 * <p>Title: Main.java</p>
 * <p>Description: </p>
 * 
 * @author caifugui
 *
 * @email fuxuemingzhu@163.com
 *
 * @date 2014年12月18日  下午10:44:51
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
 * Description:各种图形的绘制和使用
 * </p>
 * 
 * @author caifugui
 * 
 * @email fuxuemingzhu@163.com
 * 
 * @date 2014年12月18日 下午10:44:51
 */
public class Main extends JFrame {

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
	 * btn_circle 确定按键
	 */
	public JButton btn_circle;
	/**
	 * btn_pentagon 重置按键
	 */
	public JButton btn_pentagon;
	/**
	 * btn_circle 确定按键
	 */
	public JButton btn_square;
	/**
	 * btn_pentagon 重置按键
	 */
	public JButton btn_triangle;
	/**
	 * path 文件路径字符串
	 */
	public static String path = new String("E:/学习/java/result.txt");

	/**
	 * txt_r 圆的半径
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
		this.lbl_help.setText("请选择需要计算的图形");// 设置标签标题
		this.lbl_help.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 14));// 设置标签字体
		this.lbl_help.setForeground(Color.RED);// 设置标签字体颜色
		this.btn_circle.setText("圆");
		this.btn_pentagon.setText("正五边形");
		this.btn_square.setText("正方形");
		this.btn_triangle.setText("三角形");
		this.lbl_help.setBounds(120, 40, 150, 20);// 设置标签x坐标120,y坐标20,长60,宽20
		this.btn_circle.setBounds(60, 100, 120, 20);
		this.btn_pentagon.setBounds(60, 160, 120, 20);
		this.btn_square.setBounds(200, 100, 120, 20);
		this.btn_triangle.setBounds(200, 160, 120, 20);
		this.btn_circle.addActionListener(new ActionListener()// 匿名类实现ActionListener接口
				{
					public void actionPerformed(ActionEvent e) {
						btn_circle_Action(e);
					}
				});
		this.btn_pentagon.addActionListener(new ActionListener()// 匿名类实现ActionListener接口
				{
					public void actionPerformed(ActionEvent e) {
						btn_pentagon_Action(e);
					}
				});
		this.btn_square.addActionListener(new ActionListener()// 匿名类实现ActionListener接口
				{
					public void actionPerformed(ActionEvent e) {
						btn_square_Action(e);
					}
				});
		this.btn_triangle.addActionListener(new ActionListener()// 匿名类实现ActionListener接口
				{
					public void actionPerformed(ActionEvent e) {
						btn_triangle_Action(e);
					}
				});
		this.pnl_mian.add(lbl_help);// 加载标签到面板
		this.pnl_mian.add(btn_circle);
		this.pnl_mian.add(btn_pentagon);
		this.pnl_mian.add(btn_square);
		this.pnl_mian.add(btn_triangle);
		this.add(pnl_mian);// 加载面板到框架
		this.getRootPane().setDefaultButton(btn_circle);// 设置缺省按钮
		this.setVisible(true);// 设置框架可显
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
	 * Description:点击确定键的操作
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
	 * Description:点击重置键的操作
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
	 * Description:main方法，程序的入口
	 * </p>
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		new Main();
	}
}
