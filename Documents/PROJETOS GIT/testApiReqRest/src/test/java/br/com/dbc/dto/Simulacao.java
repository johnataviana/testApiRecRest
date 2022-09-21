package br.com.dbc.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Simulacao {
    private Long id;
	public String nome;
	public String cpf;
	public String email;
	public BigDecimal valor;
	public int parcelas;
	public Boolean seguro;

}
