interface basicAnimal{
    void eat();
    void sleep();
}
class monkey{
    void jump(){
        System.out.println("I am jumping");
    }
    void bite(){
        System.out.println("I will bite you");
    }
}

class human extends monkey implements basicAnimal{
    void speak(){
        System.out.println("I am speaking my name");
    }

    @Override
    public void eat(){
        System.out.println("I am eating pizza");
    }
    @Override
    public void sleep(){
        System.out.println("I am sleeping for now");
    }
}
public class Human_Monk {
    public static void main(String[] args) {
        // human h=new human();
        // h.sleep();
        // h.eat();

        basicAnimal ba=new human();
        ba.sleep();
    }
}
