package Admin;

import java.awt.BorderLayout;
import Main.Employee;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;


public class Create_Admin extends JFrame {

	
 private Connection con;	
  private JPanel contentPane;
  private final JDesktopPane desktopPane = new JDesktopPane();
  private final JLabel lblPersonalInformation = new JLabel("Personal Information");
  private final JLabel lblEmployeeId = new JLabel("Last Name      :");
  private final JLabel lblFatherName = new JLabel("Father Name    :");
  private final JLabel lblNewLabel_2 = new JLabel("Date Of Birth  :");
  private JTextField emp_id;
  private JTextField txtfname;
  private JTextField txtlname;
  private JTextField txtF_name;
  private final JLabel lblFastName = new JLabel("First Name     :");
  private final JLabel label_1 = new JLabel("Employee ID    :");
  private final JDesktopPane desktopPane_3 = new JDesktopPane();
  private final JLabel lblAdditionalInformation = new JLabel("Address Information");
  private final JLabel lblAge = new JLabel("Gender         :");
  private final JLabel lblAge_1 = new JLabel("Age            :");
  private final JTextField txtage = new JTextField();
  private JTextField txtemail;
  private JTextField txtP_ph;
  private JTextField txtw_ph;
  private JTextField txtN;
  private JTextField txtR;
  private JTextField txtC;
  private JTextField txtTown;
  private JTextField txtNation;
  private final ButtonGroup Bbutton = new ButtonGroup();
  private  JComboBox cbostatus,dept_combo;
	JDateChooser dob_chooser ;
    JRadioButton rdoFemale;


private JRadioButton rdomale;
  private final ButtonGroup buttonGroup = new ButtonGroup();
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
      
          Create_Admin frame = new Create_Admin();
          frame.setVisible(true); 
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }
  public Create_Admin() throws SQLException {
    setTitle("Add Employee");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 1100, 742);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    desktopPane.setBackground(new Color(51, 102, 153));
    desktopPane.setBounds(15, 16, 1063, 710);
    contentPane.add(desktopPane);
    desktopPane_3.setBackground(new Color(204, 204, 204));
    desktopPane_3.setBounds(503, 0, 476, 439);
    
    desktopPane.add(desktopPane_3);
    lblAdditionalInformation.setFont(new Font("Monospaced", Font.BOLD, 20));
    lblAdditionalInformation.setBounds(33, 16, 260, 30);
    
    desktopPane_3.add(lblAdditionalInformation);
    
    JLabel lblEmail = new JLabel("E-mail                 :");
    lblEmail.setBounds(15, 259, 163, 34);
    desktopPane_3.add(lblEmail);
    lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
    
    txtemail = new JTextField();
    txtemail.setBounds(223, 266, 186, 22);
    desktopPane_3.add(txtemail);
    txtemail.setColumns(10);
    
    JLabel lblNrc = new JLabel("NRC          :");
    lblNrc.setFont(new Font("Monospaced", Font.BOLD, 18));
    lblNrc.setBounds(16, 207, 192, 34);
    desktopPane_3.add(lblNrc);
    
    JLabel lblReligion = new JLabel("Religion     :");
    lblReligion.setFont(new Font("Monospaced", Font.BOLD, 18));
    lblReligion.setBounds(16, 157, 192, 34);
    desktopPane_3.add(lblReligion);
    
    JLabel lblCity = new JLabel("City         :");


lblCity.setFont(new Font("Monospaced", Font.BOLD, 18));
    lblCity.setBounds(16, 107, 192, 34);
    desktopPane_3.add(lblCity);
    
    JLabel lblTownship = new JLabel("TownShip     :");
    lblTownship.setFont(new Font("Monospaced", Font.BOLD, 18));
    lblTownship.setBounds(16, 62, 192, 34);
    desktopPane_3.add(lblTownship);
    
    txtN = new JTextField();
    txtN.setColumns(10);
    txtN.setBounds(223, 214, 186, 22);
    desktopPane_3.add(txtN);
    
    txtR = new JTextField();
    txtR.setColumns(10);
    txtR.setBounds(223, 169, 186, 22);
    desktopPane_3.add(txtR);
    
    txtC = new JTextField();
    txtC.setColumns(10);
    txtC.setBounds(223, 114, 186, 22);
    desktopPane_3.add(txtC);
    
    txtTown = new JTextField();
    txtTown.setColumns(10);
    txtTown.setBounds(223, 69, 186, 22);
    desktopPane_3.add(txtTown);
    
    JLabel lblNationality = new JLabel("Nationality  :");
    lblNationality.setFont(new Font("Monospaced", Font.BOLD, 18));
    lblNationality.setBounds(15, 322, 192, 22);
    desktopPane_3.add(lblNationality);
    
    txtNation = new JTextField();
    txtNation.setColumns(10);
    txtNation.setBounds(219, 323, 190, 22);
    desktopPane_3.add(txtNation);
    
    JLabel label = new JLabel("");
    label.setBounds(12, 342, 56, 16);
    desktopPane_3.add(label);
    
    JLabel lblJoinedDate = new JLabel("Joined Date  :");
    lblJoinedDate.setFont(new Font("Monospaced", Font.BOLD, 18));
    lblJoinedDate.setBounds(15, 374, 192, 22);
    desktopPane_3.add(lblJoinedDate);
    
    JDateChooser jD_chooser = new JDateChooser();
    jD_chooser.setBounds(223, 364, 196, 32);
    desktopPane_3.add(jD_chooser);
    
