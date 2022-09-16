package br.com.dio.poo.exercicios.ex1;

public class RodarAplicacao {

    public static void main(String[] args){

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);
        
        double valorCombustivel;

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(valorCombustivel= 6.39));

        Carro carro2 = new Carro();

        carro2.setCor("Cinza");
        carro2.setModelo("Mercedes-Benz classe C");
        carro2.setCapacidadeTanque(66);


        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(valorCombustivel= 6.46));

    }
}
