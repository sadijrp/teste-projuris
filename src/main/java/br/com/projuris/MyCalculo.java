
package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MyCalculo implements Calculo {

    public MyCalculo() {};

    public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {
        Map<String, List<Funcionario>> funcionariosPorCargo;
        List<CustoCargo> custoPorCargo = new ArrayList<CustoCargo>();

        funcionariosPorCargo = funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getCargo));

        for (Map.Entry<String, List<Funcionario>> entry : funcionariosPorCargo.entrySet()) {
            CustoCargo tmpCustoCargo = new CustoCargo();
            BigDecimal custo;

            custo = entry.getValue().stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

            tmpCustoCargo.setCargo(entry.getKey());
            tmpCustoCargo.setCusto(custo);

            custoPorCargo.add(tmpCustoCargo);
        }

        return custoPorCargo;
    }

    public List<CustoDepartamento> custoPorDepartamento(List<Funcionario>funcionarios) {
        Map<String, List<Funcionario>> funcionariosPorDepartamento;
        List<CustoDepartamento> custoPorDepartamento = new ArrayList<CustoDepartamento>();

        funcionariosPorDepartamento = funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getDepartamento));

        for (Map.Entry<String, List<Funcionario>> entry : funcionariosPorDepartamento.entrySet()) {
            CustoDepartamento tmpCustoCargo = new CustoDepartamento();
            BigDecimal custo;

            custo = entry.getValue().stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

            tmpCustoCargo.setDepartamento(entry.getKey());
            tmpCustoCargo.setCusto(custo);

            custoPorDepartamento.add(tmpCustoCargo);
        }

        return custoPorDepartamento;
    };
}
