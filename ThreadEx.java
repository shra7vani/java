import java.io.*;
import java.util.*;
 class MyThread extends Thread
 {
	public void run()
	{
		for(int i=1;i<=7;i++)
		{
			System.out.println("Thread  A Executing:" +i);
		
		try{
			Thread.sleep(90);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		}
	}
}
 class YourThread extends Thread
 {
	public void run()
	{
		for(int i=1;i<=7;i++)
		{
			System.out.println("Thread  B Executing:" +i);
		
		try{
			Thread.sleep(90);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		}
	}
}
	public class ThreadEx
	{
		public static void main(String[] args)
		{
			MyThread threadA = new MyThread();
			YourThread threadB = new YourThread();
			threadA.start();
			threadB.start();
		}
	}
	