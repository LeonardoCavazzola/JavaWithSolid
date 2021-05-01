package com.solid.curso.service.promocao;

import com.solid.curso.model.Cargo;
import com.solid.curso.model.Funcionario;
import com.solid.curso.service.ValidacaoException;

public class PromocaoService {
    public void promover(Funcionario funcionario, boolean metaBatida) {
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerentes nao podem ser promovidos!");
        }

        if (metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionario nao bateu a meta!");
        }
    }
}
