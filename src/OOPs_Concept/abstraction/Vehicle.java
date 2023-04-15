// java abstraction by abstract class
package OOPs_Concept.abstraction;
abstract class Vehicle {
    abstract void start();
}
class car extends Vehicle {
    void start(){
        System.out.println("with the key");
    }
    public static void main(String[] args) {
        System.out.println("how we can start car");
        car s = new car();
        s.start();
    }
}
