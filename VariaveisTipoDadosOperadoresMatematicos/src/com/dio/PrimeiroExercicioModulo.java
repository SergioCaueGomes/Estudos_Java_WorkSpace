package com.dio;

public class PrimeiroExercicioModulo {

	public static void main(String[] args) {
		
		int i;
		// int i; quando declaramos uma variável com o mesmo nome da erro.
		int I; //nesse caso as variáveis são case sensitive e i é diferente de I
		//int 1a; nesse caso o java não aceita variaveis iniciadas por numeros.
		int _1a; // não gera erro porem não é uma boa pratica iniciar com caracter especial nome de variaveis.
		int $aq; // não gera erro porem não é uma boa pratica iniciar com caracter especial nome de variaveis.
		
		i=5;
		I=10;
		_1a= 20;
		$aq = 7;
		
		final int j = 10; // Final é uma variavel constante tendo seu valor de inicio ao fim.
		//j = 15; // gera esso pois o valor de j é constante conforme dito antes.
		int asrn24678md;
		//int asrn246 78md; //Esse gera erro pois nome de variavel não pode conter espaços.
		int asrn2$4678_md = 10;
		//int asrn2$46%78_md =10; //
		
		asrn24678md = 5;
		asrn2$4678_md = 10;
		
		int quantidadeProduto = 50; //Forma correta de se criar uma variavel.
		//int QuantidadeProduto; // Não gera erro mas não é uma boa pratica iniciar o nome de uma variavel com letra maiusculas.
		final int NUMERO_TENTATIVAS = 5; //Forma correta de se criar uma variavel final, Tudo maiusculo e separadas com underline.
		//final  int numeroTentativas = 5; // forma errada pois não atende os requisitos de boas praticas ao criar uma variavel final.
		int QUANTIDADE_OPCOES = 25; // não gera erro mas não é boa pratica pois não é uma variavel final para ser escrita dessa forma seu nome.
		//int qtdProd;
		
		System.out.println(i);
		System.out.println(I);
		System.out.println(_1a);
		System.out.println($aq);
		System.out.println(j);
		System.out.println(asrn24678md);
		System.out.println(asrn2$4678_md);
		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		System.out.println(QUANTIDADE_OPCOES);
		

	}

}
