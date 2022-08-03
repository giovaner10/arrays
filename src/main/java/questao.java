import java.util.ArrayList;

public class questao {


    public static void main(String[] args) {



        Validator teste = new Validator();

        ArrayList<Integer> validar = teste.validar(6);


        validar.forEach(integer -> System.out.println(integer));

    }





}