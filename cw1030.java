/**
 * cw1030
 * Program will demo reppetition structures
 */
import java.util.Scanner;
public class cw1030 
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        /*String choice = "yes";
        while (choice.equalsIgnoreCase("yes"))
        {
            System.out.println("Donte'");
            System.out.print("Would you like to run the program again? Enter yes or no: ");
            choice = k.next();
        }
        System.out.println("Program has exited!");
        */

        System.out.print("Enter nubmer of grades to average: ");
        int num = k.nextInt();
        int count;
        double total = 0; // accumulator must be initialized zero
        for(count = 0; count < num; count++)
        {
            System.out.print("Enter a grade: ");
            int grade = k.nextInt();
            total += grade; // total = grade + total
        }
        System.out.println(total);
        k.close();
    }
}