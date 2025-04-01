package com.todo.list.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.list.dtos.TarefaDTO;
import com.todo.list.entities.Tarefas;
import com.todo.list.services.TarefaService;

import jakarta.validation.Valid;

@RequestMapping
@RestController
public class TarefaController {

	@Autowired // autowired pede para o Spring criar e fornecer automaticamente um objeto para você
	TarefaService tarefaService;
	
	@PostMapping // lida com requisições http do tipo post
	public ResponseEntity <TarefaDTO> criarTarefa(@Valid @RequestBody TarefaDTO dto){
	dto = tarefaService.salvarTarefa(dto);
	return ResponseEntity.ok(dto);
	}
	
	@GetMapping // lida com requisições http do tipo get
	public ResponseEntity <List<Tarefas>> listarTarefas(){ // define um método
		// que retorna uma lista de tarefas (List<Tarefas>) dentro de uma resposta 
		// http (ResponseEntity)
		return ResponseEntity.ok(tarefaService.listarTarefas()); // retorna a lista de tarefas ao cliente com sucesso
	}
}
