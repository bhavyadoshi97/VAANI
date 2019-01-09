package com.VAANI.model;

import javax.persistence.*;

@Entity

@Table(name="register1")

public class RegVO
	{
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="id")
		private int id;
		
		@Column(name="name")
		private String name;
		
		@Column(name="email")
		private String email;
		
		
		@Column(name="pwd")
		private String pwd;


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPwd() {
			return pwd;
		}


		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		
	}
