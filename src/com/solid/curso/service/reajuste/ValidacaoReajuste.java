package com.solid.curso.service.reajuste;

import com.solid.curso.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}
