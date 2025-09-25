package Day2.Pattern;

import java.util.Scanner;

public class Pattern1 {
/*
        * * * * *
        * * * * *
        * * * * *
        * * * * *
*/
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("No. of rows print stars  : ");
        int no_of_rows = sc.nextInt();
        for (int i = 1 ; i<=no_of_rows;i++){
            System.out.println("* * * * *");
        }
        sc.close();
    }
}
