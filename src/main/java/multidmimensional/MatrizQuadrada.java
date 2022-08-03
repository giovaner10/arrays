package multidmimensional;

public class MatrizQuadrada {

    public static void main(String[] args) {


        int[][] matrizQuadrada = new int[10][10];



        matrizQuadrada[0][0] = 7;

        matrizQuadrada[0][1] = 7;

        matrizQuadrada[0][2] = 7;

        ///

        matrizQuadrada[0][9] = 7;

////
        matrizQuadrada[1][0] = 7;

        matrizQuadrada[1][1] = 7;

        ///

        matrizQuadrada[1][9] = 8;



        ///


        //ultimo elemento

        matrizQuadrada[9][9] = 7;




        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){


                System.out.println("matrizQuadrada["+ i +"]["+ j +"] = " + matrizQuadrada[i][j]);
            }

            }









    }
}
