package Basic_Concept;
class BasicExample_Pen {
    //Properties of pen (yhan pen ak objec he ,or object ki kuch properties or method jarur hoti he )
    String color;
    String type;
    //Functionality of pen
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        //(ak class me jab 2 object banaye jate he,tab hm method me this keyword ka use karte hen,this keyword ye show
        //karta he ki current me us method ko ,kis object ne call kia he,kis object ke according value print karni he)
        System.out.println("color of pen is"+".."+this.color);
    }
}
class OOPS{
    public static void main(String[] args) {
        //yhan hm BasicExample_Pen ke 2 object banayenge
        BasicExample_Pen pen1 = new BasicExample_Pen();
        BasicExample_Pen pen2 = new BasicExample_Pen();
        pen1.color="blue";
        pen1.type="ballpen";
        pen2.color="black";
        pen2.type="gelpen";
        pen1.printColor();
        pen2.printColor();
    }
}
