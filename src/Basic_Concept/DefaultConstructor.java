package Basic_Concept;
class DefaultConstructor {
    String name; //instance variable
    int age;    //instance variable
    public static void main(String[] args) {
        System.out.println("compiler itself calls the default constructor after creating object");
        DefaultConstructor obj = new DefaultConstructor();
        System.out.println("As Whenever the default constructor is called, it initilize the default value of the instance variable");
        System.out.println("instance variable is...name and age");
        System.out.println("show the output.....");
        System.out.println("instance variable..name"+"="+obj.name);
        System.out.println("instance variable..age"+"="+obj.age);
    }
}
