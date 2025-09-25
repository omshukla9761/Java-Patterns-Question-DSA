package Day2.Pattern;

import java.util.Scanner;

public class Pattern2 {
    /*
         * 
         * * 
         * * *
         * * * *
         * * * * *
    */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int no_of_rows = sc.nextInt();
        for (int i = 1 ; i <= no_of_rows ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}