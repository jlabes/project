package com.gama.academy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gama.academy.dto.CandidatoDto;
import com.gama.academy.service.CandidatoService;

@RestController
public class CandidatoController {

	@Autowired
	private CandidatoService service;
	
	@PostMapping(path = "/cadastro/candidato", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> post(@Valid @RequestBody CandidatoDto candidatoDto, BindingResult bindginResult) {
		try {
			
			if (bindginResult.hasErrors()) {
				return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
			}
			
			return new ResponseEntity<Void>(service.create(candidatoDto) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST);
		
		} catch (Exception ex) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