//    JDateChooser dateChooser_1 = new JDateChooser();
//    dateChooser_1.setBounds(223, 374, 186, 26);
//    desktopPane_3.add(dateChooser_1);
    
    JButton btnNewButton = new JButton("Add");
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		
            String id=emp_id.getText();
             int dept=Integer.parseInt(dept_combo.getSelectedItem().toString());
            String fname=txtfname.getText();
            String lname=txtlname.getText();
            String age=txtage.getText();
            String gender=null;
            if(rdomale .isSelected())
              gender="Male";
            if(rdoFemale.isSelected())
              gender="Female";
            String email=txtemail.getText();
            String  w_phno=txtw_ph.getText();
            String  P_phno=txtP_ph.getText();
            String TownShip=txtTown.getText();
            String City=txtC.getText();
            String nrc=txtN.getText();
            String Nationality=txtNation.getText();
            String Father_Name=txtF_name.getText();
            String religion=txtR.getText();
            String city=txtC.getText();
            String town=txtTown.getText();
          String txt_status =cbostatus.getSelectedItem().toString();
          Date jD=new Date(jD_chooser.getDate().getTime());
         Date dob=new Date(dob_chooser.getDate().getTime());
         System.out.println(dob);
  //       Employee ee=new Employee(id,dept,fname,lname,gender,age,String.valueOf(dob), nrc,email,w_phno,P_phno,txt_status,Nationality,religion,Father_Name,String.valueOf(jD),fname,fname);
//         try {
//			//new AdminDAO().AddEmp(ee);
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			JOptionPane.showMessageDialog(null, "Error happened", "error found try again",JOptionPane.ERROR_MESSAGE);
//			System.out.println(e1);
//		}
         
    	}
    });
    btnNewButton.setFont(new Font("Monospaced", Font.BOLD, 18));
    btnNewButton.setBounds(819, 500, 97, 25);
    desktopPane.add(btnNewButton);
    
    JButton btnBack = new JButton("Clear");
    btnBack.setFont(new Font("Monospaced", Font.BOLD, 18));
    btnBack.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        emp_id.setText(null);
        txtfname.setText(null);
        txtlname.setText(null);
        txtage.setText(null);
        buttonGroup.clearSelection();
        dept_combo.setSelectedIndex(0);
        cbostatus.setSelectedIndex(0);
        txtemail.setText(null);
        txtP_ph.setText(null);
        txtw_ph.setText(null);
        txtTown.setText(null);
        txtC.setText(null);
        txtN.setText(null);
        txtNation.setText(null);
        txtF_name.setText(null);
        txtR.setText(null);
        dob_chooser.setDateFormatString("");
        jD_chooser.setDateFormatString("");
      }
    });
    btnBack.setBounds(819, 576, 97, 25);
    desktopPane.add(btnBack);
    
    JButton btnNext = new JButton("Close");
    btnNext.setFont(new Font("Monospaced", Font.BOLD, 18));
    btnNext.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
       System.exit(0);    
      }
    });
    btnNext.setBounds(819, 617, 97, 25);
    desktopPane.add(btnNext);
    
    JDesktopPane desktopPane_1 = new JDesktopPane();
    desktopPane_1.setBackground(Color.LIGHT_GRAY);
    desktopPane_1.setBounds(0, 0, 454, 670);
    desktopPane.add(desktopPane_1);
    lblFastName.setBounds(19, 161, 198, 34);
    desktopPane_1.add(lblFastName);
    lblFastName.setFont(new Font("Monospaced", Font.BOLD, 18));
    lblEmployeeId.setBounds(20, 211, 188, 34);
    desktopPane_1.add(lblEmployeeId);
    lblEmployeeId.setFont(new Font("Monospaced", Font.BOLD, 18));
    lblAge.setBounds(19, 261, 177, 34);
    desktopPane_1.add(lblAge);
    lblAge.setFont(new Font("Monospaced", Font.BOLD, 18));
    
    JLabel txt_status = new JLabel("Marital Status :");
    txt_status.setBounds(19, 604, 188, 34);
    desktopPane_1.add(txt_status);
    txt_status.setFont(new Font("Monospaced", Font.BOLD, 18));
    
    JLabel lblWorkph = new JLabel("Work_Ph_no     :");
    lblWorkph.setBounds(19, 554, 198, 34);
    desktopPane_1.add(lblWorkph);
    lblWorkph.setFont(new Font("Monospaced", Font.BOLD, 18));
    
    JLabel lblPersonalPh = new JLabel("Personal_Ph_no :");
    lblPersonalPh.setBounds(19, 498, 198, 34);
    desktopPane_1.add(lblPersonalPh);
    lblPersonalPh.setFont(new Font("Monospaced", Font.BOLD, 18));
    lblNewLabel_2.setBounds(19, 446, 178, 30);
    desktopPane_1.add(lblNewLabel_2);
    lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD, 18));
    lblFatherName.setBounds(19, 386, 209, 34);
    desktopPane_1.add(lblFatherName);
    lblFatherName.setFont(new Font("Monospaced", Font.BOLD, 18));
    lblAge_1.setBounds(19, 327, 188, 34);
    desktopPane_1.add(lblAge_1);
    lblAge_1.setFont(new Font("Monospaced", Font.BOLD, 18));
    
    txtw_ph = new JTextField();
    txtw_ph.setBounds(226, 555, 198, 22);
    desktopPane_1.add(txtw_ph);
    txtw_ph.setColumns(10);
    
    txtP_ph = new JTextField();
    txtP_ph.setBounds(226, 499, 198, 22);
    desktopPane_1.add(txtP_ph);
    txtP_ph.setColumns(10);
