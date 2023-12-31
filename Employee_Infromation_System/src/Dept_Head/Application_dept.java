package Dept_Head;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Application_dept extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application_dept frame = new Application_dept(null,null,null,null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Application_dept(String emp_id,String dept_id,String email,String Type) throws SQLException{
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-50 (3) (1).png"));
		setTitle("Employee Information Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,850,500);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 834, 461);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnProjects = new JButton("");
		btnProjects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Project(emp_id,dept_id,email,Type).setVisible(true);
			}
		});
		btnProjects.setBounds(524, 208, 201, 99);
		btnProjects.setIcon(new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\icons8-department-96.png"));
		btnProjects.setForeground(new Color(128, 128, 128));
		btnProjects.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnProjects.setBackground(Color.WHITE);
		panel.add(btnProjects);
		
		JButton button_2 = new JButton("");
//		button_2.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				button_2.setBounds(259, 163, 221, 129);
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				button_2.setBounds(259, 163, 201, 99);
//			}
//		});
		button_2.setBounds(279, 208, 201, 99);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
					new create_emp_dept(emp_id,dept_id,email,Type).setVisible(true);
			
			}
		});
		button_2.setIcon(new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\icons8-employee-96.png"));
		button_2.setForeground(new Color(0, 0, 102));
		button_2.setFont(new Font("Monospaced", Font.BOLD, 20));
		button_2.setBackground(Color.WHITE);
		panel.add(button_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 163, 461);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(0, 102, 102));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.WHITE));
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(32, 10, 102, 92);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 112, 92);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\photo_2023-06-15_10-33-47.jpg"));
		
		JLabel lblAdmin = new JLabel(Type);
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setBounds(0, 101, 163, 28);
		panel_1.add(lblAdmin);
		lblAdmin.setFont(new Font("Modern No. 20", Font.BOLD, 12));
		
		JLabel lemail = new JLabel(email);
		lemail.setHorizontalAlignment(SwingConstants.CENTER);
		lemail.setBounds(0, 119, 163, 23);
		panel_1.add(lemail);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				 new Dept_login().setVisible(true);
			}
		});
		btnLogout.setIcon(new ImageIcon("D:\\HR Info Sys Pto\\icons8-logout-rounded-30.png"));
		btnLogout.setBackground(Color.LIGHT_GRAY);
		btnLogout.setFont(new Font("Modern No. 20", Font.BOLD, 20));
		btnLogout.setBounds(0, 401, 163, 28);
		panel_1.add(btnLogout);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_8.setBounds(0, 152, 163, 2);
		panel_1.add(panel_8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 834, 33);
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel.add(panel_2);
		
		JLabel lblHelloWelcomeAdmin = new JLabel("Hello, welcome "+ Type );
		lblHelloWelcomeAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelloWelcomeAdmin.setBounds(145, 0, 340, 43);
		panel_2.add(lblHelloWelcomeAdmin);
		lblHelloWelcomeAdmin.setIcon(new ImageIcon("D:\\HR Info Sys Pto\\icons8-male-user-24.png"));
		
		JLabel lblManagementSystem = new JLabel("MANAGEMENT SYSTEM");
		lblManagementSystem.setBounds(192, 27, 505, 47);
		lblManagementSystem.setForeground(new Color(0, 102, 102));
		lblManagementSystem.setFont(new Font("Modern No. 20", Font.BOLD, 33));
		panel.add(lblManagementSystem);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(160, 69, 513, 5);
		panel_4.setBackground(new Color(0, 102, 102));
		panel.add(panel_4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(279, 306, 201, 47);
		panel_7.setBackground(new Color(0, 102, 102));
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblEmployee = new JLabel("Employees Mgmt");
		lblEmployee.setBounds(0, 0, 201, 47);
		panel_7.add(lblEmployee);
		lblEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployee.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(524, 306, 201, 47);
		panel.add(panel_5);
		panel_5.setBackground(new Color(0, 102, 102));
		panel_5.setLayout(null);
		
		JLabel lblProjectsInfo = new JLabel("Projects Mgmt");
		lblProjectsInfo.setBounds(0, 0, 201, 47);
		panel_5.add(lblProjectsInfo);
		lblProjectsInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblProjectsInfo.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		JLabel lblPositionDepartment = new JLabel("Position : Department Head");
		lblPositionDepartment.setForeground(new Color(0, 102, 102));
		lblPositionDepartment.setFont(new Font("Modern No. 20", Font.BOLD, 25));
		lblPositionDepartment.setBackground(Color.WHITE);
		lblPositionDepartment.setBounds(185, 70, 367, 47);
		panel.add(lblPositionDepartment);
	}
}
