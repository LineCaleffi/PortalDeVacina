package br.com.nava.dto;

import org.modelmapper.ModelMapper;

import br.com.nava.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
	private int id;
	private String nome, cpf, dataNasc, endereco;
	private int telefone;
	
	public UsuarioEntity toEntity() {
		ModelMapper mapper = new ModelMapper();
		
		return mapper.map(this, UsuarioEntity.class);
	}
}//subindo projeto no gitLab
