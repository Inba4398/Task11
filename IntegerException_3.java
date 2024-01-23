package Task11;
import java.util.Scanner;

public class IntegerException_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			// declare and initialize here.
			int a,b,c;
			Scanner SC=new Scanner(System.in);
			
			// input numbers here.
			System.out.print("Enter first number : ");
			a=SC.nextInt();
       
			System.out.print("Enter second number : ");
			b=SC.nextInt();
       
			//throw to catch
			c=a/b;
			System.out.println("Result:"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("Error:"+e);
		}
		// here program ends.
		System.out.println("End");
	}

	}

