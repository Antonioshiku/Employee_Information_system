package Dept_Head;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Dept_Head.View_Table;
import Main.role_history;

import javax.swing.border.CompoundBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Update_dept_emp extends JFrame {
	private JTextField txt_address;
	private JTextField txt_Wp;
	private JTextField txt_region;
	private JTextField txt_town;
	private JTextField txt_city;
	private JTextField txt_email;
	private JTextField txt_position;
	private JTextField txt_salary;
	private JComboBox combostatus,comboMastatus;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_dept_emp frame = new Update_dept_emp(null,null,null,null,null,null,null,null,null);
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
	public Update_dept_emp(String emp, String ph_no, String add, String Email, String town, String city,
			String salary, String position,String dept_id) {
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
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				try {
					new View_Table(emp,dept_id).setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Monospaced", Font.BOLD, 20));
		button.setBackground(new Color(0, 102, 102));
		button.setBounds(62, 424, 145, 28);
		panel.add(button);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Work_Ph=txt_Wp.getText();
				String Address=txt_address.getText();
				String Email=txt_email.getText();
				String Township=txt_town.getText();
				String city=txt_city.getText();
				String region=txt_region.getText();
				String salary=txt_salary.getText();
				String position=txt_position.getText();
				String status=combostatus.getSelectedItem().toString();
				String Martial_status=comboMastatus.getSelectedItem().toString();
				
				role_history rr=new role_history();
				rr.setW_phno(Work_Ph);
		        rr.setAddr(Address);	
		        rr.setEmail(Email);
		        rr.setTownship(Township);
		        rr.setCity(city);
		        rr.setRegion(region);
		        rr.setSalary(salary);
		        rr.setPosition(position);
		        rr.setMatrital_status(Martial_status);
		        rr.setStatus(status);
				int choice = JOptionPane.showConfirmDialog(null, "Do you really want to save your data",
						"Comfirm Message", JOptionPane.INFORMATION_MESSAGE);
				if (choice == JOptionPane.YES_OPTION)
					try {
				 		new ApplicationDAO().updateEmp(rr, emp);
					
						
					
					  txt_address.setText(" ");
					  txt_town.setText(" ");
					  txt_city.setText(" ");
					  txt_region.setText(" ");
					  txt_salary.setText(" ");
						txt_Wp.setText(" ");
						txt_position.setText(" ");
				  combostatus.setSelectedIndex(0);
				  comboMastatus.setSelectedIndex(0);
						
					} catch (SQLException e1_) {
						JOptionPane.showMessageDialog(null, "Database Connection Error", "Save Error",
								JOptionPane.ERROR_MESSAGE);
						System.out.println(e1_);
					
					}
			}
		});
		
		
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnUpdate.setBackground(new Color(0, 102, 102));
		btnUpdate.setBounds(243, 424, 145, 28);
		panel.add(btnUpdate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  txt_address.setText(" ");
				  txt_town.setText(" ");
				  txt_city.setText(" ");
				  txt_region.setText(" ");
				  txt_salary.setText(" ");
					txt_Wp.setText(" ");
					txt_position.setText(" ");
			  combostatus.setSelectedIndex(0);
			  comboMastatus.setSelectedIndex(0);
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnClear.setBackground(new Color(0, 102, 102));
		btnClear.setBounds(433, 424, 145, 28);
		panel.add(btnClear);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnClose.setBackground(new Color(0, 102, 102));
		btnClose.setBounds(620, 424, 145, 28);
		panel.add(btnClose);
		
		txt_address = new JTextField(town);
		txt_address.setColumns(10);
		txt_address.setBounds(40, 314, 500, 28);
		panel.add(txt_address);
		
		JLabel lblPosition = new JLabel("Address :");
		lblPosition.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition.setBounds(40, 296, 145, 14);
		panel.add(lblPosition);
		
		txt_Wp = new JTextField(ph_no);
		txt_Wp.setColumns(10);
		txt_Wp.setBounds(40, 182, 500, 28);
		panel.add(txt_Wp);
		
		JLabel lblWorkPhoneNumber = new JLabel("Work Phone Number :");
		lblWorkPhoneNumber.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblWorkPhoneNumber.setBounds(40, 164, 197, 14);
		panel.add(lblWorkPhoneNumber);
		
		JLabel lblEmail = new JLabel("Status :");
		lblEmail.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEmail.setBounds(557, 353, 145, 14);
		panel.add(lblEmail);
		
		JLabel label_1 = new JLabel("Employee ID :");
		label_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_1.setBounds(295, 130, 245, 14);
		panel.add(label_1);
		
		JLabel lblDepartmentId = new JLabel("Department  :");
		lblDepartmentId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		lblDepartmentId.setBounds(295, 71, 126, 16);
		panel.add(lblDepartmentId);
		
		txt_region = new JTextField();
		txt_region.setColumns(10);
		txt_region.setBounds(557, 182, 245, 28);
		panel.add(txt_region);
		
		JLabel lblRegion = new JLabel("Region :");
		lblRegion.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblRegion.setBounds(557, 164, 245, 14);
		panel.add(lblRegion);
		
		 txt_salary = new JTextField(salary);
		txt_salary.setColumns(10);
		txt_salary.setBounds(557, 239, 245, 28);
		panel.add(txt_salary);
		
		JLabel lblSalary = new JLabel("Salary :");
		lblSalary.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblSalary.setBounds(557, 221, 245, 14);
		panel.add(lblSalary);
		
		txt_town = new JTextField(Email);
		txt_town.setColumns(10);
		txt_town.setBounds(557, 71, 245, 28);
		panel.add(txt_town);
		
		JLabel lblPosition_1 = new JLabel("Township :");
		lblPosition_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition_1.setBounds(557, 53, 245, 14);
		panel.add(lblPosition_1);
		
		txt_city = new JTextField(city);
		txt_city.setColumns(10);
		txt_city.setBounds(557, 125, 245, 28);
		panel.add(txt_city);
		
		JLabel lblCity = new JLabel("City :");
		lblCity.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblCity.setBounds(557, 107, 245, 14);
		panel.add(lblCity);
		
		txt_email = new JTextField(add);
		txt_email.setColumns(10);
		txt_email.setBounds(40, 241, 500, 28);
		panel.add(txt_email);
		
		JLabel lblEmail_1 = new JLabel("Email :");
		lblEmail_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEmail_1.setBounds(40, 223, 471, 14);
		panel.add(lblEmail_1);
		
		txt_position = new JTextField(position);
		txt_position.setColumns(10);
		txt_position.setBounds(557, 314, 245, 28);
		panel.add(txt_position);
		
		JLabel lblPosition_2 = new JLabel("Position :");
		lblPosition_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition_2.setBounds(557, 296, 145, 14);
		panel.add(lblPosition_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 102));
		panel_1.setBounds(40, 59, 245, 94);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_9 = new JLabel("EIMS");
		label_9.setBounds(0, 0, 245, 94);
		panel_1.add(label_9);
		label_9.setBackground(new Color(0, 102, 102));
		label_9.setIcon(new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\icons8-old-vmware-logo-100.png"));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		
		JLabel lblEmployeeUpdate = new JLabel("Employee Update Form ");
		lblEmployeeUpdate.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmployeeUpdate.setForeground(new Color(0, 102, 102));
		lblEmployeeUpdate.setFont(new Font("Mongolian Baiti", Font.BOLD, 32));
		lblEmployeeUpdate.setBackground(Color.WHITE);
		lblEmployeeUpdate.setBounds(40, 0, 476, 38);
		panel.add(lblEmployeeUpdate);
		
		JLabel lDeptId = new JLabel(dept_id);
		lDeptId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lDeptId.setBounds(429, 68, 100, 22);
		panel.add(lDeptId);
		
		JLabel lEmp_id = new JLabel(emp);
		lEmp_id.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lEmp_id.setBounds(433, 125, 100, 22);
		panel.add(lEmp_id);
		
		 combostatus = new JComboBox();
		combostatus.setModel(new DefaultComboBoxModel(new String[] {"none ", "Active in project", "Stay"}));
		combostatus.setBounds(557, 377, 245, 22);
		panel.add(combostatus);
		
		JLabel lblMatritalStatus = new JLabel("Matrital Status :");
		lblMatritalStatus.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblMatritalStatus.setBounds(40, 355, 145, 14);
		panel.add(lblMatritalStatus);
		
		 comboMastatus = new JComboBox();
		comboMastatus.setModel(new DefaultComboBoxModel(new String[] {"none", "Single", "Merried"}));
		comboMastatus.setBounds(40, 378, 500, 21);
		panel.add(comboMastatus);
	}
}

