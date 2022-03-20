//and operator  -- all conditions must be true (&&)
//wap to check if total sales>50000 and experience>5 year so eligible for bonus
//else not eligible 


package Function;
import java.util.Scanner;
public class Andproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sales,exp;
		Scanner g = new Scanner(System.in);
				System.out.println("Enter sales done");
		sales=g.nextInt();
		System.out.println("Enter exp");
		exp=g.nextInt();
		
		if(sales>50000 && exp>5)
		{
			System.out.println("Eligible fo bonus");
		}
		else
		{
			System.out.println("Not eligible");
		}
		

	}

}
