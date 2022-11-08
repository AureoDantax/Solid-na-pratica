package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class ReajusteService {

/* esse metódo se encontrava na classe funcionario, apesar de ter aver com o funcionario
 esse é um serviço de cálculo, uma regra de negócio e deve estar numa classe separada em um service, por exemplo
 */

    public void reajustarSalario(Funcionario funcionario,BigDecimal aumento) {
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }

        BigDecimal novoSalario = salarioAtual.add(percentualReajuste);
        funcionario.atualizarSalario(novoSalario);


    }
}
