package sixthquestion;
import java.util.Scanner;
public class TypeOfNumber {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println(" Enter Your Number");
		float a= sc.nextFloat();
		
		if (a<0)
		{
			System.out.println("Your Number Is Negative");
		}else if (a==0)
		{
			System.out.println("Your Number Is Zero");
		}else
			
			System.out.println("Your Number Is Positive");

	}

}
