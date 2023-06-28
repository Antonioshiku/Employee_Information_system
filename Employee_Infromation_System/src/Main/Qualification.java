package Main;

public class Qualification extends Employee {
    String QF_id;
    String emp_id;
    int dept_id;
    String Degree_Certificate;
    String Type;
    String Field_name;
    String  org_name;
    String from_date;
    String end_date;
	public Qualification(String qF_id, String emp_id, int dept_id, String degree_Certificate, String type,
			String field_name, String org_name, String from_date, String end_date) {

		QF_id = qF_id;
		this.emp_id = emp_id;
		this.dept_id = dept_id;
		Degree_Certificate = degree_Certificate;
		Type = type;
		Field_name = field_name;
		this.org_name = org_name;
		this.from_date = from_date;
		this.end_date = end_date;
	}
	public String getQF_id() {
		return QF_id;
	}
	public void setQF_id(String qF_id) {
		QF_id = qF_id;
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
	public String getDegree_Certificate() {
		return Degree_Certificate;
	}
	public void setDegree_Certificate(String degree_Certificate) {
		Degree_Certificate = degree_Certificate;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getField_name() {
		return Field_name;
	}
	public void setField_name(String field_name) {
		Field_name = field_name;
	}
	public String getOrg_name() {
		return org_name;
	}
	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
    
    
    
}