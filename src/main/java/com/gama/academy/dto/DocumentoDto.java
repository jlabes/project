package com.gama.academy.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class DocumentoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Max(value = 11)
	@Min(value = 11)
	private int cpf;
	
	@NotNull
	private int rg;
	
	private String habilitacao;
	
	private boolean isVeiculo;
	
	public DocumentoDto() {}
	
	public DocumentoDto(@NotNull @Max(11) @Min(11) int cpf, @NotNull int rg, String habilitacao, boolean isVeiculo) {
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
	public String toString() {
		return super.toString();
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
