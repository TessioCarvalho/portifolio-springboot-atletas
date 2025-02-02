package com.tessio.tournament.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tessio.tournament.dto.AthleteAgeDTO;
import com.tessio.tournament.dto.ShowAthleteDTO;
import com.tessio.tournament.dto.HeavyWeightDTO;
import com.tessio.tournament.entities.Athlete;
import com.tessio.tournament.repositories.AthleteRepository;

@Service
public class AthleteService {
	
	@Autowired
	private AthleteRepository athleteRepository;
	
	@Transactional(readOnly = true)
	public List<ShowAthleteDTO> findAll(){
		List<Athlete> result = athleteRepository.findAll();
		return result.stream().map(x -> new ShowAthleteDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<HeavyWeightDTO> findHeavyWeight(){
		List<Athlete> result = athleteRepository.findByWeightBetween(83.90, 94.90);
		return result.stream().map(x -> new HeavyWeightDTO(x)).toList();
	}	
	
	@Transactional(readOnly = true)
	public List<AthleteAgeDTO> findByAgeBetween(Integer ageMin, Integer ageMax) {
        List<Athlete> result = athleteRepository.findByAgeBetween(ageMin, ageMax);
        return result.stream().map(x -> new AthleteAgeDTO(x)).toList();
    }	
	
	@Transactional
	public Athlete addAthlete(Athlete athlete) {
		return athleteRepository.save(athlete);
	}
	
	@Transactional
	public void deleteAthlete(Integer id) {
	    athleteRepository.deleteById(id);
	}
	
}
