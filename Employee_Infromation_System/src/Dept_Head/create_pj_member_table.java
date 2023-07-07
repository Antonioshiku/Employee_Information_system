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
import javax.swing.RowFilter;

import java.awt.SystemColor;
import javax.swing.JComboBox;

import Main.pr_member;
import Main.project;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class create_pj_member_table extends JFrame {
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					create_pj_member_table frame = new create_pj_member_table(null,null,null,null,null);
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
	public create_pj_member_table(String emp,String dept_id,String email,String Type,String pj_id) throws SQLException {
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
		panel_3.setBounds(20, 49, 772, 361);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 27, 26, -15);
		panel_3.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 772, 361);
		panel_3.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Employee - Id", "Name", "Department Name","Position"
			}
		));
		scrollPane_1.setViewportView(table);
		
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
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Monospaced", Font.BOLD, 20));
		button_2.setBackground(new Color(0, 102, 102));
		button_2.setBounds(417, 418, 145, 28);
		panel_2.add(button_2);
		
		JButton btnCreate = new JButton("Add");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(true);
				String emp_id=table.getValueAt(table.getSelectedRow(), 0).toString();
				try {
					new create_project_member(emp,dept_id,email,Type,emp_id,pj_id).setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnCreate.setForeground(Color.WHITE);
		btnCreate.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnCreate.setBackground(new Color(0, 102, 102));
		btnCreate.setBounds(251, 418, 145, 28);
		panel_2.add(btnCreate);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(model);
				table.setRowSorter(obj1);
				obj1.setRowFilter(RowFilter.regexFilter(textField.getText()));

			}
		});
		textField.setBounds(190, 10, 425, 29);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Search :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(112, 11, 79, 21);
		panel_2.add(lblNewLabel);

      showEmp();
	
	}
	
	
	public void showEmp() {
		  Connection con;
	        try{
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system","root","123456");
	            
	            DefaultTableModel model = (DefaultTableModel) table.getModel();
	            String query="select employee.emp_id,employee.F_Name,employee.L_Name,department.dept_name,role_history.position from employee,department,role_history where employee.emp_id=role_history.emp_id && employee.dept_id=department.dept_id;";
	            
	        	PreparedStatement pst = con.prepareStatement(query);
	            ResultSet rs=pst.executeQuery();
	      	while(rs.next()) {
	      	 model.addRow(new String[] {rs.getString(1),rs.getString(2) + rs.getString(3),rs.getString(4),rs.getString(5),});
	      	}
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	}
}

