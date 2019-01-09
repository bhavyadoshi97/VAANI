package com.VAANI.model;

import javax.persistence.*;

@Entity

@Table(name="stateTable")

public class StateVO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stateId")
	private int stateId;
	
	@Column(name="stateName")
	private String stateName;
	
	@Column(name="stateDescription")
	private String stateDescription;
	
	@Column(name="deleteStatus")
	private String deleteStatus;

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateDescription() {
		return stateDescription;
	}

	public void setStateDescription(String stateDescription) {
		this.stateDescription = stateDescription;
	}
	
	public String getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(String deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
}

	