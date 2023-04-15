//   SUM OF TOW MATRIX .....
package OOPs_Concept.Array;
import java.util.Scanner;
public class DemoAddMatrix {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF FIRST MATRIX A");
        for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.print("ENTER THE NUMBER OF SECOND MATRIX B");
        for (int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("MATRIX A");
        for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("MATRIX B");
        for (int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("sum of matrix a nd b");
        for (int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j]=(a[i][j]+b[i][j]);
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
