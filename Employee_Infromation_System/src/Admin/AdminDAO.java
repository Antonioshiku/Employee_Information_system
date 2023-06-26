package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Main.Employee;

public class AdminDAO {
	   private  Connection con;
	    public AdminDAO(){
	        try{
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system","root","123456");
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	    }
	    
	    public ArrayList<String> showDept() throws SQLException {
	    	
	    	ArrayList<String> result=new ArrayList<String>();
	    	PreparedStatement pst = con.prepareStatement("select dept_id from  department");
	  		ResultSet rs=pst.executeQuery();
	  		
	  		while(rs.next()) {
	  			 result.add(rs.getString(1));
	  		}
	  		
	  		return result;
	    }
	    
	    public void AddEmp(Employee e) throws SQLException {
	      	PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	      	pst.setString(1,e.getEmp_id());
	      	pst.setInt(2, e.getDept_id());
	      	pst.setString(3, e.getFname());
	      	pst.setString(4, e.getLname());
	      	pst.setString(5, e.getGender());
	      	pst.setString(6, e.getAge());
	      	pst.setString(7, e.getDob());
	      	pst.setString(8, e.getNRC());
	      	pst.setString(9, e.getEmail());
	      	pst.setString(10, e.getW_phno());
	      	pst.setString(11, e.getP_phno());
	      	pst.setString(12, e.getMatrital_status());
	      	pst.setString(13, e.getNationality());
	      	pst.setString(14, e.getReligion());
	      	pst.setString(15, e.getFather_name());
	      	pst.setString(16, e.getJoined_date());
	  		
	      	 int i=pst.executeUpdate();
	  		
	  		
	    }
	    
//	    public static void main(String[] args) throws SQLException {
//			ArrayList<String> s=new ArrayList<String>();
//	    	s= new AdminDAO().showDept();
//	    	
//		}
	    
}
