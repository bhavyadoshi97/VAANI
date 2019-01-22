package com.VAANI.model;

import javax.persistence.*;
import com.VAANI.model.LoginVO;
@Entity

@Table(name="registration")

public class RegVO
	{
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="registrationId")
		private int registrationId;
		
		@Column(name="orgName")
		private String organisationName;
		
		@ManyToOne
		LoginVO loginVO;


		public int getRegistrationId() {
			return registrationId;
		}


		public String getOrganisationName() {
			return organisationName;
		}


		public void setOrganisationName(String organisationName) {
			this.organisationName = organisationName;
		}


		public LoginVO getLoginVO() {
			return loginVO;
		}


		public void setLoginVO(LoginVO loginVO) {
			this.loginVO = loginVO;
		}


		public void setRegistrationId(int registrationId) {
			this.registrationId = registrationId;
		}


		

}