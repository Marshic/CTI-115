/**
 * M7CW1_Brown
 */
import java.util.Scanner;
public class M7CW1_Brown 
{

    public static void main(String[] args) 
        {
            runMenu();
        }
        public static void runMenu()
    {
        Scanner in = new Scanner(System.in);
        String keep_going = "yes";
        while(keep_going.equalsIgnoreCase("yes"))
            {
                displayInfo();

                // all calls to your function/methods should come from runProgram()  method only
                int sideA = getSideA(in);
                int sideB = getSideB(in);
                double area = calArea(sideA,sideB);
                double hypotenuse = calHypotenuse(sideA,sideB);
                displayValues(sideA, sideB, area, hypotenuse);
                
                System.out.println();
                System.out.print("Do you want to run the program again? Enter yes or no: ");
                keep_going = in.next();
                System.out.println();
            }
            in.close();
        System.out.println("Program has terminated!");
        }
        public static void displayInfo()
        {
            System.out.println();
            System.out.println("Donte' Brown");
            System.out.println();
        }
        public static int getSideA(Scanner in )
        {
            System.out.print("Enter side A of the right triangle: ");
                int sideA = in.nextInt();
                return sideA; 
        }
        public static int getSideB(Scanner in )
        {
            System.out.print("Enter side B of the right triangle: ");
            int sideB = in.nextInt();
            return sideB; 
        }
        public static double calArea(double a, int b)
        {
            return (a*b)/2; 
        }
        public static double calHypotenuse( double a, double b )
        {
            // hypotenuse must be double in the Math.hypot() function so values are received as double not integers
            // this function has no errors
            return Math.hypot(a, b); 
        }
        public static void displayValues(int sideA, int sideB, double area, double hypotenuse)
        {
            System.out.println();
            System.out.println("Side A is " + sideA);
            System.out.println("Side B is " + sideB);
            System.out.println("Area is "+ area);
            System.out.println("Hypotenuse is " + hypotenuse);
            System.out.println();
        }
    }