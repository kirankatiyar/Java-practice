package OOPs_Concept.Array.CharacterArray;
public class CharArrayDemo {
    public static void main(String[]args){
        //declaration & initilization of character array
        char[] alphabet = new char[5];
        alphabet[0]='a';
        alphabet[1]='b';
        alphabet[2]='c';
        alphabet[3]='d';
        alphabet[4]='e';
        //itrate all characters of array by for_each loop
        for(char c:alphabet){
            System.out.print(c+" ");
        }
    }
}
