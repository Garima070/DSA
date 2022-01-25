import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=0;
        for (int i = 1; i <= n; i++,t=0)
        {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            while(t!=2*i-1)
            {
                System.out.print("*");
                ++t;
            }
            System.out.println();
        }
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
