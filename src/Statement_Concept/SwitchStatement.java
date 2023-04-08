package Statement_Concept;
import java.util.Scanner;
class SwitchStatement {
    public static void main(String[] args) {
        int a=10,b=20;
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER User Choice");
        int uch = s.nextInt();
        switch(uch) {
            case 1:
                System.out.println("Sum of a & b is:= "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction of a & b is:=  "+(a-b));
                break;
            case 3:
                System.out.println("multiplication of a & b is:= "+(a*b));
                break;
            case 4:
                System.out.println("Division of a & b is:= "+(a/b));
                break;
            default: System.out.println("Invalid choice");
        }
    }
}
