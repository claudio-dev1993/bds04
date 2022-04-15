package com.devsuperior.bds04.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.bds04.services.EventService;

@RestController
@RequestMapping(path = "/events")
public class EventController {
	
	@Autowired
	public EventService eventService;
}
