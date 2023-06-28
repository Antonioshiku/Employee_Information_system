
package Admin

;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;

import Main.Qualification;
import Main.Working_Exe;
import Main.role_history;

public class Create_Admin extends JFrame {

	private JPanel contentPane;
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
	private JTextField txte_id;
	private JTextField txtC;
	private JTextField txtP;
	private JTextField txtW_exp;
	private JTextField txtW_id;
	private JTextField txtqf_id;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create_Admin frame = new Create_Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Create_Admin() {
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

		JLabel lblemp_id = new JLabel("Emp_id        :");
		lblemp_id.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblemp_id.setBounds(12, 93, 168, 47);
		desktopPane.add(lblemp_id);

		txtemp = new JTextField();
		txtemp.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtemp.setBounds(190, 105, 126, 22);
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

		txtdept = new JTextField();
		txtdept.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtdept.setColumns(10);
		txtdept.setBounds(192, 153, 126, 22);
		desktopPane.add(txtdept);

		txtdegree = new JTextField();
		txtdegree.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtdegree.setColumns(10);
		txtdegree.setBounds(192, 231, 126, 22);
		desktopPane.add(txtdegree);

		txtfname = new JTextField();
		txtfname.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtfname.setColumns(10);
		txtfname.setBounds(192, 349, 126, 22);
		desktopPane.add(txtfname);

		txtoname = new JTextField();
		txtoname.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtoname.setColumns(10);
		txtoname.setBounds(192, 409, 126, 22);
		desktopPane.add(txtoname);

		JComboBox cboType = new JComboBox();
		cboType.setModel(new DefaultComboBoxModel(new String[] { "None", "Bachelor", "Cartificate" }));
		cboType.setBounds(192, 289, 126, 22);
		desktopPane.add(cboType);

		JLabel lblQfid = new JLabel("QF_id         :");
		lblQfid.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblQfid.setBounds(12, 44, 181, 47);
		desktopPane.add(lblQfid);

		txtqf_id = new JTextField();
		txtqf_id.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtqf_id.setColumns(10);
		txtqf_id.setBounds(192, 56, 126, 22);
		desktopPane.add(txtqf_id);

		JDateChooser dcFrom_date = new JDateChooser();
		dcFrom_date.setBounds(190, 470, 126, 20);
		desktopPane.add(dcFrom_date);

		JDateChooser dcEnd_date = new JDateChooser();
		dcEnd_date.setBounds(190, 535, 126, 20);
		desktopPane.add(dcEnd_date);

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

		txtrole_id = new JTextField();
		txtrole_id.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtrole_id.setColumns(10);
		txtrole_id.setBounds(187, 93, 126, 22);
		desktopPane_1.add(txtrole_id);

		txtemp_id = new JTextField();
		txtemp_id.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtemp_id.setColumns(10);
		txtemp_id.setBounds(187, 153, 126, 22);
		desktopPane_1.add(txtemp_id);

		txtdept_id = new JTextField();
		txtdept_id.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtdept_id.setColumns(10);
		txtdept_id.setBounds(187, 229, 126, 22);
		desktopPane_1.add(txtdept_id);

		txtp = new JTextField();
		txtp.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtp.setColumns(10);
		txtp.setBounds(187, 289, 126, 22);
		desktopPane_1.add(txtp);

		txts = new JTextField();
		txts.setFont(new Font("Monospaced", Font.BOLD, 18));
		txts.setColumns(10);
		txts.setBounds(187, 349, 126, 22);
		desktopPane_1.add(txts);

		txtstatus = new JTextField();
		txtstatus.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtstatus.setColumns(10);
		txtstatus.setBounds(187, 409, 126, 22);
		desktopPane_1.add(txtstatus);

		JDateChooser dcfrom_date = new JDateChooser();
		dcfrom_date.setBounds(187, 468, 126, 20);
		desktopPane_1.add(dcfrom_date);

		JDateChooser dcto_date = new JDateChooser();
		dcto_date.setBounds(187, 533, 126, 20);
		desktopPane_1.add(dcto_date);

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
		lblCompany.setBounds(12, 217, 173, 47);
		desktoPane.add(lblCompany);

		JLabel lblWorkingexp = new JLabel("Working_exp   :");
		lblWorkingexp.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblWorkingexp.setBounds(10, 337, 181, 47);
		desktoPane.add(lblWorkingexp);

		JLabel lblWorkid = new JLabel("Work_id       :");
		lblWorkid.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblWorkid.setBounds(12, 137, 181, 47);
		desktoPane.add(lblWorkid);
		JLabel lblWorking = new JLabel("Working_Experience");
		lblWorking.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblWorking.setBounds(12, 13, 281, 37);
		desktoPane.add(lblWorking);

		JLabel lblPosition_1 = new JLabel("Position      :");
		lblPosition_1.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblPosition_1.setBounds(12, 275, 181, 47);
		desktoPane.add(lblPosition_1);

		txte_id = new JTextField();
		txte_id.setFont(new Font("Monospaced", Font.BOLD, 18));
		txte_id.setColumns(10);
		txte_id.setBounds(198, 93, 126, 22);
		desktoPane.add(txte_id);

		txtC = new JTextField();
		txtC.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtC.setColumns(10);
		txtC.setBounds(198, 153, 126, 22);
		desktoPane.add(txtC);

		txtP = new JTextField();
		txtP.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtP.setColumns(10);
		txtP.setBounds(198, 229, 126, 22);
		desktoPane.add(txtP);

		txtW_exp = new JTextField();
		txtW_exp.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtW_exp.setColumns(10);
		txtW_exp.setBounds(198, 287, 126, 22);
		desktoPane.add(txtW_exp);

		txtW_id = new JTextField();
		txtW_id.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtW_id.setColumns(10);
		txtW_id.setBounds(198, 349, 126, 22);

		desktoPane.add(txtW_id);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//boolean ch = inputCheck();
//				if (ch == true) {

					String QF_id = txtqf_id.getText().trim();
					String emp_id = txtemp.getText().trim();
					int dept_id = Integer.parseInt(txtdept.getText().trim());
					String degree_certificate = txtdegree.getText().trim();
					String Type = cboType.getSelectedItem().toString();
					String Field_name = txtfname.getText().trim();
					String Org_name = txtoname.getText().trim();
					Date From_date = new Date(dcFrom_date.getDate().getTime());
					Date End_date = new Date(dcEnd_date.getDate().getTime());
					// Qualification q=new
					// Qualification(QF_id,emp_id,0,degree_certificate,Type,Field_name,Org_name,String.valueOf(From_date),String.valueOf(End_date));
					Qualification q = new Qualification(QF_id,emp_id,dept_id,degree_certificate,Type,Field_name,Org_name,String.valueOf(From_date),String.valueOf(End_date));
//					q.setQF_id(QF_id);
//					q.setEmp_id(emp_id);
//					q.setDept_id(dept_id);
//					q.setDegree_Certificate(degree_certificate);
//					q.setType(Type);
//					q.setField_name(Field_name);
//					q.setOrg_name(Org_name);
//					q.setFrom_date(String.valueOf(From_date));
//					q.setEnd_date(String.valueOf(End_date));

					String Role_id = txtrole_id.getText().trim();
					String Emp_id = txtemp_id.getText().trim();
					int Dept_id = Integer.parseInt(txtdept_id.getText().trim());
					String position = txtp.getText().trim();
					String Salary = txts.getText().trim();
					String status = txtstatus.getText().trim();
					Date from_date = new Date(dcfrom_date.getDate().getTime());
					Date to_date = new Date(dcto_date.getDate().getTime());
					// role_history r=new
					// role_history(Role_id,Emp_id,0,position,Salary,status,String.valueOf(from_date),String.valueOf(to_date));
					role_history r = new role_history(Role_id,Emp_id,dept_id,position,Salary,status,String.valueOf(from_date),String.valueOf(to_date));
//					r.setRole_id(Role_id);
//					r.setEmp_id(Emp_id);
//					r.setDept_id(dept_id);
//					r.setPosition(position);
//					r.setSalary(Salary);
//					r.setStatus(status);
//					r.setFrom_date(String.valueOf(from_date));
//					r.setTo_date(String.valueOf(to_date));

					String Work_id = txtW_id.getText();
					String Employee_id = txte_id.getText();
					String Company = txtC.getText();
					String Position = txtP.getText();
					String Working_exp = txtW_exp.getText();

					// Working_experience w=new
					// Working_experience(Work_id,Employee_id,Company,Position,Working_exp);
					Working_Exe w = new Working_Exe(Work_id,Employee_id,Company,Position,Working_exp);
//					w.setWork_id(Work_id);
//					w.setEmp_id(Employee_id);
//					w.setCompany(Company);
//					w.setPosition(Position);
//					w.setWorking_exp(Working_exp);

					int choice = JOptionPane.showConfirmDialog(null, "Do you really want to save your data",
							"Comfirm Message", JOptionPane.INFORMATION_MESSAGE);
					if (choice == JOptionPane.YES_OPTION)
						try {
							new AdminDAO().addEmployee_QFInfo(q);
							new AdminDAO().addEmployee_RoleInfo(r);
							new AdminDAO().addEmployee_Work_expInfo(w);

						} catch (SQLException e1_) {
							JOptionPane.showMessageDialog(null, "Database Connection Error", "Save Error",
									JOptionPane.ERROR_MESSAGE);
						}
				
			}
		});
		btnNewButton.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(735, 645, 97, 37);
		panel.add(btnNewButton);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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

				txte_id.setText("");
				txtC.setText(" ");
				txtP.setText("");
				txtW_exp.setText("");
				txtW_id.setText(" ");

			}
		});
		btnClear.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnClear.setForeground(Color.BLACK);
		btnClear.setBounds(857, 645, 97, 37);
		panel.add(btnClear);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnBack.setForeground(Color.BLACK);
		btnBack.setBounds(973, 645, 97, 37);
		panel.add(btnBack);
	}

	public boolean inputCheck() {
		return true;

	}
}