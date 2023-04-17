//write a program to find out whether a given integer is present in an array or not;
package OOPs_Concept.Array;
public class ArrayTest {
    public static void main(String[] args) {
        int[] number = {78,2,58,45,9};
        System.out.println("given integer is present or not in array");
        int a=45;
        for(int integer : number){
            if(integer==a) {
            }
            break;
        }
        System.out.println("present");
    }
}
