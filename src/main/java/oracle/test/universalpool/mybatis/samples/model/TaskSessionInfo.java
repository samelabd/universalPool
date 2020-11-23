package oracle.test.universalpool.mybatis.samples.model;


public class TaskSessionInfo {

	private String departmentId;
	private String userId;
	
	
	public TaskSessionInfo(String dept_id , String userId){
		this.departmentId = dept_id ;
		this.userId = userId ;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	

}
