package OOPs_Concept;

public class TwoWheelarVehical {
    void engineParts(String[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
class Activa extends TwoWheelarVehical {

    void bodyParts(String[] b){
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);}
    }
}
class Main{
    public static void main(String[] args) {
        String[] a= {"Pistons","Connecting" ,"Crankshaft","Spark_Plugs","Engine_Valves","Cooling_System"};
        String[] b= {"Kick_Lever","Horn","Handle_Bar","Clutch_wire","Brake_Shoe","Battery"};
        Activa obj = new Activa();
        System.out.println("Activa is a two wheelar vehical");
        System.out.println("Activa engine parts");
        obj.engineParts(a);
        System.out.println(" ");
        System.out.println("Activa Body Parts");
        obj.bodyParts(b);
    }
}
