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
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;

public class Create_otherEmpInfo extends JFrame {
	
	
	private JTextField txtemp;
	private JTextField txtdept;
	private JTextField txtdegree;
	private JTextField txtfname;
	private JTextField txtoname;
	private JTextField txtrole_id;
	private JTextField txtemp_id;
	private JTextField txtdept_id;
	private JTextField txtp;
	private JTextField txts;
	private JTextField txtstatus;
	private JTextField txtW_id;
	private JTextField txte_id;
	private JTextField txtC;
	private JTextField txtP;
	private JTextField txtW_exp;
	private JTextField txtqf_id;
	private JComboBox cboType;
	private JDateChooser dcfrom_date, dcto_date;
	private JDateChooser dcEnd_date,dcFrom_date; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create_otherEmpInfo frame = new Create_otherEmpInfo();
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
	public Create_otherEmpInfo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-50 (3) (1).png"));
		setTitle("Employee Information management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1102,734);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 1084, 693);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 164, 348, 518);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_7 = new JLabel("Employee ID :");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_7.setBounds(10, 127, 245, 14);
		panel_1.add(label_7);
		
		txtemp = new JTextField();
		txtemp.setColumns(10);
		txtemp.setBounds(10, 145, 328, 28);
		panel_1.add(txtemp);
		
		JLabel label_9 = new JLabel("Departmengt ID :");
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_9.setBounds(10, 176, 245, 14);
		panel_1.add(label_9);
		
		txtdept = new JTextField();
		txtdept.setColumns(10);
		txtdept.setBounds(10, 194, 328, 28);
		panel_1.add(txtdept);
		
		JLabel lblDegreeCer = new JLabel("Degree Certificaton :");
		lblDegreeCer.setForeground(Color.BLACK);
		lblDegreeCer.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblDegreeCer.setBounds(10, 222, 245, 14);
		panel_1.add(lblDegreeCer);
		
		txtdegree = new JTextField();
		txtdegree.setColumns(10);
		txtdegree.setBounds(10, 239, 328, 28);
		panel_1.add(txtdegree);
		
		JLabel lblType = new JLabel("Type :");
		lblType.setForeground(Color.BLACK);
		lblType.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblType.setBounds(10, 269, 245, 14);
		panel_1.add(lblType);
		
		JLabel lblFieldName = new JLabel("Field Name :");
		lblFieldName.setForeground(Color.BLACK);
		lblFieldName.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblFieldName.setBounds(10, 316, 245, 14);
		panel_1.add(lblFieldName);
		
		txtfname = new JTextField();
		txtfname.setColumns(10);
		txtfname.setBounds(10, 333, 328, 28);
		panel_1.add(txtfname);
		
		JLabel lblEndDate = new JLabel("End Date :");
		lblEndDate.setForeground(Color.BLACK);
		lblEndDate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEndDate.setBounds(10, 462, 245, 14);
		panel_1.add(lblEndDate);
		
		JLabel lblFromDate = new JLabel("From Date :");
		lblFromDate.setForeground(Color.BLACK);
		lblFromDate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblFromDate.setBounds(10, 411, 245, 14);
		panel_1.add(lblFromDate);
		
		txtoname = new JTextField();
		txtoname.setColumns(10);
		txtoname.setBounds(10, 381, 328, 28);
		panel_1.add(txtoname);
		
		JLabel lblOrgName = new JLabel("Org Name :");
		lblOrgName.setForeground(Color.BLACK);
		lblOrgName.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblOrgName.setBounds(10, 362, 245, 14);
		panel_1.add(lblOrgName);
		
		JLabel lblQualification = new JLabel("Qualification");
		lblQualification.setForeground(new Color(0, 102, 102));
		lblQualification.setFont(new Font("Modern No. 20", Font.BOLD, 25));
		lblQualification.setBackground(Color.WHITE);
		lblQualification.setBounds(11, 2, 327, 47);
		panel_1.add(lblQualification);
		
		txtqf_id = new JTextField();
		txtqf_id.setColumns(10);
		txtqf_id.setBounds(10, 98, 328, 28);
		panel_1.add(txtqf_id);
		
		JLabel lblQualificationId = new JLabel("Qualification ID :");
		lblQualificationId.setForeground(Color.BLACK);
		lblQualificationId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblQualificationId.setBounds(10, 80, 245, 14);
		panel_1.add(lblQualificationId);
		
		 cboType = new JComboBox();
		cboType.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		cboType.setModel(new DefaultComboBoxModel(new String[] {"None", "Bachelor", "Certificate"}));
		cboType.setBounds(10, 285, 328, 28);
		panel_1.add(cboType);
		
		 dcFrom_date = new JDateChooser();
		dcFrom_date.setBounds(10, 431, 328, 28);
		panel_1.add(dcFrom_date);
		
		 dcEnd_date = new JDateChooser();
		dcEnd_date.setBounds(10, 479, 328, 28);
		panel_1.add(dcEnd_date);
		
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
		panel_2.setBounds(368, 68, 348, 489);
		panel.add(panel_2);
		
		JLabel lblRoleId = new JLabel("Role ID :");
		lblRoleId.setForeground(Color.BLACK);
		lblRoleId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblRoleId.setBounds(10, 60, 245, 14);
		panel_2.add(lblRoleId);
		
		txtrole_id = new JTextField();
		txtrole_id.setColumns(10);
		txtrole_id.setBounds(10, 79, 328, 28);
		panel_2.add(txtrole_id);
		
		JLabel lblEmployeeId = new JLabel("Employee  ID:");
		lblEmployeeId.setForeground(Color.BLACK);
		lblEmployeeId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEmployeeId.setBounds(10, 112, 245, 14);
		panel_2.add(lblEmployeeId);
		
		txtemp_id = new JTextField();
		txtemp_id.setColumns(10);
		txtemp_id.setBounds(10, 131, 328, 28);
		panel_2.add(txtemp_id);
		
		JLabel lblDeptId = new JLabel("Dept ID :");
		lblDeptId.setForeground(Color.BLACK);
		lblDeptId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblDeptId.setBounds(10, 161, 245, 14);
		panel_2.add(lblDeptId);
		
		txtdept_id = new JTextField();
		txtdept_id.setColumns(10);
		txtdept_id.setBounds(10, 180, 328, 28);
		panel_2.add(txtdept_id);
		
		JLabel lblPosition = new JLabel("Position :");
		lblPosition.setForeground(Color.BLACK);
		lblPosition.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition.setBounds(10, 213, 245, 14);
		panel_2.add(lblPosition);
		
		txtp = new JTextField();
		txtp.setColumns(10);
		txtp.setBounds(10, 232, 328, 28);
		panel_2.add(txtp);
		
		JLabel lblSalary = new JLabel("Salary :");
		lblSalary.setForeground(Color.BLACK);
		lblSalary.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblSalary.setBounds(10, 264, 245, 14);
		panel_2.add(lblSalary);
		
		txts = new JTextField();
		txts.setColumns(10);
		txts.setBounds(10, 283, 328, 28);
		panel_2.add(txts);
		
		JLabel lblEndDate_1 = new JLabel("End Date :");
		lblEndDate_1.setForeground(Color.BLACK);
		lblEndDate_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEndDate_1.setBounds(10, 431, 245, 14);
		panel_2.add(lblEndDate_1);
		
		JLabel lblFromDate_1 = new JLabel("From Date :");
		lblFromDate_1.setForeground(Color.BLACK);
		lblFromDate_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblFromDate_1.setBounds(10, 373, 245, 14);
		panel_2.add(lblFromDate_1);
		
		txtstatus = new JTextField();
		txtstatus.setColumns(10);
		txtstatus.setBounds(10, 334, 328, 28);
		panel_2.add(txtstatus);
		
		JLabel lblStatus = new JLabel("Status :");
		lblStatus.setForeground(Color.BLACK);
		lblStatus.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblStatus.setBounds(10, 315, 245, 14);
		panel_2.add(lblStatus);
		
		JLabel lblRoleHistory = new JLabel("Role History");
		lblRoleHistory.setForeground(new Color(0, 102, 102));
		lblRoleHistory.setFont(new Font("Modern No. 20", Font.BOLD, 25));
		lblRoleHistory.setBackground(Color.WHITE);
		lblRoleHistory.setBounds(10, 11, 327, 47);
		panel_2.add(lblRoleHistory);
		
		 dcfrom_date = new JDateChooser();
		dcfrom_date.setBounds(10, 392, 328, 28);
		panel_2.add(dcfrom_date);
		
		 dcto_date = new JDateChooser();
		dcto_date.setBounds(10, 450, 328, 28);
		panel_2.add(dcto_date);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(726, 68, 348, 344);
		panel.add(panel_3);
		
		JLabel lblEmpId = new JLabel("Emp ID :");
		lblEmpId.setForeground(Color.BLACK);
		lblEmpId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEmpId.setBounds(11, 125, 245, 14);
		panel_3.add(lblEmpId);
		
		txtW_id = new JTextField();
		txtW_id.setColumns(10);
		txtW_id.setBounds(11, 88, 328, 28);
		panel_3.add(txtW_id);
		
		JLabel lblCompany = new JLabel("Company :");
		lblCompany.setForeground(Color.BLACK);
		lblCompany.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblCompany.setBounds(11, 176, 245, 14);
		panel_3.add(lblCompany);
		
		txte_id = new JTextField();
		txte_id.setColumns(10);
		txte_id.setBounds(11, 140, 328, 28);
		panel_3.add(txte_id);
		
		JLabel lblPosition_1 = new JLabel("Position :");
		lblPosition_1.setForeground(Color.BLACK);
		lblPosition_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition_1.setBounds(11, 230, 245, 14);
		panel_3.add(lblPosition_1);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(11, 191, 328, 28);
		panel_3.add(txtC);
		
		JLabel lblWorkingExp = new JLabel("Working EXP :");
		lblWorkingExp.setForeground(Color.BLACK);
		lblWorkingExp.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblWorkingExp.setBounds(11, 285, 245, 14);
		panel_3.add(lblWorkingExp);
		
		txtP = new JTextField();
		txtP.setColumns(10);
		txtP.setBounds(11, 249, 328, 28);
		panel_3.add(txtP);
		
		txtW_exp = new JTextField();
		txtW_exp.setColumns(10);
		txtW_exp.setBounds(11, 300, 328, 28);
		panel_3.add(txtW_exp);
		
		JLabel lblWorkingExperience = new JLabel("Working Experience");
		lblWorkingExperience.setForeground(new Color(0, 102, 102));
		lblWorkingExperience.setFont(new Font("Modern No. 20", Font.BOLD, 25));
		lblWorkingExperience.setBackground(Color.WHITE);
		lblWorkingExperience.setBounds(11, 11, 327, 47);
		panel_3.add(lblWorkingExperience);
		
		JLabel label_1 = new JLabel("Work ID :");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_1.setBounds(11, 69, 245, 14);
		panel_3.add(label_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(368, 559, 706, 94);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JButton button = new JButton("Back");
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				 Create_Admin a = null;
//				try {
//					a = new Create_Admin();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				 a.setVisible(true);
//				
//			}
//		});
		button.setBounds(93, 33, 110, 28);
		panel_5.add(button);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button.setBackground(new Color(0, 102, 102));
		
		JButton btnCreate = new JButton("Create");
//		btnCreate.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//               boolean ch=inputCheck();
//               if(ch==true){
//					String QF_id=txtqf_id.getText().trim();
//					String emp_id=txtemp.getText().trim();
//					int dept_id=Integer.parseInt(txtdept.getText());
//					String degree_certificate=txtdegree.getText().trim();
//					String Type=cboType.getSelectedItem().toString();
//					String Field_name=txtfname.getText().trim();
//					String Org_name=txtoname.getText().trim();
//					Date From_date=new Date(dcFrom_date.getDate().getTime());
//					Date End_date=new Date(dcEnd_date.getDate().getTime());
//					//Qualification q=new Qualification(QF_id,emp_id,0,degree_certificate,Type,Field_name,Org_name,String.valueOf(From_date),String.valueOf(End_date));
//				//	Qualification q=new Qualification();
//					q.setQF_id(QF_id);
//					q.setEmp_id(emp_id);
//					q.setDept_id(dept_id);
//					q.setDegree_Certificate(degree_certificate);
//					q.setType(Type);
//					q.setField_name(Field_name);
//					q.setOrg_name(Org_name);
//					q.setFrom_date(String.valueOf(From_date));
//					q.setEnd_date(String.valueOf(End_date));
//					
//					String Role_id=txtrole_id.getText().trim();
//					String Emp_id=txtemp_id.getText().trim();
//					int Dept_id=Integer.parseInt(txtdept_id.getText().trim());
//				String position=txtp.getText().trim();
//				String Salary=txts.getText().trim();
//				String status=txtstatus.getText().trim();
//					Date from_date=new Date(dcfrom_date.getDate().getTime());
//					Date to_date=new Date(dcto_date.getDate().getTime());
//					//role_history r=new role_history(Role_id,Emp_id,0,position,Salary,status,String.valueOf(from_date),String.valueOf(to_date));	
//				//	role_history r=new role_history();
//					r.setRole_id(Role_id);
//					r.setEmp_id(Emp_id);
//					r.setDept_id(dept_id);
//					r.setPosition(position);
//					r.setSalary(Salary);
//					r.setStatus(status);
//					r.setFrom_date(String.valueOf(from_date));
//					r.setTo_date(String.valueOf(to_date));
//					
//					String Work_id=txtW_id.getText();
//					String Employee_id=txte_id.getText();
//					String Company=txtC.getText();
//					String Position=txtP.getText();
//					String Working_exp=txtW_exp.getText();
//					
//		//			Working_experience w=new Working_experience(Work_id,Employee_id,Company,Position,Working_exp);
//					//Working_experience w=new Working_experience();
//					 w.setWork_id(Work_id);
//					 w.setEmp_id(Employee_id);
//					 w.setCompany(Company);
//					 w.setPosition(Position);
//					 w.setWorking_exp(Working_exp);
//           System.out.print(w.getWork_id());
//           System.out.print(w.getEmp_id());
//           System.out.print(w.getCompany());
//           System.out.print(w.getWorking_exp());
//					 int choice=JOptionPane.showConfirmDialog(null, "Do you really want to save your data","Comfirm Message",JOptionPane.INFORMATION_MESSAGE);
//					if(choice==JOptionPane.YES_OPTION)
//						try{
//							new Create_emp_infoDAO().addEmployee_QFInfo(q);
//							new Create_emp_infoDAO().addEmployee_RoleInfo(r);
//							new Create_emp_infoDAO().addEmployee_Work_expInfo(w);
//							
//						}catch (SQLException e1_) {
//							JOptionPane.showMessageDialog(null, "Database Connection Error","Save Error",JOptionPane.ERROR_MESSAGE);
//						}
//					}
//				}
//			});

				
		btnCreate.setBounds(232, 33, 110, 28);
		panel_5.add(btnCreate);
		btnCreate.setForeground(Color.WHITE);
		btnCreate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnCreate.setBackground(new Color(0, 102, 102));
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtqf_id.setText("");
				 txtemp.setText("");
				 txtdept.setText("");
				 cboType.setSelectedIndex(0);
				 txtdegree.setText("");
				txtfname.setText("");
				txtoname.setText("");
				dcFrom_date.setDate(null);
				dcEnd_date.setDate(null);
				
				txtrole_id.setText("");
				txtemp_id.setText("");
				txtdept_id.setText("");
				txtp.setText("");
				txts.setText("");
				txtstatus.setText("");
				dcfrom_date.setDate(null);
				dcto_date.setDate(null);
				
				txtW_id.setText(" ");
				txte_id.setText("");
				txtC.setText(" ");
				txtP.setText("");
				txtW_exp.setText("");
				
				
			}
		});
			
		btnClear.setBounds(367, 33, 110, 28);
		panel_5.add(btnClear);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnClear.setBackground(new Color(0, 102, 102));
		
		JButton button_3 = new JButton("Close");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_3.setBounds(506, 33, 110, 28);
		panel_5.add(button_3);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button_3.setBackground(new Color(0, 102, 102));
	}
	public boolean inputCheck(){
		boolean result=false;
		if(txtqf_id.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Qualification ID is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
			txtqf_id.requestFocus();
		}
		else{
			if(txtemp.getText().isEmpty()){
				JOptionPane.showMessageDialog(null, "Employee ID is required data","Input Mission Error",JOptionPane.ERROR_MESSAGE);
			    txtemp.requestFocus();
			}
		
			else{
				if(txtdept.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Department ID is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
					txtdept.requestFocus();
				}
				else{
					if(cboType.getSelectedIndex() == 0){
						JOptionPane.showMessageDialog(null, "Type is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
					}
				
				else{
					if(txtdegree.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Degree Certificate is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
						txtdegree.requestFocus();
					}
					else{
						if(txtfname.getText().isEmpty()){
							JOptionPane.showMessageDialog(null, "Field_Name is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
							txtfname.requestFocus();
						}
						else{
							if(txtoname.getText().isEmpty()){
								JOptionPane.showMessageDialog(null, "Org_Name is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
								txtoname.requestFocus();
							}
							else{
								if(dcFrom_date.getDate()==null){
									JOptionPane.showMessageDialog(null,"From Date is required data","Input Mission Error",JOptionPane.ERROR_MESSAGE);
								}
								else{
									if(dcEnd_date.getDate()==null){
										JOptionPane.showMessageDialog(null,"End Date is required data","Input Mission Error",JOptionPane.ERROR_MESSAGE);
									}
								}
						}
						
					}
				
				}
			
			
			}
			
		}
				
	}
		
						
	}
		if(txtrole_id.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Role ID is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
			txtrole_id.requestFocus();
		}
		else{
			if(txtemp_id.getText().isEmpty()){
				JOptionPane.showMessageDialog(null, "Employee ID is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
				txtemp_id.requestFocus();
			}
			else{
				if(txtdept_id.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Department ID is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
					txtdept_id.requestFocus();
				}
				else{
					if(txtp.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Position is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
						txtp.requestFocus();
					}
					else{
						if(txts.getText().isEmpty()){
							JOptionPane.showMessageDialog(null, "Salary is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
							txts.requestFocus();
						}
						else{
							if(txtstatus.getText().isEmpty()){
								JOptionPane.showMessageDialog(null, "Status is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
								txtstatus.requestFocus();
							}
							else{
								if(dcfrom_date.getDate()==null){
									JOptionPane.showMessageDialog(null,"From Date is required data","Input Mission Error",JOptionPane.ERROR_MESSAGE);
								}
								else{
									if(dcto_date.getDate()==null){
										JOptionPane.showMessageDialog(null,"To Date is required data","Input Mission Error",JOptionPane.ERROR_MESSAGE);
									}
								}
							}
						}
					}
				}
			}
		}
		if(txtW_id.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Work ID is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
			txtW_id.requestFocus();
		}
		else{
			if(txte_id.getText().isEmpty()){
				JOptionPane.showMessageDialog(null, "Employee ID is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
				txte_id.requestFocus();
			}
			else{
				if(txtC.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Company name is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
					txtC.requestFocus();	
				}
				else{
					if(txtP.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Position is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
						txtP.requestFocus();
					}
					else{
						if(txtW_exp.getText().isEmpty()){
							JOptionPane.showMessageDialog(null, "Working experience is required data","Input Missing Error",JOptionPane.ERROR_MESSAGE);
							txtW_exp.requestFocus();
						}
						else return true;
					}
				}
			}
		}
		return result;

	}
	
		}


