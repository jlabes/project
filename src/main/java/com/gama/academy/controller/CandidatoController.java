package com.gama.academy.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gama.academy.dto.CandidatoDto;
import com.gama.academy.service.CandidatoService;

@RestController
public class CandidatoController {

	private CandidatoService service;
	
	@PostMapping(path = "/cadastro/candidato")
	public void post(@Valid @RequestBody CandidatoDto candidatoDto) {
		
	}
}
