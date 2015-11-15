import java.util.Scanner;

public class CheckOddEven {
	public static void main (String [] args) {
		int num, countEven = 0, countOdd = 0;
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			if (scan.hasNextInt()) 
			{
				num = scan.nextInt();
			
				if ( num % 2 == 0 ) 
				{
					countEven += 1;
				}
				else 
				{
					countOdd += 1;						
				}					
			}
			else 
			{
				if(scan.hasNext("end"))
				{	 	
					 System.out.println("Count of even numbers is " + countEven + "; Count of odd numbers is " + countOdd);
					 break;
				}			
				else 
				{	System.out.println("Error! You have to enter only number. Try fill it again, please. " );
					scan.nextLine();
					continue;
					
				}
				
			}
			
		}
	}

}
