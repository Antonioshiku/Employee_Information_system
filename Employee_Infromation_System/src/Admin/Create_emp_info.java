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
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Create_emp_info extends JFrame {
	private JTextField txt_emp_id;
	private JTextField txt_dept_id;
	private JTextField txt_FName;
	private JTextField txt_LName;
	private JTextField txt_age;
	private JTextField txt_dob;
	private JTextField txt_Per_ph;
	private JTextField txt_Work_ph;
	private JTextField txt_M_status;
	private JTextField txt_address;
	private JTextField txt_city;
	private JTextField txt_religion;
	private JTextField txt_nrc;
	private JTextField txt_Email;
	private JTextField txt_J_Date;
	private JTextField txt_nationality;
	private JTextField txt_FatherN;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txt_town;
	private JTextField txt_postal;
	private JTextField txt_add_code;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create_emp_info frame = new Create_emp_info();
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
	public Create_emp_info() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-50 (3) (1).png"));
		setTitle("Employee Information management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1100,705);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 1084, 666);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 164, 348, 489);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_7 = new JLabel("Employee ID :");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_7.setBounds(10, 60, 245, 14);
		panel_1.add(label_7);
		
		txt_emp_id = new JTextField();
		txt_emp_id.setColumns(10);
		txt_emp_id.setBounds(10, 79, 328, 28);
		panel_1.add(txt_emp_id);
		
		JLabel label_9 = new JLabel("Departmengt ID :");
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_9.setBounds(10, 136, 245, 14);
		panel_1.add(label_9);
		
		txt_dept_id = new JTextField();
		txt_dept_id.setColumns(10);
		txt_dept_id.setBounds(10, 155, 328, 28);
		panel_1.add(txt_dept_id);
		
		JLabel lblDegreeCer = new JLabel("First Name :");
		lblDegreeCer.setForeground(Color.BLACK);
		lblDegreeCer.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblDegreeCer.setBounds(10, 210, 245, 14);
		panel_1.add(lblDegreeCer);
		
		txt_FName = new JTextField();
		txt_FName.setColumns(10);
		txt_FName.setBounds(10, 229, 328, 28);
		panel_1.add(txt_FName);
		
		JLabel lblType = new JLabel("Last Name :");
		lblType.setForeground(Color.BLACK);
		lblType.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblType.setBounds(10, 281, 245, 14);
		panel_1.add(lblType);
		
		txt_LName = new JTextField();
		txt_LName.setColumns(10);
		txt_LName.setBounds(10, 300, 328, 28);
		panel_1.add(txt_LName);
		
		JLabel lblFieldName = new JLabel("Gender :");
		lblFieldName.setForeground(Color.BLACK);
		lblFieldName.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblFieldName.setBounds(10, 353, 245, 14);
		panel_1.add(lblFieldName);
		
		txt_age = new JTextField();
		txt_age.setColumns(10);
		txt_age.setBounds(10, 432, 328, 28);
		panel_1.add(txt_age);
		
		JLabel lblOrgName = new JLabel("Age :");
		lblOrgName.setForeground(Color.BLACK);
		lblOrgName.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblOrgName.setBounds(10, 413, 245, 14);
		panel_1.add(lblOrgName);
		
		JLabel lblQualification = new JLabel("Personal Information");
		lblQualification.setForeground(new Color(0, 102, 102));
		lblQualification.setFont(new Font("Modern No. 20", Font.BOLD, 25));
		lblQualification.setBackground(Color.WHITE);
		lblQualification.setBounds(11, 2, 327, 47);
		panel_1.add(lblQualification);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBackground(Color.WHITE);
		rdbtnMale.setFont(new Font("Monospaced", Font.PLAIN, 13));
		rdbtnMale.setBounds(20, 374, 109, 23);
		panel_1.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBackground(new Color(255, 255, 255));
		rdbtnFemale.setFont(new Font("Monospaced", Font.PLAIN, 13));
		rdbtnFemale.setBounds(159, 374, 109, 23);
		panel_1.add(rdbtnFemale);
		
		JLabel label = new JLabel("EIMS");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		label.setBackground(new Color(0, 102, 102));
		label.setBounds(10, 68, 348, 94);
		panel.add(label);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 102, 102));
		panel_4.setBounds(10, 68, 348, 94);
		panel.add(panel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(368, 10, 348, 547);
		panel.add(panel_2);
		
		JLabel lblRoleId = new JLabel("Date Of Birth :");
		lblRoleId.setForeground(Color.BLACK);
		lblRoleId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblRoleId.setBounds(10, 80, 245, 14);
		panel_2.add(lblRoleId);
		
		txt_dob = new JTextField();
		txt_dob.setColumns(10);
		txt_dob.setBounds(10, 104, 328, 28);
		panel_2.add(txt_dob);
		
		JLabel lblEmployeeId = new JLabel("Personal_Ph_No. :");
		lblEmployeeId.setForeground(Color.BLACK);
		lblEmployeeId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEmployeeId.setBounds(10, 228, 245, 14);
		panel_2.add(lblEmployeeId);
		
		txt_Per_ph = new JTextField();
		txt_Per_ph.setColumns(10);
		txt_Per_ph.setBounds(10, 252, 328, 28);
		panel_2.add(txt_Per_ph);
		
		JLabel lblDeptId = new JLabel("Work_Ph_No. :");
		lblDeptId.setForeground(Color.BLACK);
		lblDeptId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblDeptId.setBounds(10, 321, 245, 14);
		panel_2.add(lblDeptId);
		
		txt_Work_ph = new JTextField();
		txt_Work_ph.setColumns(10);
		txt_Work_ph.setBounds(10, 340, 328, 28);
		panel_2.add(txt_Work_ph);
		
		JLabel lblPosition = new JLabel("Marital Status :");
		lblPosition.setForeground(Color.BLACK);
		lblPosition.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition.setBounds(10, 413, 245, 14);
		panel_2.add(lblPosition);
		
		txt_M_status = new JTextField();
		txt_M_status.setColumns(10);
		txt_M_status.setBounds(10, 432, 328, 28);
		panel_2.add(txt_M_status);
		
		JLabel label_1 = new JLabel("Father Name :");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_1.setBounds(10, 10, 245, 14);
		panel_2.add(label_1);
		
		txt_FatherN = new JTextField();
		txt_FatherN.setColumns(10);
		txt_FatherN.setBounds(10, 42, 328, 28);
		panel_2.add(txt_FatherN);
		
		JLabel lblEndDate_2 = new JLabel("Joined Date :");
		lblEndDate_2.setBounds(10, 470, 245, 14);
		panel_2.add(lblEndDate_2);
		lblEndDate_2.setForeground(Color.BLACK);
		lblEndDate_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		
		txt_J_Date = new JTextField();
		txt_J_Date.setBounds(10, 509, 328, 28);
		panel_2.add(txt_J_Date);
		txt_J_Date.setColumns(10);
		
		JLabel lblWorkingExp = new JLabel("NRC :");
		lblWorkingExp.setBounds(20, 142, 245, 14);
		panel_2.add(lblWorkingExp);
		lblWorkingExp.setForeground(Color.BLACK);
		lblWorkingExp.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		
		txt_nrc = new JTextField();
		txt_nrc.setBounds(10, 179, 328, 28);
		panel_2.add(txt_nrc);
		txt_nrc.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(726, 10, 348, 547);
		panel.add(panel_3);
		
		JLabel lblEmpId = new JLabel("Address :");
		lblEmpId.setForeground(Color.BLACK);
		lblEmpId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEmpId.setBounds(11, 69, 245, 14);
		panel_3.add(lblEmpId);
		
		txt_address = new JTextField();
		txt_address.setColumns(10);
		txt_address.setBounds(11, 88, 328, 28);
		panel_3.add(txt_address);
		
		JLabel lblCompany = new JLabel("City :");
		lblCompany.setForeground(Color.BLACK);
		lblCompany.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblCompany.setBounds(11, 427, 245, 14);
		panel_3.add(lblCompany);
		
		txt_city = new JTextField();
		txt_city.setColumns(10);
		txt_city.setBounds(11, 451, 328, 28);
		panel_3.add(txt_city);
		
		JLabel lblPosition_1 = new JLabel("Religion :");
		lblPosition_1.setForeground(Color.BLACK);
		lblPosition_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition_1.setBounds(11, 179, 245, 14);
		panel_3.add(lblPosition_1);
		
		txt_religion = new JTextField();
		txt_religion.setColumns(10);
		txt_religion.setBounds(11, 203, 328, 28);
		panel_3.add(txt_religion);
		
		JLabel lblWorkId = new JLabel("E-Mail :");
		lblWorkId.setForeground(Color.BLACK);
		lblWorkId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblWorkId.setBounds(11, 303, 245, 14);
		panel_3.add(lblWorkId);
		
		txt_Email = new JTextField();
		txt_Email.setColumns(10);
		txt_Email.setBounds(11, 327, 328, 28);
		panel_3.add(txt_Email);
		
		txt_nationality = new JTextField();
		txt_nationality.setColumns(10);
		txt_nationality.setBounds(11, 389, 328, 28);
		panel_3.add(txt_nationality);
		
		JLabel lblFromDate_2 = new JLabel("Nationality :");
		lblFromDate_2.setForeground(Color.BLACK);
		lblFromDate_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblFromDate_2.setBounds(11, 365, 245, 14);
		panel_3.add(lblFromDate_2);
		
		JLabel lblWorkingExperience = new JLabel("Address Information");
		lblWorkingExperience.setForeground(new Color(0, 102, 102));
		lblWorkingExperience.setFont(new Font("Modern No. 20", Font.BOLD, 25));
		lblWorkingExperience.setBackground(Color.WHITE);
		lblWorkingExperience.setBounds(11, 11, 327, 47);
		panel_3.add(lblWorkingExperience);
		
		JLabel lblEmpId_1 = new JLabel("TownShip :");
		lblEmpId_1.setForeground(Color.BLACK);
		lblEmpId_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEmpId_1.setBounds(11, 126, 245, 14);
		panel_3.add(lblEmpId_1);
		
		txt_town = new JTextField();
		txt_town.setColumns(10);
		txt_town.setBounds(11, 141, 328, 28);
		panel_3.add(txt_town);
		
		JLabel lblPosition_1_1 = new JLabel("Postal Code :");
		lblPosition_1_1.setForeground(Color.BLACK);
		lblPosition_1_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition_1_1.setBounds(11, 243, 245, 14);
		panel_3.add(lblPosition_1_1);
		
		txt_postal = new JTextField();
		txt_postal.setColumns(10);
		txt_postal.setBounds(11, 265, 328, 28);
		panel_3.add(txt_postal);
		
		JLabel lblAddressCode = new JLabel("address code :");
		lblAddressCode.setForeground(Color.BLACK);
		lblAddressCode.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblAddressCode.setBounds(11, 485, 245, 14);
		panel_3.add(lblAddressCode);
		
		txt_add_code = new JTextField();
		txt_add_code.setColumns(10);
		txt_add_code.setBounds(11, 509, 328, 28);
		panel_3.add(txt_add_code);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(368, 559, 706, 94);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JButton button = new JButton("Back");
		button.setBounds(10, 33, 110, 28);
		panel_5.add(button);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button.setBackground(new Color(0, 102, 102));
		
		JButton btnCreate = new JButton("Next ");
		btnCreate.setBounds(281, 33, 110, 28);
		panel_5.add(btnCreate);
		btnCreate.setForeground(Color.WHITE);
		btnCreate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnCreate.setBackground(new Color(0, 102, 102));
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_emp_id.setText("");
				txt_dept_id.setText("");
				txt_FName.setText(" ");
				txt_LName.setText(" ");
				buttonGroup.clearSelection();
				txt_age.setText(" ");
				txt_FatherN.setText(" ");
				txt_dob.setText(" ");
				txt_Per_ph.setText(" ");
				txt_Work_ph.setText(" ");
				txt_M_status.setText(" ");
				txt_address.setText(" ");
				txt_city.setText(" ");
				txt_religion.setText(" ");
				txt_nrc.setText(" ");
				txt_Email.setText(" ");
				txt_nationality.setText(" ");
				txt_J_Date.setText(" ");
			}
		});
		btnClear.setBounds(408, 33, 110, 28);
		panel_5.add(btnClear);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnClear.setBackground(new Color(0, 102, 102));
		
		JButton button_3 = new JButton("Close");
		button_3.setBounds(544, 33, 110, 28);
		panel_5.add(button_3);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button_3.setBackground(new Color(0, 102, 102));
		
		JButton btnCreate_2 = new JButton("Create");
		btnCreate_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCreate_2.setForeground(Color.WHITE);
		btnCreate_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnCreate_2.setBackground(new Color(0, 102, 102));
		btnCreate_2.setBounds(147, 33, 110, 28);
		panel_5.add(btnCreate_2);
	}
}

