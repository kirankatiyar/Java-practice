package OOPs_Concept.Polymorphism;

public class MethodOverriding {
    void display(String mna){
        System.out.println("my name is...:="+mna);
    }
}
class Override extends MethodOverriding{
    void display(String sna){
        System.out.println("my son name is...:="+sna);
    }
}
class Main2{
    public static void main(String[] args) {
        MethodOverriding obj1 = new MethodOverriding();
        Override obj2 = new Override();
        System.out.println("namme of me nd my son is....");
        obj1.display("Kiran_katiyar");
        obj2.display("Pratyush_katiyar");
    }
}
