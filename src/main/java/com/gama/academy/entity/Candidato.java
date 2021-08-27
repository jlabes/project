package com.gama.academy.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Candidato")
public class Candidato {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "nome", nullable = false)
	private Date dataNascimento;
	
	@Column(name = "documento", nullable = true)
	private int telefone;
	
	@Column(name = "documento", nullable = false)
	private int celular;
	
	@Column(name = "documento", nullable = true)
	private String email; 
	
	@Column(name = "documento", nullable = false)
	private String cargoPretendido;
	
	@Column(name = "documento", nullable = true)
	private String estadoCivil;
	
	@Column(name = "documento", nullable = true)
	private String genero;
	
	@Column(name = "endereco", nullable = false)
	@ManyToOne
	private Endereco endereco;
	
	@Column(name = "documento", nullable = false)
	@OneToOne
	private Documento documento;
	
	public Candidato() {}

	public Candidato(long id, String nome, Date dataNascimento, int telefone, String email, String cargoPretendido,
			String estadoCivil, String genero, Endereco endereco, Documento documento, int celular) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.cargoPretendido = cargoPretendido;
		this.estadoCivil = estadoCivil;
		this.genero = genero;
		this.endereco = endereco;
		this.documento = documento;
		this.celular = celular;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}
}
