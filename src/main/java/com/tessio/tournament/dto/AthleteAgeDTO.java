package com.tessio.tournament.dto;

import com.tessio.tournament.entities.Athlete;

public class AthleteAgeDTO {
	
	private String name;
	private Integer age;
	
	public AthleteAgeDTO() {}

	public AthleteAgeDTO(Athlete entity) {
		name = entity.getName();
		age = entity.getAge();
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
	
	

}
