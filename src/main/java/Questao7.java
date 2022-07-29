import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);


        String[] nomes = new String[1000];
        String[] letras = new String[1000];
        int contador = 0;

        int interromper = 0;





        while (true) {

            System.out.println("Informe o nome da posicao " + contador);

            nomes[contador] = ler.next();

            letras[contador] = (nomes[contador].split("")[0]) + (nomes[contador].split("")[2]);

            System.out.println("DIGITE O PARA CONTINUAR OU 1 PARA SAIR");

            interromper = ler.nextInt();

            if (interromper == 1) {
                break;
            }


            contador++;
        }

        /*for (int i = 0; i < nomes.length; i++) {

            if (nomes[i] != null) {

                System.out.println("nome: " + nomes[i] + " primeira letra: " + letras[i]);
            }
        }
*/

        for (String nome : letras) {

            if (nome != null) {

                System.out.println(nome);
            }

        }

    }
}
