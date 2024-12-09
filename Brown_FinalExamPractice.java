import java.util.Scanner;
public class Brown_FinalExamPractice 
{

    public static void main(String[] args) 
    {
    // Calls from the main
        Scanner in = new Scanner(System.in);
        displayInfo();
        double payrate = getRate(in);
        double hours = getHours(in);
        double grosspay = calculateGrossPay(payrate, hours);
        displayRHGrosspay(payrate, hours, grosspay);
        in.close();

    
    }
    public static void displayInfo()
    {
        System.out.println("Name: Donte' Brown");
        System.out.println("December 19th 2024");
        System.out.println("This program calculates gross pay");
    }
    public static double getRate(Scanner in)
    {
        System.out.print("Enter the payrate: ");
        double payrate = in.nextDouble();
        return payrate;
    }
    public static double getHours(Scanner in)
    {
        System.out.print("Enter the amount of hours worked: ");
        double hours = in.nextDouble(); 
        return hours;
    }
    public static double calculateGrossPay(double payrate, double hours)
    {
        return payrate * hours;
    }
    public static void displayRHGrosspay(double payrate, double hours, double grosspay)
    {
        System.out.println("Payrate: $" + String.format("%.2f", payrate));
        System.out.println("Hours worked: " + hours);
        System.out.println("Grosspay: $" + String.format("%.2f", grosspay));
    }
}