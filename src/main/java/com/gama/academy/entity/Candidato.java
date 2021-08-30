package com.gama.academy.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	@Column(name = "dataNascimento", nullable = false)
	private LocalDate dataNascimento;
	
	@Column(name = "telefone", nullable = true)
	private String telefone;
	
	@Column(name = "celular", nullable = false)
	private String celular;
	
	@Column(name = "email", nullable = true)
	private String email; 
	
	@Column(name = "cargoPretendido", nullable = false)
	private String cargoPretendido;
	
	@Column(name = "estadoCivil", nullable = true)
	private String estadoCivil;
	
	@Column(name = "genero", nullable = true)
	private String genero;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="endereco_id", referencedColumnName = "id")
	private Endereco endereco;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "documento_cpf", referencedColumnName = "cpf")
	private Documento documento;
	
	public Candidato() {}
	
	public Candidato(Long id, String nome, LocalDate dataNascimento, String telefone, String celular, String email,
			String cargoPretendido, String estadoCivil, String genero, Endereco endereco, Documento documento) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.cargoPretendido = cargoPretendido;
		this.estadoCivil = estadoCivil;
		this.genero = genero;
		this.endereco = endereco;
		this.documento = documento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
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

}
