import java.util.Scanner;

public class Questao1 {

    //Faça um programa que peça ao utilizador três notas, guarde-as num vetor e apresente a média final lendo as
    //notas do vetor.
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double[] notas = new double[3];

        double soma = 0;


        for(int i = 0; i < notas.length; i++){


            System.out.println("Informe a nota " + i +1);

            notas[i] = ler.nextInt();

           // soma += notas[i];
        }


       for(int i = 0; i < notas.length; i++){

           System.out.println("NOTA: " + i + " = " + notas[i]);


           soma += notas[i];

          // System.out.println( soma + " + " + notas[i] + " = " + soma);

          // System.out.println("Soma das notas no ciclo: " + i + " eh igual ah = " + soma);

        }


        double media = soma / notas.length;

        System.out.println("Sua media eh: " + media);





    }
}
