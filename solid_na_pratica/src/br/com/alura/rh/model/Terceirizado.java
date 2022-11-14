package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado extends Funcionario{


    private String Empresa;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        super(nome, cpf, cargo, salario);
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }
}
