package Main;

public class Working_Exe extends Employee {
   String work_id;
   String emp_id;
   String Company;
   String position;
   String  working_exp;
  public Working_Exe() {
    
  }
public Working_Exe(String work_id, String emp_id, String company, String position, String working_exp) {
	this.work_id = work_id;
	this.emp_id = emp_id;
	Company = company;
	this.position = position;
	this.working_exp = working_exp;
}
public String getWork_id() {
	return work_id;
}
public void setWork_id(String work_id) {
	this.work_id = work_id;
}
public String getEmp_id() {
	return emp_id;
}
public void setEmp_id(String emp_id) {
	this.emp_id = emp_id;
}
public String getCompany() {
	return Company;
}
public void setCompany(String company) {
	Company = company;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public String getWorking_exp() {
	return working_exp;
}
public void setWorking_exp(String working_exp) {
	this.working_exp = working_exp;
}




  }