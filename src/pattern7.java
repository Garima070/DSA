import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j<=n*2 ; j++) {
                if(j<=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
                if((i+j)<=n*2)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=2*n ; j++) {
                if(i>(n+1-j))
                    System.out.print(" ");
                else
                    System.out.print("*");
                if((i+n)>j)
                    System.out.print(" ");
                else
                    System.out.print("*");

            }
            System.out.println();
        }

    }
}
