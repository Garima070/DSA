import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int j;
        for (int i = 0; i < n; i++) {
            for ( j = 0; j <=i; j++) {
                if((i+j)%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");

            }
            System.out.print("\n");

        }
    }

}
