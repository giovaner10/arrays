import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        int[] array = new int[99];
        int aux = 0;
        Scanner ler = new Scanner(System.in);



       /* for (int i = 0; i < 99; i++) {

            array[i] = new Random().nextInt();
        }

        //bublle sort
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        Arrays.stream(array).forEach(value -> System.out.println(value));*/

       /* String i = "java";
        String split = i.split("")[0];

        System.out.println(split);*/


        System.out.println("informe o valor de aux");
        aux = ler.nextInt();
        System.out.println("O valor do aux eh: " + aux);

    }
}
