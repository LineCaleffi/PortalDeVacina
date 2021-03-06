package br.com.nava.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nava.dto.VacinaDto;
import br.com.nava.entity.VacinaEntity;
import br.com.nava.repositories.VacinaRepository;

@Service
public class VacinaService {
	@Autowired
	private VacinaRepository vacinaRep;
		
	public List<VacinaDto> getAll(){
		List<VacinaEntity> lista = vacinaRep.findAll(); // retorna os dados do banco de dados
		List<VacinaDto> listaDTO = new ArrayList<>();
		for(VacinaEntity vacina : lista) {
			listaDTO.add(vacina.toDTO());
		}
		return listaDTO;
	}
	
	public VacinaDto getOne(int id) {
		return vacinaRep.findById(id).orElse(new VacinaEntity()).toDTO();
	}
	
	public VacinaDto save(VacinaEntity vacina) {
		return vacinaRep.save(vacina).toDTO();
	}
	
	public VacinaDto update(int id, VacinaEntity novaVacina) {
		Optional<VacinaEntity> vacinaBD = vacinaRep.findById(id);
		
		if(vacinaBD.isPresent()) {
			VacinaEntity v = vacinaBD.get();
			
			v.setNome(novaVacina.getNome());
			v.setFabricante(novaVacina.getFabricante());
			v.setQntDoses(novaVacina.getQntDoses());
			v.setIntervalo(novaVacina.getIntervalo());
			
			return vacinaRep.save(v).toDTO();
		}else {
			return new VacinaEntity().toDTO();
		}
	}
	
	public void delete(int id) {
		vacinaRep.deleteById(id);
	}
}
