package Admin

;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Create_emp_info extends JFrame {

	private JPanel contentPane;
	private JTextField txtemp;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;

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
		setTitle("Employee Information System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 102));
		panel.setBounds(0, 0, 1082, 695);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome ");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 13, 1046, 72);
		panel.add(lblNewLabel);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(12, 86, 336, 596);
		panel.add(desktopPane);
		
		JLabel lblNewLabel_1 = new JLabel("Emp_id        :");
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewLabel_1.setBounds(12, 79, 168, 47);
		desktopPane.add(lblNewLabel_1);
		
		txtemp = new JTextField();
		txtemp.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtemp.setBounds(192, 93, 126, 22);
		desktopPane.add(txtemp);
		txtemp.setColumns(10);
		
		JLabel lbldept = new JLabel("Dept_id       :");
		lbldept.setFont(new Font("Monospaced", Font.BOLD, 18));
		lbldept.setBounds(12, 139, 173, 47);
		desktopPane.add(lbldept);
		
		JLabel lblType = new JLabel("Type          :");
		lblType.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblType.setBounds(12, 275, 181, 47);
		desktopPane.add(lblType);
		
		JLabel lblFieldname = new JLabel("Field_Name    :");
		lblFieldname.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblFieldname.setBounds(12, 335, 181, 47);
		desktopPane.add(lblFieldname);
		
		JLabel lblOrgname = new JLabel("Org_Name      :");
		lblOrgname.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblOrgname.setBounds(12, 395, 165, 47);
		desktopPane.add(lblOrgname);
		
		JLabel lblFromdate = new JLabel("From_date     :");
		lblFromdate.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblFromdate.setBounds(12, 455, 165, 47);
		desktopPane.add(lblFromdate);
		
		JLabel lblEnddate = new JLabel("End_date      :");
		lblEnddate.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblEnddate.setBounds(12, 520, 165, 47);
		desktopPane.add(lblEnddate);
		
		JLabel lblNewLabel_2 = new JLabel("Qualification");
		lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblNewLabel_2.setBounds(12, 13, 281, 37);
		desktopPane.add(lblNewLabel_2);
		
		JTextArea txtrDegree = new JTextArea();
		txtrDegree.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtrDegree.setText("Degree\r\nCertification :");
		txtrDegree.setBackground(Color.LIGHT_GRAY);
		txtrDegree.setBounds(12, 207, 168, 55);
		desktopPane.add(txtrDegree);
		
		textField = new JTextField();
		textField.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField.setColumns(10);
		textField.setBounds(192, 153, 126, 22);
		desktopPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(192, 231, 126, 22);
		desktopPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(192, 349, 126, 22);
		desktopPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(192, 409, 126, 22);
		desktopPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(192, 469, 126, 22);
		desktopPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(192, 534, 126, 22);
		desktopPane.add(textField_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"None", "Bachelor", "Cartificate"}));
		comboBox.setBounds(192, 289, 126, 22);
		desktopPane.add(comboBox);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.LIGHT_GRAY);
		desktopPane_1.setBounds(373, 86, 336, 596);
		panel.add(desktopPane_1);
		
		JLabel lblRoleid = new JLabel("Role_id       :");
		lblRoleid.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblRoleid.setBounds(12, 79, 168, 47);
		desktopPane_1.add(lblRoleid);
		
		JLabel lblEmpid = new JLabel("Emp_id        :");
		lblEmpid.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblEmpid.setBounds(12, 139, 173, 47);
		desktopPane_1.add(lblEmpid);
		
		JLabel lblPosition = new JLabel("Position      :");
		lblPosition.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblPosition.setBounds(12, 275, 181, 47);
		desktopPane_1.add(lblPosition);
		
		JLabel lblSalary = new JLabel("Salary        :");
		lblSalary.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblSalary.setBounds(12, 335, 181, 47);
		desktopPane_1.add(lblSalary);
		
		JLabel lblStatus = new JLabel("Status        :");
		lblStatus.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblStatus.setBounds(12, 395, 165, 47);
		desktopPane_1.add(lblStatus);
		
		JLabel label_5 = new JLabel("From_date     :");
		label_5.setFont(new Font("Monospaced", Font.BOLD, 18));
		label_5.setBounds(12, 455, 165, 47);
		desktopPane_1.add(label_5);
		
		JLabel lblTodate = new JLabel("To_date       :");
		lblTodate.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblTodate.setBounds(12, 520, 165, 47);
		desktopPane_1.add(lblTodate);
		
		JLabel lblRolehistory = new JLabel("Role_History");
		lblRolehistory.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblRolehistory.setBounds(12, 13, 281, 37);
		desktopPane_1.add(lblRolehistory);
		
		JLabel lblDeptid_1 = new JLabel("Dept_id       :");
		lblDeptid_1.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblDeptid_1.setBounds(12, 215, 173, 47);
		desktopPane_1.add(lblDeptid_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(187, 93, 126, 22);
		desktopPane_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(187, 153, 126, 22);
		desktopPane_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(187, 229, 126, 22);
		desktopPane_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(187, 289, 126, 22);
		desktopPane_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_10.setColumns(10);
		textField_10.setBounds(187, 349, 126, 22);
		desktopPane_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_11.setColumns(10);
		textField_11.setBounds(187, 409, 126, 22);
		desktopPane_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_12.setColumns(10);
		textField_12.setBounds(187, 469, 126, 22);
		desktopPane_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_13.setColumns(10);
		textField_13.setBounds(187, 534, 126, 22);
		desktopPane_1.add(textField_13);
		
		JDesktopPane desktoPane = new JDesktopPane();
		desktoPane.setBackground(Color.LIGHT_GRAY);
		desktoPane.setBounds(734, 86, 336, 527);
		panel.add(desktoPane);
		
		JLabel label_8 = new JLabel("Emp_id        :");
		label_8.setFont(new Font("Monospaced", Font.BOLD, 18));
		label_8.setBounds(12, 79, 168, 47);
		desktoPane.add(label_8);
		
		JLabel lblCompany = new JLabel("Company       :");
		lblCompany.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblCompany.setBounds(12, 139, 173, 47);
		desktoPane.add(lblCompany);
		
		JLabel lblWorkingexp = new JLabel("Working_exp   :");
		lblWorkingexp.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblWorkingexp.setBounds(12, 275, 181, 47);
		desktoPane.add(lblWorkingexp);
		
		JLabel lblWorkid = new JLabel("Work_id       :");
		lblWorkid.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblWorkid.setBounds(12, 335, 181, 47);
		desktoPane.add(lblWorkid);
		
		JLabel lblStartdate = new JLabel("Start_date    :");
		lblStartdate.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblStartdate.setBounds(15, 395, 165, 47);
		desktoPane.add(lblStartdate);
		
		JLabel label_14 = new JLabel("End_date      :");
		label_14.setFont(new Font("Monospaced", Font.BOLD, 18));
		label_14.setBounds(12, 455, 165, 47);
		desktoPane.add(label_14);
		
		JLabel lblWorking = new JLabel("Working_Experience");
		lblWorking.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblWorking.setBounds(12, 13, 281, 37);
		desktoPane.add(lblWorking);
		
		JLabel lblPosition_1 = new JLabel("Position      :");
		lblPosition_1.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblPosition_1.setBounds(12, 215, 181, 47);
		desktoPane.add(lblPosition_1);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_14.setColumns(10);
		textField_14.setBounds(198, 93, 126, 22);
		desktoPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_15.setColumns(10);
		textField_15.setBounds(198, 153, 126, 22);
		desktoPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_16.setColumns(10);
		textField_16.setBounds(198, 229, 126, 22);
		desktoPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_17.setColumns(10);
		textField_17.setBounds(198, 287, 126, 22);
		desktoPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_18.setColumns(10);
		textField_18.setBounds(198, 349, 126, 22);
		desktoPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_19.setColumns(10);
		textField_19.setBounds(198, 409, 126, 22);
		desktoPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Monospaced", Font.BOLD, 18));
		textField_20.setColumns(10);
		textField_20.setBounds(198, 469, 126, 22);
		desktoPane.add(textField_20);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(735, 645, 97, 37);
		panel.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnClear.setForeground(Color.BLACK);
		btnClear.setBounds(857, 645, 97, 37);
		panel.add(btnClear);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnBack.setForeground(Color.BLACK);
		btnBack.setBounds(973, 645, 97, 37);
		panel.add(btnBack);
	}
}
