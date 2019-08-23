
package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App
{
    public static void main( String[] args )
    {
        MyFindArray myFindArray = new MyFindArray();
        MyFindChar myFindChar = new MyFindChar();
        MyCalculo myCalculo = new MyCalculo();
        int array[] = {4, 9, 3, 7, 8};
        int subarray[] = {3, 7};
        String word = new String("stress");
        Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0));
        Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70));
        Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45));
        Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9));
        Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal(7500));
        Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0));
        Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4));
        Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90));
        Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50));
        Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0));
        List<Funcionario> listaFuncionario = new ArrayList<>();

        listaFuncionario.add(funcionario1);
        listaFuncionario.add(funcionario2);
        listaFuncionario.add(funcionario3);
        listaFuncionario.add(funcionario4);
        listaFuncionario.add(funcionario5);
        listaFuncionario.add(funcionario6);
        listaFuncionario.add(funcionario7);
        listaFuncionario.add(funcionario8);
        listaFuncionario.add(funcionario9);
        listaFuncionario.add(funcionario10);

        System.out.println("------------------------");
        System.out.println("* 1 - MyFindArray");
        System.out.println("* array: "+ Arrays.toString(array));
        System.out.println("* subarray: "+ Arrays.toString(subarray));
        System.out.println("* Resultado: " + myFindArray.findArray(array, subarray) );

        System.out.println("------------------------");
        System.out.println("* 2 - MyFindChar");
        System.out.println("* word: " + word);
        System.out.println("* Resultado: " + myFindChar.findChar(word));

        System.out.println("------------------------");
        System.out.println("* 3 - MyCalculo");
        System.out.println("* Custo por cargo: ");
        for(CustoCargo custoCargo : myCalculo.custoPorCargo(listaFuncionario)) {
            System.out.println("* " + custoCargo.getCargo() + " - " + custoCargo.getCusto());
        }
        System.out.println("*");
        System.out.println("* Custo por departamento: ");
        for(CustoDepartamento custoDepartamento: myCalculo.custoPorDepartamento(listaFuncionario)){
            System.out.println("* " + custoDepartamento.getDepartamento() + " - " + custoDepartamento.getCusto());
        }
        System.out.println("------------------------");
    }
}
