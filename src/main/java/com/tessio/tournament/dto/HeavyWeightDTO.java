package com.tessio.tournament.dto;

import com.tessio.tournament.entities.Athlete;

public class HeavyWeightDTO {
	
	private String name;
	private Double weight;
	
	public HeavyWeightDTO() {}

	public HeavyWeightDTO(Athlete entity) {
		name = entity.getName();
		weight = entity.getWeight();
	}

	public String getName() {
		return name;
	}

	public Double getWeight() {
		return weight;
	}
	
}
