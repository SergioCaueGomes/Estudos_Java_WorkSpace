import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        int inicio = A;
        int soma = inicio;
        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        while (inicio < N) {

            inicio++;
            soma += A;

        }
        System.out.println(soma);

    }
}