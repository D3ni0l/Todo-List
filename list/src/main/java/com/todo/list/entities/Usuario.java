package com.todo.list.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity //DEFINE A CLASSE COMO ENTIDADE
@Table(name = "tb_usuario") // @Table DEFINE O NOME DA TABELA
public class Usuario {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	private String nome;
	@Column( unique = true ) // não deixa vc colocar emails repetidos
	private String email;
	
	@OneToMany( mappedBy = "usuario" ) // !
	private List <Tarefas> tarefas;  // !
	
	public Usuario() { // CONSTRUTOR VAZIO
	}

	public Usuario(Long id, String nome, String email) { // CONSTRUTOR COM ARGUMENTOS
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	// Getters and setters
	public Long getId() {
		return id; // pega o id, traz ele para os lugar
	}

	public void setId(Long id) {
		this.id = id; // modificar o atributo id
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

	public List<Tarefas> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefas> tarefas) {
		this.tarefas = tarefas;
	}
	
}
