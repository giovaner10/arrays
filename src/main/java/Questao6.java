import java.util.Random;
import java.util.Scanner;

public class Questao6 {

    //Faça um programa que peça ao utilizador um conjunto de nomes e os guarda num vetor. De seguida sorteie uma
    //posição do vetor e escreva o nome que está nessa posição.
    public static void main(String[] args) {

       String[] nomes = new String[4];

        Scanner ler = new Scanner(System.in);


        for (int i = 0; i < nomes.length; i++){

            System.out.println("Informe o nome da posicao " + i);
            nomes[i] = ler.next();
            System.out.println("CICLO " + i);
        }


        for (int i = 0; i < nomes.length; i++){


            System.out.println(nomes[i]);
        }


        Random j = new Random();

        int i = j.nextInt(nomes.length); // 0 - nomes.lenght

        System.out.println("Valor da posicao que foi sorteado " + i);

        System.out.println(nomes[i]);



    }
}

