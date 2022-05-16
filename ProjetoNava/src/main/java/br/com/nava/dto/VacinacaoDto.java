package br.com.nava.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.modelmapper.ModelMapper;

import br.com.nava.entity.UsuarioEntity;
import br.com.nava.entity.VacinaEntity;
import br.com.nava.entity.VacinacaoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VacinacaoDto {
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
	
	public VacinacaoEntity toEntity() {
		ModelMapper mapper = new ModelMapper();
		
		return mapper.map(this, VacinacaoEntity.class);
	}
}
