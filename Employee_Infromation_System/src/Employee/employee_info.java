package Employee;

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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class employee_info extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employee_info frame = new employee_info(null);
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
	public employee_info(String emp_id) {
		
		ArrayList<String> rr=new ArrayList<String>();
		rr=EmpInfo(emp_id);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-50 (3) (1).png"));
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
				new Employee_Dashboard(emp_id,null).setVisible(true);
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
		label_1.setBounds(37, 289, 78, 14);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("Township :");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_2.setBounds(472, 121, 85, 14);
		panel_3.add(label_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.WHITE));
		panel_1.setBackground(new Color(0, 102, 102));
		panel_1.setBounds(37, 10, 102, 93);
		panel_3.add(panel_1);
		
		JLabel label_27 = new JLabel("");
		label_27.setBackground(new Color(0, 102, 102));
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setIcon(new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\photo_2023-06-15_10-33-47.jpg"));
		label_27.setBounds(0, 0, 102, 92);
		panel_1.add(label_27);
		
		JLabel label_3 = new JLabel(rr.get(8));
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		label_3.setBounds(149, 66, 191, 14);
		panel_3.add(label_3);
		
		JLabel lName = new JLabel(rr.get(1));
		lName.setForeground(Color.BLACK);
		lName.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lName.setBounds(149, 41, 105, 14);
		panel_3.add(lName);
		
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
		
		JLabel label_10 = new JLabel("City :");
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_10.setBounds(472, 163, 69, 14);
		panel_3.add(label_10);
		
		JLabel label_11 = new JLabel("Region :");
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_11.setBounds(472, 205, 85, 14);
		panel_3.add(label_11);
		
		JLabel label_12 = new JLabel("Salary :");
		label_12.setForeground(Color.BLACK);
		label_12.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_12.setBounds(472, 246, 105, 14);
		panel_3.add(label_12);
		
		JLabel lblDob = new JLabel("DOB  :");
		lblDob.setForeground(Color.BLACK);
		lblDob.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblDob.setBounds(472, 289, 105, 14);
		panel_3.add(lblDob);
		
		JLabel lEmp = new JLabel(emp_id);
		lEmp.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lEmp.setBounds(175, 121, 105, 14);
		panel_3.add(lEmp);
		
		JLabel lDept = new JLabel(rr.get(0));
		lDept.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lDept.setBounds(225, 164, 105, 14);
		panel_3.add(lDept);
		
		JLabel lWph = new JLabel(rr.get(2));
		lWph.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lWph.setBounds(253, 205, 105, 14);
		panel_3.add(lWph);
		
		JLabel lEmail = new JLabel(rr.get(3));
		lEmail.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lEmail.setBounds(140, 289, 190, 14);
		panel_3.add(lEmail);
		
		JLabel ladd = new JLabel(rr.get(4));
		ladd.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		ladd.setBounds(140, 247, 190, 14);
		panel_3.add(ladd);
	
		
		JLabel lTown = new JLabel(rr.get(5));
		lTown.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lTown.setBounds(597, 121, 105, 14);
		panel_3.add(lTown);
		
		JLabel lCity = new JLabel(rr.get(6));
		lCity.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lCity.setBounds(558, 163, 105, 14);
		panel_3.add(lCity);
		
		JLabel lRegion = new JLabel(rr.get(7));
		lRegion.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lRegion.setBounds(586, 205, 105, 14);
		panel_3.add(lRegion);
		
		JLabel lSalary = new JLabel(rr.get(9));
		lSalary.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lSalary.setBounds(587, 246, 105, 14);
		panel_3.add(lSalary);
		
		JLabel label_24 = new JLabel(rr.get(10));
		label_24.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		label_24.setBounds(558, 332, 105, 14);
		panel_3.add(label_24);
		
		JLabel lDOB = new JLabel(rr.get(12));
		lDOB.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lDOB.setBounds(587, 289, 105, 14);
		panel_3.add(lDOB);
		
		JLabel label_26 = new JLabel("EIMS");
		label_26.setIcon(new ImageIcon("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-100.png"));
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
		
		JLabel label_6 = new JLabel("Status :");
		label_6.setBounds(121, 333, 85, 14);
		panel_4.add(label_6);
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		
		JLabel label_1_1 = new JLabel("NRC :");
		label_1_1.setForeground(Color.BLACK);
		label_1_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_1_1.setBounds(37, 321, 78, 14);
		panel_3.add(label_1_1);
		
		JLabel lNRc = new JLabel(rr.get(11));
		lNRc.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lNRc.setBounds(140, 323, 190, 14);
		panel_3.add(lNRc);
		
		JLabel lblPersonalInformations = new JLabel("Employee Personal Informations");
		lblPersonalInformations.setHorizontalAlignment(SwingConstants.LEFT);
		lblPersonalInformations.setForeground(new Color(0, 102, 102));
		lblPersonalInformations.setFont(new Font("Mongolian Baiti", Font.BOLD, 32));
		lblPersonalInformations.setBackground(Color.WHITE);
		lblPersonalInformations.setBounds(62, 4, 582, 38);
		panel_2.add(lblPersonalInformations);
	}
	
	public ArrayList<String> EmpInfo(String emp) {
		ArrayList<String> result = new ArrayList<String>();
		Connection con;
         String query=" select employee.dept_id,employee.F_Name,employee.L_Name,employee.Work_Ph_No,employee.Email,Address.address,Address.TownShip,Address.City,Address.Region,role_history.position,role_history.Salary,role_history.status,Employee.NRC,Employee.DOB from employee,role_history,address where employee.emp_id=? && employee.emp_id=role_history.emp_id && employee.emp_id=address.emp_id";
         
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system" + "", "root",
					"123456");
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, emp);

			ResultSet rs = stmt.executeQuery();
//			String emp_id, F_Name, L_Name, Ph_No, add, Email, town, city, salary, position, status, dept_id;
			while (rs.next()) {
				result.add(0, rs.getString(1));
				result.add(1, rs.getString(2) + rs.getString(3));
				result.add(2,rs.getString(4));
				result.add(3,rs.getString(5));
				result.add(4,rs.getString(6));
				result.add(5,rs.getString(7));
				result.add(6,rs.getString(8));
				result.add(7,rs.getString(9));
				result.add(8,rs.getString(10));
				result.add(9,rs.getString(11));
				result.add(10,rs.getString(12));
				result.add(11,rs.getString(13));
				result.add(12,rs.getString(14));
				
				

			}

		} catch (Exception ee) {
			ee.printStackTrace();
		}
		return result;
	}
}

