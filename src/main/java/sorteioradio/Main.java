package sorteioradio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<Ouvintes> ouvintesArrayList = new ArrayList<>();

        int pesoDoJogo = 4000;

        Ouvintes ouvinte = new Ouvintes();

        int index = 0;

        Scanner ler = new Scanner(System.in);

        ouvintesArrayList.add(new Ouvintes("Giovane"));
        ouvintesArrayList.add(new Ouvintes("Leh"));


        int opcao = 0;


        while (true) {


            System.out.println(
                    "1 - Criar um novo ouvinte  " +
                            "\n2 - Editar um novo ouvinte" +
                            "\n3 - Apagar um ouvinte" +
                            "\n4 - Listar todos os ouvintes" +
                            "\n5 - Ver usuario por index" +
                            "\n6 - Ver Ranking" +
                            "\n7 - jogar");


            opcao = ler.nextInt();
            System.out.println("=======================================================");


            while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao !=6 && opcao != 7
            ) {
                System.out.println("Valor invalido, tente novamente: ");
                opcao = ler.nextInt();
            }

            switch (opcao) {
                case 1:

                    System.out.println("Informe o nome do usuario");
                    String nome = ler.next();



                    boolean foiInserido = ouvinte.criarOuvinte(new Ouvintes(nome), ouvintesArrayList);

                    System.out.println(foiInserido ? "Ouvinte criado" : "Ouvinte não criado");
                    System.out.println("=======================================================");


                    break;


                case 2:

                    System.out.println("Informe a posicao do usuario que deseja editar");
                    index = ler.nextInt();

                    System.out.println("Informe o novo nome do usuario");
                    String novoNome = ler.next();

                    ouvinte.editarPorIndex(ouvintesArrayList, index, novoNome);

                    System.out.println("=======================================================");

                    break;

                case 3:
                    System.out.println("Informe a posicao do usuario que deseja deletar");
                    index = ler.nextInt();
                    ouvinte.apagarPorIndex(ouvintesArrayList, index);
                    System.out.println("=======================================================");

                    break;

                case 4:
                    ouvinte.listarTodos(ouvintesArrayList);
                    System.out.println("=======================================================");

                    break;

                case 5:
                    System.out.println("Informe a posicao do usuario que deseja verificar");
                    index = ler.nextInt();
                    ouvinte.listarPorIndex(ouvintesArrayList, index);
                    System.out.println("=======================================================");


                    break;

                case 6:

                    ouvinte.verRanking(ouvintesArrayList);
                    break;


                case 7:
                    System.out.println("Informe a posicao do usuario que deseja Jogar");
                    index = ler.nextInt();
                    System.out.println("Informe o lance do usuario");
                    int valor = ler.nextInt();
                    ouvinte.jogadaUsuario(ouvintesArrayList, index, pesoDoJogo, valor);
                    System.out.println("=======================================================");


                    break;





                default:
                    System.out.println("Encerrando");
                    System.out.println("=======================================================");

                    break;

            }

        }


    }






















}
