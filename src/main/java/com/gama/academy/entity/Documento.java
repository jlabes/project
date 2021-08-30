package com.gama.academy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Documento")
public class Documento {
	
	@Id
	@Column(name = "cpf", nullable = false)
	private String cpf;
	
	@Column(name = "rg", nullable = false)
	private String rg;
	
	@Column(name = "habilitacao", nullable = true)
	private String habilitacao;
	
	@Column(name = "isVeiculo", nullable = true)
	private boolean isVeiculo;

	public Documento() {}

	public Documento(String cpf, String rg, String habilitacao, boolean isVeiculo) {
		this.cpf = cpf;
		this.rg = rg;
		this.habilitacao = habilitacao;
		this.isVeiculo = isVeiculo;
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

	public boolean isVeiculo() {
		return isVeiculo;
	}

	public void setVeiculo(boolean isVeiculo) {
		this.isVeiculo = isVeiculo;
	}
}
