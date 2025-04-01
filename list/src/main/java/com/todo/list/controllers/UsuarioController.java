package com.todo.list.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.list.dtos.UsuarioDTO;
import com.todo.list.services.UsuarioService;

import jakarta.validation.Valid;

@RestController // indica que a classe será um controller
@RequestMapping("usuario") // define um caminho para um controller
						//	requisições que começam com /usuario serão tratadas aqui.
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping
	public ResponseEntity<UsuarioDTO> salvar(@Valid @RequestBody UsuarioDTO dto){
		dto = usuarioService.salvar(dto);
		
		return ResponseEntity.ok(dto);
	}
}
