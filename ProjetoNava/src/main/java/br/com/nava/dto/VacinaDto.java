package br.com.nava.dto;

import org.modelmapper.ModelMapper;

import br.com.nava.entity.VacinaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VacinaDto {
	private int id;
	
	private String nome;
	private String fabricante;
	private int qntDoses;
	private int intervalo;
	
	public VacinaEntity toEntity() {
		ModelMapper mapper = new ModelMapper();
		
		return mapper.map(this, VacinaEntity.class);
	}
}//subindo projeto no gitLab
