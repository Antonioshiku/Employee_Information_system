package Application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GraphicsConfiguration;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import Main.role_history;

import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import Application.View_Table;

public class View_Emp extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Emp frame = new View_Emp(null, null, null, null, null, null, null, null, null);

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @return
	 */

	public View_Emp(String emp, String name, String ph_no, String add, String email, String town, String city,
			String salary, String position) {

		ArrayList<String> rs = new ArrayList<String>();
		rs = empInfo(emp);

		setIconImage(
				Toolkit.getDefaultToolkit().getImage("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-50 (3) (1).png"));
		setTitle("Employee Information management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 834, 461);
		getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 102, 102));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 0, 834, 461);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				try {
					new View_Table().setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		button.setBackground(new Color(0, 102, 102));
		button.setBounds(62, 422, 145, 28);
		panel_2.add(button);

		JButton button_1 = new JButton("Close");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		button_1.setBackground(new Color(0, 102, 102));
		button_1.setBounds(232, 422, 145, 28);
		panel_2.add(button_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 102, 102)));
		panel_3.setBackground(UIManager.getColor("CheckBox.background"));
		panel_3.setBounds(62, 53, 712, 357);
		panel_2.add(panel_3);
		panel_3.setLayout(null);

		JLabel label = new JLabel("Department ID :");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label.setBounds(37, 163, 124, 14);
		panel_3.add(label);

		JLabel label_1 = new JLabel("Email :");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_1.setBounds(37, 300, 78, 14);
		panel_3.add(label_1);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.WHITE));
		panel_1.setBackground(new Color(0, 102, 102));
		panel_1.setBounds(37, 9, 102, 81);
		panel_3.add(panel_1);

		JLabel label_27 = new JLabel("");
		label_27.setBackground(new Color(0, 102, 102));
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setIcon(
				new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\photo_2023-06-15_10-33-47.jpg"));
		label_27.setBounds(0, 0, 102, 81);
		panel_1.add(label_27);

		JLabel txt_position = new JLabel(position);
		txt_position.setForeground(Color.BLACK);
		txt_position.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txt_position.setBounds(149, 66, 153, 14);
		panel_3.add(txt_position);

		JLabel txt_name = new JLabel(name);
		txt_name.setForeground(Color.BLACK);
		txt_name.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txt_name.setBounds(149, 41, 105, 14);
		panel_3.add(txt_name);

		JLabel label_5 = new JLabel("Employee ID :");
		label_5.setForeground(Color.BLACK);
		label_5.setBackground(new Color(0, 102, 102));
		label_5.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_5.setBounds(37, 121, 105, 14);
		panel_3.add(label_5);

		JLabel label_7 = new JLabel("Work Phone Number :");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_7.setBounds(37, 205, 167, 14);
		panel_3.add(label_7);

		JLabel label_8 = new JLabel("Address :");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_8.setBounds(37, 246, 85, 14);
		panel_3.add(label_8);

		JLabel txt_empId = new JLabel(emp);
		txt_empId.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txt_empId.setBounds(175, 121, 105, 14);
		panel_3.add(txt_empId);

		JLabel txt_DeptId = new JLabel(rs.get(0));
		txt_DeptId.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txt_DeptId.setBounds(225, 164, 105, 14);
		panel_3.add(txt_DeptId);

		JLabel txt_WorkPh = new JLabel(ph_no);
		txt_WorkPh.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txt_WorkPh.setBounds(197, 205, 105, 14);
		panel_3.add(txt_WorkPh);

		JLabel txt_Email = new JLabel(add);
		txt_Email.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txt_Email.setBounds(120, 300, 182, 14);
		panel_3.add(txt_Email);

		JLabel txt_Address = new JLabel(email);
		txt_Address.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		txt_Address.setBounds(140, 247, 175, 14);
		panel_3.add(txt_Address);

		JLabel label_26 = new JLabel("EIMS");
		label_26.setIcon(
				new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\icons8-old-vmware-logo-100.png"));
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setForeground(Color.BLACK);
		label_26.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		label_26.setBackground(new Color(0, 102, 102));
		label_26.setBounds(432, 9, 245, 94);
		panel_3.add(label_26);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 102, 102));
		panel_4.setBounds(350, 0, 362, 357);
		panel_3.add(panel_4);
		panel_4.setLayout(null);

		JLabel label_2 = new JLabel("Township :");
		label_2.setBounds(82, 122, 85, 14);
		panel_4.add(label_2);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));

		JLabel label_10 = new JLabel("City :");
		label_10.setBounds(82, 167, 69, 14);
		panel_4.add(label_10);
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));

		JLabel label_11 = new JLabel("Region :");
		label_11.setBounds(82, 207, 85, 14);
		panel_4.add(label_11);
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));

		JLabel label_12 = new JLabel("Salary :");
		label_12.setBounds(82, 246, 105, 14);
		panel_4.add(label_12);
		label_12.setForeground(Color.BLACK);
		label_12.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));

		JLabel label_13 = new JLabel("Position :");
		label_13.setBounds(82, 289, 105, 14);
		panel_4.add(label_13);
		label_13.setForeground(Color.BLACK);
		label_13.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));

		JLabel label_6 = new JLabel("Status :");
		label_6.setBounds(82, 333, 85, 14);
		panel_4.add(label_6);
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));

		JLabel txt_Town = new JLabel(town);
		txt_Town.setBounds(177, 122, 175, 14);
		panel_4.add(txt_Town);
		txt_Town.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));

		JLabel txt_City = new JLabel(city);
		txt_City.setBounds(177, 167, 105, 14);
		panel_4.add(txt_City);
		txt_City.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));

		JLabel txt_Region = new JLabel(rs.get(1));
		txt_Region.setBounds(177, 207, 105, 14);
		panel_4.add(txt_Region);
		txt_Region.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));

		JLabel txt_Salary = new JLabel(salary);
		txt_Salary.setBounds(177, 246, 105, 14);
		panel_4.add(txt_Salary);
		txt_Salary.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));

		JLabel txt_Position = new JLabel(position);
		txt_Position.setBounds(177, 289, 160, 14);
		panel_4.add(txt_Position);
		txt_Position.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));

		JLabel txt_Status = new JLabel(rs.get(2));
		txt_Status.setBounds(177, 333, 105, 14);
		panel_4.add(txt_Status);
		txt_Status.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));

		JLabel lblPersonalInformations = new JLabel("Employee Personal Informations");
		lblPersonalInformations.setHorizontalAlignment(SwingConstants.LEFT);
		lblPersonalInformations.setForeground(new Color(0, 102, 102));
		lblPersonalInformations.setFont(new Font("Mongolian Baiti", Font.BOLD, 32));
		lblPersonalInformations.setBackground(Color.WHITE);
		lblPersonalInformations.setBounds(62, 4, 582, 38);
		panel_2.add(lblPersonalInformations);
	}

	public ArrayList<String> empInfo(String emp) {
		ArrayList<String> result = new ArrayList<String>();
		Connection con;
		String query = "select employee.dept_id,address.region,role_history.status from employee,address,role_history where employee.emp_id =?  && employee.emp_Id = role_history.emp_Id && employee.emp_Id = address.emp_id; ";

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system" + "", "root",
					"123456");
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, "1001");

			ResultSet rs = stmt.executeQuery();
//			String emp_id, F_Name, L_Name, Ph_No, add, Email, town, city, salary, position, status, dept_id;
			while (rs.next()) {
				result.add(0, rs.getString(1));
				result.add(1, rs.getString(2));
				result.add(2, rs.getString(3));

			}

		} catch (Exception ee) {
			ee.printStackTrace();
		}
		return result;
	}

}
