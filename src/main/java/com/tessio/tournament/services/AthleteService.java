package com.tessio.tournament.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tessio.tournament.dto.AthleteDTO;
import com.tessio.tournament.entities.Athlete;
import com.tessio.tournament.repositories.AthleteRepository;

@Service
public class AthleteService {
	
	@Autowired
	private AthleteRepository athleteRepository;
	
	public List<AthleteDTO> findAll(){
		List<Athlete> result = athleteRepository.findAll();
		return result.stream().map(AthleteDTO::new).toList();
	}
	
}
