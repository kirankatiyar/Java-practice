//calculate the Sum and Average of Array Elements....
package OOPs_Concept.Array;
public class OneDArray {
    public static void main(String[] args) {
        double sum=0 ;
        double avg=0 ;
        int l;
        int[] number = {25,58,36,47,23};  //Array
        for(int element:number){
            sum = sum+element;
        }
        System.out.println("Sum of the Array element is:"+sum);
        System.out.println("calculate the average");
        System.out.println("Average = {Sum of Array elements} ÷ {Total number of Array elements}");
        System.out.println("sum of Array elementis :"+sum);
        l=number.length;
        System.out.println("length of Array is:"+l);
        avg=sum/l;
        System.out.println("Avrage of the Array element is:"+avg);
    }
}
