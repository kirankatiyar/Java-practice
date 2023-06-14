package OOPs_Concept.Array.CharacterArray;
import java.util.Arrays;
public class ArraysSortMethod {
    public static void main(String[] args) {
        // initializing unsorted char array
        char[] vowels = {'i','o','a','e','u'};
        // let us print all the values available in list
        System.out.println("unsorted char array");
        for(char v:vowels){
            System.out.println(v);
        }
        // sorting array from index 0 to 4
        Arrays.sort(vowels,0,4);
        // let us print all the values available in list
        System.out.println("char array with some sorted values(0 to 4) is");
        for(char w:vowels){
            System.out.println(w);
        }
        System.out.println("length of array is:="+vowels.length);
    }
}
