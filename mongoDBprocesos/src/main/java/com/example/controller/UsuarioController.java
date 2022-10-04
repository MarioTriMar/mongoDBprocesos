package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.model.Usuario;
import com.example.service.UsuarioService;


@RequestMapping("api")
@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioServ;
	
	@GetMapping(value="/prueba")
	public String saludar() {
		return "hola mundo";
	}
	
	@PostMapping(value= "/usuarios")
	public void save(@RequestBody Usuario usuario) {
		System.out.println("X");
		usuarioServ.save(usuario);
	}
	
	@GetMapping(value= "/usuarios")
	public List	<Usuario> findAll(){
		return usuarioServ.findAll();
	}
	
	@GetMapping(value= "/usuario/{id}")
	public Usuario findById(@PathVariable String id) {
		return usuarioServ.findById(id).get();
	}
	
	@DeleteMapping(value= "/usuario/{id}")
	public void deleteById(@PathVariable String id) {
		usuarioServ.deleteById(id);
	}
	
	@PutMapping(value= "/usuarios")
	public void update(@RequestBody Usuario usuario) {
		usuarioServ.save(usuario);
	}
	
}