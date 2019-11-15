import java.util.Arrays;
import java.util.Scanner;

public class christmasTree {


    public static void main (String[] args) {

        itsChristmas(getHeight());

    }

    public static int getHeight () {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many lines tall should the tree be?");
        int height = sc.nextInt();
        return height;

    }


    public static void itsChristmas(int height) {


        for (int j=0; j <height; j++) {

            String branch[] = new String[height];

            for (int i=0; i <= j; i++) {

                branch[i] = "*";

            }

            System.out.println(Arrays.toString(branch).replace("[","").replace("]","").replace(",","").replace("null",""));

        }

        System.out.println("| |");

    }


}
