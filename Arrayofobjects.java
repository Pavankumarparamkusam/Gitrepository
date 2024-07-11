import java.util.*;
class Employee {
    int empno;
    String name;
    String designation;
    float salary;
    Scanner sc=new Scanner(System.in);
    Employee(int empno,String name,String designation,float salary){
        this.empno=empno;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }
}
class Arrayofobjects{
    public static void main(String args[]){
        Employee e[]=new Employee[5];
        e[0]=new Employee(1,"sachin","manager",55000.56f);
        e[1]=new Employee(2,"rahul","asst.manager",45000.45f);
        e[2]=new Employee(3,"kapil","analyst",40000.23f);
        e[3]=new Employee(4,"sehwag","team leader",35000.34f);
        e[4]=new Employee(5,"dhoni","captain",100000.12f);
        for(int i=0;i<e.length;i++){
            System.out.println(e[i].empno+" "+e[i].name+" "+e[i].designation+" "+e[i].salary);
        }
    }
}