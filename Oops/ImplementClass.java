
abstract class abs{
    abstract void greeting(String s,int a);
}
class Employee extends abs {
    String name;
    String postion;
    String dept;
    private int salary;

    int getSalary() {
        return salary;
    }
    void setSalary(int sal) {
        this.salary = sal;
    }

    @Override
    void greeting(String s,int a){
        System.out.println(s);
    }
}

public class ImplementClass {

    public static void changeObj(Employee e){
        e.name="Raman";
        return;
    }
    public static void setSalaryftn(Employee obj,int sal){
        obj.setSalary(sal);
        return;
    }
    public static void main(String[] args) {
        Employee obj = new Employee();

        System.out.println(obj.getSalary());
        
        setSalaryftn(obj, 500);
        System.out.println(obj.getSalary());
        obj.greeting("Good Night",0);

    }
}
