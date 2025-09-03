import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] ints = new int[11];

        for (int i = 0; i < ints.length ; i++){
            ints[i] = 10-i;
        }

        binarySearch(ints);

    }


    public static void binarySearch(int[] ints){

        Arrays.sort(ints);

        int M;
        int L = 0;
        int R = ints.length-1;
        int num = 6;
        boolean bol = true;

        System.out.println(Arrays.toString(ints));

        while (bol){

            M = (R+L)/2;

            if (num == ints[M]){
                M++;
                System.out.println("num is at: " + M);
                bol = false;
            }
            else if (num > ints[M]){
                L = M;
            }
            else if (num < ints[M]){
                R = M;
            }
        }
    }

}