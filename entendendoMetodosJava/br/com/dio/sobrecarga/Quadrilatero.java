package br.com.dio.sobrecarga;

/*
* Classe de exemplo para o exercício da Aula 2 de Métodos.
* Sobrecarga do metodo é quando mantemos o mesmo nome do metodo, porem mudamos os seus parametos dado/nome dos dados.
* */

public class Quadrilatero {

    public static void area(double lado) {

        System.out.println("Área do quadrado:" + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }

}
