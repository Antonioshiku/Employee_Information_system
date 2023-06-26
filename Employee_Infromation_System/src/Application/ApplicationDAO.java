package Application;

import Main.Employee;
import Main.Address;
import Main.role_history;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ApplicationDAO {
	  private  Connection con;
	    public ApplicationDAO(){
	        try{
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr_inforamtion_system","root","123456");
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	    }
	    
	    public  ArrayList<String>  showEmp() throws SQLException{
	    	String query=" select employee.emp_id,employee.dept_id,employee.F_Name,employee.L_Name,employee.Per_Ph_No,employee.Email,Address.address,Address.TownShip,Address.City,role_history.position,role_history.Salary,role_history.status from employee,role_history,address where employee.dept_id=100 && employee.emp_id=role_history.emp_id && employee.emp_id=address.emp_id;";
	    	ArrayList<String> result=new ArrayList<String>();
	    	PreparedStatement pst = con.prepareStatement(query);
	          ResultSet rs=pst.executeQuery();
	         
	          while(rs.next()) {
	        	   result.add(rs.getString(1));
	        	   result.add(Integer.toString(rs.getInt(2)));
	        	   result.add(rs.getString(3));
	        	   result.add(rs.getString(4));
	        	   result.add(rs.getString(5));
	        	   result.add(rs.getString(6));
	        	   result.add(rs.getString(7));
	        	   result.add(rs.getString(8));
	        	   result.add(rs.getString(9));
	        	   result.add(rs.getString(10));
	        	   result.add(rs.getString(11));
	        	   result.add(rs.getString(12));
	        	   
	          }
	    	return result;
	    }
	    
	
}

