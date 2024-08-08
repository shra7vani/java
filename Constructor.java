import java.util.Scanner;
class Employee
{
String name;
double salary;
int id;
Employee( String em_name,double em_salary,int em_id){
    this.name = em_name;
    this. salary = em_salary;
    this.id= em_id;
}
String getname(){
return name;
}
double getsalary(){
    return salary;
}
void raisesalary(){
    salary=salary*1.10;
}
int getid(){
    return id;
}
}
class Constructor{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String Name;
    double Salary;
    int ID;
     System.out.println("enter the Data:");
     System.out.println("Name:");
     Name=sc.next();
    System.out.println("emp_Salary:");
    Salary =sc.nextDouble();
    
    System.out.println("emp_id:");
    ID=sc.nextInt();
    Employee em = new Employee(Name,Salary,ID);
    System.out.println("Name"+em.getname());
    System.out.println("Salary"+em.getsalary());
    System.out.println("ID"+em.getid());
    em.raisesalary();
    System.out.println("updated salary:"+ em.getsalary());
}
}

