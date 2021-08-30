package com.gama.academy.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gama.academy.dto.CandidatoDto;
import com.gama.academy.entity.Candidato;
import com.gama.academy.entity.Documento;
import com.gama.academy.entity.Endereco;
import com.gama.academy.repository.CandidatoRepository;

@Service
public class CandidatoService {

	@Autowired
	private CandidatoRepository repository;

	public boolean create(CandidatoDto candidatoDto) throws Exception {

		Candidato candidato = dtoToEntity(candidatoDto);
		
		repository.save(candidato);
		
		return true;
	}

	private Candidato dtoToEntity(CandidatoDto candidatoDto) throws Exception {

		Documento documento = new Documento(candidatoDto.getCpf(),  candidatoDto.getRg(), candidatoDto.getHabilitacao(),
			Boolean.parseBoolean(candidatoDto.getIsVeiculo()));

		Endereco endereco = new Endereco(null, candidatoDto.getCep(), candidatoDto.getLogradouro(), candidatoDto.getNumero(),
				candidatoDto.getBairro(), candidatoDto.getCidade(), candidatoDto.getUf());

		Candidato candidato = new Candidato((Long)null, candidatoDto.getNome(), LocalDate.parse(candidatoDto.getDataNascimento()),
				candidatoDto.getTelefone(), candidatoDto.getCelular(), candidatoDto.getEmail(),
				candidatoDto.getCargoPretendido(), candidatoDto.getEstadoCivil(), candidatoDto.getGenero(), endereco,
				documento);

		return candidato;

	}

}
