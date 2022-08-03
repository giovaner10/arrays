package projetos;

import java.util.Random;

public class Loteria {

    public static void main(String[] args) {

        int[] sorteados = new int[7];

        int bubbleAux;


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


        for (int i = 0; i < 7; i++) {


            if(i < 5){

                System.out.println("NUMERO sorteados["+i+"] = " + sorteados[i]);
            }

            if(i > 4){

                System.out.println("ESTRELAS sorteados["+i+"] = " + sorteados[i]);
            }

        }



    }
}
