import java.util.*;

public class TestClass {
    public static void main(String[] args) {

        int n=3;

        for(int i=0; i<5; i++)
        {
            if(i<3) for(int j=0; j<i; j++) System.out.print(" ");
            else for(int j=5-i-1; j>0; j--) System.out.print(" ");

            System.out.print(i+1);

            if(i<3)
            {   for(int j=0; j<n; j++) System.out.print(" ");
                n-=2;
            }
            else
            {
                if(n<0) n=1;
                for(int j=0; j<n; j++) System.out.print(" ");
                n+=2;
            }

            if(i!=2)System.out.print(i+1);

            System.out.println();
        }

    }
}