package Application;

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

import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import Application.ApplicationDAO;
import Main.project;
import javax.swing.DefaultComboBoxModel;

public class create_project extends JFrame {
	private JTextField txt_pN;
	private JTextField txt_PId;
	private JComboBox comboDept;
	private JDateChooser dcend_date, dcstart_date;
	private int next_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					create_project frame = new create_project();
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
	public create_project() throws SQLException {
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

		JLabel lblDepartmentId = new JLabel("Department ID   :");
		lblDepartmentId.setForeground(Color.BLACK);
		lblDepartmentId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblDepartmentId.setBounds(37, 142, 124, 14);
		panel_3.add(lblDepartmentId);

		JLabel lblProjectId = new JLabel("Project ID          :");
		lblProjectId.setForeground(Color.BLACK);
		lblProjectId.setBackground(new Color(0, 102, 102));
		lblProjectId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblProjectId.setBounds(37, 83, 146, 14);
		panel_3.add(lblProjectId);

		JLabel lblProjectName = new JLabel("Project Name     :");
		lblProjectName.setForeground(Color.BLACK);
		lblProjectName.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblProjectName.setBounds(37, 185, 167, 14);
		panel_3.add(lblProjectName);

		JLabel lblStartDate = new JLabel("Start Date         :");
		lblStartDate.setForeground(Color.BLACK);
		lblStartDate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblStartDate.setBounds(37, 240, 146, 14);
		panel_3.add(lblStartDate);

		JLabel lblEndDate = new JLabel("End Date           :");
		lblEndDate.setForeground(Color.BLACK);
		lblEndDate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEndDate.setBounds(37, 294, 146, 14);
		panel_3.add(lblEndDate);

		JLabel lblProject = new JLabel("Project");
		lblProject.setHorizontalAlignment(SwingConstants.CENTER);
		lblProject.setForeground(new Color(0, 102, 102));
		lblProject.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		lblProject.setBackground(new Color(0, 102, 102));
		lblProject.setBounds(235, 0, 245, 94);
		panel_3.add(lblProject);

		txt_pN = new JTextField();
		txt_pN.setColumns(10);
		txt_pN.setBounds(235, 180, 245, 28);
		panel_3.add(txt_pN);

		dcstart_date = new JDateChooser();
		dcstart_date.setBounds(235, 240, 245, 20);
		panel_3.add(dcstart_date);

		txt_PId = new JTextField();
		txt_PId.setColumns(10);
		txt_PId.setBounds(235, 83, 245, 28);
		panel_3.add(txt_PId);

		dcend_date = new JDateChooser();
		dcend_date.setBounds(235, 288, 245, 20);
		panel_3.add(dcend_date);

		comboDept = new JComboBox();
		comboDept.setModel(new DefaultComboBoxModel(new String[] {"none", "100"}));
		comboDept.setBounds(235, 132, 245, 24);
		panel_3.add(comboDept);

		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Project().setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button.setBackground(new Color(0, 102, 102));
		button.setBounds(706, 44, 110, 28);
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
		button_1.setBounds(706, 100, 110, 28);
		panel_2.add(button_1);

		JButton button_2 = new JButton("Clear");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_PId.setText(" ");
				comboDept.setSelectedIndex(0);
		//		combopj.setSelectedIndex(0);
				txt_pN.setText(" ");
			//	txtPosition.setText(" ");
				dcstart_date.setDate(null);
				dcend_date.setDate(null);
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Monospaced", Font.BOLD, 20));
		button_2.setBackground(new Color(0, 102, 102));
		button_2.setBounds(330, 420, 110, 28);
		panel_2.add(button_2);

		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputCheck();
				String pr_id = txt_PId.getText();
				int dept_id = Integer.parseInt(comboDept.getSelectedItem().toString());
			//	String emp_id = combopj.getSelectedItem().toString();
				String pj_name = txt_pN.getText();
			//	String position = txtPosition.getText();
				Date start_date = new Date(dcstart_date.getDate().getTime());
				Date end_date = new Date(dcend_date.getDate().getTime());

				project p = new project(pr_id, pj_name, dept_id, String.valueOf(start_date), String.valueOf(end_date));
				// pr_member pm=new pr_member();

				int choice = JOptionPane.showConfirmDialog(null, "Do you really want to save your data",
						"Comfirm Message", JOptionPane.INFORMATION_MESSAGE);
				if (choice == JOptionPane.YES_OPTION)
					try {
						new ApplicationDAO().create_pj(p);
						next_id = 1;
						
						txt_PId.setText(" ");
						comboDept.setSelectedIndex(0);
					//	combopj.setSelectedIndex(0);
						txt_pN.setText(" ");
					//	txtPosition.setText(" ");
						dcstart_date.setDate(null);
						dcend_date.setDate(null);
					} catch (SQLException e1_) {
						JOptionPane.showMessageDialog(null, "Database Connection Error", "Save Error",
								JOptionPane.ERROR_MESSAGE);
						System.out.println(e1_);
						next_id = 0;
					}
			}
		});
		btnCreate.setForeground(Color.WHITE);
		btnCreate.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnCreate.setBackground(new Color(0, 102, 102));
		btnCreate.setBounds(55, 420, 110, 28);
		panel_2.add(btnCreate);

		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(next_id > 0) {
					 setVisible(false);
					 try {
						new create_pj_member().setVisible(true);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					 JOptionPane.showMessageDialog(null, "First You need to create project.","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Monospaced", Font.BOLD, 20));
		btnNext.setBackground(new Color(0, 102, 102));
		btnNext.setBounds(192, 420, 110, 28);
		panel_2.add(btnNext);
		
		JButton button_1_1 = new JButton("Add project Member");
		button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				try {
					new create_pj_member().setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_1_1.setForeground(Color.WHITE);
		button_1_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button_1_1.setBackground(new Color(0, 102, 102));
		button_1_1.setBounds(467, 422, 229, 28);
		panel_2.add(button_1_1);
	}

	public void inputCheck() {
		    if(txt_PId.getText().isEmpty()) {
		    	 JOptionPane.showMessageDialog(null, "Project Id is missing ", "missing check error",JOptionPane.ERROR_MESSAGE);
		    }else {
		    	 if(comboDept.getSelectedIndex() == 0) {
		    		 JOptionPane.showMessageDialog(null, "Project Dept is missing ", "missing check error",JOptionPane.ERROR_MESSAGE);
		    	 }else {
		    		  if(txt_pN.getText().isEmpty()) {
		    			  JOptionPane.showMessageDialog(null, "Project Name is missing ", "missing check error",JOptionPane.ERROR_MESSAGE);
		    		  }
		    			
		    			   else {
		    				    if(dcstart_date.getDate() == null) {
		    				    	 JOptionPane.showMessageDialog(null, "Start Date  is missing ", "missing check error",JOptionPane.ERROR_MESSAGE);
		    				    }else {
		    				    	 if(dcstart_date.getDate() == null) {	    
		    				    	 JOptionPane.showMessageDialog(null, "End Date is missing ", "missing check error",JOptionPane.ERROR_MESSAGE);
		    				    }
		    			   }
		    		  }
		    	 }
		    }
	  }
	
}
	
