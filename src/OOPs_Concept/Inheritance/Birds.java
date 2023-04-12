package OOPs_Concept.Inheritance;
// feild and method of super class
public class Birds {
    String name;
    String colour;
    public void eat(){
        System.out.println("i eat my favourite fruits");
    }
}
// new mathod of subclass && Sparrow class inherite class Birds
class Sparrow extends Birds{
    public void fly(){
        System.out.println("i am fly in the sky ");
    }
    public void display(){
        System.out.println("my name  is"+"........."+name);
        System.out.println("my colour is"+"......."+colour);
    }
}
// main class
class Main{
    // main method
    public static void main(String[] args) {
        System.out.println("hii....i am innocent bird & guess my name");
        // create the object of subclass (Sparrow class )
        Sparrow s = new Sparrow();
        // access the feild of super class
        s.name="angel";
        s.colour="light_brown";
        //call the method of parent class
        s.display();
        s.eat();
        //call the method of child class
        s.fly();
        System.out.println("i am so inocent");
    }
}
