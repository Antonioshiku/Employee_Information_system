package Admin;

import Admin.Admin_Dashboard;
import javax.swing.BorderFactory;
import Employee.Employee_Dashboard;
import Main.Choose_User;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.border.Border;

public class Admin_Login extends JFrame {
	private JTextField txt_Email;
	private   JPasswordField  txt_Password;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Login frame = new Admin_Login();
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
	public Admin_Login() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\Java Project\\Employee_Infromation_System\\photo\\icons8-old-vmware-logo-100.png"));
		setTitle("  ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 834, 461);
		getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(93, 32, 635, 384);
		panel_1.setBorder(new CompoundBorder());
		panel_1.setBackground(new Color(0, 102, 102));
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel label = new JLabel("  WELCOME\r\n");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Modern No. 20", Font.BOLD, 32));
		label.setBounds(46, 58, 220, 42);
		panel_1.add(label);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(46, 107, 283, 4);
		panel_1.add(panel_5);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 229, 315, 42);
		panel_1.add(panel_4);
		panel_4.setLayout(null);

		JLabel lbl_Position = new JLabel("Admin");
		lbl_Position.setForeground(new Color(0, 102, 102));
		lbl_Position.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lbl_Position.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Position.setBounds(59, 11, 186, 20);
		panel_4.add(lbl_Position);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(null);
		panel_2.setBounds(315, -31, 320, 415);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JButton btnLogIn = new JButton("Login");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// inputCheck();

				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system",
							"root", "123456");
					
					PreparedStatement stmt=con.prepareStatement("select email from employee where emp_id=?");
					stmt.setString(1, txt_Email.getText());
				
					
					ResultSet rr=stmt.executeQuery();
					
					String email="";
					while(rr.next()) {
					  email=rr.getString(1);
					}
					
//					System.out.println(email);
					PreparedStatement pst = con.prepareStatement("select user_name,password,Type from  login where emp_id= ?");
					pst.setString(1, txt_Email.getText());
					ResultSet rs = pst.executeQuery();

					while (rs.next()) {
						if (rs.getString(3).equalsIgnoreCase("Admin")  &&  textField.getText().equalsIgnoreCase(email) &&txt_Password.getText().equalsIgnoreCase(rs.getString(2))) {
							setVisible(false);
							new Admin_Dashboard().setVisible(true);
						} else {
							JOptionPane.showMessageDialog(null, "User not found", "user not found error",
									JOptionPane.ERROR_MESSAGE);
						}

					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnLogIn.setBounds(84, 324, 145, 28);
		btnLogIn.setForeground(Color.WHITE);
		panel_2.add(btnLogIn);
		btnLogIn.setFont(new Font("Modern No. 20", Font.BOLD, 20));
		btnLogIn.setBackground(new Color(0, 102, 102));

		JLabel lblLogIn = new JLabel("Login Account");
		lblLogIn.setBounds(10, 56, 295, 42);
		panel_2.add(lblLogIn);
		lblLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogIn.setForeground(new Color(0, 102, 102));
		lblLogIn.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 32));

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Choose_User().setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setBounds(84, 362, 145, 28);
		panel_2.add(btnBack);
		btnBack.setForeground(new Color(0, 102, 102));
		btnBack.setFont(new Font("Modern No. 20", Font.BOLD, 20));
		btnBack.setBackground(Color.WHITE);

		JLabel lblEmailOrUsername = new JLabel("Employee Id");
		lblEmailOrUsername.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEmailOrUsername.setBounds(38, 121, 145, 14);
		panel_2.add(lblEmailOrUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPassword.setBounds(38, 256, 145, 14);
		panel_2.add(lblPassword);

		txt_Email = new JTextField();
		txt_Email.setBackground(new Color(255, 255, 255));
		txt_Email.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

			}
		});
		txt_Email.setBounds(38, 145, 245, 28);
		panel_2.add(txt_Email);
		txt_Email.setColumns(10);

		txt_Password = new JPasswordField();
		txt_Password.setColumns(10);
		txt_Password.setBounds(38, 286, 245, 28);
		panel_2.add(txt_Password);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(38, 218, 245, 28);
		panel_2.add(textField);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEmail.setBounds(38, 183, 145, 14);
		panel_2.add(lblEmail);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(46, 38, 283, 4);
		panel_1.add(panel_3);

		JLabel label_1 = new JLabel("EIMS");
		label_1.setForeground(Color.BLACK);
		label_1.setIcon(
				new ImageIcon("D:\\Java Project\\Employee_Infromation_System\\photo\\icons8-old-vmware-logo-100.png"));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		label_1.setBounds(27, 120, 260, 88);
		panel_1.add(label_1);
	}

	public void inputCheck() {
		if (txt_Email.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Email is Missing", "missing error ", JOptionPane.ERROR_MESSAGE);
			txt_Email.requestFocus();
		} else {
			if (txt_Password.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Password is Missing", "missing error ", JOptionPane.ERROR_MESSAGE);
				txt_Password.requestFocus();
			}
		}
	}
}
