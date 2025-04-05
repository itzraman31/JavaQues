import java.util.*;

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

        // obj.name="Hello world";
        // System.out.println(obj.name);
        
        // changeObj(obj);
        // System.out.println(obj.name);

        System.out.println(obj.getSalary());
        
        setSalaryftn(obj, 500);
        System.out.println(obj.getSalary());

    }
}
