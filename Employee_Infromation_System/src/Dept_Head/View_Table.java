package Dept_Head;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GraphicsConfiguration;

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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import Main.Employee;
import Main.role_history;

import javax.swing.border.CompoundBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class View_Table extends JFrame {
	private  JTable table;
	private JTextField txt_search;
	JButton button;
	private JButton Show_Emp_View;
	public static role_history rr;
	public static ArrayList<String>  info;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Table frame = new View_Table(null,null);
					
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws SQLException
	 */
	
	
	public View_Table(String emp_Id,String dept_id) throws SQLException {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-50 (3) (1).png"));
		setTitle("Employee Information management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		getContentPane().setLayout(null);
		
	// System.out.println(emp_Id);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 834, 461);
		getContentPane().add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 50, 814, 361);
		panel.add(scrollPane);

		ArrayList<String> rs = new ArrayList<String>();

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Emp_ID", "Name", "Work_Ph_No.", "Address",
				"Email", "Township", "City", "Salary", "Position" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class,
					String.class, String.class, String.class, String.class, };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];

			}

		});

		scrollPane.setViewportView(table);

		JButton btnClear = new JButton("Back");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				try {
					new Application_dept(null,null,null,dept_id).setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnClear.setBounds(20, 421, 118, 30);
		panel.add(btnClear);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnClear.setBackground(new Color(0, 102, 102));

		JButton button_3 = new JButton("Close");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button_3.setBackground(new Color(0, 102, 102));
		button_3.setBounds(148, 421, 110, 30);
		panel.add(button_3);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\aungp\\Downloads\\icons8-search-24.png"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(new Color(0, 102, 102));
		label.setBounds(58, 11, 34, 28);
		panel.add(label);

		txt_search = new JTextField();
		txt_search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(model);
				table.setRowSorter(obj1);
				obj1.setRowFilter(RowFilter.regexFilter(txt_search.getText()));
				Show_Emp_View.setEnabled(false);

			}
		});
		txt_search.setColumns(10);
		txt_search.setBounds(88, 11, 556, 28);
		panel.add(txt_search);

		button = new JButton("Search");
		button.setForeground(new Color(0, 102, 102));
		button.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 19));
		button.setBackground(Color.WHITE);
		button.setBounds(649, 11, 118, 28);
		panel.add(button);

		Show_Emp_View = new JButton("Show Emp");
		Show_Emp_View.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showEmp(dept_id);
			}
		});
		Show_Emp_View.setForeground(Color.WHITE);
		Show_Emp_View.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		Show_Emp_View.setBackground(new Color(0, 102, 102));
		Show_Emp_View.setBounds(679, 421, 145, 28);
		panel.add(Show_Emp_View);

		JButton Show_Emp_1 = new JButton("View");
		Show_Emp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    String emp_id= table.getValueAt(table.getSelectedRow(), 0).toString();
			    String Name =table.getValueAt(table.getSelectedRow(), 1).toString();
			    String Ph_No=table.getValueAt(table.getSelectedRow(), 2).toString();
			    String address=table.getValueAt(table.getSelectedRow(), 3).toString();
			    String email=table.getValueAt(table.getSelectedRow(), 4).toString();
			    String township=table.getValueAt(table.getSelectedRow(), 5).toString();
			    String city=table.getValueAt(table.getSelectedRow(), 6).toString();
			    String salary=table.getValueAt(table.getSelectedRow(), 7).toString();
			    String position=table.getValueAt(table.getSelectedRow(), 8).toString();
			    new View_Emp(emp_id,Name,Ph_No,address,email,township,city,salary,position).setVisible(true);
			

			}
		});
		Show_Emp_1.setForeground(Color.WHITE);
		Show_Emp_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15)); 
		Show_Emp_1.setBackground(new Color(0, 102, 102));
		Show_Emp_1.setBounds(282, 422, 118, 29);
		panel.add(Show_Emp_1);
		
		JButton Show_Emp_2 = new JButton("Update");
		Show_Emp_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  String emp_id= table.getValueAt(table.getSelectedRow(), 0).toString();
				    String Ph_No=table.getValueAt(table.getSelectedRow(), 2).toString();
				    String address=table.getValueAt(table.getSelectedRow(), 3).toString();
				    String email=table.getValueAt(table.getSelectedRow(), 4).toString();
				    String township=table.getValueAt(table.getSelectedRow(), 5).toString();
				    String city=table.getValueAt(table.getSelectedRow(), 6).toString();
				    String salary=table.getValueAt(table.getSelectedRow(), 7).toString();
				    String position=table.getValueAt(table.getSelectedRow(), 8).toString();
		     	    new Update_dept_emp(emp_id,Ph_No,address,email,township,city,salary,position,dept_id).setVisible(true);
				
			}
		});
		Show_Emp_2.setForeground(Color.WHITE);
		Show_Emp_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		Show_Emp_2.setBackground(new Color(0, 102, 102));
		Show_Emp_2.setBounds(410, 421, 145, 28);
		panel.add(Show_Emp_2);

	}

	// Show Employee Function

	public  void showEmp(String dept_id) {

		
		Connection con;
		DefaultTableModel model = (DefaultTableModel) table.getModel();

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system" + "", "root",
					"123456");
			PreparedStatement stmt = con.prepareStatement(
					"select employee.emp_id,employee.F_Name,employee.L_Name,employee.Work_Ph_No,employee.Email,Address.address,Address.TownShip,Address.City,role_history.position,role_history.Salary from employee,role_history,address where employee.dept_id=? && employee.emp_id=role_history.emp_id && employee.emp_id=address.emp_id");
            stmt.setString(1,dept_id);
			ResultSet rs = stmt.executeQuery();
//			String emp_id, F_Name, L_Name, Ph_No, add, Email, town, city, salary, position, status, dept_id;

			while (rs.next()) {
				model.addRow(new String[] { rs.getString(1), rs.getString(2) + rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(7), rs.getString(6), rs.getString(8), rs.getString(10),
						rs.getString(9)});
			}

		} catch (Exception ee) {
			ee.printStackTrace();
		}


	}


}
