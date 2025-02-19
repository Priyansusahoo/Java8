/**
 * Topic : Sorting of Our own class Objects with Lambda Expressions
 */
import java.util.*;
class Main {
    public static void main(String[] args) {
        /*Employee e1 = new Employee(100, "Priyansu");
        System.out.println(e1);*/
        
        ArrayList<Employee> empList = new ArrayList<Employee>();
        
        empList.add(new Employee(104, "Broly"));
        empList.add(new Employee(105, "Zeno"));
        empList.add(new Employee(106, "Priyansu"));
        empList.add(new Employee(101,"Thanos"));
        empList.add(new Employee(102, "DoomsDay"));
        empList.add(new Employee(103, "GokuBlack"));

        System.out.println("Before Sorting :");
        System.out.println(empList);
        
        System.out.println("Before Sorting :");
        // Customized Sorting for Custom Class using Lambda Expression
        Collections.sort(empList, (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0); // -------------------------> Imp
        
        System.out.println(empList);
    }
}

class Employee {
    int eno;
    String ename;
    
    Employee(){}
    
    Employee(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }
    
    @Override
    public String toString(){
        return eno + ":" + ename;
    }
}