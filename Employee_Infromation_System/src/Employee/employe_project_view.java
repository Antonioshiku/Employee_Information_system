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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class employe_project_view extends JFrame {
	private  JTable table;
	private ArrayList<String> rr;
	private 	JLabel lPJmID,label_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employe_project_view frame = new employe_project_view(null);
					
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
	public employe_project_view(String emp_id) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-50 (3) (1).png"));
		setTitle("Employee Information management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,850,500);
		getContentPane().setLayout(null);
		
		ArrayList<String> EmpPjInfo=new ArrayList<String>();
		EmpPjInfo=shoPjMemberInfo(emp_id);
	
		 rr=new ArrayList<String>();
		 
		
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
		panel_3.setBounds(41, 10, 750, 400);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Employee ID :");
		lblEmployeeId.setForeground(Color.BLACK);
		lblEmployeeId.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEmployeeId.setBounds(6, 229, 124, 14);
		panel_3.add(lblEmployeeId);
		
		JLabel lblProjectId = new JLabel("Project member ID :");
		lblProjectId.setForeground(Color.BLACK);
		lblProjectId.setBackground(new Color(0, 102, 102));
		lblProjectId.setFont(new Font("Dialog", Font.BOLD, 14));
		lblProjectId.setBounds(6, 171, 141, 14);
		panel_3.add(lblProjectId);
		
		JLabel lPosition = new JLabel("Position :");
		lPosition.setForeground(Color.BLACK);
		lPosition.setFont(new Font("Dialog", Font.BOLD, 14));
		lPosition.setBounds(6, 292, 74, 14);
		panel_3.add(lPosition);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 102, 102));
		panel_4.setBounds(255, 0, 495, 400);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 495, 400);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String pr_id=table.getValueAt(table.getSelectedRow(), 0).toString();
				
				  Connection con;
				   rr=new ArrayList<String>();
					try {
						 	
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system" + "", "root",
								"123456");
						
						String query="select pr_member_id,position from project_member where pr_id=?&& emp_id=?";
				        PreparedStatement stmt = con.prepareStatement(query);         
				        stmt.setString(1, pr_id);
				        stmt.setString(2, emp_id);
				        ResultSet rs=stmt.executeQuery();
				        while(rs.next()) {
				        	lPJmID.setText(rs.getString(1));
							label_16.setText(rs.getString(2));
			
				        }
					} catch (SQLException e1_) {
					
						System.out.println(e1_);
					}
					
				
				
				
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Project  Id", "Project Name", "Department Id", "Start Date", "End Date"
			}
		));
		scrollPane.setViewportView(table);
		
		
		 lPJmID = new JLabel();
		lPJmID.setFont(new Font("Dialog", Font.BOLD, 14));
		lPJmID.setBounds(157, 171, 105, 14);
		panel_3.add(lPJmID);
		
		JLabel lEmpID = new JLabel(emp_id);
		lEmpID.setFont(new Font("Dialog", Font.BOLD, 14));
		lEmpID.setBounds(117, 229, 105, 14);
		panel_3.add(lEmpID);
		
		 label_16 = new JLabel();
		label_16.setFont(new Font("Dialog", Font.BOLD, 14));
		label_16.setBounds(90, 292, 166, 25);
		panel_3.add(label_16);
		
		JLabel lblProject = new JLabel("Project");
		lblProject.setHorizontalAlignment(SwingConstants.CENTER);
		lblProject.setForeground(Color.BLACK);
		lblProject.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		lblProject.setBackground(new Color(0, 102, 102));
		lblProject.setBounds(10, 42, 245, 94);
		panel_3.add(lblProject);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Employee_Dashboard(emp_id,null).setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button.setBackground(new Color(0, 102, 102));
		button.setBounds(41, 420, 145, 28);
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
		button_1.setBounds(196, 420, 145, 28);
		panel_2.add(button_1);
		
		ShowPj(emp_id);
	}
	
	public  void ShowPj(String emp_id) {
		   Connection con;
		   
			try {
				 	DefaultTableModel model = (DefaultTableModel) table.getModel();
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system" + "", "root",
						"123456");
				
				String query="select project.pr_id,project.pr_name,project.dept_id,project.start_date,project.end_date,project_member.pr_member_id,project_member.position from project_member,project where project_member.emp_id=? && project.pr_id=project_member.pr_id;";  
		        PreparedStatement stmt = con.prepareStatement(query);         
		        stmt.setString(1, emp_id);
		        ResultSet rs=stmt.executeQuery();
		        while(rs.next()) {
		        	   model.addRow(new String[] {rs.getString(1) , rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5)});
		        }
			} catch (SQLException e1_) {
			
				System.out.println(e1_);
			}
	}
	
	public ArrayList<String> shoPjMemberInfo(String emp_id){
		  Connection con;
		   ArrayList<String> rr=new ArrayList<String>();
			try {
				 	
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system" + "", "root",
						"123456");
				
				String query="select project_member.pr_member_id,project_member.position from project,project_member where project_member.emp_id=? && project_member.pr_id=project.pr_id; ";  
		        PreparedStatement stmt = con.prepareStatement(query);         
		        stmt.setString(1, emp_id);
		        ResultSet rs=stmt.executeQuery();
		        while(rs.next()) {
		        	  rr.add(0,rs.getString(1));
		        	  rr.add(1,rs.getString(2));
	
		        }
			} catch (SQLException e1_) {
			
				System.out.println(e1_);
			}
			
			return rr;
	}
}

