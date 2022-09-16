package br.com.dio.poo.exercicios.ex3;

public class RodarAplicação {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //upcast - Sempre implicito - melhor abordagem.
        Funcionario faxineiro = new Faxineiro();
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();

        //downcast - explícita necessita descrever em qual classe filha vai tranformar, deve-se evitar essa abordagem.
//        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}
