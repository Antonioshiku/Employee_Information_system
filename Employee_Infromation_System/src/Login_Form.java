
import java.awt.BorderLayout;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;

public class Login_Form extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Form frame = new Login_Form();
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
	public Login_Form() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-50 (3) (1).png"));
		setTitle("  ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,850,500);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 834, 461);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(98, 60, 630, 356);
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
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setForeground(new Color(0, 102, 102));
		lblPosition.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 20));
		lblPosition.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosition.setBounds(59, 11, 186, 20);
		panel_4.add(lblPosition);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(null);
		panel_2.setBounds(315, 0, 315, 356);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnLogIn = new JButton("Login");
		btnLogIn.setBounds(84, 278, 145, 28);
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
		btnBack.setBounds(84, 317, 145, 28);
		panel_2.add(btnBack);
		btnBack.setForeground(new Color(0, 102, 102));
		btnBack.setFont(new Font("Modern No. 20", Font.BOLD, 20));
		btnBack.setBackground(Color.WHITE);
		
		JLabel lblEmailOrUsername = new JLabel("Email or Username");
		lblEmailOrUsername.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEmailOrUsername.setBounds(38, 132, 145, 14);
		panel_2.add(lblEmailOrUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPassword.setBounds(38, 196, 145, 14);
		panel_2.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(38, 157, 245, 28);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(38, 221, 245, 28);
		panel_2.add(textField_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(46, 38, 283, 4);
		panel_1.add(panel_3);
		
		JLabel label_1 = new JLabel("EIMS");
		label_1.setForeground(Color.BLACK);
		label_1.setIcon(new ImageIcon("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-100.png"));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		label_1.setBounds(27, 120, 260, 88);
		panel_1.add(label_1);
	}
}
