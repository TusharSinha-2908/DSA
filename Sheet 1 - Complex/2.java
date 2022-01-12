import java.util.*;

public class TestClass {
    public static void main(String[] args) {

        int a = 0, b = 1, sum = 0;

        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                sum = a+b;
                System.out.print(b + " ");
                a = b;
                b = sum;
            }
            System.out.println();
        }

    }
}