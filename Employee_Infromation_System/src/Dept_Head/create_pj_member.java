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

import com.toedter.calendar.JDateChooser;

import Admin.AdminDAO;
import Dept_Head.ApplicationDAO;

import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JComboBox;

import Main.pr_member;
import Main.project;

public class create_pj_member extends JFrame {
	private JTextField txtPosition;
	private JTextField txt_pj_id;
	private JTextField txt_pj_mid;
	private JComboBox combopj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					create_pj_member frame = new create_pj_member(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public create_pj_member(String dept_id) throws SQLException {
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
		panel_3.setBounds(91, 10, 640, 400);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblProjectId = new JLabel("Project ID          :");
		lblProjectId.setForeground(Color.BLACK);
		lblProjectId.setBackground(new Color(0, 102, 102));
		lblProjectId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblProjectId.setBounds(37, 131, 146, 14);
		panel_3.add(lblProjectId);
		
		JLabel lblProject = new JLabel("Project Member");
		lblProject.setHorizontalAlignment(SwingConstants.CENTER);
		lblProject.setForeground(new Color(0, 102, 102));
		lblProject.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		lblProject.setBackground(new Color(0, 102, 102));
		lblProject.setBounds(235, 0, 245, 94);
		panel_3.add(lblProject);
		
		JLabel lblProjectMember = new JLabel("project member  :");
		lblProjectMember.setForeground(Color.BLACK);
		lblProjectMember.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblProjectMember.setBounds(37, 186, 167, 14);
		panel_3.add(lblProjectMember);
		
		JLabel lblPosition = new JLabel("Position   :");
		lblPosition.setForeground(Color.BLACK);
		lblPosition.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition.setBounds(37, 312, 167, 14);
		panel_3.add(lblPosition);
		
		 combopj = new JComboBox(new ApplicationDAO().showEmpId().toArray());
		combopj.setBounds(235, 182, 245, 24);
		panel_3.add(combopj);
		
		txtPosition = new JTextField();
		txtPosition.setColumns(10);
		txtPosition.setBounds(235, 307, 245, 28);
		panel_3.add(txtPosition);
		
		txt_pj_id = new JTextField();
		txt_pj_id.setColumns(10);
		txt_pj_id.setBounds(235, 117, 245, 28);
		panel_3.add(txt_pj_id);
		
		JLabel lblProjectMemberId = new JLabel("project member  ID :");
		lblProjectMemberId.setForeground(Color.BLACK);
		lblProjectMemberId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblProjectMemberId.setBounds(37, 248, 167, 14);
		panel_3.add(lblProjectMemberId);
		
		txt_pj_mid = new JTextField();
		txt_pj_mid.setColumns(10);
		txt_pj_mid.setBounds(235, 247, 245, 28);
		panel_3.add(txt_pj_mid);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Project(dept_id).setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button.setBackground(new Color(0, 102, 102));
		button.setBounds(91, 420, 145, 28);
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
		button_1.setBounds(584, 418, 145, 28);
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("Clear");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_pj_id.setText(" ");
				combopj.setSelectedIndex(0);
				txtPosition.setText(" ");
				txt_pj_mid.setText(" ");
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Monospaced", Font.BOLD, 20));
		button_2.setBackground(new Color(0, 102, 102));
		button_2.setBounds(417, 418, 145, 28);
		panel_2.add(button_2);
		
		JButton btnCreate = new JButton("Add");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					inputCheck();
	              	Connection con=null;
	              	String pj_member_id=txt_pj_mid.getText();
	              	String emp_id=combopj.getSelectedItem().toString();
	              	String position=txtPosition.getText();
	              	String Project_id=txt_pj_id.getText();
			   pr_member pjm=new pr_member(pj_member_id,position,emp_id);
			   pjm.setProject_Id(Project_id);
				int choice = JOptionPane.showConfirmDialog(null, "Do you really want to save your data",
						"Comfirm Message", JOptionPane.INFORMATION_MESSAGE);
				if (choice == JOptionPane.YES_OPTION)
					try {
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system" + "", "root",
								"123456");
				        PreparedStatement stmt = con.prepareStatement("insert into project_member(pr_member_id,pr_id,position,emp_id) values(?,?,?,?);");
				         stmt.setString(1, pjm.getPr_member_id());
				         stmt.setString(2, pjm.getProject_Id());
				         stmt.setString(3, pjm.getPosition());
				         stmt.setString(4, pjm.getEmp_Id());
				         int i=stmt.executeUpdate();
				         
				         PreparedStatement pst = con.prepareStatement("select count(pr_id) from project_member where pr_id=?");		 
				         pst.setString(1, pjm.getProject_Id());
				         ResultSet rs=pst.executeQuery();
				         String ii="0";
				         while(rs.next()) {
				        	  ii=rs.getString(1);
				         }
				         
				         String data="You add in project( "+Project_id+" ). The number of project member  : "+ii;
				         if(i> 0) {
				        	  JOptionPane.showMessageDialog(null,data, "Data Successfullly",JOptionPane.ERROR_MESSAGE);
				         }
				         
						
					  

					} catch (SQLException e1_) {
						JOptionPane.showMessageDialog(null, "Database Connection Error", "Save Error",
								JOptionPane.ERROR_MESSAGE);
						System.out.println(e1_);
					}
			}
		});
		btnCreate.setForeground(Color.WHITE);
		btnCreate.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnCreate.setBackground(new Color(0, 102, 102));
		btnCreate.setBounds(251, 418, 145, 28);
		panel_2.add(btnCreate);
	}
	
	public void inputCheck() {
		 if(txt_pj_mid.getText().isEmpty()) {
			 JOptionPane.showMessageDialog(null, "Project member Id is missing ", "missing check error",JOptionPane.ERROR_MESSAGE);
		 }else {
			  if(combopj.getSelectedIndex() == 0) {
				  JOptionPane.showMessageDialog(null, "Emp  Id is missing ", "missing check error",JOptionPane.ERROR_MESSAGE);
			  }else {
				   if(txtPosition.getText().isEmpty()) {
					   JOptionPane.showMessageDialog(null, "Project Position is missing ", "missing check error",JOptionPane.ERROR_MESSAGE);
				   }else {
					   if(txt_pj_id.getText().isEmpty()) {
						   JOptionPane.showMessageDialog(null, "Project  Id is missing ", "missing check error",JOptionPane.ERROR_MESSAGE);
					   }
				   }
			  }
		 }
	}
}

