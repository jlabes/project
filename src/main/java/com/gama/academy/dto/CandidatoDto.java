package com.gama.academy.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CandidatoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@NotEmpty
	@JsonProperty("nome")
	private String nome;
	
	@NotNull
	@NotEmpty
	@JsonProperty("dataNascimento")
	private String dataNascimento;
	
	@JsonProperty("telefone")
	private String telefone;
	
	@NotNull
	@NotEmpty
	@JsonProperty("celular")
	private String celular;
	
	@NotNull
	@NotEmpty
	@JsonProperty("email")
	private String email;
	
	@NotNull
	@NotEmpty
	@JsonProperty("cargoPretendido")
	private String cargoPretendido;
	
	@JsonProperty("estadoCivil")
	private String estadoCivil;
	
	@JsonProperty("genero")
	private String genero;
	
	@NotNull
	@NotEmpty
	@JsonProperty("cep")
	private String cep;
	
	@NotNull
	@NotEmpty
	@JsonProperty("logradouro")
	private String logradouro;
	
	@NotNull
	@NotEmpty
	@JsonProperty("numero")
	private String numero;
	
	@NotNull
	@NotEmpty
	@JsonProperty("bairro")
	private String bairro;
	
	@NotNull
	@NotEmpty
	@JsonProperty("cidade")
	private String cidade;
	
	@NotNull
	@NotEmpty
	@JsonProperty("uf")
	private String uf;
	
	@NotNull
	@NotEmpty
	@JsonProperty("cpf")
	private String cpf;
	
	@NotNull
	@NotEmpty
	@JsonProperty("rg")
	private String rg;
	
	@JsonProperty("habilitacao")
	private String habilitacao;
	
	@JsonProperty("isVeiculo")
	private String isVeiculo;
	
	public CandidatoDto() {
	}
	
	public CandidatoDto(@NotNull @NotEmpty String nome, @NotNull @NotEmpty String dataNascimento, String telefone, @NotNull @NotEmpty String celular,
			@NotNull @NotEmpty String email, @NotNull @NotEmpty String cargoPretendido, String estadoCivil, String genero,
			@NotNull @NotEmpty String cep, @NotNull @NotEmpty String logradouro, @NotNull @NotEmpty String numero, @NotNull @NotEmpty String bairro,
			@NotNull @NotEmpty String cidade, @NotNull @NotEmpty String uf, @NotNull @NotEmpty String cpf, @NotNull @NotEmpty String rg, String habilitacao,
			String isVeiculo) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.cargoPretendido = cargoPretendido;
		this.estadoCivil = estadoCivil;
		this.genero = genero;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cpf = cpf;
		this.rg = rg;
		this.habilitacao = habilitacao;
		this.isVeiculo = isVeiculo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getCelular() {
		return celular;
	}



	public void setCelular(String celular) {
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



	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	public String getLogradouro() {
		return logradouro;
	}



	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getUf() {
		return uf;
	}



	public void setUf(String uf) {
		this.uf = uf;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public String getHabilitacao() {
		return habilitacao;
	}



	public void setHabilitacao(String habilitacao) {
		this.habilitacao = habilitacao;
	}



	public String getIsVeiculo() {
		return isVeiculo;
	}



	public void setIsVeiculo(String isVeiculo) {
		this.isVeiculo = isVeiculo;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
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
