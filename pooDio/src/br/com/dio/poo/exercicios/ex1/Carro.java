package br.com.dio.poo.exercicios.ex1;

public class Carro {

    //atributos da classe carro, por ser caracteristicas
    // se fossem manipulaveis seria uma variavel;
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    String getCor() {
        return cor;
    }

   void setCor(String cor) {
        this.cor = cor;
    }

    String getModelo() {
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){

        return capacidadeTanque * valorCombustivel;
    }


}
