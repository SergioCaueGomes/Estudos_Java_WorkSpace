package br.com.dio.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
        System.out.println("Nome: ");
        nome = sc.next();
        if (nome.equals("0")) break;

        System.out.println("Idade: ");
        idade = sc.nextInt();
        }

        System.out.println("Continua aqui após o while");
    }
}
