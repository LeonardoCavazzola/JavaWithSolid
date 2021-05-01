package com.solid.curso.service.tributacao;

import java.math.BigDecimal;

public interface ReajusteTributavel extends Reajuste {
	
	BigDecimal valorImpostoDeRenda();
}
