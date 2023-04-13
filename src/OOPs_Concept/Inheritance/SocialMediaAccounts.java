// HAS-A relationship ...write once and use any where
//when you want use the part of functionality then u should go for HAS-A relationship
package OOPs_Concept.Inheritance;
public class SocialMediaAccounts {
    void facebook(){
        System.out.println("we can upload photos to facebook");
    }
    void Watsapp(){
        System.out.println("we can chat with others on watsapp");
    }
    void Instagram(){
        System.out.println("on instagram we can share reels to others");
    }
}
class NewTechnology{
    public static void main(String[] args) {
        System.out.println(" in today's era , so many new technology have come,due to which our work has become very easy ");
        System.out.println("we can learn any skills from youtube ");
        System.out.println("we can tweet our thoughts on twitter");
        SocialMediaAccounts obj = new SocialMediaAccounts();
        obj.facebook();
        obj.Watsapp();
    }
}
