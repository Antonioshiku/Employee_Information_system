package Admin;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
import javax.swing.border.CompoundBorder;

public class Dept_Table extends JFrame {
	private  static JTable table;
    private String project_id;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dept_Table frame = new Dept_Table();
					ShowDept();
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
	public Dept_Table() {
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
				"Department Id", "Department Name", "Department Ph No",
			}
		));
		scrollPane.setViewportView(table);
		
		
		
		JButton button_1 = new JButton("Close");
		button_1.setBounds(604, 392, 110, 28);
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
				
				new Admin_Dashboard().setVisible(true);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnBack.setBackground(new Color(0, 102, 102));
		btnBack.setBounds(462, 392, 110, 28);
		panel.add(btnBack);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 102));
		panel_1.setBounds(38, 46, 129, 298);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			        String dept_id=table.getValueAt(table.getSelectedRow(), 0).toString();	
			        String dept_name=table.getValueAt(table.getSelectedRow(), 1).toString();
			        String dept_ph=table.getValueAt(table.getSelectedRow(), 2).toString();
			      
			        new View_Dept(dept_id,dept_name,dept_ph).setVisible(true);
			      
			}
		});
		btnView.setBounds(10, 181, 110, 28);
		panel_1.add(btnView);
		btnView.setForeground(new Color(0, 102, 102));
		btnView.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnView.setBackground(Color.WHITE);
		
		JButton btnShowPj = new JButton("Show Dept");
		btnShowPj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ShowDept();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShowPj.setForeground(new Color(0, 102, 102));
		btnShowPj.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 13));
		btnShowPj.setBackground(Color.WHITE);
		btnShowPj.setBounds(10, 52, 110, 28);
		panel_1.add(btnShowPj);
		
		JButton btnCreateDept = new JButton("Create Dept");
		btnCreateDept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				try {
					
					new create_dept().setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCreateDept.setForeground(new Color(0, 102, 102));
		btnCreateDept.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 12));
		btnCreateDept.setBackground(Color.WHITE);
		btnCreateDept.setBounds(10, 119, 110, 28);
		panel_1.add(btnCreateDept);
		

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

	public static void ShowDept() throws SQLException {
		
		  Connection con;
		        try{
		            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system","root","123456");
		            
		            DefaultTableModel model = (DefaultTableModel) table.getModel();
		            String query="select * from department";
		        	PreparedStatement pst = con.prepareStatement(query);
		            ResultSet rs=pst.executeQuery();
		      	while(rs.next()) {
		      	 model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3)});
		      	}
		        }
		        catch(Exception e){
		            e.printStackTrace();
		        }
		    }
    }
		


