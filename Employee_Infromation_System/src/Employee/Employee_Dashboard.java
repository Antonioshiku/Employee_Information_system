package Employee;


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

public class Employee_Dashboard extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_Dashboard frame = new Employee_Dashboard(null,null);
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
	public Employee_Dashboard(String emp,String email) {
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
		
		JButton btnProjects = new JButton("PJs");
		btnProjects.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			  new employe_project_view(emp).setVisible(true);;
			}
		});
		btnProjects.setBounds(524, 208, 201, 99);
		btnProjects.setIcon(new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\icons8-organization-chart-people-96.png"));
		btnProjects.setForeground(new Color(128, 128, 128));
		btnProjects.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnProjects.setBackground(Color.WHITE);
		panel.add(btnProjects);
		
		JButton btnInfo = new JButton("Info");
		btnInfo.setBounds(259, 208, 201, 99);
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				new employee_info(emp).setVisible(true);
			}
		});
		btnInfo.setIcon(new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\icons8-profile-96.png"));
		btnInfo.setForeground(new Color(0, 0, 102));
		btnInfo.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnInfo.setBackground(Color.WHITE);
		panel.add(btnInfo);
		
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
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 102, 92);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\photo_2023-06-15_10-33-47.jpg"));
		
		JLabel lblAdmin = new JLabel(emp);
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setBounds(63, 113, 60, 28);
		panel_1.add(lblAdmin);
		lblAdmin.setFont(new Font("Modern No. 20", Font.BOLD, 14));
		
		JLabel lblaphonen = new JLabel(email);
		lblaphonen.setFont(new Font("Modern No. 20", Font.BOLD, 15));
		lblaphonen.setHorizontalAlignment(SwingConstants.CENTER);
		lblaphonen.setBounds(0, 143, 145, 23);
		panel_1.add(lblaphonen);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Employee_login().setVisible(true);
			}
		});
		btnLogout.setIcon(new ImageIcon("D:\\HR Info Sys Pto\\icons8-logout-rounded-30.png"));
		btnLogout.setBackground(Color.LIGHT_GRAY);
		btnLogout.setFont(new Font("Modern No. 20", Font.BOLD, 20));
		btnLogout.setBounds(0, 401, 145, 28);
		panel_1.add(btnLogout);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_8.setBounds(0, 176, 145, 2);
		panel_1.add(panel_8);
		
		JLabel lblNewLabel = new JLabel("Emp Id : ");
		lblNewLabel.setFont(new Font("Modern No. 20", Font.BOLD, 14));
		lblNewLabel.setBounds(20, 115, 77, 24);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 834, 33);
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel.add(panel_2);
		
		JLabel lblHelloWelcomeAdmin = new JLabel("Hello, welcome Lone!");
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
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(259, 306, 201, 47);
		panel_7.setBackground(new Color(0, 102, 102));
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblEmployee = new JLabel("Own Info");
		lblEmployee.setBounds(0, 0, 201, 47);
		panel_7.add(lblEmployee);
		lblEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployee.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(524, 306, 201, 47);
		panel.add(panel_5);
		panel_5.setBackground(new Color(0, 102, 102));
		panel_5.setLayout(null);
		
		JLabel lblProjectsInfo = new JLabel("Projects Info");
		lblProjectsInfo.setBounds(0, 0, 201, 47);
		panel_5.add(lblProjectsInfo);
		lblProjectsInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblProjectsInfo.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		JLabel lblPositionDepartment = new JLabel("Position : Employee");
		lblPositionDepartment.setForeground(new Color(0, 102, 102));
		lblPositionDepartment.setFont(new Font("Modern No. 20", Font.BOLD, 25));
		lblPositionDepartment.setBackground(Color.WHITE);
		lblPositionDepartment.setBounds(155, 70, 367, 47);
		panel.add(lblPositionDepartment);
	}
}
