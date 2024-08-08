import java.util.Scanner;
interface Client
{
    void input();
    void output();
}
class My_info implements Client{
    String name;
    double salary;
    public void input(){
        Scanner sc = new Scanner (System.in);
 System.out.println("ENTER YOUR NAME");
name = sc.next();
        System.out.println("ENTER YOUR SALARY:");
        
        salary=sc.nextDouble();
    }
    public void output(){
	 System.out.println("ENTER YOUR NAME" + name);
        System.out.println("ENTER YOUR SALARY:" + salary);
       
    
}
public static void main(String[] args){
    Client c1 = new My_info();
    c1.input();
    c1.output();
}
}