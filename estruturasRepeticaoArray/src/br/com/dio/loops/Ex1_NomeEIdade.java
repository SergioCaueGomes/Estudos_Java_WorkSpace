package br.com.dio.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
*/

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variaveis
        String nome; //Armazena nome
        int idade;  //Armazena idade

        while (true) { //Enquando o loop for verdadeiro
            System.out.println("Nome: "); //Peça o nome
            nome = sc.next(); //armazene esse nome na variável

            if (nome.equals("0")) { //caso o nome igual a "0"
                break; //interrompa o programa
            }

            System.out.println("Idade: "); //Peça a idade
            idade = sc.nextInt(); //armazene a idade na variável

            //imprima o nome e a idade
            System.out.println("Nome: " + nome + " - idade: " + idade);

        }
    }
}
