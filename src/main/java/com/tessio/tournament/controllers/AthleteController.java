package com.tessio.tournament.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tessio.tournament.dto.AthleteDTO;
import com.tessio.tournament.services.AthleteService;

@RestController
@RequestMapping(value = "/athletes")
public class AthleteController {
	
	@Autowired
	private AthleteService athleteService;
	
	@GetMapping
	public List<AthleteDTO> findAll(){
		List<AthleteDTO> result = athleteService.findAll();
		return result;
	}

}
