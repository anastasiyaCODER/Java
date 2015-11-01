import java.util.Scanner;

/**
 * Created by Anastasiya on 01.11.2015.
 */
//1 2 3 2 2 2 3 3 3 4 7 7 6 7 7
    // 1 1 2 1 1 2 1 1 2 2 1 1 2 1 1
public class Homework {
    public static void main(String[] args) {
        System.out.println("Enter 15 values");
        Scanner scan = new Scanner(System.in);
        int i, n = 0, door = 14; //door - количество пробелов между числами
        int[] array;
        array = new int[15];
        for (i =  0; i < 15; i++ )
            array[i] = scan.nextInt();
        for (i = 0; i < 14; i ++)
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