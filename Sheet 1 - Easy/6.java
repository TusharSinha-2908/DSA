import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        
        int n = 1;

        for(int i=1; i<=5; i++,n+=2)
        {
            for(int j=0; j<5-i; j++) System.out.print(" ");
            for(int j=n; j>=1; j--) System.out.print(j);
            System.out.println();
        }

    }
}