package Main;

public class Employee {
	 private String emp_id,  Fname, Lname, gender,age,  Father_name , p_phno , w_phno , dob ,addr, Township , City , Religion , NRC , Email , Nationality , matrital_status , joined_date;
     private int dept_id;
	  public Employee() {
	  }

	  public Employee(String emp_id,int dept_id, String fname, String lname, String Full,String gender, String age, String father_name, String p_phno,
	      String w_phno, String dob,String addr, String township, String city, String religion, String nRC, String email,
	      String nationality, String matrital_status, String joined_date) {
	    emp_id = emp_id;
	    this.dept_id=dept_id;
	    Fname = fname;
	    Lname = lname;
	    gender = gender;
	    age = age;
	    Father_name = father_name;
	    p_phno = p_phno;
	    w_phno = w_phno;
	    dob = dob;
	    this.addr=addr;
	    Township = township;
	    City = city;
	    Religion = religion;
	    NRC = nRC;
	    Email = email;
	    Nationality = nationality;
	    matrital_status = matrital_status;
	    joined_date = joined_date;
	  }


	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getEmp_id() {
	    return emp_id;
	  }

	  public void setEmp_id(String emp_id) {
	    this.emp_id = emp_id;
	  }

	  public String getFname() {
	    return Fname;
	  }

	  public void setFname(String fname) {
	    Fname = fname;
	  }

	  public String getLname() {
	    return Lname;
	  }

	  public void setLname(String lname) {
	    Lname = lname;
	  }

	  public String getGender() {
	    return gender;
	  }

	  public void setGender(String gender) {
	    this.gender = gender;
	  }

	  public String getAge() {
	    return age;
	  }

	  public void setAge(String age) {
	    this.age = age;
	  }

	  public String getFather_name() {
	    return Father_name;
	  }

	  public void setFather_name(String father_name) {
	    Father_name = father_name;
	  }

	  public String getP_phno() {
	    return p_phno;
	  }

	  public void setP_phno(String p_phno) {
	    this.p_phno = p_phno;
	  }

	  public String getW_phno() {
	    return w_phno;
	  }

	  public void setW_phno(String w_phno) {
	    this.w_phno = w_phno;
	  }

	  public String getDob() {
	    return dob;
	  }

	  public void setDob(String dob) {
	    this.dob = dob;
	  }

	  public String getTownship() {
	    return Township;
	  }

	  public void setTownship(String township) {
	    Township = township;
	  }

	  public String getCity() {
	    return City;
	  }

	  public void setCity(String city) {
	    City = city;
	  }

	  public String getReligion() {
	    return Religion;
	  }

	  public void setReligion(String religion) {
	    Religion = religion;
	  }

	  public String getNRC() {
	    return NRC;
	  }

	  public void setNRC(String nRC) {
	    NRC = nRC;
	  }

	  public String getEmail() {
	    return Email;
	  }

	  public void setEmail(String email) {
	    Email = email;
	  }

	  public String getNationality() {
	    return Nationality;
	  }

	  public void setNationality(String nationality) {
	    Nationality = nationality;
	  }

	  public String getMatrital_status() {
	    return matrital_status;
	  }

	  public void setMatrital_status(String matrital_status) {
	    this.matrital_status = matrital_status;
	  }

	  public String getJoined_date() {
	    return joined_date;
	  }

	  public void setJoined_date(String joined_date) {
	    this.joined_date = joined_date;
	  }

	public void addAccountInfo(Employee e) {
		// TODO Auto-generated method stub
		
	}


	  
	  

	}


