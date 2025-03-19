// package Array;

class CarProp {
    String color;
    int speed;
    String engine;

    void Car(String color,int speed,String engine){
        this.color=color;
        this.speed=speed;
        this.engine=engine;
    }

    public void display(){
        System.out.println("Color of Car is: "+color);
        System.out.println("Speed of Car is: "+speed);
        System.out.println("Engine of Car is: "+engine);
    }
    
}

class SuperCar extends CarProp{
    int Maxspeed;
    void SuperCar(String color,int Speed,String engine){
       super Car(color, Speed, color);
    }
    public void SetMaxSpeed(int speed){
        Maxspeed=speed;
    }
    public void printMaxSpeed(){
        System.out.println("Max Speed is: "+Maxspeed);
    }
}
public class Car {
 public static void main(String[] args) {
    SuperCar car=new SuperCar("White",90,"Normal");
    car.SetMaxSpeed(200);
    car.display();
    car.printMaxSpeed();
 }

}