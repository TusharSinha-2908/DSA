import java.util.*;

public class TestClass {

    public static void arrow(int n)
    {
        for(int i = 1; i <= (n*2)-1; i++)
        {
            if(i<=n)
            {
                for(int j=0; j<i-1; j++) System.out.print(" ");
                for(int j=1; j<=i; j++) System.out.print("*");
            }
            else
            {
                for(int j=1; j<n-(i-n); j++) System.out.print(" ");
                for(int j=1; j<=n-(i-n); j++) System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        arrow(n);

        sc.close();
    }
}