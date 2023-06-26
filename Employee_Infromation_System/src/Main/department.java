package Main;

public class department extends Employee {
           private String dept_name, dept_ph_no;
	public department() {
		// TODO Auto-generated constructor stub
	}



	public department(String dept_name, String dept_ph_no) {
		super();
		this.dept_name = dept_name;
		this.dept_ph_no = dept_ph_no;
	}



	public String getDept_name() {
		return dept_name;
	}



	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}



	public String getDept_ph_no() {
		return dept_ph_no;
	}



	public void setDept_ph_no(String dept_ph_no) {
		this.dept_ph_no = dept_ph_no;
	}



}
