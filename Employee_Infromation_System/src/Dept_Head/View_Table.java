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
					View_Table frame = new View_Table(null,null,null,null);
					
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
	
	
	public View_Table(String emp_Id,String dept_id,String user_name,String Type) throws SQLException {
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
		
				JLabel label = new JLabel("");
				scrollPane.setColumnHeaderView(label);
				label.setFont(new Font("Tahoma", Font.PLAIN, 14));
				label.setIcon(new ImageIcon("C:\\Users\\aungp\\Downloads\\icons8-search-24.png"));
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setBackground(new Color(0, 102, 102));

		JButton btnClear = new JButton("Back");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new create_emp_dept(emp_Id,dept_id,user_name,Type).setVisible(true);

			}
		});
		btnClear.setBounds(10, 421, 98, 28);
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
		button_3.setBounds(128, 421, 98, 28);
		panel.add(button_3);

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
		txt_search.setBounds(113, 12, 556, 28);
		panel.add(txt_search);

		button = new JButton("Search");
		button.setForeground(new Color(0, 102, 102));
		button.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 19));
		button.setBackground(Color.WHITE);
		button.setBounds(679, 11, 118, 28);
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
			    new View_Emp(emp_id,Name,Ph_No,address,email,township,city,salary,position,user_name,Type).setVisible(true);
			

			}
		});
		Show_Emp_1.setForeground(Color.WHITE);
		Show_Emp_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15)); 
		Show_Emp_1.setBackground(new Color(0, 102, 102));
		Show_Emp_1.setBounds(240, 421, 98, 28);
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
		Show_Emp_2.setBounds(509, 421, 145, 28);
		panel.add(Show_Emp_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-refresh-30.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				 model.setRowCount(0);
				 txt_search.setText(" ");
				 Show_Emp_2.setEnabled(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 12, 98, 29);
		panel.add(btnNewButton);
		
		JButton Show_Emp_2_1 = new JButton("Delete Emp");
		Show_Emp_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con;
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				String emp_id = table.getValueAt(table.getSelectedRow(), 0).toString();

				String data = "Emp_id  : " + table.getValueAt(table.getSelectedRow(), 0).toString();
				data += "\nName   :" + table.getValueAt(table.getSelectedRow(), 1).toString();
				data += "\nWork_Phno :  " + table.getValueAt(table.getSelectedRow(), 2).toString();
				data += "\nEmai; :  " + table.getValueAt(table.getSelectedRow(), 3).toString();
				data += "\nAddress:  " + table.getValueAt(table.getSelectedRow(), 4).toString();
				data += "\nTownship :  " + table.getValueAt(table.getSelectedRow(), 5).toString();
				data += "\nCity :  " + table.getValueAt(table.getSelectedRow(), 6).toString();
				data += "\nSalary :  " + table.getValueAt(table.getSelectedRow(), 7).toString();
				data += "\nPosition:  " + table.getValueAt(table.getSelectedRow(), 8).toString();
			
	

				data += "\nDo you want to really delete above data";
				int ch = JOptionPane.showConfirmDialog(null, data, "Confirm Message", JOptionPane.WARNING_MESSAGE);

				if (ch == JOptionPane.YES_OPTION) {
					try {
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system", "root",
								"123456");
						
						PreparedStatement ppss = con.prepareStatement("select employee.dept_id,role_history.position,employee.joined_date from employee,role_history where employee.emp_id=? && employee.emp_id=role_history.emp_id;");
						 ppss.setString(1, emp_id);
						ResultSet rs = ppss.executeQuery();

							while (rs.next()) {
                      PreparedStatement p=con.prepareStatement("insert into retiredemp values(?,?,?,?)");
                      p.setString(1, emp_id);
                      p.setInt(2, Integer.parseInt(rs.getString(1)));
                      p.setString(3, rs.getString(2));
                      p.setString(4, rs.getString(3));
                      
                      int i=p.executeUpdate();
							}
						
						PreparedStatement stmt = con.prepareStatement(
								"delete from address  where emp_id=?");
						stmt.setString(1, emp_id);
						PreparedStatement qua=con.prepareStatement("delete from qualification  where emp_id=?");
						qua.setString(1, emp_id);
						PreparedStatement work=con.prepareStatement("delete from Working_Experience  where emp_id=?");
						work.setString(1, emp_id);
						PreparedStatement role=con.prepareStatement("delete from role_history where emp_id=?");
						role.setString(1, emp_id);
						PreparedStatement project=con.prepareStatement("delete from project_member  where emp_id=?");
						project.setString(1, emp_id);
						PreparedStatement log=con.prepareStatement("delete from  login where emp_id=?");
		                  log.setString(1, emp_id);
						PreparedStatement pst = con.prepareStatement("delete from employee where emp_id=?");
						pst.setString(1, emp_id);
					
						int ii=stmt.executeUpdate();
						int iii=qua.executeUpdate();
						int w=work.executeUpdate();
						int r=role.executeUpdate();
						int pr=project.executeUpdate();
						int lo=log.executeUpdate();
						int ps=pst.executeUpdate();
					
						if(ii > 0 && iii>0 && w>0 && r>0 && pr>0 && ps>0  && lo>0) {
							 JOptionPane.showMessageDialog(null, "data de lete correct successfully","Correct",JOptionPane.INFORMATION_MESSAGE);
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
		Show_Emp_2_1.setForeground(Color.WHITE);
		Show_Emp_2_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		Show_Emp_2_1.setBackground(new Color(0, 102, 102));
		Show_Emp_2_1.setBounds(348, 421, 145, 28);
		panel.add(Show_Emp_2_1);

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
