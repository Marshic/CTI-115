import java.util.Scanner;

/**
 * M7HW1_Brown
 */
public class M7HW1_Brown 
{
    public static void main(String[] args) 
    {
        runProgram();
    }
    public static void runProgram()
    {
        Scanner k = new Scanner(System.in);
        String keep_going = "yes";
        while(keep_going.equalsIgnoreCase("yes"))
            {
                displayInfo();
                int widgetSales = getSales();
                int widgetsReturned = getReturns();
                int netWidgets = calWidSold(widgetSales, widgetsReturned);
                double widgetSalesAmount  = calWidSalesAmt(netWidgets);
                double commision_amount = calComm(netWidgets, widgetSalesAmount, widgetSalesAmount);
                double salary = calSalary(commision_amount);
                displayValues(widgetSales, widgetsReturned, netWidgets, widgetSalesAmount, commision_amount, salary);
                // all calls to your function/methods should come from runProgram()  method only
                System.out.println();
                System.out.print("Do you want to run the program again? Enter yes or no: ");
                keep_going = k.next();
                System.out.println();
            }
    k.close();
    System.out.println("Program has terminated!");
    }
    public static void displayInfo()
    {
        System.out.println();
        System.out.println("Donte' Brown");
        System.out.println();
        System.out.println("M7HW1 Solution");
        System.out.println();
    }
    // create your functions/methods here
    public static int getSales()
    {
        int total = 0;
        int count, week = 0;
        Scanner k = new Scanner(System.in);
        for (count = 1; count < 5; count++)
        { 
            System.out.print("Enter the amount of widgets sold in week " + count + ": ");
            week = k.nextInt();
            total += week;
        }
        return total;
    }
    public static int getReturns()
    {
        int total = 0;
        int count, week = 0;
        Scanner k = new Scanner(System.in);
        for (count = 1; count < 5; count++)
        { 
            System.out.print("Enter the amount of widgets returned in week " + count + ": ");
            week = k.nextInt();
            total += week;
        }
        return total;
    }
    public static int calWidSold(int widgetSales, int widgetsReturned)
    {
        return widgetSales - widgetsReturned;
    }
    public static double calWidSalesAmt(int netWidgets)
    {
        return netWidgets * 4.79;
    }
    public static double calComm(int netWidgets, double widgetSalesAmount, double commissionRate)
    {
        if (netWidgets >= 0 && netWidgets <= 100)
            {
            commissionRate = 0.1;
            }
        else if (netWidgets > 100 && netWidgets < 200)
            {
            commissionRate = 0.15;
            }
        else if (netWidgets >= 200 && netWidgets < 300)
            {
            commissionRate = 0.2;
            } 
        else
            {
            commissionRate = 0.25;
            }   
        return widgetSalesAmount * commissionRate;
    }
    public static double calSalary(double commision_amount)
    {
        return 2000 + commision_amount;
    }
    public static void displayValues(int widgetSales, int widgetsReturned, int netWidgets, double widgetSalesAmount, double commision_amount, double salary)
    {
        System.out.println("Donte' Brown");
        System.out.println("Weekly Sales: " + widgetSales);
        System.out.println("Weekly Returns: " + widgetsReturned);
        System.out.println("Net Widgets Sold: " + netWidgets);
        System.out.println("Widget Sales Amount: $" + String.format("%.2f", widgetSalesAmount));
        System.out.println("Commission Amount: $" + String.format("%.2f", commision_amount));
        System.out.println("Monthly Salary: $" + String.format("%.2f", salary));
    }
}