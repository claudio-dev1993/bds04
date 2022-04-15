package com.devsuperior.bds04.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds04.services.CityService;

@RestController
@RequestMapping(path = "cities")
public class CityController {
	
	@Autowired
	public CityService cityService;
}
