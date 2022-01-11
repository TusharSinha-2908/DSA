import java.util.*;

public class TestClass {
    public static void main(String[] args) {

        int n=1;
        for(int i=1; i<=5; i++)
        {
            for(int j=0; j<5-i; j++) System.out.print(" ");

            if(i==1) System.out.print("1");
            else
            {   System.out.print(i);
                for(int j=n; j>0; j--) System.out.print(" ");
                System.out.print(i);
                n+=2;
            }
            System.out.println();
        }

        n-=4;

        for(int i=4; i>0; i--)
        {
            for(int j=0; j<5-i; j++) System.out.print(" ");

            if(i==1) System.out.print("1");
            else
            {   System.out.print(i);
                for(int j=n; j>0; j--) System.out.print(" ");
                System.out.print(i);
                n-=2;
            }
            System.out.println();
        }

    }
}