package com.gama.academy.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CandidatoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String nome;
	
	@NotNull
	private Date dataNascimento;
	
	/**
	 * Default +55
	 */
	@Max(value = 13)
	@Min(value = 11)
	private int telefone;
	
	/**
	 * Default +55
	 */
	@NotNull
	@Max(value = 14)
	@Min(value = 12)
	private int celular;
	
	@Email
	@NotNull
	private String email;
	
	@NotNull
	private String cargoPretendido;
	
	private String estadoCivil;
	
	private String genero;
	
	public CandidatoDto() {
	}

	public CandidatoDto(@NotNull String nome, @NotNull Date dataNascimento,
			@Max(13) @Min(11) int telefone, @NotNull @Max(14) @Min(12) int celular, @Email @NotNull String email,
			@NotNull String cargoPretendido, String estadoCivil, String genero) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.cargoPretendido = cargoPretendido;
		this.estadoCivil = estadoCivil;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCargoPretendido() {
		return cargoPretendido;
	}

	public void setCargoPretendido(String cargoPretendido) {
		this.cargoPretendido = cargoPretendido;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
