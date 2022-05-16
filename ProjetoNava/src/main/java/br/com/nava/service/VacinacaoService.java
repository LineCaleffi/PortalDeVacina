package br.com.nava.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nava.dto.VacinacaoDto;
import br.com.nava.entity.VacinacaoEntity;
import br.com.nava.repositories.VacinacaoRepository;

@Service
public class VacinacaoService {
	@Autowired
	private VacinacaoRepository vacinacaoRep;
	
	public List<VacinacaoDto> getAll(){
		List<VacinacaoEntity> lista = vacinacaoRep.findAll();
		List<VacinacaoDto> listaDto = new ArrayList<>();
		
		for(VacinacaoEntity vacinacao : lista) {
			listaDto.add(vacinacao.toDTO());
		}
		
		return listaDto;		
	}
	
	public VacinacaoDto getOne(int id) {
		return vacinacaoRep.findById(id).orElse(new VacinacaoEntity()).toDTO();
	}
	
	public VacinacaoDto save(VacinacaoEntity vacinacao) {
		return vacinacaoRep.save(vacinacao).toDTO();
	}
}
