// Inheritance .....Is a relationship
package OOPs_Concept.Inheritance;
public class ElectronicItem {
    void display(){
        System.out.println("it is a electronic item");
    }
    void show(){
        System.out.println("it work byabstract class vehicle electricity");
    }
    void useful(){
        System.out.println("its soo useful");
    }
}
class Refrigerator extends ElectronicItem {
    String cnm;
    int p;

    void work() {
        System.out.println("Refrigerator company name :" + "...." + cnm);
        System.out.println("LG Refrigerator price:" + "...." + p);
        System.out.println("Refrigerator keep fruits and food cool ");
    }
}
class NewMain {
    public static void main(String[] args) {
        Refrigerator r = new Refrigerator();
        System.out.println("1st item ****************");
        System.out.println("Refrigerator");
        r.cnm = "LG";
        r.p = 23000;
        r.work();
        r.display();
        r.show();
        r.useful();
    }
}
