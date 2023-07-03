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
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import Dept_Head.ApplicationDAO;
import Main.pr_member;

import javax.swing.border.CompoundBorder;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;

public class update_project extends JFrame {
	private JTextField txt_pj_member;
	private JTextField txt_position;
	private JComboBox comboEmp;
	private JDateChooser dcend_date;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					update_project frame = new update_project(null, null, null, null, null);
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
	public update_project(String pj_id, String pj_name, String dept_id, String start_date, String end_date) {

		ArrayList<String> rr = new ArrayList<String>();

		rr = showEmp(pj_id);

		setIconImage(
				Toolkit.getDefaultToolkit().getImage("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-50 (3) (1).png"));
		setTitle("Employee Information management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 834, 461);
		getContentPane().add(panel);
		panel.setLayout(null);

		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Project(dept_id).setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Monospaced", Font.BOLD, 20));
		button.setBackground(new Color(0, 102, 102));
		button.setBounds(62, 424, 145, 28);
		panel.add(button);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String emp = comboEmp.getSelectedItem().toString();
				String project_id = pj_id;
				String Position = txt_position.getText();
				String project_mid = txt_pj_member.getText();
				Date End_date = new Date(dcend_date.getDate().getTime());

			     pr_member pp=new pr_member();
			     pp.setEnd_date(String.valueOf(End_date));
			     pp.setPosition(Position);
			     pp.setPr_member_id(project_mid);
			     pp.setEmp_Id(emp);
				
				int choice = JOptionPane.showConfirmDialog(null, "Do you really want to save your data",
						"Comfirm Message", JOptionPane.INFORMATION_MESSAGE);
				if (choice == JOptionPane.YES_OPTION)
					try {
                     new ApplicationDAO().updatePj(pp, pj_id);
                  
						txt_position.setText(" ");
						comboEmp.setSelectedIndex(0);

						txt_pj_member.setText(" ");

					
						dcend_date.setDate(null);
					} catch (SQLException e1_) {
						JOptionPane.showMessageDialog(null, "Database Connection Error", "Save Error",
								JOptionPane.ERROR_MESSAGE);
						System.out.println(e1_);

					}

			}
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnUpdate.setBackground(new Color(0, 102, 102));
		btnUpdate.setBounds(243, 424, 145, 28);
		panel.add(btnUpdate);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_position.setText(" ");
				comboEmp.setSelectedIndex(0);

				txt_pj_member.setText(" ");

				dcend_date.setDate(null);
				dcend_date.setDate(null);
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnClear.setBackground(new Color(0, 102, 102));
		btnClear.setBounds(433, 424, 145, 28);
		panel.add(btnClear);

		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnClose.setBackground(new Color(0, 102, 102));
		btnClose.setBounds(620, 424, 145, 28);
		panel.add(btnClose);

		JLabel lblDepartmentId = new JLabel("Department ID :");
		lblDepartmentId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblDepartmentId.setBounds(10, 199, 161, 14);
		panel.add(lblDepartmentId);

		JLabel lblPosition_3 = new JLabel("Project Name:");
		lblPosition_3.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition_3.setBounds(20, 238, 125, 14);
		panel.add(lblPosition_3);

		txt_pj_member = new JTextField();
		txt_pj_member.setColumns(10);
		txt_pj_member.setBounds(520, 285, 245, 28);
		panel.add(txt_pj_member);

		JLabel lblRegion = new JLabel("Project member Id  :");
		lblRegion.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblRegion.setBounds(322, 290, 245, 14);
		panel.add(lblRegion);

		JLabel lblPosition_1 = new JLabel("emp_id :");
		lblPosition_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition_1.setBounds(339, 199, 245, 14);
		panel.add(lblPosition_1);

		dcend_date = new JDateChooser();
		dcend_date.setBounds(520, 323, 245, 38);
		panel.add(dcend_date);

		txt_position = new JTextField();
		txt_position.setColumns(10);
		txt_position.setBounds(520, 233, 245, 28);
		panel.add(txt_position);

		JLabel lblCity = new JLabel("Position :");
		lblCity.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblCity.setBounds(333, 238, 245, 14);
		panel.add(lblCity);

		JLabel lblEmployeeUpdate = new JLabel("Project Updat Form ");
		lblEmployeeUpdate.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmployeeUpdate.setForeground(new Color(0, 102, 102));
		lblEmployeeUpdate.setFont(new Font("Mongolian Baiti", Font.BOLD, 32));
		lblEmployeeUpdate.setBackground(Color.WHITE);
		lblEmployeeUpdate.setBounds(40, 0, 476, 38);
		panel.add(lblEmployeeUpdate);

		JLabel lblPosition_3_1 = new JLabel("Project ID:");
		lblPosition_3_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition_3_1.setBounds(20, 291, 125, 12);
		panel.add(lblPosition_3_1);

		JLabel lblPosition_3_2 = new JLabel("Start Date:");
		lblPosition_3_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition_3_2.setBounds(20, 347, 125, 14);
		panel.add(lblPosition_3_2);

		JLabel lDept = new JLabel(dept_id);
		lDept.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lDept.setBounds(143, 191, 212, 28);
		panel.add(lDept);

		JLabel lPjName = new JLabel(pj_name);
		lPjName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lPjName.setBounds(143, 230, 284, 28);
		panel.add(lPjName);

		JLabel lPjId = new JLabel(pj_id);
		lPjId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lPjId.setBounds(143, 284, 212, 28);
		panel.add(lPjId);

		JLabel lstart_date = new JLabel(start_date);
		lstart_date.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lstart_date.setBounds(143, 339, 212, 28);
		panel.add(lstart_date);

		comboEmp = new JComboBox(rr.toArray());
		comboEmp.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String emp = comboEmp.getSelectedItem().toString();
				txt_position.setText(showPosition(emp, pj_id));
				txt_pj_member.setText(showPjId(emp, pj_id));
			}
		});

		comboEmp.setBounds(520, 197, 245, 21);
		panel.add(comboEmp);

		// txt_position.setText(showPosition(emp,pj_id));

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(0, 128, 64));
		desktopPane.setBounds(10, 43, 814, 134);
		panel.add(desktopPane);

		JLabel label_9 = new JLabel("EIMS");
		label_9.setBounds(279, -80, 256, 298);
		desktopPane.add(label_9);
		label_9.setBackground(new Color(0, 102, 102));
		label_9.setIcon(
				new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\icons8-old-vmware-logo-100.png"));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Modern No. 20", Font.BOLD, 30));

		JLabel lblEndDate = new JLabel("End Date :");
		lblEndDate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEndDate.setBounds(333, 347, 245, 14);
		panel.add(lblEndDate);
	}

	public ArrayList<String> showEmp(String pj_id) {
		Connection con;

		ArrayList<String> result = new ArrayList<String>();

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system" + "", "root",
					"123456");
			PreparedStatement stmt = con.prepareStatement("select emp_id from project_member where pr_id=?");
			stmt.setString(1, pj_id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				result.add(rs.getString(1));
			}

		} catch (Exception ee) {
			ee.printStackTrace();
		}

		return result;
	}

	public String showPosition(String emp_id, String pj_id) {
		String result = null;

		Connection con;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system" + "", "root",
					"123456");
			PreparedStatement stmt = con
					.prepareStatement("select position from project_member where emp_id=? && pr_id=?");
			stmt.setString(1, emp_id);
			stmt.setString(2, pj_id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				result = rs.getString(1);
			}

		} catch (Exception ee) {
			ee.printStackTrace();
		}

		return result;
	}

	public String showPjId(String emp_id, String pj_id) {
		String result = null;

		Connection con;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system" + "", "root",
					"123456");
			PreparedStatement stmt = con
					.prepareStatement("select pr_member_id from project_member where emp_id=? && pr_id=?");
			stmt.setString(1, emp_id);
			stmt.setString(2, pj_id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				result = rs.getString(1);
			}

		} catch (Exception ee) {
			ee.printStackTrace();
		}

		return result;
	}
}
