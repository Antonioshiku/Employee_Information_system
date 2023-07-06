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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Dept_Head.Application_dept;

import javax.swing.border.CompoundBorder;

public class Project extends JFrame {
	private JTable table;
    private String project_id;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project frame = new Project(null,null,null,null);
					
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
	public Project(String emp,String dept_id,String email,String Type) {
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(164, 46, 631, 298);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(0, 102, 102));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Project Id", "Project Name", "Dept Id", "Start Date", "End Date"
			}
		));
		scrollPane.setViewportView(table);
		
		
		
		JButton button_1 = new JButton("Close");
		button_1.setBounds(570, 392, 145, 28);
		panel.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button_1.setBackground(new Color(0, 102, 102));
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				try {
					new Application_dept(emp,dept_id,email,Type).setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnBack.setBackground(new Color(0, 102, 102));
		btnBack.setBounds(415, 392, 145, 28);
		panel.add(btnBack);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 102));
		panel_1.setBounds(38, 46, 129, 298);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(10, 24, 110, 28);
		panel_1.add(btnCreate);
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				try {
					new create_project(emp,dept_id,email,Type).setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnCreate.setForeground(new Color(0, 102, 102));
		btnCreate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnCreate.setBackground(Color.WHITE);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			        String project_id=table.getValueAt(table.getSelectedRow(), 0).toString();	
			        String Project_Name=table.getValueAt(table.getSelectedRow(), 1).toString();
			        String dept_id=table.getValueAt(table.getSelectedRow(), 2).toString();
			        String Start_date=table.getValueAt(table.getSelectedRow(), 3).toString();
			        String end_date=table.getValueAt(table.getSelectedRow(), 4).toString();
			        new Project_member_view(project_id,Project_Name,dept_id,Start_date,end_date,emp,email,Type).setVisible(true);
			 
			}
		});
		btnView.setBounds(10, 129, 110, 28);
		panel_1.add(btnView);
		btnView.setForeground(new Color(0, 102, 102));
		btnView.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnView.setBackground(Color.WHITE);
		
		JButton btnShowPj = new JButton("Show PJ");
		btnShowPj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ShowProject(dept_id);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShowPj.setForeground(new Color(0, 102, 102));
		btnShowPj.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnShowPj.setBackground(Color.WHITE);
		btnShowPj.setBounds(10, 76, 110, 28);
		panel_1.add(btnShowPj);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     String project_id=table.getValueAt(table.getSelectedRow(), 0).toString();	
			        String Project_Name=table.getValueAt(table.getSelectedRow(), 1).toString();
			        String dept_id=table.getValueAt(table.getSelectedRow(), 2).toString();
			        String Start_date=table.getValueAt(table.getSelectedRow(), 3).toString();
			        String end_date=table.getValueAt(table.getSelectedRow(), 4).toString();
				setVisible(false);
				new update_project(project_id,Project_Name,dept_id,Start_date,end_date,emp,email,Type).setVisible(true);
			}
		});
		btnUpdate.setForeground(new Color(0, 102, 102));
		btnUpdate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.setBounds(10, 185, 110, 28);
		panel_1.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con;
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				String pr_id = table.getValueAt(table.getSelectedRow(), 0).toString();
				
				String data = "Project_Id  : " + table.getValueAt(table.getSelectedRow(), 0).toString();
				data += "\nProject Name   :" + table.getValueAt(table.getSelectedRow(), 1).toString();
				data += "\nDept Id :  " + table.getValueAt(table.getSelectedRow(), 2).toString();
				data += "\nStart Date; :  " + table.getValueAt(table.getSelectedRow(), 3).toString();
				data += "\nEnd Date:  " + table.getValueAt(table.getSelectedRow(), 4).toString();
				
				int ch = JOptionPane.showConfirmDialog(null, data, "Confirm Message", JOptionPane.WARNING_MESSAGE);

				if (ch == JOptionPane.YES_OPTION) {
					try {
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system", "root",
								"123456");
						
						
						PreparedStatement stmt = con.prepareStatement(
								"delete from project_member  where pr_id=?");
						stmt.setString(1, pr_id);
						PreparedStatement qua=con.prepareStatement("delete from project  where pr_id=?");
						qua.setString(1,pr_id);
					
						int ii=stmt.executeUpdate();
						int iii=qua.executeUpdate();

					
						if(ii > 0 && iii > 0) {
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
		btnDelete.setBounds(10, 242, 110, 28);
		panel_1.add(btnDelete);
		btnDelete.setForeground(new Color(0, 102, 102));
		btnDelete.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnDelete.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(new Color(0, 102, 102));
		label.setBounds(143, 86, 34, 28);
		panel.add(label);
	}
	
	
	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	public void ShowProject(String dept_id) throws SQLException {
		
		  Connection con;
		        try{
		            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system","root","123456");
		            
		            DefaultTableModel model = (DefaultTableModel) table.getModel();
		            String query="select * from project where dept_id=?";
		        	PreparedStatement pst = con.prepareStatement(query);
		        	pst.setString(1, dept_id);
		            ResultSet rs=pst.executeQuery();
		      	while(rs.next()) {
		      	 model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),});
		      	}
		        }
		        catch(Exception e){
		            e.printStackTrace();
		        }
		    }
    }
		


