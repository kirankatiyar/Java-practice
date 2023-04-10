package Basic_Concept;
import java.util.Scanner;
public class ExmpleOprators {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter two no");
        int a=s.nextInt();
        int b=s.nextInt();
        // ARITHMETIC OPRATORS
        int h=a+b;
        int m=a-b;
        int n=a*b;
        int o=a/b;

        System.out.println("addition:=...."+h);
        System.out.println("subtraction:=...."+m);
        System.out.println("multiplicational:=...."+n);
        System.out.println("division:=...."+o);
        System.out.println("increament of a is:=..."+(++a));
        System.out.println("decreament of a is:=...."+(--a));
        System.out.println("increament of b is:=...."+(++b));
        System.out.println("decreament of b is:=...."+(--b));
    }
}
