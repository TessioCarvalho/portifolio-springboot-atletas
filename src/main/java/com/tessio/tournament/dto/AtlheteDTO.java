package com.tessio.tournament.dto;

import com.tessio.tournament.entities.Athlete;

public class AtlheteDTO {
	
	private String name;
	private String team;
	private Float weight;
	
	public AtlheteDTO() {}
	
	public AtlheteDTO(Athlete entity) {
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
