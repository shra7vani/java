import java.util.Scanner;

public class Operation
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("choose Operation");
			System.out.println("1.Arithmatic Operation");
			System.out.println("2.Stastical Operation");
			System.out.println("3.Trignometric Operation");
			System.out.println("4.Exit");
		
		int URChoice = sc.nextInt();
		switch(URChoice)
		{
			case 1: 
			System.out.println("ENTER  TWO THE NUMBERS");
			double num1= sc.nextDouble();
			double num2 = sc.nextDouble();
			
			System.out.println(" 1.Addition :" + (num1+num2));
			System.out.println(" 2.Subtraction :" + (num1-num2));
			System.out.println(" 3.Product:" + (num1*num2));
			System.out.println(" 4.Quotient :" + (num1/num2));
			break;
			
			
			case 2:
			//average
			 System.out.println("Enter the number of values: ");
			int count = sc.nextInt();

			double sum = 0;

			for (int i = 0; i < count; i++) 
		{
            System.out.println("Enter number : " + (i + 1));
            double number = sc.nextDouble();
            sum += number;
		}

        double mean = sum / count;
		

        System.out.println("The mean is: %.2f%n" + mean);
		
		/*variance
        double varianceSum = 0;
        for (double number : numbers)
		{
            varianceSum += Math.pow(number -mean, 2);
        }
        double variance = varianceSum / count;  
        System.out.println("The variance is: %.2f%n", + variance);*/
		break;
		
			case 3:
			System.out.println("Enter angle in degree:");
			double angle=sc.nextDouble();
			double rad = Math.toRadians(angle);
			System.out.println("Sine:" + Math.sin(rad));
			System.out.println("Cosine:" + Math.cos(rad));
			System.out.println("Tangent:" + Math.tan(rad));
			break;
			
			case 4:
			System.out.println("exit");
			sc.close();
			System.exit(0);
			break;
			
			default:
			System.out.println("INVALID");
		}
	}
}
}


		
