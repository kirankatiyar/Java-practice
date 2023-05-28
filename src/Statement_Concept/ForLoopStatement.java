package Statement_Concept;
public class ForLoopStatement {
    int[] arr = new int[10];
    int a=18;
    int b=1;
    public void logic(){
        for(int i=0;i<arr.length;i++){
            arr[i]=a*b;
            b++;
        }
        System.out.println("table of 18 is:= ");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args) {
        ForLoopStatement refobj = new ForLoopStatement();
        refobj.logic();
    }
}
