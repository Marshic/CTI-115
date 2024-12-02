/**
 * cw120224_functions
 */
import java.util.Scanner;
public class cw120224_functions 
{

    public static void main(String[] args) 
    {
        // all calls will come from main()
        Scanner in = new Scanner(System.in);
        int number = getNumGrades(in);
        int tot = getGrades(in, number);
        double ave = getAverage(number, tot);
        System.out.println(ave);
        in.close();

    }
    public static int getNumGrades(Scanner in)
    {
        System.out.print("Enter the # of grades to average: ");
        int num = in.nextInt();
        return num; //need to change this to a variable
    }
    public static int getGrades(Scanner in, int n)
    {
        int i, grade, total = 0;
        for(i =0; i < n; i++)
        {
            System.out.print("Enter a grade: ");
            grade = in.nextInt();
            total += grade;
        }
        return total;
    }
        public static double getAverage(int num, double total)
    {
        return total / num;
        //double average = total/ num;
        // return average;
    }
}
