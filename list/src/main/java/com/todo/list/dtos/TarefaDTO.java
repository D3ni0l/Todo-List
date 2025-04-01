package com.todo.list.dtos;

import java.time.LocalDate;

import com.todo.list.entities.Tarefas;
import com.todo.list.enums.Prioridade;
import com.todo.list.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class TarefaDTO {

	@Id // define o atributo como ID
	@GeneratedValue( strategy = GenerationType.IDENTITY) //gera automaticamente um número unico para id
	private Long id;
	private String descricao;
	private String setor;
	private Prioridade prioridade;
	private LocalDate dataCadastro;
	private Status status;
	private Long idUsuario;
	
	public TarefaDTO() {
	}

	public TarefaDTO(Long id, String descricao, String setor, Prioridade prioridade, LocalDate dataCadastro,
			Status status, Long idUsuario) {
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
		this.prioridade = prioridade;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.idUsuario = idUsuario;
	}

	public TarefaDTO(Tarefas entity) {
		id = entity.getId();
		descricao = entity.getDescricao();
		setor = entity.getSetor();
		prioridade = entity.getPrioridade();
		dataCadastro = entity.getDataCadastro();
		status = entity.getStatus();
		idUsuario = entity.getUsuario().getId(); //pega o usuario e depois pega o atributo id dele
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
}
