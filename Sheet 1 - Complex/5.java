import java.util.*;

public class TestClass {
    public static void star(int n)
    {
        int space = n-4;
        for(int i=1; i<=n; i++)
        {
            if(i==1 || i==n) for(int j=1; j<=n; j++) System.out.print("*");
            else if(i <= n/2+1)
            {
                System.out.print("*");
                for(int j=1; j<i-1; j++) System.out.print(" ");
                System.out.print("*");
                for(int j=0; j<space; j++) System.out.print(" ");
                if(space > 0)System.out.print("*");
                for(int j=1; j<i-1; j++) System.out.print(" ");
                System.out.print("*");
                space -= 2;
            }
            else
            {   if(space < 0){ space *= -1; space -=2; }
                System.out.print("*");

                for(int j=1; j<=n-i-1; j++) System.out.print(" ");
                System.out.print("*");
                for(int j=0; j<space; j++) System.out.print(" ");
                System.out.print("*");
                for(int j=1; j<=n-i-1; j++) System.out.print(" ");
                System.out.print("*");
                space += 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        star(n);

        sc.close();
    }
}