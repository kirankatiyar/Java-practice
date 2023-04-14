//multilevel inheritance;
package OOPs_Concept.Inheritance;
public class Facebook {
    String num="kiran_katiyar";
    int age=30;
    String ccty="bhopal";
    String homt="dewas";
    void personal_details(){
        System.out.println("my name is:"+num);
        System.out.println("my age is:"+age);
        System.out.println("my curent city:"+ccty);
        System.out.println("my home town:"+homt);
    }
    void show1(){
        System.out.println("i like facebook");
    }
}
class whatsapp extends Facebook {
    void show2(){
        System.out.println("watsapp app is so useful");
    }
    void status(){
        System.out.println("change whatsapp ststus in 24 hrs");
    }
}
class Instragram extends whatsapp{
    void show3(){
        System.out.println("instragram  is very intreasting app");
    }
    void papular(){
        System.out.println("instragram is very papullar app ");
    }

}
class Twitter extends Instragram{
    void show4(){
        System.out.println("twitter is educational app");
    }
}
class EInheritance {
    public static void main(String[]args){
        Twitter s=new Twitter();
        s.personal_details();
        s.show1();
        s.show2();
        s.status();
        s.show3();
        s.show4();
        s.papular();
    }
}
