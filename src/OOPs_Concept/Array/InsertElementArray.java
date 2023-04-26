//insert element in array  on second position.
package OOPs_Concept.Array;
public class InsertElementArray {
    public static void main(String[] args) {
        int[] a={25,36,98,12,45,78,362,9};
        int posi=2;
        int element=1000;
        System.out.println("Before insertion Araay ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=a.length-1;i>posi-1;i-- ){
            a[i]=a[i-1];
        }
        a[posi-1]=element;
        System.out.println(" ");
        System.out.println("After insertion Araay ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
