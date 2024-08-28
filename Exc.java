import.java.util.Scanner;
class Exc{
    public static void Main(String args[]){
    Scanner sc = new Scanner(System.in)
    System.out.println("Program Started:");
    int dividend[]=new int[7];
    int divisor[]=new int[];
    int remainder;
        for(int j=0;j<7;j++){
         dividend[j] = sc.nextInt(System.in);
        }
        System.out.println("Your  five divisior's:");
        divisior[j]=sc.nextInt(System.in);
        System.out.println("your Solution is:");
        for (int j=0;j<7;j++){
            try{
                remainder[]=dividend[j]/divisior;
                System.out.println("Remainder is:");
            }
            catch(Execption e){
                System.out.println("Number is not divisible by 0 ");

            }
        }
        System.out.println("Program Ended without an error.");

    }
}