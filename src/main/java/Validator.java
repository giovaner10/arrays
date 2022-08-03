import java.util.ArrayList;

public class Validator {


    public static void main(String[] args) {
        Validator val = new Validator();
        val.validar(5);
    }
    public ArrayList<Integer> validar(int maxDigit) {

        ArrayList<Integer> valoresComSoma21 = new ArrayList<>();


        for (int i = 0; i <= maxDigit; i++) {
            for (int j = 0; j <= maxDigit; j++) {
                for (int k = 0; k <= maxDigit; k++) {
                    for (int l = 0; l <= maxDigit; l++) {

                        if (i + j + k + l == 21) {

                            String concat = String.valueOf(i) + String.valueOf(j) + String.valueOf(k) + String.valueOf(l);
                            valoresComSoma21.add(Integer.valueOf(concat));

                        }


                    }
                }
            }


        }

        return valoresComSoma21;
    }
}
