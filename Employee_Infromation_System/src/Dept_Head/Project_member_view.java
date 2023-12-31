package Dept_Head;

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
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Project_member_view extends JFrame {
	private static JTable table;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project_member_view frame = new Project_member_view(null,null,null,null,null,null,null,null);
				
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
	public Project_member_view(String pj_id,String pj_name,String dept_id,String start_date,String end_date,String emp,String email,String Type) {
		
		
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 102, 102)));
		panel_3.setBackground(UIManager.getColor("CheckBox.background"));
		panel_3.setBounds(62, 53, 712, 357);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label = new JLabel("Department ID :");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label.setBounds(10, 163, 124, 14);
		panel_3.add(label);
		
		JLabel lblProjectId = new JLabel("Project ID :");
		lblProjectId.setForeground(Color.BLACK);
		lblProjectId.setBackground(new Color(0, 102, 102));
		lblProjectId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblProjectId.setBounds(10, 121, 105, 14);
		panel_3.add(lblProjectId);
		
		JLabel lpjName = new JLabel("Project Name :");
		lpjName.setForeground(Color.BLACK);
		lpjName.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lpjName.setBounds(10, 205, 115, 14);
		panel_3.add(lpjName);
		
		JLabel lblStartDate = new JLabel("Start Date :");
		lblStartDate.setForeground(Color.BLACK);
		lblStartDate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblStartDate.setBounds(10, 247, 85, 14);
		panel_3.add(lblStartDate);
		
		JLabel lblEndDate = new JLabel("End Date :");
		lblEndDate.setForeground(Color.BLACK);
		lblEndDate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEndDate.setBounds(10, 291, 124, 14);
		panel_3.add(lblEndDate);
		
		JLabel lPjId = new JLabel(pj_id);
		lPjId.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lPjId.setBounds(127, 121, 105, 14);
		panel_3.add(lPjId);
		
		JLabel lDeptId = new JLabel(dept_id);
		lDeptId.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lDeptId.setBounds(127, 163, 105, 14);
		panel_3.add(lDeptId);
		
		JLabel lPjName = new JLabel(pj_name);
		lPjName.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lPjName.setBounds(127, 205, 152, 14);
		panel_3.add(lPjName);
		
		JLabel lStart = new JLabel(start_date);
		lStart.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lStart.setBounds(127, 247, 105, 14);
		panel_3.add(lStart);
		
		JLabel lEnd = new JLabel(end_date);
		lEnd.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		lEnd.setBounds(127, 291, 105, 14);
		panel_3.add(lEnd);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 102, 102));
		panel_4.setBounds(267, 0, 445, 357);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 445, 357);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Project Member Id", "Name", "Dept Name", "Position"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblProject = new JLabel("Project");
		lblProject.setHorizontalAlignment(SwingConstants.CENTER);
		lblProject.setForeground(Color.BLACK);
		lblProject.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		lblProject.setBackground(new Color(0, 102, 102));
		lblProject.setBounds(0, 17, 245, 94);
		panel_3.add(lblProject);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Project(emp,dept_id,email,Type).setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button.setBackground(new Color(0, 102, 102));
		button.setBounds(62, 421, 121, 28);
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
		button_1.setBounds(193, 421, 121, 28);
		panel_2.add(button_1);
		
		JButton button_1_1 = new JButton("Add project Member");
		button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				try {
					new create_pj_member_table(emp,dept_id,email,Type,pj_id).setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_1_1.setForeground(Color.WHITE);
		button_1_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button_1_1.setBackground(new Color(0, 102, 102));
		button_1_1.setBounds(562, 420, 212, 28);
		panel_2.add(button_1_1);
		
		JButton button_1_2 = new JButton("Delete PJ_Member");
		button_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con;
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				String pr_id = table.getValueAt(table.getSelectedRow(), 0).toString();
				String emp_id=table.getValueAt(table.getSelectedRow(), 1).toString();
				String data = "Project Member Id  : " + table.getValueAt(table.getSelectedRow(), 0).toString();
				data += "\nPosition   :" + table.getValueAt(table.getSelectedRow(), 1).toString();
				data += "\nEmp Id :  " + table.getValueAt(table.getSelectedRow(), 2).toString();

				
				int ch = JOptionPane.showConfirmDialog(null, data, "Confirm Message", JOptionPane.WARNING_MESSAGE);

				if (ch == JOptionPane.YES_OPTION) {
					try {
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system", "root",
								"123456");
						
						
						PreparedStatement stmt = con.prepareStatement(
								"delete from project_member  where pr_id=? && emp_id=?");
						stmt.setString(1, pr_id);
						stmt.setString(2, emp_id);

					
						int ii=stmt.executeUpdate();

					
						if(ii > 0) {
							 JOptionPane.showMessageDialog(null, "data delete correct successfully","Correct",JOptionPane.INFORMATION_MESSAGE);
						}else {
							 
						}

				          DefaultTableModel dm=(DefaultTableModel)table.getModel();
				          dm.removeRow(table.getSelectedRow());

					} catch (Exception ee) {
						ee.printStackTrace();
						System.out.println(ee);
					}
				}
			}
		});
		button_1_2.setForeground(Color.WHITE);
		button_1_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button_1_2.setBackground(new Color(0, 102, 102));
		button_1_2.setBounds(324, 420, 200, 28);
		panel_2.add(button_1_2);
		
		ShowPjMember(pj_id);
	}
	


	public static void ShowPjMember(String pj_id) {
		Connection con;
		DefaultTableModel model = (DefaultTableModel) table.getModel();

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system" + "", "root",
					"123456");
			PreparedStatement stmt = con.prepareStatement("select emp_id from project_member where pr_id=?");
			stmt.setString(1, pj_id);
			ResultSet rs = stmt.executeQuery();


			while (rs.next()) {
				
				PreparedStatement pst = con.prepareStatement("select project_member.pr_member_id,employee.F_Name,employee.L_Name,department.dept_name,project_member.position from department,employee,project_member where project_member.pr_id=? && project_member.emp_id=? && employee.emp_id = project_member.emp_id && employee.dept_id=department.dept_id;");
               pst.setString(1, pj_id);
               pst.setString(2, rs.getString(1));
               ResultSet ss = pst.executeQuery();
               while(ss.next()) {
				model.addRow(new String[] { ss.getString(1), ss.getString(2) + ss.getString(3),ss.getString(4),ss.getString(5)});
			}
			}
		} catch (Exception ee) {
			ee.printStackTrace();
			System.out.println(ee);
		}
	}
}

