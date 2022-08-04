package jogodos21;

import java.util.Scanner;

public class PlayerXPlayer {

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

            if(palitos <= 1){ //ele vai verificar se esse placar atende as condicoes de parada para se termos um vencedor, em resumo se  a quantidade de palitos for igual a 1, o proximo jogador, que seria o player 2 perde, pois ele nao tem como mais jogar
                System.out.println("Jogador 1 venceu");
                break;
            }// caso contrario, o player podera jogar



            System.out.println("jogador 2 - Informe o valor que deseja retirar (1, 2, 3 ou 4)");
            jogador2 = ler.nextInt();

            while (jogador2 < 1 || jogador2 > 4){
                System.out.println("Numero invalido, player 2");
                System.out.println("Informe o valor que deseja retirar (1, 2, 3 ou 4)");
                jogador2 = ler.nextInt();

            }

            palitos -= jogador2;
            System.out.println("Placar " + palitos);

            if(palitos <= 1){
                System.out.println("Jogador 2 venceu");
                break;
            }



        }
    }

}
