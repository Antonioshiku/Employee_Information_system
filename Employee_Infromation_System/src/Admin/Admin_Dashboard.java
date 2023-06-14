package Admin;


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
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Admin_Dashboard extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Dashboard frame = new Admin_Dashboard();
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
	public Admin_Dashboard() {
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
		
		JButton button = new JButton("Dept ");
		button.setBounds(391, 211, 201, 99);
		button.setIcon(new ImageIcon("D:\\HR Info Sys Pto\\icons8-organization-chart-people-96.png"));
		button.setForeground(new Color(0, 102, 102));
		button.setFont(new Font("Monospaced", Font.BOLD, 20));
		button.setBackground(Color.WHITE);
		panel.add(button);
		
		JButton btnProjects = new JButton("PJs");
		btnProjects.setBounds(623, 250, 201, 99);
		btnProjects.setIcon(new ImageIcon("D:\\HR Info Sys Pto\\icons8-project-management-96 (1).png"));
		btnProjects.setForeground(new Color(128, 128, 128));
		btnProjects.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnProjects.setBackground(Color.WHITE);
		panel.add(btnProjects);
		
		JButton button_2 = new JButton("Emp");
		button_2.setBounds(155, 163, 201, 99);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_2.setIcon(new ImageIcon("D:\\HR Info Sys Pto\\icons8-profile-96.png"));
		button_2.setForeground(new Color(0, 0, 102));
		button_2.setFont(new Font("Monospaced", Font.BOLD, 20));
		button_2.setBackground(Color.WHITE);
		panel.add(button_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 145, 461);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(0, 102, 102));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.WHITE));
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(21, 11, 102, 92);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(0, 0, 102, 92);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\HR Info Sys Pto\\photo_2023-06-09_16-04-48.png"));
		
		JLabel lblAdmin = new JLabel(" Aung Phone Naing");
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setBounds(0, 103, 145, 28);
		panel_1.add(lblAdmin);
		lblAdmin.setFont(new Font("Modern No. 20", Font.BOLD, 14));
		
		JLabel lblaphonen = new JLabel("@aphone_n2004");
		lblaphonen.setHorizontalAlignment(SwingConstants.CENTER);
		lblaphonen.setBounds(21, 118, 113, 23);
		panel_1.add(lblaphonen);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setIcon(new ImageIcon("D:\\HR Info Sys Pto\\icons8-logout-rounded-30.png"));
		btnLogout.setBackground(Color.LIGHT_GRAY);
		btnLogout.setFont(new Font("Modern No. 20", Font.BOLD, 20));
		btnLogout.setBounds(0, 401, 145, 28);
		panel_1.add(btnLogout);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_8.setBounds(0, 152, 145, 10);
		panel_1.add(panel_8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 834, 33);
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel.add(panel_2);
		
		JLabel lblHelloWelcomeAdmin = new JLabel("Hello, welcome Aung!");
		lblHelloWelcomeAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelloWelcomeAdmin.setBounds(145, 0, 162, 33);
		panel_2.add(lblHelloWelcomeAdmin);
		lblHelloWelcomeAdmin.setIcon(new ImageIcon("D:\\HR Info Sys Pto\\icons8-male-user-24.png"));
		
		JLabel lblManagementSystem = new JLabel("MANAGEMENT SYSTEM");
		lblManagementSystem.setBounds(155, 32, 505, 47);
		lblManagementSystem.setForeground(new Color(0, 102, 102));
		lblManagementSystem.setFont(new Font("Modern No. 20", Font.BOLD, 33));
		panel.add(lblManagementSystem);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(145, 70, 528, 4);
		panel_4.setBackground(new Color(0, 102, 102));
		panel.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(155, 263, 201, 47);
		panel_5.setBackground(new Color(0, 102, 102));
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblEmployee = new JLabel("  Employee Mgmt");
		lblEmployee.setBounds(0, 0, 201, 47);
		panel_5.add(lblEmployee);
		lblEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployee.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(391, 309, 201, 47);
		panel_6.setBackground(new Color(0, 102, 102));
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblDepartmentMgmt = new JLabel("Department Mgmt");
		lblDepartmentMgmt.setBounds(0, 0, 201, 47);
		panel_6.add(lblDepartmentMgmt);
		lblDepartmentMgmt.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepartmentMgmt.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(623, 348, 201, 47);
		panel_7.setBackground(new Color(0, 102, 102));
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblProjectsInfo = new JLabel("Projects Info");
		lblProjectsInfo.setBounds(0, 0, 201, 47);
		panel_7.add(lblProjectsInfo);
		lblProjectsInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblProjectsInfo.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		JLabel lblAdminster = new JLabel("Position : Administrator");
		lblAdminster.setBackground(Color.WHITE);
		lblAdminster.setForeground(new Color(0, 102, 102));
		lblAdminster.setFont(new Font("Modern No. 20", Font.BOLD, 25));
		lblAdminster.setBounds(155, 70, 327, 47);
		panel.add(lblAdminster);
	}
}