package projetos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) throws InterruptedException {

        Scanner ler = new Scanner(System.in);

        int[] sorteados = new int[7];

        ArrayList<String> resultados = new ArrayList<>();

        int bubbleAux;

        int quantidadeDeJogos = 0;


        int acertoDeNumeros = 0;
        int acertoDeEstrelas = 0;


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


        while (true){

            System.out.println("Bem vindo a loteria, aqui voce faz suas apostas!");
            System.out.println("Carregando...");
            Thread.sleep(2000);


            System.out.println("Para continuar pressione qualquer tecla, ou digite 100 para finalizar");

            int continuar = ler.nextInt();

            if( continuar == 100){

                resultados.forEach(resultado -> System.out.println(resultado));

                System.out.println("Encerrando aposta, obrigado pela preferencia");
                break;
            }



            for (int i = 0; i < 7; i++) {


                if(i < 5){
                    System.out.println("Informe o numero da " + (i+1) +"° posicao");
                    int numero = ler.nextInt();

                    while (numero < 1 || numero > 50 ){
                        System.out.println("Valor invalido, informe dezenas entre 1 e 50. Digite novamente.");
                        System.out.println("Informe o numero da " + (i+1) +"° posicao");

                        numero = ler.nextInt();
                    }

                    if(numero == sorteados[i]){
                        acertoDeNumeros += 1;
                    }


                }

                if(i > 4){

                    System.out.println("Informe o numero ESTRELA da " + (i+1) + "° posicao");
                    int numero = ler.nextInt();

                    while (numero < 1 || numero > 11 ){
                        System.out.println("Valor invalido, informe dezenas entre 1 e 11. Digite novamente.");
                        System.out.println("Informe o numero ESTRELA da " + (i+1) + "° posicao");

                        numero = ler.nextInt();
                    }

                    if(numero == sorteados[i]){
                        acertoDeEstrelas += 1;
                    }

                }

            }


            resultados.add(acertoDeNumeros + " NUMEROS " + acertoDeEstrelas + " ESTRELAS");

            quantidadeDeJogos++;

            if (quantidadeDeJogos == 5){
                System.out.println("Voce ja jogou o maximo de vezes por hoje("+quantidadeDeJogos+"), volte a jogar amanhã");
                resultados.forEach(resultado -> System.out.println(resultado));
                break;

            }

        }



    }
}
