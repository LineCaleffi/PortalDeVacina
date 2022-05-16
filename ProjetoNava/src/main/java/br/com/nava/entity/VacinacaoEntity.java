package br.com.nava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import br.com.nava.dto.VacinacaoDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="vacinacao")
public class VacinacaoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dataVacinacao;
	private int dose;
	private String dataProxima;
	
	@ManyToOne
	@JoinColumn(name="usario_id")
	private UsuarioEntity usuario;
	
	@OneToOne
	@JoinColumn(name="vacina_id")	
	private VacinaEntity vacina;
	
	public VacinacaoDto toDTO() {
		ModelMapper mapper = new ModelMapper();
		
		VacinacaoDto dto = mapper.map(this, VacinacaoDto.class);
		 
		return dto;
	}
}
