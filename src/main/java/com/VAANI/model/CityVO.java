package com.VAANI.model;

import javax.persistence.*;

import com.VAANI.model.StateVO;
@Entity

@Table(name="cityTable")
public class CityVO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int cityId;
	
	@Column(name="cityName")
	private String cityName;
	
	@Column(name="cityDescription")
	private String cityDescription;
	
	@ManyToOne 
	StateVO s1;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityDescription() {
		return cityDescription;
	}

	public void setCityDescription(String cityDescription) {
		this.cityDescription = cityDescription;
	}

	public StateVO getS1() {
		return s1;
	}

	public void setS1(StateVO s1) {
		this.s1 = s1;
	}
}
