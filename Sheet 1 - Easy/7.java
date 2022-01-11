import java.util.*;

public class TestClass {
    public static void main(String[] args) {

        int n = 5;

        for(int i=1; i<=5; i++)
        {   for(int j=0; j<i; j++) System.out.print(n-j);
            System.out.println();
        }
        
        for(int i=6; i>=1; i--)
        {   for(int j=0; j<i; j++) System.out.print(n-j);
            System.out.println();
        }
        
    }
}