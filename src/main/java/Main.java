public class Main {
    public static void main(String[] args) {


        int[] array = new int[3];

        array[0] = 6;

        array[1] = 8;

        array[2] = 99;

        System.out.println(array[0]);

        array[0] = array[2];

        System.out.println(array[0]);

        //99 += 99 - 99;
        array[0] = array[0] - 99 ;

        System.out.println(array[0]);














    }
}
