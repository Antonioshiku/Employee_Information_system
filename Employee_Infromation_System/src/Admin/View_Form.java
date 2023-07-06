package Admin;

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
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class View_Form extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Form frame = new View_Form(null,null,0,null,null,null,null,null,null,null);
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
	public View_Form(String Emp_ID,String Name,int Dept_ID,String Email,String Work_Ph_no,String Address,String Township,String City,String Salary,String Position) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-50 (3) (1).png"));
		setTitle("Employee Information management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,850,500);
		getContentPane().setLayout(null);
		
		ArrayList<String> rr=new ArrayList<String>();
		rr=showEmp(Emp_ID);
		
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
				new View_Emp_Form().setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		button.setBackground(new Color(0, 102, 102));
		button.setBounds(62, 422, 145, 28);
		panel_2.add(button);
		
		JButton button_1 = new JButton("Close");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		button_1.setBackground(new Color(0, 102, 102));
		button_1.setBounds(232, 422, 145, 28);
		panel_2.add(button_1);
		
		JPanel ladd = new JPanel();
		ladd.setBorder(new LineBorder(new Color(0, 102, 102)));
		ladd.setBackground(UIManager.getColor("CheckBox.background"));
		ladd.setBounds(62, 53, 712, 357);
		panel_2.add(ladd);
		ladd.setLayout(null);
		
		JLabel label = new JLabel("Department ID :");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		label.setBounds(10, 163, 151, 14);
		ladd.add(label);
		
		JLabel label_1 = new JLabel("Email :");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		label_1.setBounds(10, 332, 78, 14);
		ladd.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.WHITE));
		panel_1.setBackground(new Color(0, 102, 102));
		panel_1.setBounds(37, 11, 102, 92);
		ladd.add(panel_1);
		
		JLabel label_27 = new JLabel("");
		label_27.setBackground(new Color(0, 102, 102));
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setIcon(new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\photo_2023-06-15_10-33-47.jpg"));
		label_27.setBounds(0, 0, 102, 92);
		panel_1.add(label_27);
		
		JLabel label_3 = new JLabel(Position);
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		label_3.setBounds(157, 67, 191, 36);
		ladd.add(label_3);
		
		JLabel label_4 = new JLabel(Name);
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
		label_4.setBounds(160, 33, 163, 23);
		ladd.add(label_4);
		
		JLabel label_5 = new JLabel("Employee ID :");
		label_5.setForeground(Color.BLACK);
		label_5.setBackground(new Color(0, 102, 102));
		label_5.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		label_5.setBounds(10, 120, 151, 14);
		ladd.add(label_5);
		
		JLabel lblWorkPhoneNo = new JLabel("Work Phone No. :");
		lblWorkPhoneNo.setForeground(Color.BLACK);
		lblWorkPhoneNo.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblWorkPhoneNo.setBounds(10, 205, 167, 14);
		ladd.add(lblWorkPhoneNo);
		
		JLabel label_8 = new JLabel("Address :");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		label_8.setBounds(10, 246, 85, 14);
		ladd.add(label_8);
		
		JLabel lblNrc = new JLabel("NRC :");
		lblNrc.setForeground(Color.BLACK);
		lblNrc.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lblNrc.setBounds(10, 288, 124, 14);
		ladd.add(lblNrc);
		
		JLabel label_14 = new JLabel(Emp_ID);
		label_14.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		label_14.setBounds(160, 120, 105, 14);
		ladd.add(label_14);
		
		JLabel ldept = new JLabel(String.valueOf(Dept_ID));
		ldept.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		ldept.setBounds(159, 163, 83, 14);
		ladd.add(ldept);
		
		JLabel lemail = new JLabel(Email);
		lemail.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lemail.setBounds(160, 205, 188, 15);
		ladd.add(lemail);
		
		JLabel lph = new JLabel(Work_Ph_no);
		lph.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lph.setBounds(161, 323, 227, 23);
		ladd.add(lph);
		
		JLabel laddresws = new JLabel(Address);
		laddresws.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		laddresws.setBounds(161, 237, 200, 23);
		ladd.add(laddresws);
		
		JLabel lnrc = new JLabel(rr.get(3));
		lnrc.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		lnrc.setBounds(160, 279, 176, 23);
		ladd.add(lnrc);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 102, 102));
		panel_4.setBounds(350, 0, 362, 357);
		ladd.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label_2 = new JLabel("Township :");
		label_2.setBounds(10, 82, 85, 14);
		panel_4.add(label_2);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		
		JLabel label_10 = new JLabel("City :");
		label_10.setBounds(10, 127, 69, 14);
		panel_4.add(label_10);
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		
		JLabel label_11 = new JLabel("Region :");
		label_11.setBounds(10, 187, 85, 14);
		panel_4.add(label_11);
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		
		JLabel label_12 = new JLabel("Salary :");
		label_12.setBounds(10, 232, 105, 14);
		panel_4.add(label_12);
		label_12.setForeground(Color.BLACK);
		label_12.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		
		JLabel lblDob = new JLabel(" DOB :");
		lblDob.setBounds(10, 279, 105, 14);
		panel_4.add(lblDob);
		lblDob.setForeground(Color.BLACK);
		lblDob.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		
		JLabel label_6 = new JLabel("Status :");
		label_6.setBounds(10, 333, 85, 14);
		panel_4.add(label_6);
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		
		JLabel ltown = new JLabel(Township);
		ltown.setBounds(148, 77, 140, 25);
		panel_4.add(ltown);
		ltown.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		
		JLabel lcity = new JLabel(City);
		lcity.setBounds(148, 122, 105, 25);
		panel_4.add(lcity);
		lcity.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		
		JLabel lregion = new JLabel(rr.get(0));
		lregion.setBounds(148, 173, 105, 28);
		panel_4.add(lregion);
		lregion.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		
		JLabel lsalary = new JLabel(Salary);
		lsalary.setBounds(148, 211, 105, 35);
		panel_4.add(lsalary);
		lsalary.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		
		JLabel ldob = new JLabel(rr.get(2));
		ldob.setBounds(148, 268, 105, 25);
		panel_4.add(ldob);
		ldob.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		
		JLabel lstatus = new JLabel(rr.get(1));
		lstatus.setBounds(148, 334, 204, 13);
		panel_4.add(lstatus);
		lstatus.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		
		JLabel label_26 = new JLabel("EIMS");
		label_26.setBounds(79, 0, 245, 94);
		panel_4.add(label_26);
		label_26.setIcon(new ImageIcon("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-100.png"));
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setForeground(Color.BLACK);
		label_26.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		label_26.setBackground(new Color(0, 102, 102));
		
		JLabel lblPersonalInformations = new JLabel("Employee Personal Informations");
		lblPersonalInformations.setHorizontalAlignment(SwingConstants.LEFT);
		lblPersonalInformations.setForeground(new Color(0, 102, 102));
		lblPersonalInformations.setFont(new Font("Mongolian Baiti", Font.BOLD, 32));
		lblPersonalInformations.setBackground(Color.WHITE);
		lblPersonalInformations.setBounds(62, 4, 582, 38);
		panel_2.add(lblPersonalInformations);
		
		JButton btnUpdateEmployee = new JButton("Update Employee");
		btnUpdateEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				try {
					new Update_emp_form(Emp_ID, Name, Dept_ID, Email, Work_Ph_no, Address, Township, City, Salary, Position).setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnUpdateEmployee.setForeground(Color.WHITE);
		btnUpdateEmployee.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		btnUpdateEmployee.setBackground(new Color(0, 102, 102));
		btnUpdateEmployee.setBounds(595, 420, 179, 28);
		panel_2.add(btnUpdateEmployee);
	}
	
	public ArrayList<String> showEmp(String emp) {
		ArrayList<String> result = new ArrayList<String>();
		Connection con;
		String query = "select address.region,role_history.status,employee.dob,employee.NRC from employee,address,role_history where employee.emp_id =?  && employee.emp_Id = role_history.emp_Id && employee.emp_Id = address.emp_id; ";

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system" + "", "root",
					"123456");
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, emp);

			ResultSet rs = stmt.executeQuery();
//			String emp_id, F_Name, L_Name, Ph_No, add, Email, town, city, salary, position, status, dept_id;
			while (rs.next()) {
				result.add(0, rs.getString(1));
				result.add(1, rs.getString(2));
				result.add(2, rs.getString(3));
				result.add(3, rs.getString(4));

			}

		} catch (Exception ee) {
			ee.printStackTrace();
		}
		return result;
	}
}

