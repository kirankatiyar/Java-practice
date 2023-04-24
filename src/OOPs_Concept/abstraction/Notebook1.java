//multiple interface..
package OOPs_Concept.abstraction;
interface Notebook1 {
    public abstract void pages();
}
interface Notebook2 {
    public abstract void quality();
}
class Stationary implements Notebook1,Notebook2{
    public void pages(){
        System.out.println("Notebook1 pages no is 250 ");
    }
    public void quality(){
        System.out.println("Notebook2 pages quality are good");
    }
}
class Main{
    public static void main(String[] args) {
        Stationary s = new Stationary();
        System.out.println("About Notebook1 and Notebook2");
        s.pages();
        s.quality();
    }
}

