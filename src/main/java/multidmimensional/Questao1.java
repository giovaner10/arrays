package multidmimensional;

import java.util.Random;
import java.util.Scanner;

public class Questao1 {

    // Crie um programa que utilize um array multidimensional que simule a tabuada de 10x10. Deve utilizar ciclos para
    //preenchimento do array e aquando da execução da aplicação escrever a todo o array
    public static void main(String[] args) {

        int[][] num = new int[2][2];

        int somaDasLinhas = 0;

        //somaDasLinhas += 3; essas duas linhas sao equivalentes
        //somaDasLinhas = somaDasLinhas + 3;


        int somaDasColunas = 0;

        int somaTotal = 0;

        Scanner in = new Scanner(System.in);




        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.println("Insira o valor da posicao [" + i + "][" + j +"]");

                num[i][j] = in.nextInt();


            }
        }

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                somaDasLinhas += num[i][j];

                System.out.print("[" + num[i][j] + "] ");

            }

            System.out.print(" = " + somaDasLinhas  + " media das linhas = "  + somaDasLinhas / 2);
            somaDasLinhas = 0;

            System.out.println();

        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                somaDasColunas += num[j][i];
                somaTotal = somaTotal + num[j][i];

            }
            System.out.print(somaDasColunas + "   ");
            System.out.println(somaDasColunas / 2 + "   ");

            somaDasColunas = 0;


        }

        System.out.print( "    soma total = "   + somaTotal);
        System.out.print( "    Media aritimetica = "   + somaTotal / num.length);


    }


}
