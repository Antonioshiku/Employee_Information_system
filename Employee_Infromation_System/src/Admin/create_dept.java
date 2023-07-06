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

public class create_dept extends JFrame {
	private JTextField txt_dept_ph;
	private JTextField txt_dept_id;
	private JTextField txt_dept_name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					create_dept frame = new create_dept();
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
	public create_dept() throws SQLException {
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
		panel_3.setBounds(56, 10, 640, 400);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblProjectId = new JLabel("Department ID    :");
		lblProjectId.setForeground(Color.BLACK);
		lblProjectId.setBackground(new Color(0, 102, 102));
		lblProjectId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		lblProjectId.setBounds(39, 131, 175, 14);
		panel_3.add(lblProjectId);
		
		JLabel lblProject = new JLabel("Department");
		lblProject.setHorizontalAlignment(SwingConstants.CENTER);
		lblProject.setForeground(new Color(0, 102, 102));
		lblProject.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		lblProject.setBackground(new Color(0, 102, 102));
		lblProject.setBounds(235, 0, 245, 94);
		panel_3.add(lblProject);
		
		JLabel lblPosition = new JLabel("Department Ph No  :");
		lblPosition.setForeground(Color.BLACK);
		lblPosition.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		lblPosition.setBounds(37, 312, 167, 14);
		panel_3.add(lblPosition);
		
		txt_dept_ph = new JTextField();
		txt_dept_ph.setColumns(10);
		txt_dept_ph.setBounds(235, 307, 245, 28);
		panel_3.add(txt_dept_ph);
		
		txt_dept_id = new JTextField();
		txt_dept_id.setColumns(10);
		txt_dept_id.setBounds(235, 117, 245, 28);
		panel_3.add(txt_dept_id);
		
		JLabel lblProjectMemberId = new JLabel("Department Name :");
		lblProjectMemberId.setForeground(Color.BLACK);
		lblProjectMemberId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		lblProjectMemberId.setBounds(37, 220, 167, 14);
		panel_3.add(lblProjectMemberId);
		
		txt_dept_name = new JTextField();
		txt_dept_name.setColumns(10);
		txt_dept_name.setBounds(235, 215, 245, 28);
		panel_3.add(txt_dept_name);
		
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
		button.setBounds(137, 422, 110, 28);
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
		button_1.setBounds(586, 422, 110, 28);
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("Clear");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_dept_id.setText(" ");
				txt_dept_ph.setText(" ");
				txt_dept_name.setText(" ");
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Monospaced", Font.BOLD, 20));
		button_2.setBackground(new Color(0, 102, 102));
		button_2.setBounds(442, 420, 110, 28);
		panel_2.add(button_2);
		
		JButton btnCreate = new JButton("Add");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					inputCheck();
	              	Connection con=null;
	              	String dept_name=txt_dept_name.getText();
	              	String dept_ph=txt_dept_ph.getText();
	              	int dept_id=Integer.parseInt(txt_dept_id.getText());
			
				int choice = JOptionPane.showConfirmDialog(null, "Do you really want to save your data",
						"Comfirm Message", JOptionPane.INFORMATION_MESSAGE);
				if (choice == JOptionPane.YES_OPTION)
					try {
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system" + "", "root",
								"123456");
				        PreparedStatement stmt = con.prepareStatement("insert into department values(?,?,?);");
				       stmt.setInt(1, dept_id);
				       stmt.setString(2, dept_name);
				       stmt.setString(3, dept_ph);
				         int i=stmt.executeUpdate();
				         
				         if(i> 0) {
				        	  JOptionPane.showMessageDialog(null,"You create new "+txt_dept_name.getText() +"  Department", "Data Successfullly",JOptionPane.ERROR_MESSAGE);
				         }
				         
						
					  

					} catch (SQLException e1_) {
						JOptionPane.showMessageDialog(null, "Database Connection Error", "Save Error",
								JOptionPane.ERROR_MESSAGE);
						if(e1_.equals("Duplicate entry '"+txt_dept_id.getText() +"' for key 'department.PRIMARY'")) {
							JOptionPane.showMessageDialog(null, "Department is already excits.", "Save Error",
									JOptionPane.ERROR_MESSAGE);
						}
					}
			}
		});
		btnCreate.setForeground(Color.WHITE);
		btnCreate.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnCreate.setBackground(new Color(0, 102, 102));
		btnCreate.setBounds(291, 421, 110, 28);
		panel_2.add(btnCreate);
	}
	
	public void inputCheck() {
		 if(txt_dept_name.getText().isEmpty()) {
			 JOptionPane.showMessageDialog(null, "Project member Id is missing ", "missing check error",JOptionPane.ERROR_MESSAGE);
		 }else {
				   if(txt_dept_ph.getText().isEmpty()) {
					   JOptionPane.showMessageDialog(null, "Project Position is missing ", "missing check error",JOptionPane.ERROR_MESSAGE);
				   }else {
					   if(txt_dept_id.getText().isEmpty()) {
						   JOptionPane.showMessageDialog(null, "Project  Id is missing ", "missing check error",JOptionPane.ERROR_MESSAGE);
					   }
				   }
			  }
		 }
	}
