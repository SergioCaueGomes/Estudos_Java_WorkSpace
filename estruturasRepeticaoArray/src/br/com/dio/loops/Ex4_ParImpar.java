package br.com.dio.loops;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        System.out.println("Quantidade de números: "); //Peça um número
        int qtdNumeros = sc.nextInt(); //Entrada de dados, neste caso de um int.

        //variáveis para guardar a quantidade dos números pares e ímpares
        int qtdPar = 0, qtdImpar = 0;

        int count = 0; //controla o loop
        //loop
        do { //primeiro, independente do que tem no while, faça:
            System.out.println("Número: "); //Peça um número
            int numero = sc.nextInt(); //Entrada de dados, neste caso de um int.

            //se o resto da divisão do número por 2 (numero/2) for 0,
            if (numero % 2 == 0) {
                qtdPar++; //acrescente o valor 1 a variável qtdPar.
                //caso contrário, o número digitado é ímpar
            } else {
                qtdImpar++; //adicione o valor 1 a variável qtdImpar.
            }

            count++; //some o valor 1 ao contador até que invalide a condição do loop. (count < quantidadeDeNumeros)
        } while (count < qtdNumeros);
        // Faça o loop caso o valor do contador seja menor que a quantidade de números

        //imprimindo a quantidade de números pares digtados e números ímpares digitados
        System.out.println("Quantidade números pares: " + qtdPar + " / Quantidade números ímpares: " + qtdImpar);
    }

}
