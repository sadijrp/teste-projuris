
package br.com.projuris;

import java.math.BigDecimal;


public class Funcionario {
    private String cargo;
    private String departamento;
    private BigDecimal salario;

    public Funcionario(String cargo, String depargamento, BigDecimal salario) {
        this.cargo = cargo;
        this.departamento = depargamento;
        this.salario = salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public BigDecimal getSalario() {
        return this.salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public void setSalario(BigDecimal salario){
        this.salario = salario;
    }

}
