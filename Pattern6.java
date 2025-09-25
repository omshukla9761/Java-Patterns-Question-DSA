package Day2.Pattern;

public class Pattern6 {
/*

*____*
*___*
*__*
*_*
**

*/
    public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
    System.out.print("*");
    for (int j = 0; j < 5 - i - 1; j++) {
        System.out.print(" ");
    }
    System.out.println("*");
}

    }
}
