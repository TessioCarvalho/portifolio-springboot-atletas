package com.tessio.tournament.dto;

import com.tessio.tournament.entities.Athlete;

public class AthleteDTO {
	
	private String name;
	private String team;
	private Float weight;
	
	public AthleteDTO() {}
	
	public AthleteDTO(Athlete entity) {
		name = entity.getName();
		team = entity.getTeam();
		weight = entity.getWeight();
	}

	public String getName() {
		return name;
	}

	public String getTeam() {
		return team;
	}

	public Float getWeight() {
		return weight;
	}
		
}
