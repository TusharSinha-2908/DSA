import java.util.*;

public class TestClass {
    public static void main(String[] args) {

        int n = 5;

        for(int i=1; i<=4; i++,n-=2)
        {
            int j;

            for(j=1; j<=i; j++) System.out.print(j);

            for(int k = j, l = j+n; k<l; k++,j++) System.out.print(" ");

            for(;j<=7; j++) System.out.print(j);

            System.out.println();
        }

        n = 1;
        for(int i=5; i<=7; i++,n+=2)
        {
            int j;

            for(j=1; j<i-n; j++) System.out.print(j);

            for(int k = j, l = j+n; k<l; k++,j++) System.out.print(" ");

            for(;j<=7; j++) System.out.print(j);

            System.out.println();
        }


    }
}