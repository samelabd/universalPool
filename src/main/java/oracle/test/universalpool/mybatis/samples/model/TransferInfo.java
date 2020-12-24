package oracle.test.universalpool.mybatis.samples.model;



import java.io.Serializable;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

//import es.cls.core.session.CurrentESSession;

public class TransferInfo implements Serializable {

	private static final long serialVersionUID = 1424728601509946844L;

	//public static final int TRANSFER_ACTION_FOR_FEEDBACK = 10;
	//public static final int TRANSFER_ACTION_FOR_INFO = 1;

	private static final String INTERNAL = "Internal";
	private static final String OUTGOING = "Outgoing";
	private static final String INCOMING = "Incoming";
	
	private String orginalTransferId;

	private String transferId;
	private String documentId;
	private String fromContact;
	private String toContact;
	private String fromOrganization;
	private String fromCitizen;
	private String toCItizen;
	private String toOrganization;
	//SETTLED_BY
	private String settledBy;
	private String toDepartment;
	private String fromDepartment;
	private String toDepartmentOfficeId;
	List<String> attachIDs ;
	private String description;
	private String closed;
	private String actionId;
	private String parentTransfer;
	private Date transferDate;
	private Date CLOSE_DATE;
	private Date SENT_DATE;
	private String CLOSED_BY;

	
	private String autoClosed;
	private String transferDateHijri;
	private String sendTarget;
	private String executorId;

	private String closeNotes;
	private String delegateFor;
	private String documentCategory;
	private String executorDelegateFor;
	private String createdByDepartment;
	private String documentNumber;

	private String outgoingProjectPath;
	private String publicNote;
	private String rejectReason;
	private boolean isRejected;
	private boolean isReceived;

	private String documentDocPath;



	private boolean IS_MIGRATED;

	private boolean isReturned;
	//MHM
	private boolean isTransfered;
	private boolean transfer;
	private int transferNo = -1;
	private boolean isOnHold;
	private boolean isCanceled;
	private boolean isSystematic;
	private String screenId;
//	private int transfer_number = 0 ;
    private int workDay = -1;
	private Date transferDeuDate;
	private String transferDueDateH;
	private int transferImportance = -1 ;
	//EAS
	private boolean IsFollowUp;
	private boolean SettleSameRefNO;

	private boolean IS_CIRCULAR;
	private boolean IS_ELETTER;
	//EAD
	private int TransSecurityLevel = -1 ;

	private String receivedOrTransferred;
	private String transferFollowUpStatus;
	private String toDepartmentFollowUp;
	
	private String signature;
	private String ATTACHMENT_NO;
	private String secretaryExplanationDate;
	private Date secretaryExplanationDateG;
	private String sideType;
	private String signStatus;
	
	
	private String locked;
	
	private String createdBy;
	
	
	
	public String getLocked() {
		return locked;
	}

	public void setLocked(String locked) {
		this.locked = locked;
	}

	public String getOrginalTransferId() {
		return orginalTransferId;
	}

	public void setOrginalTransferId(String orginalTransferId) {
		this.orginalTransferId = orginalTransferId;
	}

	public boolean isIS_MIGRATED() {
		return IS_MIGRATED;
	}

	public void setIS_MIGRATED(boolean iS_MIGRATED) {
		IS_MIGRATED = iS_MIGRATED;
	}
	
	
	public String getSecretaryExplanationDate() {
		return secretaryExplanationDate;
	}

	public void setSecretaryExplanationDate(String secretaryExplanationDateH) {
		this.secretaryExplanationDate = secretaryExplanationDateH;
	}

	public Date getSecretaryExplanationDateG() {
		return secretaryExplanationDateG;
	}

	public void setSecretaryExplanationDateG(Date secretaryExplanationDateG) {
		this.secretaryExplanationDateG = secretaryExplanationDateG;
	}

	private String createdByOriginalDep;
	//END

	private TaskSessionInfo taskSessionInfo;

	
	public TaskSessionInfo getTaskSessionInfo() {
		return taskSessionInfo;
	}

	public boolean isTransfered() {
		return isTransfered;
	}

