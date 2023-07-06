package Admin;

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
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import Main.Address;
import Main.Employee;

import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Date;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class Create_emp_info extends JFrame {
	private JTextField txt_emp_id;
	private JTextField txt_FName;
	private JTextField txt_LName;
	private JTextField txt_age;
	private JTextField txt_Per_ph;
	private JTextField txt_Work_ph;
	private JTextField txt_M_status;
	private JTextField txt_address;
	private JTextField txt_city;
	private JTextField txt_religion;
	private JTextField txt_nrc;
	private JTextField txt_Email;
	private JTextField txt_nationality;
	private JTextField txt_FatherN;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txt_town;
	private JTextField txt_postal;
	private JTextField txt_region;
	private JTextField txt_addr_code;
	private JComboBox comboDept;
	private JRadioButton rdbtnMale, rdbtnFemale;
	private boolean nextCheck;
	private JTextField txt_NRC;
	private JButton btnCreate,btnCreate_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create_emp_info frame = new Create_emp_info();
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
	public Create_emp_info() throws SQLException {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage("D:\\HR Info Sys Pto\\icons8-old-vmware-logo-50 (3) (1).png"));
		setTitle("Employee Information management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 705);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 1084, 666);
		getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 164, 348, 489);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel label_7 = new JLabel("Employee ID :");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_7.setBounds(10, 60, 245, 14);
		panel_1.add(label_7);

		txt_emp_id = new JTextField();
		txt_emp_id.setColumns(10);
		txt_emp_id.setBounds(10, 79, 328, 28);
		panel_1.add(txt_emp_id);

		JLabel lblDepartmentId = new JLabel("Department ID :");
		lblDepartmentId.setForeground(Color.BLACK);
		lblDepartmentId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblDepartmentId.setBounds(10, 136, 245, 14);
		panel_1.add(lblDepartmentId);

		JLabel lblDegreeCer = new JLabel("First Name :");
		lblDegreeCer.setForeground(Color.BLACK);
		lblDegreeCer.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblDegreeCer.setBounds(10, 210, 245, 14);
		panel_1.add(lblDegreeCer);

		txt_FName = new JTextField();
		txt_FName.setColumns(10);
		txt_FName.setBounds(10, 229, 328, 28);
		panel_1.add(txt_FName);

		JLabel lblType = new JLabel("Last Name :");
		lblType.setForeground(Color.BLACK);
		lblType.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblType.setBounds(10, 281, 245, 14);
		panel_1.add(lblType);

		txt_LName = new JTextField();
		txt_LName.setColumns(10);
		txt_LName.setBounds(10, 300, 328, 28);
		panel_1.add(txt_LName);

		JLabel lblFieldName = new JLabel("Gender :");
		lblFieldName.setForeground(Color.BLACK);
		lblFieldName.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblFieldName.setBounds(10, 353, 245, 14);
		panel_1.add(lblFieldName);

		txt_age = new JTextField();
		txt_age.setColumns(10);
		txt_age.setBounds(10, 432, 328, 28);
		panel_1.add(txt_age);

		JLabel lblOrgName = new JLabel("Age :");
		lblOrgName.setForeground(Color.BLACK);
		lblOrgName.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblOrgName.setBounds(10, 413, 245, 14);
		panel_1.add(lblOrgName);

		JLabel lblQualification = new JLabel("Personal Information");
		lblQualification.setForeground(new Color(0, 102, 102));
		lblQualification.setFont(new Font("Modern No. 20", Font.BOLD, 25));
		lblQualification.setBackground(Color.WHITE);
		lblQualification.setBounds(11, 2, 327, 47);
		panel_1.add(lblQualification);

		rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBackground(Color.WHITE);
		rdbtnMale.setFont(new Font("Monospaced", Font.PLAIN, 13));
		rdbtnMale.setBounds(20, 374, 109, 23);
		panel_1.add(rdbtnMale);

		rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBackground(new Color(255, 255, 255));
		rdbtnFemale.setFont(new Font("Monospaced", Font.PLAIN, 13));
		rdbtnFemale.setBounds(159, 374, 109, 23);
		panel_1.add(rdbtnFemale);

		comboDept = new JComboBox(new AdminDAO().showEmpId().toArray());
		comboDept.setBounds(10, 167, 328, 33);
		panel_1.add(comboDept);

		JLabel label = new JLabel("EIMS");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Modern No. 20", Font.BOLD, 30));
		label.setBackground(new Color(0, 102, 102));
		label.setBounds(10, 68, 348, 94);
		panel.add(label);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 102, 102));
		panel_4.setBounds(10, 68, 348, 94);
		panel.add(panel_4);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(368, 10, 348, 547);
		panel.add(panel_2);

		JLabel lblRoleId = new JLabel("Date Of Birth :");
		lblRoleId.setForeground(Color.BLACK);
		lblRoleId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblRoleId.setBounds(10, 80, 245, 14);
		panel_2.add(lblRoleId);

		JDateChooser dob = new JDateChooser();
		dob.setBounds(10, 104, 328, 28);
		panel_2.add(dob);

		JLabel lblEmployeeId = new JLabel("Personal_Ph_No. :");
		lblEmployeeId.setForeground(Color.BLACK);
		lblEmployeeId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEmployeeId.setBounds(10, 228, 245, 14);
		panel_2.add(lblEmployeeId);

		txt_Per_ph = new JTextField();
		txt_Per_ph.setColumns(10);
		txt_Per_ph.setBounds(10, 252, 328, 28);
		panel_2.add(txt_Per_ph);

		JLabel lblDeptId = new JLabel("Work_Ph_No. :");
		lblDeptId.setForeground(Color.BLACK);
		lblDeptId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblDeptId.setBounds(10, 290, 245, 14);
		panel_2.add(lblDeptId);

		txt_Work_ph = new JTextField();
		txt_Work_ph.setColumns(10);
		txt_Work_ph.setBounds(10, 320, 328, 28);
		panel_2.add(txt_Work_ph);

		JLabel lblPosition = new JLabel("Marital Status :");
		lblPosition.setForeground(Color.BLACK);
		lblPosition.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition.setBounds(10, 367, 245, 14);
		panel_2.add(lblPosition);

		txt_M_status = new JTextField();
		txt_M_status.setColumns(10);
		txt_M_status.setBounds(10, 391, 328, 28);
		panel_2.add(txt_M_status);

		JLabel label_1 = new JLabel("Father Name :");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		label_1.setBounds(10, 10, 245, 14);
		panel_2.add(label_1);

		txt_FatherN = new JTextField();
		txt_FatherN.setColumns(10);
		txt_FatherN.setBounds(10, 42, 328, 28);
		panel_2.add(txt_FatherN);

		JLabel lblEndDate_2 = new JLabel("Joined Date :");
		lblEndDate_2.setBounds(10, 429, 245, 14);
		panel_2.add(lblEndDate_2);
		lblEndDate_2.setForeground(Color.BLACK);
		lblEndDate_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));

		JLabel lblWorkingExp = new JLabel("NRC :");
		lblWorkingExp.setBounds(20, 142, 245, 14);
		panel_2.add(lblWorkingExp);
		lblWorkingExp.setForeground(Color.BLACK);
		lblWorkingExp.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));

		JComboBox NRC2 = new JComboBox();
		NRC2.setBounds(82, 177, 117, 25);
		panel_2.add(NRC2);

		JComboBox cboNRC1 = new JComboBox();
		cboNRC1.addItemListener((ItemListener) new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				String d1[] = { "BaMaNa", "KhaHpaNa", "DaHpaYa", "HaPaNa", "HpaKaNa", "AhGaYa", "KaMaNa", "KaMaTa",
						"KaPaTa", "MaKhaBa", "MaSaNa", "MaKaTa", "MaNyaNa", "KhaLaHpa", "LaGaNa", "MaMaNa", "MaKaNa",
						"MaLaNa", "NaMaNa", "PaWaNa", "PaNaDa", "PaTaAh", "PaTaAh", "SaDaNa", "YaBaYa", "YaKaNa",
						"SaBaNa", "SaPaYa", "TaNaNa", "SaLaNa", "TaSaLa", "WaMaNa" };
				String d2[] = { "BaLaKha", "DaMaSa", "HpaSaNa", "HpaYaSa", "LaKaNa", "MaSaNa", "YaTaNa", "aThaNa" };
				String d3[] = { "BaGaLa", "LaBaNa", "BaAhNa", "HpaPaNa", "BaThaSa", "KaMaMa", "KaKaYa", "KaDaNa",
						"KaSaKa", "KaDaTa", "LaThaNa", "MaWaTa", "PaKaNa", "YaYaTha", "SaKaLa", "ThaTaNa", "ThaTaKa",
						"WaLaMa" };
				String d4[] = { "KaKhaNa", "HpaLaNa", "HaKhaNa", "KaPaLa", "MaTaPa", "MaTaNa", "PaLaWa", "YaZaNa",
						"YaKhaDa", "SaMaNa", "TaTaNa", "HtaTaLa", "TaZaNa" };
				String d5[] = { "AhYaTa", "BaMaNa", "BaTaLa", "KhaTaNa", "KhaOuTa", "HaMaLa", "AhTaNa", "KaLaHta",
						"KaLaWa", "KaBaLa", "KaNaNa", "KaThaNa", "KaLaTa", "KhaOuNa", "KaLaNa", "LaHaNa", "LaYaNa",
						"MaLaNa", "MaKaNa", "MaYaNa", "MaMaNa", "MaMaTa", "NaYaNa", "NgaZaNa", "PaLaNa", "HpaPaNa",
						"PaLaBa", "SaKaNa", "SaLaKa", "YaBaNa", "DaPaYa", "TaMaNa", "TaSaNa", "HtaKhaNa", "WaLaNa",
						"WaThaNa", "YaOuNa", "YaMaPa", "KaMaNa", "KhaPaNa" };
				String d6[] = { "BaPaNa", "HtaWaNa", "KaLaAh", "KaThaNa", "KaSaNa", "LaLaNa", "MaMaNa", "PaLaNa",
						"TaThaYa", "ThuYaKha", "YaHpaNa", "KhaMaNa", "MaTaNa", "PaLaTa", "MaAhYa", "MaAhYa", "KaYaYa" };
				String d7[] = { "DaOuNa", "KaPaKa", "KaWaNa", "KaKaNa", "KaTaKha", "LaPaTa", "MaLaNa", "MaNyaNa",
						"NaTaLa", "NyaLaPa", "AhHpaNa", "AhTaNa", "PaTaNa", "PaKhaTa", "PaKhaNa", "PaTaTa", "PaNaKa",
						"HpaMaNa", "PaMaNa", "YaTaNa", "YaKaNa", "HtaTaPa", "TaNgaNa", "ThaNaPa", "ThaWaTa", "ThaKaNa",
						"ThaSaNa", "WaMaNa", "YaTaYa", "ZaKaNa", "PaTaSa" };
				String d8[] = { "AhLaNa", "KhaMaNa", "GaGaNa", "KaMaNa", "MaKaNa", "MaBaNa", "MaTaNa", "MaLaNa",
						"MaMaNa", "MaHtaNa", "MaThaNa", "NaMaNa", "NgaHpaNa", "PaKhaKa", "PaMaNa", "PaHpaNa", "SaLaNa",
						"SaMaNa", "SaHpaNa", "SaTaYa", "SaPaWa", "TaTaKa", "ThaYaNa", "HtaLaNa", "YaNaKha", "YaSaKa",
						"MaHtaNa", "KaHtaNa", "MaTaNa" };
				String d9[] = { "AhMaYa", "AhMaZa", "KhaAhZa", "KhaMaSa", "KaPaTa", "KaSaNa", "MaTaYa", "MaHaMa",
						"MaLaNa", "MaYaMa", "MaYaTa", "MaNaMa", "MaNaTa", "MaHtaLa", "MaKaNa", "MaKhaNa", "MaThaNa",
						"NaHtaNa", "NaHtaKa", "NgaThaYa", "NgaZaNa", "NyaOuNa", "PaThaKa", "PaBaNa", "PaKaKha",
						"PaOuLa", "SaKaNa", "SaKaTa", "ThaPaKa", "TaTaOu", "TaThaNa", "ThaSaNa", "WaTaNa", "YaMaTha",
						"NgaThaYa", "TaKaNa", "TaKaTa", "MaMaNa", "DaKhaTha", "LaWaNa", "OuTaTha", "PaBaTha", "PaMaNa",
						"TaKaNa", "ZaBaTha", "ZaYaTha" };
				String d10[] = { "BaLaNa", "KhaSaNa", "KhaZaNa", "KaMaYa", "KaHtaNa", "LaMaNa", "MaLaMa", "MaDaNa",
						"PaMaNa", "ThaHpaYa", "ThaHtaNa", "YaMaNa" };
				String d11[] = { "AaMaNa", "BaThaTa", "GaMaNa", "KaHpaNa", "KaTaNa", "MaAhNa", "MaAhTa", "MaTaNa",
						"MaPaNa", "MaAhNa", "MaOuNa", "MaPaTa", "PaTaNa", "PaNaKa", "PaNaTa", "YaBaNa", "YaThaTa",
						"SaTaNa", "ThaTaNa", "TaKaNa", "KaTaLa", "TaPaWa" };
				String d12[] = { "AhLaNa", "BaHaNa", "BaTaHta", "KaKaKa", "DaGaYa", "DaGaMa", "DaGaSa", "DaGaTa",
						"DaGaNa", "DaLaNa", "DaPaNa", "LaThaYa", "LaMaNa", "LaKaNa", "MaBaNa", "HtaTaPa", "AhSaNa",
						"KaMaYa", "KaMaNa", "KhaYaNa", "KaKhaKa", "KaTaTa", "KaTaNa", "KaMaTa", "LaMaTa", "LaThaNa",
						"MaYaKa", "MaGaDa", "MaGaTa", "OuKaMa", "PaBaTa", "PaZaTa", "SaKhaNa", "SaKaKha", "SaKaNa",
						"YaPaTha", "OuKaTa", "TaTaHta", "TaKaNa", "TaMaNa", "ThaKaTa", "ThaLaNa", "ThaGaKa", "ThaKhaNa",
						"TaTaNa", "YaKaNa", "OuKaNa" };

				String d13[] = { "AhKhaNa", "KhaYaHa", "KhaMaNa", "HaTaNa", "HaPaNa", "HaPaTa", "SaHpaNa", "ThaNaNa",
						"SaSaNa", "ThaPaNa", "KaLaHpa", "KaLaNa", "KaLaDa", "KaMaSa", "KaTaNa", "KaYaNa", "KaTaTa",
						"KaHaNa", "KaLaNa", "KaLaTa", "KaKhaNa", "KaMaNa", "KaTaLa", "KaThaNa", "LaKhaNa", "LaKhaTa",
						"LaYaNa", "LaKaNa", "LaKaTa", "LaKhaNa", "LaHaNa", "LaLaNa", "LaHtaNa", "MaBaNa", "MaMaSa",
						"MaTaNa", "MaTaTa", "MaMaNa", "MaHpaNa", "MaKaNa", "MaPaNa", "MaHpaNa", "MaSaNa", "MaYaNa",
						"MaKhaNa", "MaLaNa", "MaMaNa", "MaMaTa", "MaMaNa", "MaMaTa", "MaNaNa", "MaPaNa", "MaPaNa",
						"MaTaNa", "MaYaTa", "MaYaNa", "MaYaNa", "MaSaTa", "NaKhaWa", "NaTaNa", "NaKhaTa", "NaKhaNa",
						"NaMaTa", "NaHpaNa", "NaSaNa", "NaSaNa", "NaKaNa", "NaWaNa", "NaPhaNa", "NaKhaNa", "NakhaTa",
						"NyaYaNa", "PaKhaNa", "PaYaNa", "PaSaNa", "PaWaNa", "HpaKhaNa", "PaTaYa", "PaLaNa", "TaKhaLa",
						"TaYaNa", "TaKhaNa", "YaLaNa", "YaSaNa", "YaHpaNa", "YaNgaNa", "NaTaYa", "PaLaTa", "KhaLaNa",
						"PaPaKa", "MaHaYa", "TaMaNya", "MaBaNa", "MaNgaNa", "AhTaNa", "TaLaNa" };
				String d14[] = { "AhMaTa", "BaKaLa", "DaNaHpa", "DaDaYa", "AhMaNa", "HaKaKa", "HaThaTa", "AhGaPa",
						"KaKaHta", "KaLaNa", "KaKhaNa", "KaKaNa", "KaPaNa", "LaPaTa", "LaMaNa", "MaAhNa", "MaMaNa",
						"NgaPaTa", "NgaThaKha", "NgaYaKa", "NgaSaNa", "NgaThaYa", "NyaTaNa", "PaTaNa", "PaThaNa",
						"HpaPaNa", "PaSaLa", "YaThaYa", "ThaPaNa", "WaKhaMa", "YaKaNa", "ZaLaNa", "PaThaYa" };
				NRC2.removeAllItems();
				if (cboNRC1.getSelectedIndex() == 1) {
					for (int i = 0; i < d1.length; i++)
						NRC2.addItem(d1[i]);
				} else {
					if (cboNRC1.getSelectedIndex() == 2) {
						for (int i = 0; i < d2.length; i++)
							NRC2.addItem(d2[i]);
					} else {
						if (cboNRC1.getSelectedIndex() == 3) {
							for (int i = 0; i < d3.length; i++)
								NRC2.addItem(d3[i]);
						} else {
							if (cboNRC1.getSelectedIndex() == 4) {
								for (int i = 0; i < d4.length; i++)
									NRC2.addItem(d4[i]);
							} else {
								if (cboNRC1.getSelectedIndex() == 5) {
									for (int i = 0; i < d5.length; i++)
										NRC2.addItem(d5[i]);
								} else {
									if (cboNRC1.getSelectedIndex() == 6) {
										for (int i = 0; i < d6.length; i++)
											NRC2.addItem(d6[i]);
									} else {
										if (cboNRC1.getSelectedIndex() == 7) {
											for (int i = 0; i < d7.length; i++)
												NRC2.addItem(d7[i]);
										} else {
											if (cboNRC1.getSelectedIndex() == 8) {
												for (int i = 0; i < d8.length; i++)
													NRC2.addItem(d8[i]);
											} else {
												if (cboNRC1.getSelectedIndex() == 9) {
													for (int i = 0; i < d9.length; i++)
														NRC2.addItem(d9[i]);
												} else {
													if (cboNRC1.getSelectedIndex() == 10) {
														for (int i = 0; i < d10.length; i++)
															NRC2.addItem(d10[i]);
													} else {
														if (cboNRC1.getSelectedIndex() == 11) {
															for (int i = 0; i < d11.length; i++)
																NRC2.addItem(d11[i]);
														} else {
															if (cboNRC1.getSelectedIndex() == 12) {
																for (int i = 0; i < d12.length; i++)
																	NRC2.addItem(d12[i]);
															} else {
																if (cboNRC1.getSelectedIndex() == 13) {
																	for (int i = 0; i < d13.length; i++)
																		NRC2.addItem(d13[i]);
																} else {
																	if (cboNRC1.getSelectedIndex() == 14) {
																		for (int i = 0; i < d14.length; i++)
																			NRC2.addItem(d14[i]);
																	}
																}
															}
														}
													}

												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		});

		cboNRC1.setModel(new DefaultComboBoxModel(new String[] { " ", "1/", "2/", "3/", "4/", "5/", "6/", "7/", "8/",
				"9/", "10/", "11/", "12/", "13/", "14/" }));
		cboNRC1.setBounds(10, 177, 73, 25);
		panel_2.add(cboNRC1);

		JComboBox NRC3 = new JComboBox();
		NRC3.setModel(new DefaultComboBoxModel(new String[] { "", "(N)", "(A)", "(P)", "(Y)", "(S)", "(T)" }));
		NRC3.setBounds(203, 177, 52, 25);
		panel_2.add(NRC3);

		JLabel lblEndDate_2_1 = new JLabel("Address Code :");
		lblEndDate_2_1.setForeground(Color.BLACK);
		lblEndDate_2_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEndDate_2_1.setBounds(10, 491, 245, 14);
		panel_2.add(lblEndDate_2_1);

		txt_addr_code = new JTextField();
		txt_addr_code.setColumns(10);
		txt_addr_code.setBounds(10, 509, 328, 28);
		panel_2.add(txt_addr_code);

		JDateChooser txt_J_Date = new JDateChooser();
		txt_J_Date.setBounds(10, 453, 328, 28);
		panel_2.add(txt_J_Date);

		txt_NRC = new JTextField();
		txt_NRC.setColumns(10);
		txt_NRC.setBounds(259, 176, 79, 28);
		panel_2.add(txt_NRC);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(726, 10, 348, 547);
		panel.add(panel_3);

		JLabel lblEmpId = new JLabel("Address :");
		lblEmpId.setForeground(Color.BLACK);
		lblEmpId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEmpId.setBounds(11, 69, 245, 14);
		panel_3.add(lblEmpId);

		txt_address = new JTextField();
		txt_address.setColumns(10);
		txt_address.setBounds(11, 88, 328, 28);
		panel_3.add(txt_address);

		JLabel lblCompany = new JLabel("City :");
		lblCompany.setForeground(Color.BLACK);
		lblCompany.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblCompany.setBounds(11, 427, 245, 14);
		panel_3.add(lblCompany);

		txt_city = new JTextField();
		txt_city.setColumns(10);
		txt_city.setBounds(11, 451, 328, 28);
		panel_3.add(txt_city);

		JLabel lblPosition_1 = new JLabel("Religion :");
		lblPosition_1.setForeground(Color.BLACK);
		lblPosition_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition_1.setBounds(11, 179, 245, 14);
		panel_3.add(lblPosition_1);

		txt_religion = new JTextField();
		txt_religion.setColumns(10);
		txt_religion.setBounds(11, 203, 328, 28);
		panel_3.add(txt_religion);

		JLabel lblWorkId = new JLabel("E-Mail :");
		lblWorkId.setForeground(Color.BLACK);
		lblWorkId.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblWorkId.setBounds(11, 303, 245, 14);
		panel_3.add(lblWorkId);

		txt_Email = new JTextField();
		txt_Email.setColumns(10);
		txt_Email.setBounds(11, 327, 328, 28);
		panel_3.add(txt_Email);

		txt_nationality = new JTextField();
		txt_nationality.setColumns(10);
		txt_nationality.setBounds(11, 389, 328, 28);
		panel_3.add(txt_nationality);

		JLabel lblFromDate_2 = new JLabel("Nationality :");
		lblFromDate_2.setForeground(Color.BLACK);
		lblFromDate_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblFromDate_2.setBounds(11, 365, 245, 14);
		panel_3.add(lblFromDate_2);

		JLabel lblWorkingExperience = new JLabel("Address Information");
		lblWorkingExperience.setForeground(new Color(0, 102, 102));
		lblWorkingExperience.setFont(new Font("Modern No. 20", Font.BOLD, 25));
		lblWorkingExperience.setBackground(Color.WHITE);
		lblWorkingExperience.setBounds(11, 11, 327, 47);
		panel_3.add(lblWorkingExperience);

		JLabel lblEmpId_1 = new JLabel("TownShip :");
		lblEmpId_1.setForeground(Color.BLACK);
		lblEmpId_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblEmpId_1.setBounds(11, 126, 245, 14);
		panel_3.add(lblEmpId_1);

		txt_town = new JTextField();
		txt_town.setColumns(10);
		txt_town.setBounds(11, 141, 328, 28);
		panel_3.add(txt_town);

		JLabel lblPosition_1_1 = new JLabel("Postal Code :");
		lblPosition_1_1.setForeground(Color.BLACK);
		lblPosition_1_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblPosition_1_1.setBounds(11, 243, 245, 14);
		panel_3.add(lblPosition_1_1);

		txt_postal = new JTextField();
		txt_postal.setColumns(10);
		txt_postal.setBounds(11, 265, 328, 28);
		panel_3.add(txt_postal);

		JLabel lblAddressCode = new JLabel("Region:");
		lblAddressCode.setForeground(Color.BLACK);
		lblAddressCode.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 11));
		lblAddressCode.setBounds(11, 485, 245, 14);
		panel_3.add(lblAddressCode);

		txt_region = new JTextField();
		txt_region.setColumns(10);
		txt_region.setBounds(11, 509, 328, 28);
		panel_3.add(txt_region);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(368, 559, 706, 94);
		panel.add(panel_5);
		panel_5.setLayout(null);

		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Choose_update_create_emp().setVisible(true);
			}
		});
		button.setBounds(10, 33, 110, 28);
		panel_5.add(button);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button.setBackground(new Color(0, 102, 102));

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_emp_id.setText("");
				comboDept.setSelectedIndex(0);
				txt_FName.setText(" ");
				txt_LName.setText(" ");
				buttonGroup.clearSelection();
				txt_age.setText(" ");
				txt_FatherN.setText(" ");
				dob.setDate(null);
				txt_Per_ph.setText(" ");
				txt_Work_ph.setText(" ");
				txt_M_status.setText(" ");
				txt_address.setText(" ");
				txt_city.setText(" ");
				txt_religion.setText(" ");
				txt_nrc.setText(" ");
				txt_Email.setText(" ");
				txt_nationality.setText(" ");
				txt_J_Date.setDate(null);
				txt_addr_code.setText(" ");
				txt_region.setText(" ");

			}
		});
		btnClear.setBounds(408, 33, 110, 28);
		panel_5.add(btnClear);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnClear.setBackground(new Color(0, 102, 102));

		JButton button_3 = new JButton("Close");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    System.exit(0);
			
			}
		});
		button_3.setBounds(544, 33, 110, 28);
		panel_5.add(button_3);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		button_3.setBackground(new Color(0, 102, 102));

		btnCreate_2 = new JButton("Create");
		btnCreate_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputCheck();
				String emp_id = txt_emp_id.getText();
				int dept_id = Integer.parseInt(comboDept.getSelectedItem().toString());
				String F_Name = txt_FName.getText();
				String L_Name = txt_LName.getText();
				String gender = null;
				if (rdbtnMale.isSelected())
					gender = "Male";
				if (rdbtnFemale.isSelected())
					gender = "Female";
				String age = txt_age.getText();
				String Father_N = txt_FatherN.getText();
				Date DOB = new Date(dob.getDate().getTime());
				String Per_Ph_no = txt_Per_ph.getText();
				String work_ph = txt_Work_ph.getText();
				String M_statsu = txt_M_status.getText();
				String address = txt_address.getText();
				String township = txt_town.getText();
				String city = txt_city.getText();
				String religion = txt_religion.getText();
				String nrc = cboNRC1.getSelectedItem().toString() + NRC2.getSelectedItem().toString()
						+ NRC3.getSelectedItem().toString() + txt_NRC.getText();
				String email = txt_Email.getText();
				String nationality = txt_nationality.getText();
				Date J_date = new Date(txt_J_Date.getDate().getTime());
				String postal = txt_postal.getText();
				String addr_code = txt_region.getText();
				String region = txt_region.getText();

				Address ee = new Address();
				ee.setRegion(region);
				ee.setPostalCode(postal);
				ee.setAddr_code(addr_code);
				ee.setAddr(address);
				ee.setEmp_id(emp_id);
				ee.setAddr(address);
				ee.setTownship(township);
				ee.setCity(city);
				Employee aa = new Employee();
				aa.setEmp_id(emp_id);
				aa.setDept_id(dept_id);
				aa.setFname(F_Name);
				aa.setLname(L_Name);
				aa.setGender(gender);
				aa.setAge(age);
				aa.setFather_name(Father_N);
				aa.setDob(String.valueOf(DOB));
				aa.setP_phno(Per_Ph_no);
				aa.setW_phno(work_ph);
				aa.setMatrital_status(M_statsu);
				aa.setEmail(email);
				aa.setReligion(religion);
				aa.setNationality(nationality);
				aa.setJoined_date(String.valueOf(J_date));
				aa.setNRC(nrc);
			
				int choice = JOptionPane.showConfirmDialog(null, "Do you really want to save your data",
						"Comfirm Message", JOptionPane.INFORMATION_MESSAGE);
				if (choice == JOptionPane.YES_OPTION)
					try {

						new AdminDAO().addEmployee_info(aa);
						new AdminDAO().addEmployee_addres(ee);
						new AdminDAO().addEmployee_Login(aa);

						nextCheck = true;
						txt_emp_id.setText("");
						comboDept.setSelectedIndex(0);
						txt_FName.setText(" ");
						txt_LName.setText(" ");
						buttonGroup.clearSelection();
						txt_age.setText(" ");
						txt_FatherN.setText(" ");
						dob.setDate(null);
						txt_Per_ph.setText(" ");
						txt_Work_ph.setText(" ");
						txt_M_status.setText(" ");
						txt_address.setText(" ");
						txt_city.setText(" ");
						txt_religion.setText(" ");
						txt_Email.setText(" ");
						txt_nationality.setText(" ");
						txt_J_Date.setDate(null);
						txt_addr_code.setText(" ");
						txt_region.setText(" ");
						txt_NRC.setText(" ");
						btnCreate.setVisible(true);
						btnCreate_2.setVisible(false);
					} catch (SQLException e1_) {
						JOptionPane.showMessageDialog(null, "Database Connection Error", "Save Error",
								JOptionPane.ERROR_MESSAGE);
						System.out.println(e1_);
						nextCheck = false;

					}

			}

		});
		btnCreate_2.setForeground(Color.WHITE);
		btnCreate_2.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnCreate_2.setBackground(new Color(0, 102, 102));
		btnCreate_2.setBounds(147, 33, 110, 28);
		panel_5.add(btnCreate_2);

		 btnCreate = new JButton("Next ");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setVisible(false);
				try {
					new Create_otherEmpInfo().setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		btnCreate.setBounds(281, 33, 110, 28);
		panel_5.add(btnCreate);
		btnCreate.setVisible(false);
		btnCreate.setForeground(Color.WHITE);
		btnCreate.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		btnCreate.setBackground(new Color(0, 102, 102));
	}

	public void inputCheck() {
		if (txt_emp_id.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Emp _id is missing", "missing data error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
