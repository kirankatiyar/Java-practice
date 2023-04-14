//write a java program sum of three numbers;
package Basic_Concept;
import java.util.Scanner;
public class Addition {
    int a, b, c;
    int sum;

    void show() {
        sum = a + b + c;
        System.out.println("sum of three no is:......=" + sum);
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("enter any three number");
        Addition s=new Addition();
        Scanner refobj =new Scanner(System.in) ;
        s.a=refobj.nextInt();
        s.b=refobj.nextInt();
        s.c=refobj.nextInt();
        s.show();
    }
}