	public List<String> getAttachIDs() {
		return attachIDs;
	}

	public void setAttachIDs(List<String> attachIDs) {
		this.attachIDs = attachIDs;
	}

	public void setTransfered(boolean isTransfered) {
		this.isTransfered = isTransfered;
	}
	
	public String getTransferId() {
		return transferId;
	}

	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}
	
	
	
	public int getTransferNo() {
		return transferNo;
	}

	public void setTransferNo(int transferNo) {
		this.transferNo = transferNo;
	}

	//EAS
	public void setReceivedOrTransferred(String ReceivedOrTransferred) {
		this.receivedOrTransferred = ReceivedOrTransferred;
	}
	
	public String getReceivedOrTransferred() {
		return this.receivedOrTransferred;
	}
	public void setTransferFollowUpStatus(String TransferFollowUpStatus) {
		this.transferFollowUpStatus = TransferFollowUpStatus;
	}
	
	public String getTransferFollowUpStatus() {
		return this.transferFollowUpStatus;
	}
	public void setToDepartmentFollowUp(String ToDepartmentFollowUp) {
		this.toDepartmentFollowUp = ToDepartmentFollowUp;
	}
	
	public String getToDepartmentFollowUp() {
		return this.toDepartmentFollowUp;
	}
	
	public String getSignature() {
		return this.signature;
	}
	
	public void setSignature(String signature){
		this.signature = signature;
	}
	

	
	public String getCreatedByOriginalDep() {
		return this.createdByOriginalDep;
	}
	
	public void setCreatedByOriginalDep(String createdByOriginalDep){
		this.createdByOriginalDep = createdByOriginalDep;
	}
	
	
	// ~

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	
	
	public int getWorkDay() {
		return workDay;
	}

	public void setWorkDay(int workDay) {
		this.workDay = workDay;
	}

	
	public boolean isSettleSameRefNO() {
		return SettleSameRefNO;
	}

	public void setSettleSameRefNO(boolean settleSameRefNO) {
		SettleSameRefNO = settleSameRefNO;
	}

	public Date getTransferDeuDate() {
		return transferDeuDate;
	}

	public void setTransferDeuDate(Date transferDeuDate) {
		this.transferDeuDate = transferDeuDate;
	}

	public String getTransferDueDateH() {
		return transferDueDateH;
	}

	public void setTransferDueDateH(String transferDueDateH) {
		this.transferDueDateH = transferDueDateH;
	}

	public String getCreatedByDepartment() {
		return createdByDepartment;
	}

	public void setCreatedByDepartment(String createdByDepartment) {
		this.createdByDepartment = createdByDepartment;
	}

	public String getTransferDateHijri() {
		return transferDateHijri;
	}

	public void setTransferDateHijri(String transferDateHijri) {
		this.transferDateHijri = transferDateHijri;
	}

	public Date getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}

	public String getFromContact() {
		return fromContact;
	}

	public void setFromContact(String fromContact) {
		this.fromContact = fromContact;
	}

	public String getFromCitizen() {
		return fromCitizen;
	}

	public void setFromCitizen(String fromCitizen) {
		this.fromCitizen = fromCitizen;
	}

	public String getToCItizen() {
		return toCItizen;
	}

	public void setToCitizen(String toCItizen) {
		this.toCItizen = toCItizen;
	}

	public String getToContact() {
		return toContact;
	}

	public void setToContact(String toContact) {
		this.toContact = toContact;
	}

	public String getFromOrganization() {
		return fromOrganization;
	}

	public void setFromOrganization(String fromOrganization) {
		this.fromOrganization = fromOrganization;
	}

	public String getToOrganization() {
		return toOrganization;
	}

	public void setToOrganization(String toOrganization) {
		this.toOrganization = toOrganization;
	}

	public String getToDepartment() {
		return toDepartment;
	}

	public void setToDepartment(String toDepartment) {
		this.toDepartment = toDepartment;
	}

	public String getFromDepartment() {
		return fromDepartment;
	}

	public void setFromDepartment(String fromDepartment) {
		this.fromDepartment = fromDepartment;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getClosed() {
		return closed;
	}

	public void setClosed(String closed) {
		this.closed = closed;
	}

	public String getActionId() {
		return actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public String getParentTransfer() {
		return parentTransfer;
	}

	public void setParentTransfer(String parentTransfer) {
		this.parentTransfer = parentTransfer;
	}

	public String getAutoClosed() {
		return autoClosed;
	}

	public void setAutoClosed(String autoClosed) {
		this.autoClosed = autoClosed;
	}

	public String getSendTarget() {
		return sendTarget;
	}

	public void setSendTarget(String sendTarget) {
		this.sendTarget = sendTarget;
	}

	public String getExecutorId() {
		return executorId;
	}

	public void setExecutorId(String executorId) {
		this.executorId = executorId;
	}

	public String getCloseNotes() {
		return closeNotes;
	}

	public void setCloseNotes(String closeNotes) {
		this.closeNotes = closeNotes;
	}

	public String getDelegateFor() {
		return delegateFor;
	}

	public void setDelegateFor(String delegateFor) {
		this.delegateFor = delegateFor;
	}

	public String getDocumentCategory() {
		return documentCategory;
	}

	public void setDocumentCategory(String documentCategory) {
		this.documentCategory = documentCategory;
	}

	public String getExecutorDelegateFor() {
		return executorDelegateFor;
	}

	public void setExecutorDelegateFor(String executorDelegateFor) {
		this.executorDelegateFor = executorDelegateFor;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getToDepartmentOfficeId() {
		return toDepartmentOfficeId;
	}

	public void setToDepartmentOfficeId(String toDepartmentOfficeId) {
		this.toDepartmentOfficeId = toDepartmentOfficeId;
	}

	public String getOutgoingProjectPath() {
		return outgoingProjectPath;
	}

	public void setOutgoingProjectPath(String outgoingProjectPath) {
		this.outgoingProjectPath = outgoingProjectPath;
	}

	public String getPublicNote() {
		return publicNote;
	}

	public void setPublicNote(String publicNote) {
		this.publicNote = publicNote;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public boolean isRejected() {
		return isRejected;
	}

	public boolean isReceived() {
		return isReceived;
	}

	public void setReceived(boolean isReceived) {
		this.isReceived = isReceived;
	}

	public void setRejected(boolean isRejected) {
		this.isRejected = isRejected;
	}

	public boolean isReturned() {
		return isReturned;
	}

	public void setReturned(boolean isReturned) {
		this.isReturned = isReturned;
	}

	public boolean isOnHold() {
		return isOnHold;
	}

	public void setOnHold(boolean isOnHold) {
		this.isOnHold = isOnHold;
	}

	public boolean isCanceled() {
		return isCanceled;
	}

	public void setCanceled(boolean isCanceled) {
		this.isCanceled = isCanceled;
	}

	public boolean isTransferToEmployee() {
		return !StringUtils.isEmpty(this.toContact);
	}

	public boolean isTO() {
		return this.sendTarget.equals("TO") == true ? true : false;
	}

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}
	public boolean isTransfer() {
		return transfer;
	}

	public void setTransfer(boolean transfer) {
		this.transfer = transfer;
	}
	public boolean isIsFollowUp() {
		return IsFollowUp;
	}

	public void setIsFollowUp(boolean isFollowUp) {
		IsFollowUp = isFollowUp;
	}

	public String getSettledBy() {
		return settledBy;
	}

	public void setSettledBy(String settledBy) {
		this.settledBy = settledBy;
	}

	public Date getCLOSE_DATE() {
		return CLOSE_DATE;
	}

	public void setCLOSE_DATE(Date cLOSE_DATE) {
		CLOSE_DATE = cLOSE_DATE;
	}

	public String getCLOSED_BY() {
		return CLOSED_BY;
	}

	public void setCLOSED_BY(String cLOSED_BY) {
		CLOSED_BY = cLOSED_BY;
	}

	public Date getSENT_DATE() {
		return SENT_DATE;
	}

	public void setSENT_DATE(Date sENT_DATE) {
		SENT_DATE = sENT_DATE;
	}

	public boolean isSystematic() {
		return isSystematic;
	}

	public void setSystematic(boolean isSystematic) {
		this.isSystematic = isSystematic;
	}

	public int getTransferImportance() {
		return transferImportance;
	}

	public void setTransferImportance(int transferImportance) {
		this.transferImportance = transferImportance;
	}

	public String getATTACHMENT_NO() {
		return ATTACHMENT_NO;
	}

	public void setATTACHMENT_NO(String attachmentNO) {
		this.ATTACHMENT_NO = attachmentNO;
	}

	public int getTransSecurityLevel() {
		return TransSecurityLevel;
	}

	public void setTransSecurityLevel(int transSecurityLevel) {
		TransSecurityLevel = transSecurityLevel;
	}

	public boolean isIS_CIRCULAR() {
		return IS_CIRCULAR;
	}

	public void setIS_CIRCULAR(boolean iS_CIRCULAR) {
		IS_CIRCULAR = iS_CIRCULAR;
	}

	public void setTaskSessionInfo(TaskSessionInfo sessionInfo) {

		this.taskSessionInfo  = sessionInfo ;
	}

	public String getSideType() {
		return sideType;
	}

	public void setSideType(String sideType) {
		this.sideType = sideType;
	}

	public void setDocumentDocPath(String docPath) {
		this.documentDocPath = docPath;
		
	}
	public String getDocumentDocPath() {
		return documentDocPath;
	}

	public boolean isIS_ELETTER() {
		return IS_ELETTER;
	}

	public void setIS_ELETTER(boolean iS_ELETTER) {
		IS_ELETTER = iS_ELETTER;
	}

	public String getSignStatus() {
		return signStatus;
	}

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	/*
	 * 
	 * public Map<String, Object> toMap() throws Exception { Hashtable<String,
	 * Object> transferMap = new Hashtable<String, Object>();
	 * 
	 * String contactId = "";// CurrentESSession.getAttribute("contact_id") == null
	 * ? "" : CurrentESSession.getAttribute("contact_id").toString(); String
	 * delegateId = "";// CurrentESSession.getAttribute("delegate_for") == null ? ""
	 * : CurrentESSession.getAttribute("delegate_for").toString(); String
	 * departmentId = "";// CurrentESSession.getAttribute("department_id") == null ?
	 * "" : CurrentESSession.getAttribute("department_id").toString();
	 * 
	 * if (StringUtils.isEmpty(contactId) || StringUtils.isEmpty(departmentId)) {
	 * throw new Exception("Contact Or Department is null"); }
	 * 
	 * if (!StringUtils.isEmpty(transferId)) { transferMap.put("#ukvalue#",
	 * transferId); transferMap.put("TRANSFER_ID", transferId); } else { // Only in
	 * Add Mode not Edit Mode if (StringUtils.isEmpty(this.fromOrganization) &&
	 * StringUtils.isEmpty(this.fromCitizen) ) transferMap.put("FROM_DEPARTMENT",
	 * departmentId);
	 * 
	 * transferMap.put("FROM_CONTACT", contactId);
	 * 
	 * transferMap.put("CREATED_BY", contactId);
	 * transferMap.put("CREATED_BY_DEPARTMENT", departmentId);
	 * transferMap.put("DELEGATE_FOR", delegateId); } if
	 * (!StringUtils.isEmpty(documentId)) { transferMap.put("DOCUMENT_ID",
	 * documentId); } if (!StringUtils.isEmpty(signStatus)) {
	 * transferMap.put("SIGN_STATUS", signStatus); }
	 * 
	 * if (!StringUtils.isEmpty(transferDateHijri)) {
	 * transferMap.put("TRANSFER_DATE_HIJRI", transferDateHijri); } // if
	 * (!StringUtils.isEmpty(toContact)) { transferMap.put("TO_CONTACT", toContact);
	 * }
	 * 
	 * if (!StringUtils.isEmpty(orginalTransferId)) {
	 * transferMap.put("ORIGINAL_TRANSFER_ID", orginalTransferId); }
	 * 
	 * 
	 * if (!StringUtils.isEmpty(settledBy)) { transferMap.put("SETTLED_BY",
	 * settledBy); }
	 * 
	 * if (!StringUtils.isEmpty(CLOSED_BY)) { transferMap.put("CLOSED_BY",
	 * CLOSED_BY); }
	 * 
	 * if (!StringUtils.isEmpty(fromOrganization)) {
	 * transferMap.put("FROM_ORGANIZATION", fromOrganization); }
	 * 
	 * if (!StringUtils.isEmpty(toCItizen)) { transferMap.put("TO_CITIZEN",
	 * toCItizen); } if (!StringUtils.isEmpty(fromCitizen)) {
	 * transferMap.put("FROM_CITIZEN", fromCitizen); } if
	 * (!StringUtils.isEmpty(toOrganization)) { transferMap.put("TO_ORGANIZATION",
	 * toOrganization); }
	 * 
	 * if (!StringUtils.isEmpty(toDepartment)) { transferMap.put("TO_DEPARTMENT",
	 * toDepartment); }
	 * 
	 * if (!StringUtils.isEmpty(description)) { transferMap.put("DESCRIPTION",
	 * description); } if(IS_CIRCULAR){ transferMap.put("IS_CIRCULAR", 1); }
	 * 
	 * 
	 * if (TransSecurityLevel != -1 ) { transferMap.put("TRANSFER_SEC_LEVEL",
	 * TransSecurityLevel); } if (!StringUtils.isEmpty(ATTACHMENT_NO)) {
	 * transferMap.put("ATTACHMENT_NO", ATTACHMENT_NO); } if
	 * (!StringUtils.isEmpty(closed)) { transferMap.put("CLOSED", closed); } if
	 * (!StringUtils.isEmpty(autoClosed)) { transferMap.put("AUTO_CLOSED",
	 * autoClosed); } if (!StringUtils.isEmpty(actionId)) {
	 * transferMap.put("ACTION_ID", actionId); } if
	 * (!StringUtils.isEmpty(parentTransfer)) { transferMap.put("PARENT_TRANSFER",
	 * parentTransfer); } if (!StringUtils.isEmpty(sendTarget)) {
	 * transferMap.put("SEND_TARGET", sendTarget); }
	 * 
	 * if (!StringUtils.isEmpty(closeNotes)) { transferMap.put("CLOSE_NOTES",
	 * closeNotes); } if (!StringUtils.isEmpty(transferDueDateH)) {
	 * transferMap.put("TRANSFER_DUE_DATE_HIJRI", transferDueDateH); } //MHM if
	 * (transferImportance != -1) { transferMap.put("TRANSFER_IMPORTANCE",
	 * transferImportance); }
	 * 
	 * if (workDay != -1) { transferMap.put("WORK_DAY", workDay); } if
	 * (!StringUtils.isEmpty(transferDueDateH) && transferDueDateH != null) {
	 * transferMap.put("TRANSFER_DUE_DATE", transferDeuDate);
	 * transferMap.put("TRANSFER_DUE_DATE_HIJRI", transferDueDateH); } if (locked ==
	 * "1") { transferMap.put("LOCKED", "1"); }
	 * 
	 * if (locked == "0") { transferMap.put("LOCKED", "0"); } if (locked == null) {
	 * transferMap.put("LOCKED", "0"); }
	 * 
	 * 
	 * //~ if (!StringUtils.isEmpty(documentCategory)) {
	 * transferMap.put("DOCUMENT_CATEGORY", documentCategory);
	 * 
	 * if (documentCategory.equals(INTERNAL)) { transferMap.put("SIDE_TYPE",
	 * "INTERNAL_ORGANIZATION"); } if (documentCategory.equals(OUTGOING)) { if
	 * (!StringUtils.isEmpty(toOrganization)) { if(StringUtils.isEmpty(sideType)) {
	 * sideType="EXTERNAL_ORGANIZATION"; }
	 * 
	 * if(sideType.equals("EXTERNAL_ORGANIZATION")) { transferMap.put("SIDE_TYPE",
	 * "EXTERNAL_ORGANIZATION"); }else {
	 * transferMap.put("SIDE_TYPE","RELATED_ORGANIZATION"); }
	 * 
	 * } else if (!StringUtils.isEmpty(toCItizen)) transferMap.put("SIDE_TYPE",
	 * "CITIZEN"); } if (documentCategory.equals(INCOMING)) { if
	 * (!StringUtils.isEmpty(fromOrganization))
	 * if(sideType.equals("EXTERNAL_ORGANIZATION")) { transferMap.put("SIDE_TYPE",
	 * "EXTERNAL_ORGANIZATION"); }else {
	 * transferMap.put("SIDE_TYPE","RELATED_ORGANIZATION"); }
	 * //transferMap.put("SIDE_TYPE", "EXTERNAL_ORGANIZATION"); else if
	 * (!StringUtils.isEmpty(fromCitizen)) transferMap.put("SIDE_TYPE", "CITIZEN");
	 * }
	 * 
	 * }
	 * 
	 * if (!StringUtils.isEmpty(toDepartmentOfficeId)) {
	 * transferMap.put("TO_DEPARTMENT_OFFICE_ID", toDepartmentOfficeId); }
	 * 
	 * if (!StringUtils.isEmpty(outgoingProjectPath)) {
	 * transferMap.put("OUTGOING_PROJECT_PATH", outgoingProjectPath); } if
	 * (!StringUtils.isEmpty(executorId)) { transferMap.put("EXECUTOR_ID",
	 * executorId); } if (!StringUtils.isEmpty(executorDelegateFor)) {
	 * transferMap.put("EXECUTOR_DELEGATE_FOR", executorDelegateFor); } if
	 * (isReceived) { transferMap.put("IS_RECEIVED", "1"); } if (!isReceived) {
	 * transferMap.put("IS_RECEIVED", "0"); } if (isRejected) {
	 * transferMap.put("IS_REJECTED", "1"); } if (isOnHold) {
	 * transferMap.put("IS_ON_HOLD", "1"); } if (transfer) {
	 * transferMap.put("TRANSFER", "1"); } // else{ // transferMap.put("TRANSFER",
	 * "0"); // // }
	 * 
	 * if (transferNo != -1) { transferMap.put("TRANSFER_NUMBER", transferNo); }
	 * 
	 * if (isTransfered) { transferMap.put("IS_TRANSFERED", "1"); } if (isReturned)
	 * { transferMap.put("IS_RETURNED", "1"); } if(isCanceled){
	 * transferMap.put("IS_CANCELED", "1"); } if(IsFollowUp){
	 * transferMap.put("DOC_FOLLOW_UP", "1"); }
	 * 
	 * if(isSystematic){ transferMap.put("IS_SYSTEMATIC", "1"); } //MHM
	 * if(!StringUtils.isEmpty(receivedOrTransferred)){
	 * transferMap.put("RECEIVED_OR_TRANSFERRED", receivedOrTransferred); }
	 * if(!StringUtils.isEmpty(transferFollowUpStatus)){
	 * transferMap.put("TRANSFER_FOLLOW_UP_STATUS", transferFollowUpStatus); }
	 * if(!StringUtils.isEmpty(toDepartmentFollowUp)){
	 * transferMap.put("TO_DEPARTMENT_FOLLOW_UP", toDepartmentFollowUp); }
	 * if(!StringUtils.isEmpty(signature)){ transferMap.put("SIGNATURE", signature);
	 * } if(!StringUtils.isEmpty(secretaryExplanationDate)){
	 * transferMap.put("SECRETARY_EXPLANATION_DATE", secretaryExplanationDate); }
	 * if(!StringUtils.isEmpty(createdByOriginalDep)){
	 * transferMap.put("CREATED_BY_ORIGINAL_DEP", createdByOriginalDep); }
	 * if(CLOSE_DATE != null){ transferMap.put("CLOSE_DATE",CLOSE_DATE); }
	 * if(SENT_DATE != null){ transferMap.put("SENT_DATE",SENT_DATE); }
	 * 
	 * //ENd return transferMap; }
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
