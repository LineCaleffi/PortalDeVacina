package br.com.nava.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nava.dto.UsuarioDto;
import br.com.nava.entity.UsuarioEntity;
import br.com.nava.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRep;
		
	public List<br.com.nava.dto.UsuarioDto> getAll(){
		List<UsuarioEntity> lista = usuarioRep.findAll(); // retorna os dados do banco de dados
		List<UsuarioDto> listaDTO = new ArrayList<>();
		for(UsuarioEntity usuario : lista) {
			listaDTO.add(usuario.toDTO());
		}
		return listaDTO;
	}
	
	public UsuarioDto getOne(int id) {
		return usuarioRep.findById(id).orElse(new UsuarioEntity()).toDTO();
	}
	
	public UsuarioDto save(UsuarioEntity user) {
		return usuarioRep.save(user).toDTO();
	}
	
	public UsuarioDto update(int id, UsuarioEntity novoUser) {
		Optional<UsuarioEntity> usuarioBD = usuarioRep.findById(id);
		
		if(usuarioBD.isPresent()) {
			UsuarioEntity v = usuarioBD.get();
			
			v.setNome(novoUser.getNome());
			v.setCpf(novoUser.getCpf());
			v.setDataNasc(novoUser.getDataNasc());
			v.setEndereco(novoUser.getEndereco());
			v.setTelefone(novoUser.getTelefone());
			
			return usuarioRep.save(v).toDTO();
		}else {
			return new UsuarioEntity().toDTO();
		}
	}
	
	public void delete(int id) {
		usuarioRep.deleteById(id);
	}      
}
