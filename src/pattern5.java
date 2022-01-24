import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int j;
        for (int i = 0; i < n; i++) {
            for ( j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k= j; k <=n; k++) {
                System.out.print("*");

            }
            System.out.print("\n");

        }
    }
}