//    
//    JDateChooser dateChooser = new JDateChooser();
//    dateChooser.setBounds(226, 440, 198, 26);
//    desktopPane_1.add(dateChooser);
    
    txtF_name = new JTextField();
    txtF_name.setBounds(226, 384, 198, 22);
    desktopPane_1.add(txtF_name);
    txtF_name.setColumns(10);
    txtage.setBounds(226, 335, 198, 22);
    desktopPane_1.add(txtage);
    txtage.setColumns(10);
    
    rdomale = new JRadioButton("Male");
    buttonGroup.add(rdomale);
    rdomale.setBounds(226, 262, 86, 33);
    desktopPane_1.add(rdomale);
    rdomale.setFont(new Font("Monospaced", Font.BOLD, 18));
     
     txtlname = new JTextField();
     txtlname.setBounds(226, 218, 198, 22);
     desktopPane_1.add(txtlname);
     txtlname.setColumns(10);
     
     txtfname = new JTextField();
     txtfname.setBounds(226, 162, 198, 22);
     desktopPane_1.add(txtfname);
     txtfname.setColumns(10);
     
	dob_chooser = new JDateChooser();
		dob_chooser.setBounds(228, 444, 196, 32);
		desktopPane_1.add(dob_chooser);
     
     emp_id = new JTextField();
     emp_id.setBounds(226, 73, 198, 22);
     desktopPane_1.add(emp_id);
     emp_id.setColumns(10);
     
     rdoFemale = new JRadioButton("Female");
     buttonGroup.add(rdoFemale);
     rdoFemale.setFont(new Font("Monospaced", Font.BOLD, 18));
     rdoFemale.setBounds(318, 262, 105, 33);
     desktopPane_1.add(rdoFemale);
     
     JLabel lblDepartmentId = new JLabel("Department ID  :");
     lblDepartmentId.setFont(new Font("Monospaced", Font.BOLD, 18));
     lblDepartmentId.setBounds(19, 111, 209, 34);
     desktopPane_1.add(lblDepartmentId);
     label_1.setBounds(19, 66, 183, 34);
     desktopPane_1.add(label_1);
     label_1.setFont(new Font("Monospaced", Font.BOLD, 18));
     lblPersonalInformation.setBounds(15, 23, 330, 34);
     desktopPane_1.add(lblPersonalInformation);
     lblPersonalInformation.setFont(new Font("Monospaced", Font.BOLD, 20));
     
      cbostatus = new JComboBox();
     cbostatus.setModel(new DefaultComboBoxModel(new String[] {"None", "1.Single", "2.Married", "3.Others"}));
     cbostatus.setBounds(227, 609, 197, 26);
     desktopPane_1.add(cbostatus);
     
		 dept_combo = new JComboBox(new AdminDAO().showDept().toArray());
           dept_combo.setBounds(226, 121, 198, 24);
           desktopPane_1.add(dept_combo);
     
     
//      dept_combo = new JComboBox();
//      dept_combo.setModel(new DefaultComboBoxModel(new String[] {"None",}));
//     dept_combo.setBounds(226, 121, 198, 24);
//     desktopPane_1.add(dept_combo);
     
     JButton btn_Next = new JButton("Next");
     btn_Next.setFont(new Font("Monospaced", Font.BOLD, 18));
     btn_Next.setBounds(819, 541, 97, 25);
     desktopPane.add(btn_Next);
  }
}