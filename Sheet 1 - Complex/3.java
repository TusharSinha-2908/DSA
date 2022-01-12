import java.util.*;

public class TestClass {
    public static int fact(int n)
    {
        int ans = 1;
        for(int i=n; i>0; i--) ans *= i;
        return ans;
    }

    public static void pascal(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                int x = fact(i)/(fact(i-j)*fact(j));
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        pascal(n);

        sc.close();
    }
}