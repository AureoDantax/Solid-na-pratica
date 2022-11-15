package br.com.alura.rh.service;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes){
        this.validacoes = validacoes;
    }
/* esse metódo se encontrava na classe funcionario, apesar de ter a ver com o funcionario
 esse é um serviço de cálculo, uma regra de negócio e deve estar numa classe separada em um service, por exemplo
 */
    public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
    this.validacoes.forEach(v -> v.validar(funcionario,aumento));

        BigDecimal novoSalario = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(novoSalario);


    }
}
