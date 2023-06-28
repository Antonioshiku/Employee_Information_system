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
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class view_project extends JFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_project frame = new view_project();
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
	public view_project() {
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
		panel_3.setBounds(24, 10, 750, 400);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label = new JLabel("Department ID :");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label.setBounds(37, 163, 124, 14);
		panel_3.add(label);
		
		JLabel lblProjectId = new JLabel("Project ID :");
		lblProjectId.setForeground(Color.BLACK);
		lblProjectId.setBackground(new Color(0, 102, 102));
		lblProjectId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblProjectId.setBounds(37, 121, 105, 14);
		panel_3.add(lblProjectId);
		
		JLabel lblProjectName = new JLabel("Project Name :");
		lblProjectName.setForeground(Color.BLACK);
		lblProjectName.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblProjectName.setBounds(37, 205, 167, 14);
		panel_3.add(lblProjectName);
		
		JLabel lblStartDate = new JLabel("Start Date :");
		lblStartDate.setForeground(Color.BLACK);
		lblStartDate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblStartDate.setBounds(37, 246, 85, 14);
		panel_3.add(lblStartDate);
		
		JLabel lblEndDate = new JLabel("End Date :");
		lblEndDate.setForeground(Color.BLACK);
		lblEndDate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEndDate.setBounds(37, 289, 124, 14);
		panel_3.add(lblEndDate);
		
		JLabel label_14 = new JLabel("Null????");
		label_14.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		label_14.setBounds(175, 121, 105, 14);
		panel_3.add(label_14);
		
		JLabel label_15 = new JLabel("Null????");
		label_15.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		label_15.setBounds(189, 163, 105, 14);
		panel_3.add(label_15);
		
		JLabel label_16 = new JLabel("Null????");
		label_16.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		label_16.setBounds(175, 205, 105, 14);
		panel_3.add(label_16);
		
		JLabel label_18 = new JLabel("Null????");
		label_18.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		label_18.setBounds(140, 247, 105, 14);
		panel_3.add(label_18);
		
		JLabel label_19 = new JLabel("Null????");
		label_19.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 11));
		label_19.setBounds(164, 291, 105, 14);
		panel_3.add(label_19);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 102, 102));
		panel_4.setBounds(255, 0, 495, 400);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 495, 400);
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Project Member Id", "Position", "Employee Id"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblProject = new JLabel("Project");
		lblProject.setHorizontalAlignment(SwingConstants.CENTER);
		lblProject.setForeground(Color.BLACK);
		lblProject.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		lblProject.setBackground(new Color(0, 102, 102));
		lblProject.setBounds(37, 16, 245, 94);
		panel_3.add(lblProject);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button.setBackground(new Color(0, 102, 102));
		button.setBounds(62, 421, 110, 28);
		panel_2.add(button);
		
		JButton button_1 = new JButton("Close");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button_1.setBackground(new Color(0, 102, 102));
		button_1.setBounds(195, 421, 110, 28);
		panel_2.add(button_1);
	}
}
