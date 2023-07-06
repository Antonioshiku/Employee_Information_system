package Main;

public class pr_member extends project {
                private String pr_member_id;
                private String position;
                private String emp_Id;
                
                public pr_member() {
                	 
                }

				public pr_member(String pr_member_id, String position, String emp_Id) {
					this.pr_member_id = pr_member_id;
					this.position = position;
					this.emp_Id = emp_Id;
				}

				public String getPr_member_id() {
					return pr_member_id;
				}

				public void setPr_member_id(String pr_member_id) {
					this.pr_member_id = pr_member_id;
				}

				public String getPosition() {
					return position;
				}

				public void setPosition(String position) {
					this.position = position;
				}

				public String getEmp_Id() {
					return emp_Id;
				}

				public void setEmp_Id(String emp_Id) {
					this.emp_Id = emp_Id;
				}
                
                
}
