import java.util.Scanner;

public class Questao2 {

    //Faça um programa que guarde num vetor os nomes de pelo menos 10 alunos da turma. Deve permitir ao
    //utilizador ao inserir o número do aluno (índice do vetor) indicar qual o nome do mesmo.


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);



        String[] nomes = new String[4];
        int posicao = 0;


        for( int i = 0 ; i < nomes.length; i++){


            System.out.println("Informe a posicao do aluno");

            posicao = ler.nextInt();

            System.out.println("Perfeito, me informe agora o nome do aluno");

            nomes[posicao] = ler.next();

            System.out.println("CICLO " + i);

        }


        for( int i = 0 ; i < nomes.length; i++){

            System.out.println("o aluno da posicao " + i + " se chama " + nomes[i]);

        }

        /// PARTE ACIMA O QUE FOI PEDIDO NA QUESTAO


        int posicaoVerificar = 0;

        boolean verificar = true;



        while(verificar){


            System.out.println("Informe a posicao que deseja verificar ou 10 para sair");

            posicaoVerificar = ler.nextInt();

            if(posicaoVerificar == 10){

                //verificar = false;

                break;
            }

            System.out.println("O valor que vc pediu para ser verificado - posicao: " + posicaoVerificar + " = " + nomes[posicaoVerificar]);

        }







    }


}
