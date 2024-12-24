// package Interfaces;

interface area {
  public double calarea();
}
class circle_area implements area {

  private double radius;

  circle_area(double r){
    this.radius=r;
  }

  public double calarea() {
    return Math.PI*radius*radius;
  }
}

class rect_area implements area{

  private double len;
  private double br;

  rect_area(double l,double b){
    this.br=b;
    this.len=l;
  }

  public double calarea(){
    return len*br;
  }

}


public class solve {
  public static void main(String[] args) {

    area c=new circle_area(7);
    area r=new rect_area(2,4);

    System.out.println((int)r.calarea());
    System.out.printf("%.2f",c.calarea());
    System.out.println();
    System.out.println((int)c.calarea());
  }
}
