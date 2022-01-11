import java.util.*;

public class TestClass {
    public static void main(String[] args) {

        int n=7;

        for(int i=0; i<5; i++,n-=2)
        {
            for(int j=0; j<i; j++) System.out.print(" ");
            System.out.print((char)('E'-i));
            for(int j=0; j<n; j++) System.out.print(" ");
            if(i!=4)System.out.print((char)('E'-i));
            System.out.println();
        }

    }
}