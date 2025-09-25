package Day2.Pattern;

public class Pattern10 {
/* 

*        *
**      **
***    ***
****  ****
**********

*/
    public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
    for (int j = 0; j <= i; j++) {
        System.out.print("*");
    }
    for (int j = 0; j < (n - i - 1) * 2; j++) {
        System.out.print(" ");
    }
    for (int j = 0; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

    }
}
