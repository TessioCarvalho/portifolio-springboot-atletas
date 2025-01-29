package com.tessio.tournament.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tessio.tournament.entities.Athlete;

public interface AthleteRepository extends JpaRepository<Athlete, Integer>{
	
	List<Athlete> findByWeightBetween(Double weightMin, Double weightMax);
	
	List<Athlete> findByAgeBetween(Integer ageMin, Integer ageMax);
	
	List<Athlete> findByTeam(String team);

}
