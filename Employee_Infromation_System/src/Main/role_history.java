package Main;

public class role_history extends Employee {
    String role_id;
    String emp_id;
    int dept_id;
    String position;
    String salary;
    String status;
    String from_date;
    String to_date;
public role_history() {
  // TODO Auto-generated constructor stub
}
public role_history(String role_id, String emp_id, int dept_id, String position, String salary, String status,
		String from_date, String to_date) {
	this.role_id = role_id;
	this.emp_id = emp_id;
	this.dept_id = dept_id;
	this.position = position;
	this.salary = salary;
	this.status = status;
	this.from_date = from_date;
	this.to_date = to_date;
}
public String getRole_id() {
	return role_id;
}
public void setRole_id(String role_id) {
	this.role_id = role_id;
}
public String getEmp_id() {
	return emp_id;
}
public void setEmp_id(String emp_id) {
	this.emp_id = emp_id;
}
public int getDept_id() {
	return dept_id;
}
public void setDept_id(int dept_id) {
	this.dept_id = dept_id;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getFrom_date() {
	return from_date;
}
public void setFrom_date(String from_date) {
	this.from_date = from_date;
}
public String getTo_date() {
	return to_date;
}
public void setTo_date(String to_date) {
	this.to_date = to_date;
}

 
}