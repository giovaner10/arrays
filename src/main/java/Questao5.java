public class Questao5 {

    public static void main(String[] args) {


        int[] vetor = {42,77,888888,4, -4, 78};

        int aux;




        for(int i = 0; i<vetor.length; i++){

            for(int j = 0; j<vetor.length - 1; j++){

                if(vetor[j] > vetor[j + 1]){

                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }

            }
        }
    }
}
