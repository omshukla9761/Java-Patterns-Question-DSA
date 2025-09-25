package Day2.Pattern ;
public class Pattern3{
    /*
        1 
        1 * 
        1 * 3 
        1 * 3 * 
        1 * 3 * 5 
    */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int num = 1; // reset odd number for each row
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(num + " ");
                    num += 2; // next odd number
                }
            }
            System.out.println();
        }
    }
}
