package projetos;

import java.util.Random;

public class LoteriaTentativasAteAcertar {
    public static void main(String[] args) {


        int[] sorteados = new int[7];

        int[] tentativas = new int[7];

        int bubbleAux;

        int quantidadeDeJogos = 0;



        for (int i = 0; i < 5; i++) {

            sorteados[i] = new Random().nextInt(50) + 1;


        }


        for(int i = 0; i < sorteados.length - 2; i++){

            for(int j = 0; j<sorteados.length - 3; j++){

                if(sorteados[j] > sorteados[j + 1]){

                    bubbleAux = sorteados[j];
                    sorteados[j] = sorteados[j+1];
                    sorteados[j+1] = bubbleAux;
                }

            }
        }



        sorteados[5] = new Random().nextInt(11) + 1;
        sorteados[6] = new Random().nextInt(11) + 1;

        if(sorteados[5] > sorteados[6]){

            int aux = sorteados[6];
            sorteados[6] = sorteados[5];
            sorteados[5] = aux;

        }


        while (true){

            for (int i = 0; i < 5; i++) {

                tentativas[i] = new Random().nextInt(50) + 1;


            }


            for(int i = 0; i < tentativas.length - 2; i++){

                for(int j = 0; j<tentativas.length - 3; j++){

                    if(tentativas[j] > sorteados[j + 1]){

                        bubbleAux = tentativas[j];
                        tentativas[j] = tentativas[j+1];
                        tentativas[j+1] = bubbleAux;
                    }

                }
            }



            tentativas[5] = new Random().nextInt(11) + 1;
            tentativas[6] = new Random().nextInt(11) + 1;

            if(tentativas[5] > tentativas[6]){

                int aux = tentativas[6];
                tentativas[6] = tentativas[5];
                tentativas[5] = aux;

            }




            for (int i = 0; i < sorteados.length ; i++) {

                if(sorteados[i] != tentativas[i]){
                    quantidadeDeJogos++;
                    System.out.println("Quantidade de jogos = " + quantidadeDeJogos);
                    break;
                }


            }

            System.out.println("Saiu do for");



        }
    }
}
