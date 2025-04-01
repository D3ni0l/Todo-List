package com.todo.list.dtos;

import com.todo.list.entities.Usuario;

public class UsuarioDTO {

	private Long id;
	private String nome;
	private String email;
	
	public UsuarioDTO() {
	}

	public UsuarioDTO(Long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	public UsuarioDTO(Usuario entity) { // recebe um dado do tipo usuario e passa esses valores pro usuarioDTO
		id = entity.getId(); //pega os valores de id do usuario
		nome = entity.getNome(); // pega os valores do nome do usuario
		email = entity.getEmail(); // pega os valores de email
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
