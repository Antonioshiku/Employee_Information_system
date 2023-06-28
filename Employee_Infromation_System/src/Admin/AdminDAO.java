package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Main.Qualification;
import Main.role_history;
import Main.Working_Exe;


public class AdminDAO {
private Connection con;
  
  public AdminDAO(){
    try{
      con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_project","root","hsupyae777");
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
  public void addEmployee_QFInfo(Qualification q) throws SQLException{
    PreparedStatement pst=con.prepareStatement("insert into qualification(QF_id,emp_id,dept_id,Degree_Certificate,Type,Field_name,org_name,from_date,end_date) values(?,?,?,?,?,?,?,?,?)");
    pst.setString(1, q.getQF_id());
    pst.setString(2, q.getEmp_id());
    pst.setString(3, q.getDegree_Certificate());
    pst.setString(4, q.getType());
    pst.setString(5, q.getField_name());
    pst.setString(6, q.getOrg_name());
    pst.setString(7, q.getFrom_date());
    pst.setString(8, q.getEnd_date());
    int i=pst.executeUpdate();
    if(i>0){
      int dept_id=0;
      pst=con.prepareStatement("Select last_insert_id()");
      ResultSet rs=pst.executeQuery();
      while(rs.next())
        dept_id=rs.getInt(1);
      if(i>0) JOptionPane.showMessageDialog(null, "Your Data have been saved successfully","Finished Saving",JOptionPane.INFORMATION_MESSAGE);
      pst.close();
      rs.close();
       }
  }
  public void addEmployee_RoleInfo( role_history r) throws SQLException{
    PreparedStatement pst=con.prepareStatement("insert into role_history(role_id,emp_id,dept_id,position,salary,status,from_date,to_date) values(?,?,?,?,?,?,?,?)");
    pst.setString(1, r.getRole_id());
    pst.setString(2, r.getEmp_id());
    pst.setString(4, r.getPosition());
    pst.setString(4, r.getSalary());
    pst.setString(5, r.getStatus());
    pst.setString(6, r.getFrom_date());
    pst.setString(7, r.getTo_date());
    int i=pst.executeUpdate();
    if(i>0){
      int dept_id=0;
      pst=con.prepareStatement("Select last_insert_id()");
      ResultSet rs=pst.executeQuery();
      while(rs.next())
        dept_id=rs.getInt(1);
      if(i>0) JOptionPane.showMessageDialog(null, "Your Data have been saved successfully","Finished Saving",JOptionPane.INFORMATION_MESSAGE);
      pst.close();
      rs.close();
    }

     }
  public void addEmployee_Work_expInfo(Working_Exe w) throws SQLException{
    PreparedStatement pst=con.prepareStatement("insert into working_experience(work_id,emp_id,Company,position,Working_exp) values(?,?,?,?,?)");
    pst.setString(1, w.getWork_id());
    pst.setString(2, w.getEmp_id());
    pst.setString(3, w.getCompany());
    pst.setString(4, w.getPosition());
    pst.setString(5, w.getWorking_exp());
     int i=pst.executeUpdate();
      if(i>0) JOptionPane.showMessageDialog(null, "Your Data have been saved successfully","Finished Saving",JOptionPane.INFORMATION_MESSAGE);
      pst.close();
      

 }
}
//	    public ArrayList<String> showDept() throws SQLException {
//	    	
//	    	ArrayList<String> result=new ArrayList<String>();
//	    	PreparedStatement pst = con.prepareStatement("select dept_id from  department");
//	  		ResultSet rs=pst.executeQuery();
//	  		
//	  		while(rs.next()) {
//	  			 result.add(rs.getString(1));
//	  		}
//	  		
//	  		return result;
//	    }
	    
