package Main;

import java.sql.Date;

public class project {
          private String Project_Id;
          private String Project_Name;
          private int dept_id;
          private String start_date;
          private String End_date;
          
          public  project() {
        	   
          }

		public project(String project_Id, String project_Name, int dept_id, String start_date, String end_date) {
			super();
			Project_Id = project_Id;
			Project_Name = project_Name;
			this.dept_id = dept_id;
			this.start_date = start_date;
			End_date = end_date;
		}

		public String getProject_Id() {
			return Project_Id;
		}

		public void setProject_Id(String project_Id) {
			Project_Id = project_Id;
		}

		public String getProject_Name() {
			return Project_Name;
		}

		public void setProject_Name(String project_Name) {
			Project_Name = project_Name;
		}

		public int getDept_id() {
			return dept_id;
		}

		public void setDept_id(int dept_id) {
			this.dept_id = dept_id;
		}

		public String getStart_date() {
			return start_date;
		}

		public void setStart_date(String start_date) {
			this.start_date = start_date;
		}

		public String getEnd_date() {
			return End_date;
		}

		public void setEnd_date(String end_date) {
			End_date = end_date;
		}
          
          
          
}
