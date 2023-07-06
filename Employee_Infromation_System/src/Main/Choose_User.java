package Main;
import Admin.Admin_Login;
import Dept_Head.Dept_login;
import Employee.Employee_login;
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
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Choose_User extends JFrame {
	
	JButton but_admin,but_emp,but_dept;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Choose_User frame = new Choose_User();
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
	public Choose_User() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Java Project\\Employee_Infromation_System\\photo\\icons8-old-vmware-logo-100.png"));
		setTitle("Employee Information management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,850,500);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 834, 461);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		 but_dept = new JButton();
		 but_dept.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	 new Dept_login().setVisible(true);
	           setVisible(false);
	  
		 	}
		 
		 });
		but_dept.setBounds(391, 211, 201, 99);
		but_dept.setIcon(new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\icons8-department-96.png"));
		but_dept.setForeground(new Color(0, 102, 102));
		but_dept.setFont(new Font("Monospaced", Font.BOLD, 20));
		but_dept.setBackground(Color.WHITE);
		panel.add(but_dept);
		
		 but_admin = new JButton("Admin");
		but_admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        new Admin_Login().setVisible(true);
			        setVisible(false);
			}
		});
		but_admin.setBounds(165, 211, 201, 99);
		but_admin.setIcon(new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\icons8-administrator-male-80.png"));
		but_admin.setForeground(new Color(0, 0, 102));
		but_admin.setFont(new Font("Monospaced", Font.BOLD, 20));
		but_admin.setBackground(Color.WHITE);
		panel.add(but_admin);
		
		JLabel lblWelcomeToEmployee = new JLabel("  WELCOME\r\n");
		lblWelcomeToEmployee.setForeground(new Color(0, 102, 102));
		lblWelcomeToEmployee.setBounds(136, 34, 220, 42);
		panel.add(lblWelcomeToEmployee);
		lblWelcomeToEmployee.setFont(new Font("Modern No. 20", Font.BOLD, 32));
		
		JLabel lblEmployeeInformationSystem = new JLabel("EMPLOYEE INFORMATION MANAGEMENT SYSTEM");
		lblEmployeeInformationSystem.setBounds(165, 87, 646, 24);
		lblEmployeeInformationSystem.setForeground(new Color(0, 102, 102));
		lblEmployeeInformationSystem.setFont(new Font("Monospaced", Font.PLAIN, 28));
		panel.add(lblEmployeeInformationSystem);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 102, 102));
		panel_4.setBounds(146, 75, 528, 4);
		panel.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(0, 102, 102));
		panel_5.setBounds(165, 309, 201, 47);
		panel.add(panel_5);
		
		JLabel lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setBounds(0, 0, 201, 47);
		panel_5.add(lblAdminLogin);
		lblAdminLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLogin.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(0, 102, 102));
		panel_6.setBounds(391, 309, 201, 47);
		panel.add(panel_6);
		
		JLabel lblDeptHeadLogin = new JLabel("Dept Head Login");
		lblDeptHeadLogin.setBounds(0, 0, 201, 47);
		panel_6.add(lblDeptHeadLogin);
		lblDeptHeadLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeptHeadLogin.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(0, 102, 102));
		panel_7.setBounds(623, 309, 201, 47);
		panel.add(panel_7);
		
		JLabel lblEmployeeLogin = new JLabel("Employee Login");
		lblEmployeeLogin.setBounds(0, 0, 201, 47);
		panel_7.add(lblEmployeeLogin);
		lblEmployeeLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeLogin.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(0, 102, 102));
		panel_1.setBounds(0, 0, 145, 461);
		panel.add(panel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(Color.WHITE));
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(21, 11, 102, 92);
		panel_1.add(panel_3);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 102, 96);
		panel_3.add(label);
		label.setIcon(new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\icons8-old-vmware-logo-100.png"));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}	
		});
		btnExit.setIcon(new ImageIcon("D:\\HR Info Sys Pto\\icons8-exit-48 (1).png"));
		btnExit.setFont(new Font("Modern No. 20", Font.BOLD, 20));
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setBounds(0, 401, 145, 28);
		panel_1.add(btnExit);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_8.setBounds(0, 152, 145, 2);
		panel_1.add(panel_8);
		
		JLabel lblEims = new JLabel("EIMS");
		lblEims.setBounds(21, 100, 102, 41);
		panel_1.add(lblEims);
		lblEims.setHorizontalAlignment(SwingConstants.CENTER);
		lblEims.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 0, 834, 33);
		panel.add(panel_2);
		
		JLabel lblHelloWelcome = new JLabel("Hello!");
		lblHelloWelcome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHelloWelcome.setBounds(102, 0, 162, 33);
		panel_2.add(lblHelloWelcome);
		lblHelloWelcome.setIcon(new ImageIcon("D:\\HR Info Sys Pto\\icons8-male-user-24.png"));
		lblHelloWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		
		 but_emp = new JButton("Emp");
		 but_emp.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		new Employee_login().setVisible(true);
		 		setVisible(false);
		 	}
		 });
		but_emp.setBounds(623, 211, 201, 99);
		panel.add(but_emp);
		but_emp.setIcon(new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\icons8-employee-96.png"));
		but_emp.setForeground(Color.DARK_GRAY);
		but_emp.setFont(new Font("Monospaced", Font.BOLD, 20));
		but_emp.setBackground(Color.WHITE);
	}
}
