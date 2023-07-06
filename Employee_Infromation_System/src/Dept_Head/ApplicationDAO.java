package Dept_Head;

import Main.Employee;
import Main.Qualification;
import Main.Working_Exe;
import Main.pr_member;
import Main.project;
import Main.Address;
import Main.role_history;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

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
	    
	    
		public void addEmployee_info(Employee a) throws SQLException {
			PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, a.getEmp_id());
			pst.setInt(2, a.getDept_id());
			pst.setString(3, a.getFname());
			pst.setString(4, a.getLname());
			pst.setString(5, a.getGender());
			pst.setString(6, a.getAge());
			pst.setString(7, a.getDob());
			pst.setString(8, a.getNRC());
			pst.setString(9, a.getEmail());
			pst.setString(10, a.getW_phno());
			pst.setString(11, a.getP_phno());
			pst.setString(12, a.getMatrital_status());
			pst.setString(13, a.getNationality());
			pst.setString(14, a.getReligion());
			pst.setString(15, a.getFather_name());
			pst.setString(16, a.getJoined_date());

			int i = pst.executeUpdate();

			if (i > 0) {
				JOptionPane.showMessageDialog(null, "Your Data have been saved successfully", "Finished Saving",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Wrong data entry. Try again.", "Error Saving",
						JOptionPane.INFORMATION_MESSAGE);
			}

		}
		

		public void addEmployee_Login(Employee e) throws SQLException {
			PreparedStatement pst = con.prepareStatement("insert into login values(?,?,?,?)");
			pst.setString(1, e.getEmp_id());
			pst.setString(2, "employee@gmail.com");
			pst.setString(3, "emp1234");
			pst.setString(4, "Employee");
			
			int i=pst.executeUpdate();
			
		}

		public void addEmployee_addres(Address e) throws SQLException {
			PreparedStatement stmt = con.prepareStatement("insert into address values(?,?,?,?,?,?,?)");
			stmt.setString(1, e.getEmp_id());
			stmt.setString(2, e.getAddr_code());
			stmt.setString(3, e.getAddr());
			stmt.setString(4, e.getTownship());
			stmt.setString(5, e.getCity());
			stmt.setString(6, e.getRegion());
			stmt.setString(7, e.getPostalCode());

			int ii = stmt.executeUpdate();

		}

		public void addEmployee_QFInfo(Qualification q) throws SQLException {
			PreparedStatement pst = con.prepareStatement(
					"insert into qualification(QF_id,emp_id,dept_id,Degree_Certificate,Type,Field_name,org_name,from_date,end_date) values(?,?,?,?,?,?,?,?,?)");
			pst.setString(1, q.getQF_id());
			pst.setString(2, q.getEmp_id());
			pst.setInt(3, q.getDept_id());
			pst.setString(4, q.getDegree_Certificate());
			pst.setString(5, q.getType());
			pst.setString(6, q.getField_name());
			pst.setString(7, q.getOrg_name());
			pst.setString(8, q.getFrom_date());
			pst.setString(9, q.getEnd_date());
			int i = pst.executeUpdate();
			if (i > 0) {

				pst.close();

			}
		}

		public void addEmployee_RoleInfo(role_history r) throws SQLException {
			PreparedStatement pst = con.prepareStatement(
					"insert into role_history(role_id,emp_id,dept_id,position,salary,status,from_date,to_date) values(?,?,?,?,?,?,?,?)");
			pst.setString(1, r.getRole_id());
			pst.setString(2, r.getEmp_id());
			pst.setInt(3, r.getDept_id());
			pst.setString(4, r.getPosition());
			pst.setString(5, r.getSalary());
			pst.setString(6, r.getStatus());
			pst.setString(7, r.getFrom_date());
			pst.setString(8, r.getTo_date());
			int i = pst.executeUpdate();

			pst.close();
//	      rs.close();

		}

		public void addEmployee_Work_expInfo(Working_Exe w) throws SQLException {
			PreparedStatement pst = con.prepareStatement(
					"insert into working_experience(work_id,emp_id,Company,position,Working_exp_year) values(?,?,?,?,?)");
			pst.setString(1, w.getWork_id());
			pst.setString(2, w.getEmp_id());
			pst.setString(3, w.getCompany());
			pst.setString(4, w.getPosition());
			pst.setString(5, w.getWorking_exp());
			int i = pst.executeUpdate();
			if (i > 0)
				JOptionPane.showMessageDialog(null, "Your Data have been saved successfully", "Finished Saving",
						JOptionPane.INFORMATION_MESSAGE);
			pst.close();

		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    public ArrayList<String>  showEmpId() throws SQLException{
	    	ArrayList<String> result=new ArrayList<String>();
	       String query="select Emp_id from employee";
	    	PreparedStatement pst = con.prepareStatement(query);
	          ResultSet rs=pst.executeQuery();
	          while(rs.next()) {
	        	   result.add(rs.getString(1));
	          }
			return result;
	    }
	    
	    public ArrayList<String>  showDept() throws SQLException{
	    	ArrayList<String> result=new ArrayList<String>();
	       String query="select dept_id from department";
	    	PreparedStatement pst = con.prepareStatement(query);
	          ResultSet rs=pst.executeQuery();
	          while(rs.next()) {
	        	   result.add(rs.getString(1));
	          }
			return result;
	    }
	    
	    public void create_pj(project p) throws SQLException {
	    	
	    	PreparedStatement pst = con.prepareStatement("insert into project values(?,?,?,?,?)");
	         pst.setString(1, p.getProject_Id());
	         pst.setString(2, p.getProject_Name());
	         pst.setInt(3, p.getDept_id());
	         pst.setString(4, p.getStart_date());
	         pst.setString(5, p.getEnd_date());
	         
       int i=pst.executeUpdate();
	         
	         if(i> 0) {
	        	  JOptionPane.showMessageDialog(null, "Data Correct Successfully", "Data Successfullly",JOptionPane.ERROR_MESSAGE);
	         }

	    }
	    
	    public void updatePj(pr_member pr,String pj_id) throws SQLException{
	    	PreparedStatement pst = con.prepareStatement("update project set end_date=? where pr_id=?");
	    	pst.setString(1, pr.getEnd_date());
	    	pst.setString(2, pj_id);
	    	
	    	PreparedStatement stmt = con.prepareStatement("update project_member set position=?,pr_member_id=? where pr_id=? && emp_id=?");
	    	stmt.setString(1, pr.getPosition());
	    	stmt.setString(2, pr.getPr_member_id());
	    	stmt.setString(3, pj_id);
	    	stmt.setString(4, pr.getEmp_Id());
	    	
	        int i=pst.executeUpdate();
	        int ii=stmt.executeUpdate();
	         
	         if(ii> 0 && i>0) {
	        	  JOptionPane.showMessageDialog(null, "Data Correct Successfully", "Data Successfullly",JOptionPane.ERROR_MESSAGE);
	         }else {
	        	 JOptionPane.showMessageDialog(null, "Wrong data  Error", "Save Error",JOptionPane.ERROR_MESSAGE);
	         }
	    	
	    }
	    
	    
	    public void updateEmp(role_history rr,String emp) throws SQLException{
	    	PreparedStatement pst = con.prepareStatement("update employee set Work_Ph_no=?,Email=?,matrital_status=? where emp_id=?");
	    	pst.setString(1,rr.getW_phno());
	    pst.setString(2,rr.getEmail());
	    pst.setString(3,rr.getMatrital_status());
	    pst.setString(4, emp);
	    
		PreparedStatement stmt = con.prepareStatement("update address set address=?,township=?,city=?,region=? where emp_id=?");
		stmt.setString(1, rr.getAddr());
		stmt.setString(2, rr.getTownship());
		stmt.setString(3, rr.getCity());
		stmt.setString(4, rr.getRegion());
		stmt.setString(5, emp);
		
		PreparedStatement pptt = con.prepareStatement("update role_history set salary=?,position=?,status=? where emp_id=?");
		pptt.setString(1, rr.getSalary());
		pptt.setString(2, rr.getPosition());
		pptt.setString(3, rr.getStatus());
		pptt.setString(4, emp);
		
		
		
		
		
		
	    int i=pst.executeUpdate();
        int ii=stmt.executeUpdate();
        int iii=pptt.executeUpdate();
         
         if(ii> 0 && i>0 && iii>0) {
        	  JOptionPane.showMessageDialog(null, "Data Correct Successfully", "Data Successfullly",JOptionPane.ERROR_MESSAGE);
         }else {
        	 JOptionPane.showMessageDialog(null, "Wrong data  Error", "Save Error",JOptionPane.ERROR_MESSAGE);
         }
	    
	    }
	    
		public ArrayList<String> showDeptId() throws SQLException {
			ArrayList<String> result = new ArrayList<String>();
			String query = "select dept_id from department;     ";
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				result.add(rs.getString(1));
			}
			return result;
		}
	    

	    
	    
	
}

