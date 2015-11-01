import java.util.Scanner;

/**
 * Created by Anastasiya on 01.11.2015.
 */
public class Homework1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, n = 0;
        int[] array;
        int length = 0;
        System.out.println("Enter length of array");
        length = scan.nextInt();
        int door = length - 1;
        System.out.println("Fill array with " + length + " values." );
        array = new int[length];
        for (i =  0; i < length; i++ )
            array[i] = scan.nextInt();
        for (i = 0; i < length-1; i ++)
        {
            if (array[i] != array[i + 1])
            {
                n += 1; //скоращенная n:=n+1
            }
        }
        //System.out.println(n);
        if (n == 0)
        {
            System.out.println("The number of repetitions: 1" );
        }
        else
        {
            System.out.println("The number of repetitions: " + (door - n));
        }
    }

}