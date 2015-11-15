import java.util.Scanner;

public class KeyboardScanner {
	public static void main (String[] args) {
		int num1;
		double  sum, num2;
		String name;
		
		Scanner in = new Scanner(System.in);
		System.out.println ("Enter integer number: ");
		num1 = in.nextInt();
		System.out.println ("Enter real number: ");
		num2 = in.nextDouble();
		System.out.println ("Enter your name:  ");
		name = in.next();
		double num3 = (double) num1;
		sum = num2 + num3;
		System.out.println("Hello, " + name + ", summa " + num1 + " + " + num2 + " = " + sum );
	}
}
