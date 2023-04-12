package OOPs_Concept.Polymorphism;

public class MethodOverloading {
    void show(String num){
        System.out.println("my name is..:="+num);
    }
    void show(int a){
        System.out.println("my age is....:="+a);
    }
    void show(String dis ,int c){
        System.out.println("district...:="+dis);
        System.out.println("house no...:="+c);
    }
    void show(char d,int b) {
        System.out.println("my id no is ....:="+b);
        System.out.println("my name is started with letter...:="+d);
    }
}
class Main{
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println("personal details");
        obj.show("kiran_katiyar");
        obj.show(30);
        obj.show("bhopal",84);
        obj.show('k',1256);
    }
}
