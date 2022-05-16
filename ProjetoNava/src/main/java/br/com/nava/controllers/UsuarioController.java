package br.com.nava.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nava.dto.UsuarioDto;
import br.com.nava.service.UsuarioService;

@RestController
@RequestMapping("usuarios")
@CrossOrigin("*")

public class UsuarioController {
	@Autowired
	private UsuarioService usuarioServ;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDto>> getAll(){
		return ResponseEntity.ok().body(usuarioServ.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UsuarioDto> getOne(@PathVariable int id){
		return ResponseEntity.ok().body(usuarioServ.getOne(id));
	}
	
	@PostMapping
	public ResponseEntity<UsuarioDto> save(@RequestBody UsuarioDto usuario){
		return ResponseEntity.ok().body(usuarioServ.save(usuario.toEntity()));
	}
	
	@PatchMapping(value="{id}")
	public ResponseEntity<UsuarioDto> update(@PathVariable int id, @RequestBody UsuarioDto usuario){
		return ResponseEntity.ok().body(usuarioServ.update(id,usuario.toEntity()));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		usuarioServ.delete(id);
	}
}
    