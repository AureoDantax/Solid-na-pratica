package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidaPeriodoReajuste  implements ValidacaoReajuste  {

    public void Validar (Funcionario funcionario, BigDecimal aumento) {
        LocalDate DataultimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate DataAtual = LocalDate.now();
        long periodoUltimoResjuste = ChronoUnit.MONTHS.between(DataultimoReajuste, DataAtual);
        if (periodoUltimoResjuste < 6) {
            throw new ValidacaoException("O funcionário já recebeu um ajuste há menos de 6 meses");
        }

    }
}
