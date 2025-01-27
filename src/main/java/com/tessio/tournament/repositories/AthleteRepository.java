package com.tessio.tournament.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tessio.tournament.entities.Athlete;

public interface AthleteRepository extends JpaRepository<Athlete, Integer>{

}
