import java.util.Scanner;
/**
 * Donte' Brown
 * M5HW1
 * 11-13-24
 */
public class M5HW1_Brown 
{
    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        String choice = "yes";

        while (choice.equalsIgnoreCase("yes"))
        {
            int score, count = 0, number, result = 0;
            double average;
            char grade;

            System.out.print("How many scores will you enter?: ");
            score = k.nextInt();
            do
            {
                count++;
                System.out.print("Enter score #" + count + ": ");
                number = k.nextInt();

                while(number < 0 || number > 100)
                {
                    System.out.println("Invalid score entered! Please re-enter: ");
                    System.out.println("Score must be from 0 - 100!");
                    System.out.print("Enter score #" + count + " again: ");
                    number = k.nextInt();
                }
                result += number;
            }
            while(count < score);

            average = result / score;
            
            if (average >= 90)
            {
                grade = 'A';
            }
            else if (average >= 80)
            {
                grade = 'B';
            }
            else if (average >= 70)
            {
                grade = 'C';
            }
            else if (average >= 60)
            {
                grade = 'D';
            }
            else
            {
                grade = 'F';
            }
            
            System.out.println("Grade is " + grade);

            System.out.print("Would you like to run the program again? Enter yes or no: ");
            choice = k.next();
        }
        System.out.println("Program has exited!");
        k.close();
    }
}