

public class Employee {
    //constructor
    //1.1 same name as class name
    //1.2 No return type
    int employeeId;
    int salary;
    String dept;
    Employee(int empid,int sal, String d){
     employeeId=empid;
     salary=sal;
     dept = d;
    }
    public static void main(String[] args) {
        
        Employee harsha= new Employee(101,3000,"testing");
        Employee varsha= new Employee(102,5000,"engineering");
        System.out.println(harsha.employeeId+" salary "+harsha.salary+" Dept "+harsha.dept);
        System.out.println(varsha.employeeId+" salary "+varsha.salary+" Dept "+varsha.dept);
    } 
}
