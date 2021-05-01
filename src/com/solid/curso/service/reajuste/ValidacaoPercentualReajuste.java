package com.solid.curso.service.reajuste;

import com.solid.curso.model.Funcionario;
import com.solid.curso.service.ValidacaoException;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {
	
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
	}

}
