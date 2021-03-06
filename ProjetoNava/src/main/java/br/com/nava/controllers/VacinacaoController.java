package br.com.nava.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nava.dto.VacinacaoDto;
import br.com.nava.service.VacinacaoService;

@RestController
@RequestMapping("vacinacao")
@CrossOrigin("*")

public class VacinacaoController {
	@Autowired
	private VacinacaoService vacServ;
	
	@GetMapping
	public ResponseEntity<List<VacinacaoDto>> getAll(){
		return ResponseEntity.ok().body(vacServ.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<VacinacaoDto> getOne(@PathVariable int id){
		return ResponseEntity.ok().body(vacServ.getOne(id));
	}
	
	@PostMapping
	public ResponseEntity<VacinacaoDto> save(@RequestBody VacinacaoDto vacinacao){
		return ResponseEntity.ok().body(vacServ.save(vacinacao.toEntity()));
	}
}//subindo projeto no gitLab
