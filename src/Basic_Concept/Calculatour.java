//Parametrized Constructor...
package Basic_Concept;
public class Calculatour {
    //variable declaration
    int a,b;
    // creat an constructor
    Calculatour(int a , int b )
    {
        this.a = a ;
        this.b = b ;
    }
    int add = a+b;
    int sub = a-b;
    int multi = a*b;
    public static void main(String[] args) {
        //create an object nd Asighn the vale of object
        Calculatour numerical = new Calculatour ( 50 , 10 );
        System.out.println("addition of a+b = add ");
        System.out.println("subtraction of a-b = sub ");
        System.out.println("multiplication of a*b = multi ");
    }
}
