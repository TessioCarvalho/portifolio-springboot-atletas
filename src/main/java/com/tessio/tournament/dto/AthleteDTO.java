package com.tessio.tournament.dto;

import com.tessio.tournament.entities.Athlete;

public class AthleteDTO {
	
	private String name;
	private String team;
	
	public AthleteDTO() {}
	
	public AthleteDTO(Athlete entity) {
		name = entity.getName();
		team = entity.getTeam();
	}

	public String getName() {
		return name;
	}

	public String getTeam() {
		return team;
	}

}
