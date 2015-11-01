import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Anastasiya on 01.11.2015.
 */
public class Homework2 {
    public static void main(String[] args) {
        System.out.print("Enter the number of students ");
        Scanner scan = new Scanner(System.in);
        int length = 0, n = 0;
        int[] array;
        length = scan.nextInt();
            System.out.println("Enter marks of students ");
            array = new int[length];
            for (int i = 0; i<length; i++)
            {
                array[i] = scan.nextInt();
            if (array[i] == 2)
                {
                    n +=1;
                }
            }
        if ( n == 0 )
        {
            System.out.println("All of students have passed the exam.");
        }
        else
        { System.out.println(n + " students who haven't passed the exam.");
        }
    }
}
