import java.util.Scanner;

/**
 * M4CW1_BrownDonte
 */
public class M4CW1_BrownDonte 
{

    public static void main(String[] args) 
    {
         // assign test score to a variable
        int testScore;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        testScore = k.nextInt();

        char grade;
        if (testScore >= 90 && testScore <= 100)
        {
        grade = 'A';
        }
        else if (testScore >= 80)
        {
        grade = 'B';
        }
        else if (testScore >= 70)
        {
        grade = 'C';
        }
        else if (testScore >= 60)
        {
        grade = 'D';
        }
        else
        {
        grade = 'F';
        }
        System.out.println("Grade is " + grade);
    }
}