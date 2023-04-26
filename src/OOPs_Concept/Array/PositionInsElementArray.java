//insert element in array on 5th Position.....
package OOPs_Concept.Array;
import java.util.Scanner;
public class PositionInsElementArray {
    public static void main(String[] args) {
        int position = 5;
        int element=1;
        int[] integer = new int[10];
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the element of array");
        for(int i=0;i<integer.length;i++){
            integer[i]=obj.nextInt();
        }
        System.out.println("show Array");
        for(int i=0;i<integer.length;i++){
            System.out.print(integer[i]+" ");
        }
        System.out.println(" ");
        System.out.println("insert a new element on 5th position ");
        for(int i=integer.length-1;i>position-1;i--){
            integer[i]=integer[i-1];
        }
        integer[position-1]=element;
        System.out.println("show Array after insertion");
        for(int i : integer){
            System.out.print(i+"  ");
        }
    }
}
