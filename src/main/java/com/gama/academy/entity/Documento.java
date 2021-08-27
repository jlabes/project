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
	private Integer cpf;
	
	@Column(name = "rg", nullable = false)
	private int rg;
	
	@Column(name = "habilitacao", nullable = true)
	private String habilitacao;
	
	@Column(name = "isVeiculo", nullable = true)
	private boolean isVeiculo;

	public Documento() {}
	
	public Documento(int cpf, int rg, String habilitacao, boolean isVeiculo) {
		this.cpf = cpf;
		this.rg = rg;
		this.habilitacao = habilitacao;
		this.isVeiculo = isVeiculo;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
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
