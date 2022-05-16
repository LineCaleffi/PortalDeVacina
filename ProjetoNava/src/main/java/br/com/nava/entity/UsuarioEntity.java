package br.com.nava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import br.com.nava.dto.UsuarioDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_usuario")
public class UsuarioEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome, cpf, dataNasc, endereco;
	private int telefone;

	public UsuarioDto toDTO() {
		ModelMapper mapper = new ModelMapper();
		
		UsuarioDto dto = mapper.map(this, UsuarioDto.class);
		
		return dto;
	}
}
