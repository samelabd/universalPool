package com.dbcall.procedure;

public class MyModel {
	String myModelId; 
	String requestNo ;
    String issuedByUser ;
    String dirCode ;
    String confirmedByUser;
    String requestStatus ;
    String requestStaDesc;
    
    public String getMyModelId() {
    	return myModelId;
    }
    public void setMyModelId(String myModelId) {
    	this.myModelId = myModelId;
    }
    
	public String getRequestNo() {
		return requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getIssuedByUser() {
		return issuedByUser;
	}
	public void setIssuedByUser(String issuedByUser) {
		this.issuedByUser = issuedByUser;
	}
	public String getDirCode() {
		return dirCode;
	}
	public void setDirCode(String dirCode) {
		this.dirCode = dirCode;
	}
	public String getConfirmedByUser() {
		return confirmedByUser;
	}
	public void setConfirmedByUser(String confirmedByUser) {
		this.confirmedByUser = confirmedByUser;
	}
	public String getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
	public String getRequestStaDesc() {
		return requestStaDesc;
	}
	public void setRequestStaDesc(String requestStaDesc) {
		this.requestStaDesc = requestStaDesc;
	}
	
	
	
}
