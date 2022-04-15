package com.devsuperior.bds04.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.bds04.dto.EventDTO;
import com.devsuperior.bds04.entities.City;
import com.devsuperior.bds04.entities.Event;
import com.devsuperior.bds04.repositories.EventRepository;

@Service
public class EventService {
	
	@Autowired
	public EventRepository eventRepository;
	
	@Transactional(readOnly = true)
	public List<EventDTO> findAll(){
		List<Event> events = eventRepository.findAll();
		return events.stream().map(x -> new EventDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public EventDTO insert(EventDTO dto) {
		Event event = new Event();
		event.setName(dto.getName());
		event.setDate(dto.getDate());
		event.setUrl(dto.getUrl());
		event.setCity(new City(dto.getCityId(), null));
		event = eventRepository.save(event);
		return new EventDTO(event);
	}
}
