package Admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JFormattedTextField;

public class View_Emp_Form extends JFrame {

	private static JTable emptable;
	private static JTextField txt_search;
	JButton button;
	protected GraphicsConfiguration String;
	public static ArrayList<String> info;
//	  private static Connection con;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Emp_Form frame = new View_Emp_Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public View_Emp_Form() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-50 (3) (1).png"));
		setTitle("Employee Information Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		getContentPane().setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 49, 814, 361);
		panel.add(scrollPane);

		emptable = new JTable();
		emptable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Emp - Id", "Name", "Dept_ID",
				"Work_Ph_no", "Email", "Address", "Township", "City", "Salary", "Position", }) {
			Class[] columnTypes = new Class[] { String.class, String.class, Integer.class, String.class, String.class,
					String.class, String.class, String.class, String.class, String.class, String.class, String.class,
					String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(emptable);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int temp = 0;
				setVisible(false);
				new Admin_Dashboard().setVisible(true);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnBack.setBackground(new Color(0, 102, 102));
		btnBack.setBounds(20, 424, 145, 28);
		panel.add(btnBack);

		JButton btnClose = new JButton("Delete Emp");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con;
				DefaultTableModel model = (DefaultTableModel) emptable.getModel();

				String emp_id = emptable.getValueAt(emptable.getSelectedRow(), 0).toString();

				String data = "Emp_id  : " + emptable.getValueAt(emptable.getSelectedRow(), 0).toString();
				data += "\nName   :" + emptable.getValueAt(emptable.getSelectedRow(), 1).toString();
				data += "\nDept_id :  " + emptable.getValueAt(emptable.getSelectedRow(), 2).toString();
				data += "\nWork_Phno :  " + emptable.getValueAt(emptable.getSelectedRow(), 3).toString();
				data += "\nEmail:  " + emptable.getValueAt(emptable.getSelectedRow(), 4).toString();
				data += "\nAddress :  " + emptable.getValueAt(emptable.getSelectedRow(), 5).toString();
				data += "\nTownship :  " + emptable.getValueAt(emptable.getSelectedRow(), 6).toString();
				data += "\nCity :  " + emptable.getValueAt(emptable.getSelectedRow(), 7).toString();
				data += "\nSalary:  " + emptable.getValueAt(emptable.getSelectedRow(), 8).toString();
				data += "\nPosition :  " + emptable.getValueAt(emptable.getSelectedRow(), 9).toString();
	

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
		
						PreparedStatement pst = con.prepareStatement("delete from employee where emp_id=?");
						pst.setString(1, emp_id);
					
						int ii=stmt.executeUpdate();
						int iii=qua.executeUpdate();
						int w=work.executeUpdate();
						int r=role.executeUpdate();
						int pr=project.executeUpdate();
						int ps=pst.executeUpdate();
						if(ii > 0 && iii>0 && w>0 && r>0 && pr>0 && ps>0) {
							 JOptionPane.showMessageDialog(null, "data delete correct successfully","Correct",JOptionPane.INFORMATION_MESSAGE);
						}

				          DefaultTableModel dm=(DefaultTableModel)emptable.getModel();
				          dm.removeRow(emptable.getSelectedRow());

					} catch (Exception ee) {
						ee.printStackTrace();
						System.out.println(ee);
					}
				}
			}
		});
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnClose.setBackground(new Color(0, 102, 102));
		btnClose.setBounds(338, 424, 145, 28);
		panel.add(btnClose);

		txt_search = new JTextField();
		txt_search.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) emptable.getModel();
				TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(model);
				emptable.setRowSorter(obj1);
				obj1.setRowFilter(RowFilter.regexFilter(txt_search.getText()));

			}
		});
		txt_search.setColumns(10);
		txt_search.setBounds(124, 11, 556, 28);
		panel.add(txt_search);

		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				showEmp();
			}
		});
		searchButton.setForeground(new Color(0, 102, 102));
		searchButton.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 19));
		searchButton.setBackground(Color.WHITE);
		searchButton.setBounds(690, 11, 118, 28);
		panel.add(searchButton);

		JButton Show_Emp1 = new JButton("View");
		Show_Emp1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

				String Emp_ID = emptable.getValueAt(emptable.getSelectedRow(), 0).toString();
				String Name = emptable.getValueAt(emptable.getSelectedRow(), 1).toString();
				int Dept_ID = Integer.parseInt(emptable.getValueAt(emptable.getSelectedRow(), 2).toString());
				String Email = emptable.getValueAt(emptable.getSelectedRow(), 3).toString();

				String Work_Ph_no = emptable.getValueAt(emptable.getSelectedRow(), 4).toString();
				String Address = emptable.getValueAt(emptable.getSelectedRow(), 5).toString();

				String Township = emptable.getValueAt(emptable.getSelectedRow(), 6).toString();
				String City = emptable.getValueAt(emptable.getSelectedRow(), 7).toString();

				String Salary = emptable.getValueAt(emptable.getSelectedRow(), 8).toString();
				String Position = emptable.getValueAt(emptable.getSelectedRow(), 9).toString();

				new View_Form(Emp_ID, Name, Dept_ID, Email, Work_Ph_no, Address, Township, City, Salary, Position)
						.setVisible(true);
			}
		});
		Show_Emp1.setForeground(Color.WHITE);
		Show_Emp1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		Show_Emp1.setBackground(new Color(0, 102, 102));
		Show_Emp1.setBounds(181, 424, 145, 28);
		panel.add(Show_Emp1);

		 JButton Show_Emp2 = new JButton("Show Emp");
		Show_Emp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showEmp();
			 Show_Emp2.setEnabled(false);
			}
		});
		Show_Emp2.setForeground(Color.WHITE);
		Show_Emp2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		Show_Emp2.setBackground(new Color(0, 102, 102));
		Show_Emp2.setBounds(663, 424, 145, 28);
		panel.add(Show_Emp2);

		JButton btnCancel = new JButton("Clear");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_search.setText(null);
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnCancel.setBackground(new Color(0, 102, 102));
		btnCancel.setBounds(495, 424, 145, 28);
		panel.add(btnCancel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-refresh-30.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) emptable.getModel();
				 model.setRowCount(0);
				 txt_search.setText(" ");
				 Show_Emp2.setEnabled(true);
		
			}
		});
		btnNewButton.setBounds(20, 11, 98, 28);
		panel.add(btnNewButton);
	}

	public static void showEmp() {

		// ee = new Employee();
		Connection con;
		DefaultTableModel model = (DefaultTableModel) emptable.getModel();

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system", "root", "123456");
			PreparedStatement stmt = con.prepareStatement(

					" SELECT employee.emp_id,employee.F_Name, employee.L_Name, employee.dept_id, employee.Work_Ph_no, employee.Email, address.address, address.township, address.city,role_history.Salary, role_history.Position FROM employee,address, role_history where  employee.emp_id=address.emp_Id && employee.emp_id=role_history.emp_id;   ");

			ResultSet rs = stmt.executeQuery();
//          String emp_id, F_Name, L_Name, Ph_No, add, Email, town, city, salary, position, status, dept_id;

			while (rs.next()) {
				model.addRow(new String[] { rs.getString(1), rs.getString(2) + rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
						rs.getString(10), rs.getString(11), });
			}

		} catch (Exception ee) {
			ee.printStackTrace();
		}

	}
}
