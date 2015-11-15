import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class PrintNumberInWord {   
   public static void main(String[] args) {
      String input; char c; 
   System.out.println("Enter integer number "); 
   Scanner scan = new Scanner(System.in);
   input = scan.next();
  
   		
   for (int i = 0; i < input.length(); i++) {
	   c = input.charAt(i);
	  if (c == '0') 
	  {
		  System.out.print(" Zero ");
	  }
	  else if (c == '1') {
		  System.out.print(" One ");
	  }
	  else if (c == '2') {
		  System.out.print(" Two ");
	  }
	  else if (c == '3') {
		  System.out.print(" Three ");
	  }
	  else if (c == '4') {
		  System.out.print(" Four ");
	  }
	  else if (c == '5') {
		  System.out.print(" Five ");
	  }
	  else if (c == '6') {
		  System.out.print(" Six ");
	  }
	  else if (c == '7') {
		  System.out.print(" Seven ");   
	  }
	  else if (c == '8') {
		  System.out.print(" Eight ");
	  }
	  else if (c == '9') {
		  System.out.print(" Nine ");
	  }
   
	  else {
		 System.out.print(" OtherSymbol ");
	  
   	 }
   		}
   			}
	}