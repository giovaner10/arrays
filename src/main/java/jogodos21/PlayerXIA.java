package jogodos21;

import java.util.Scanner;

public class PlayerXIA {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int jogador1 = 0;

        int jogador2 = 0;

        int palitos = 21;

        while (true){


            System.out.println("jogaodor 1 - Informe o valor que deseja retirar (1, 2, 3 ou 4)");
            jogador1 = ler.nextInt();

            while (jogador1 < 1 || jogador1 > 4){
                System.out.println("Numero invalido, player 1");
                System.out.println("Informe o valor que deseja retirar (1, 2, 3 ou 4)");
                jogador1 = ler.nextInt();

            }
            palitos -= jogador1;
            System.out.println("Placar " + palitos);

            if(palitos <= 1){
                System.out.println("Jogador 1 venceu");
                break;
            }



            System.out.println("Inteligencia jogando");

            if(palitos >= 15){
                jogador2 = 4;
            }

            if(palitos == 14){
                jogador2 = 3;
            }

            if(palitos == 13){
                jogador2 = 2;
            }

            if(palitos == 12){
                jogador2 = 1;
            }

            if(palitos == 11){
                jogador2 = 1;
            }

            if(palitos == 10){
                jogador2 = 4;
            }

            if(palitos == 9){
                jogador2 = 3;
            }

            if(palitos == 8){
                jogador2 = 2;
            }

            if(palitos == 7){
                jogador2 = 1;
            }

            if(palitos == 6){
                jogador2 = 1;
            }

            if(palitos == 5){
                jogador2 = 4;
            }

            if(palitos == 4){
                jogador2 = 3;
            }

            if(palitos == 3){
                jogador2 = 2;
            }

            if(palitos == 2){
                jogador2 = 1;
            }


            System.out.println("Jogada calculada " + jogador2);

            palitos -= jogador2;
            System.out.println("Placar " + palitos);

            if(palitos <= 1){
                System.out.println("Inteligencia venceu");
                break;
            }



        }
    }

}
