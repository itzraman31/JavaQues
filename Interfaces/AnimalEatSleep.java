// package Interfaces;
public class AnimalEatSleep {
    
    public static interface EatSleep {
        public void sleep(String s);
        public void eat(String s1);
    }

    public static class EatSleepclass implements EatSleep {

        public void sleep(String s){
            System.out.println("Yes i do sleep on:" + s);
        }
        
        public void eat(String s1){
            System.out.println("Yes i eat:" + s1);
        }
        
    }
    public static void main(String args[])
    {
        EatSleep dog=new EatSleepclass();

        dog.eat("Biscuits");
        dog.sleep("9'O Clock");
    }
}
