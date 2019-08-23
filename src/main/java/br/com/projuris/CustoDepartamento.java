
package br.com.projuris;

import java.math.BigDecimal;


public class CustoDepartamento {
    private String departamento;
    private BigDecimal custo;

    public CustoDepartamento () {};

    public String getDepartamento() {
        return this.departamento;
    }

    public BigDecimal getCusto() {
        return this.custo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setCusto(BigDecimal custo) {
        this.custo = custo;
    }
}
