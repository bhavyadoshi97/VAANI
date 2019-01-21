package com.VAANI.model;

import javax.persistence.*;

@Entity

@Table(name="disabledUserTable")
public class DisabledUserVO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int disabledUserId;
	
	@Column(name="disableUsername")
	private String disabledUsername;
	
	@Column(name="disabledUserUniqueId")
	private int disabledUserUniqueId;
	
	@Column(name="dateOfBirth")
	private String dateOfBirth;

	@Column(name="gender")
	private String gender;
	
	@Column(name="dateOfIssue")
	private String dateOfIssue;
	
	@Column(name="dateOfExpiry")
	private String dateOfExpiry;
	
	@Column(name="deleteStatus")
	private String deleteStatus;
	
	public int getDisabledUserId() {
		return disabledUserId;
	}

	public void setDisabledUserId(int disabledUserId) {
		this.disabledUserId = disabledUserId;
	}

	public String getDisabledUsername() {
		return disabledUsername;
	}

	public void setDisabledUsername(String disabledUsername) {
		this.disabledUsername = disabledUsername;
	}

	public int getDisabledUserUniqueId() {
		return disabledUserUniqueId;
	}

	public void setDisabledUserUniqueId(int disabledUserUniqueId) {
		this.disabledUserUniqueId = disabledUserUniqueId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(String deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

}
