package OOPs_Concept.Array.CharacterArray;
import java.util.Arrays;
public class ConversionToCharacterFromString {
    public static void main(String[] args) {
        String value = "JavaTPoint"; //Enter String
        //Convert string to a char array.
        char[] array = value.toCharArray(); // Conversion to character from string
        for(char c : array) //Iterating array values
        {
            System.out.println(c);
        }
    }
}