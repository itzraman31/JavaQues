class CarProp {
    String color;
    int speed;
    String engine;

    CarProp() {
        System.out.println("Hey i am without argument constructor");
    }

    CarProp(String color, int speed, String engine) {
        this.color = color;
        this.speed = speed;
        this.engine = engine;
    }

    public void display() {
        System.out.println("Color of Car is: " + color);
        System.out.println("Speed of Car is: " + speed);
        System.out.println("Engine of Car is: " + engine);
    }

}

class SuperCar extends CarProp {
    int Maxspeed;

    SuperCar(int Maxspeed, String color, int Speed, String engine) {
        super(color, Speed, engine);
        this.Maxspeed = Maxspeed;
    }

    void displayAllProp() {
        System.out.println("MaxSpeed of Car is: " + Maxspeed);
        System.out.println("Color of Car is: " + color);
        System.out.println("Speed of Car is: " + speed);
        System.out.println("Engine of Car is: " + engine);
    }
}

public class Car {
    public static void main(String[] args) {
        SuperCar car = new SuperCar(359, "White", 90, "SuperBooster");
        // car.displayAllProp();
        car.display();
    }

}