package br.com.nava.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import br.com.nava.dto.VacinaDto;
import br.com.nava.service.VacinaService;

@RestController
@RequestMapping("vacinas")
@CrossOrigin("*")

public class VacinaController {
	@Autowired
	private VacinaService vacinaServ;
	
	@GetMapping 
	public ResponseEntity<List<VacinaDto>> getAll(){
		//return enderecoService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(vacinaServ.getAll());
	} 
	
	@GetMapping("/{id}")
	public ResponseEntity<VacinaDto> getOne(@PathVariable int id){
		return ResponseEntity.status(HttpStatus.OK).body(vacinaServ.getOne(id));
	}
	
	@PostMapping
	public ResponseEntity<VacinaDto> save(@RequestBody VacinaDto vacina){
		return ResponseEntity.ok().body(vacinaServ.save(vacina.toEntity()));
	}
	
	@PatchMapping(value = "{id}")
	public ResponseEntity<VacinaDto> update(@PathVariable int id, @RequestBody VacinaDto vacina){
		return ResponseEntity.ok().body(vacinaServ.update(id, vacina.toEntity()));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		vacinaServ.delete(id);
	}
}
