package Basic_Concept;
public class ParametrizedConstructor_Student {
//properties of student
    String name;
    int age;
    // method
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Non parametrized constructor(constructor ka name hmesha class ke name ke jesa hota he)
    ParametrizedConstructor_Student(String nm ,int ag){
        //initilize the value of vareables
        this.name=nm;
        this.age=ag;
    }
}
class New{
    public static void main(String[] args) {
        ParametrizedConstructor_Student object = new ParametrizedConstructor_Student("kiran",31);
        object.printInfo();
    }
}
