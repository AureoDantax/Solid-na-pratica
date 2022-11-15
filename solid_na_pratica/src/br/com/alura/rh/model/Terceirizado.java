package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {


    private String Empresa;
    private DadosPessoais dadosPessoais;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoais = new DadosPessoais(nome.toUpperCase(), cpf, cargo, salario);
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }
}
