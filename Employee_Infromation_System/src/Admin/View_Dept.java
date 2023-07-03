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
import javax.swing.JOptionPane;
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
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class View_Dept extends JFrame {
	private  JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Dept frame = new View_Dept(null,null,null);
					
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
	public View_Dept(String dept_id,String dept_name,String dept_ph) {
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
		
		JPanel ldeptName = new JPanel();
		ldeptName.setBorder(new LineBorder(new Color(0, 102, 102)));
		ldeptName.setBackground(UIManager.getColor("CheckBox.background"));
		ldeptName.setBounds(24, 10, 750, 400);
		panel_2.add(ldeptName);
		ldeptName.setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Department Name :");
		lblEmployeeId.setForeground(Color.BLACK);
		lblEmployeeId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEmployeeId.setBounds(10, 229, 124, 14);
		ldeptName.add(lblEmployeeId);
		
		JLabel lblProjectId = new JLabel("Department ID :");
		lblProjectId.setForeground(Color.BLACK);
		lblProjectId.setBackground(new Color(0, 102, 102));
		lblProjectId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblProjectId.setBounds(10, 171, 128, 14);
		ldeptName.add(lblProjectId);
		
		JLabel lPosition = new JLabel("Department Ph No :");
		lPosition.setForeground(Color.BLACK);
		lPosition.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lPosition.setBounds(0, 293, 118, 13);
		ldeptName.add(lPosition);
		
		JLabel ldeptId = new JLabel(dept_id);
		ldeptId.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		ldeptId.setBounds(151, 171, 105, 14);
		ldeptName.add(ldeptId);
		
		JLabel lEmpID = new JLabel(dept_name);
		lEmpID.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lEmpID.setBounds(151, 229, 105, 14);
		ldeptName.add(lEmpID);
		
		JLabel ldeptph = new JLabel(dept_ph);
		ldeptph.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		ldeptph.setBounds(128, 291, 132, 14);
		ldeptName.add(ldeptph);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 102, 102));
		panel_4.setBounds(255, 0, 495, 400);
		ldeptName.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 495, 400);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Emp  Id", "Employee Name", "Email" ,"Position"," Salary" ,"Joined Date"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblProject = new JLabel(dept_name);
		lblProject.setHorizontalAlignment(SwingConstants.CENTER);
		lblProject.setForeground(Color.BLACK);
		lblProject.setFont(new Font("Modern No. 20", Font.BOLD, 27));
		lblProject.setBackground(new Color(0, 102, 102));
		lblProject.setBounds(10, 42, 245, 94);
		ldeptName.add(lblProject);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Dept_Table().setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button.setBackground(new Color(0, 102, 102));
		button.setBounds(62, 421, 110, 28);
		panel_2.add(button);
		
		JButton button_1 = new JButton("Close");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button_1.setBackground(new Color(0, 102, 102));
		button_1.setBounds(195, 421, 110, 28);
		panel_2.add(button_1);
		
		JButton btnViewEmployee = new JButton("View Employee");
		btnViewEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowDeptEmp(dept_id);
			}
		});
		btnViewEmployee.setForeground(Color.WHITE);
		btnViewEmployee.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnViewEmployee.setBackground(new Color(0, 102, 102));
		btnViewEmployee.setBounds(593, 420, 181, 31);
		panel_2.add(btnViewEmployee);
	}
	
	public  void ShowDeptEmp(String dept_id) {
		   Connection con;
		   
			try {
				 	DefaultTableModel model = (DefaultTableModel) table.getModel();
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system" + "", "root",
						"123456");
				
				String query=" select employee.emp_id,employee.F_Name,employee.L_Name,employee.Email,role_history.position,role_history.Salary,employee.joined_date from employee,role_history where employee.dept_id=? && employee.emp_id=role_history.emp_id;";  
		        PreparedStatement stmt = con.prepareStatement(query);         
		        stmt.setString(1, dept_id);
		        ResultSet rs=stmt.executeQuery();
		        while(rs.next()) {
		        	   model.addRow(new String[] {rs.getString(1) , rs.getString(2) + rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
		        }
			} catch (SQLException e1_) {
			
				System.out.println(e1_);
			}
	}
	
}

