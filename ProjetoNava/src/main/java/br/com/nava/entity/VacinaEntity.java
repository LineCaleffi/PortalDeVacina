package br.com.nava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import br.com.nava.dto.VacinaDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_vacina")
public class VacinaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private String fabricante;
	private int qntDoses;
	private int intervalo;
	
	public VacinaDto toDTO() {
		ModelMapper mapper = new ModelMapper();
		
		VacinaDto dto = mapper.map(this, VacinaDto.class);
		
		return dto;
	}
	
}
