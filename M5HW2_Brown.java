// Donte' Brown
//M5HW2
import java.util.Scanner;
public class M5HW2_Brown 
{

    public static void main(String[] args)
    {
        final double WIDGET_PRICE = 4.79, BASE_SALARY = 2000;
        String name;
        int widgets_sold, widgets_returned, weekly_sold, weekly_returned, net_widgets_sold;
        double widgets_sales_amt, commision_amt, salary, comm_rate;
        String user_response = "yes";
        Scanner in = new Scanner(System.in);

        while (user_response.equalsIgnoreCase("yes")) {
            widgets_sold = 0;
            widgets_returned = 0;

            System.out.print("Enter the salesperson's name: ");
            name = in.next();

            for (int week = 1; week <= 4; week++) {
                System.out.print("Enter the number of widgets sold for Week " + week + ": ");
                weekly_sold = in.nextInt();
                widgets_sold += weekly_sold;
            }


            for (int week = 1; week <= 4; week++) {
                System.out.print("Enter the number of widgets returned for Week " + week + ": ");
                weekly_returned = in.nextInt();
                widgets_returned += weekly_returned;
            }
            net_widgets_sold = widgets_sold - widgets_returned;
            widgets_sales_amt = net_widgets_sold * WIDGET_PRICE;


        if (net_widgets_sold <=100)
            comm_rate = .1;
        else if (net_widgets_sold < 200)
            comm_rate = .15;
        else if (net_widgets_sold < 300)
            comm_rate = .2;
        else
            comm_rate = .25;
        commision_amt = comm_rate * widgets_sales_amt;
        salary = commision_amt + BASE_SALARY;

            System.out.println("Sales Person: " + name);
            System.out.println("Widgets Sold: " + widgets_sold);
            System.out.println("Widgets Returned: " + widgets_returned);
            System.out.println("Net Widgets Sold: " + net_widgets_sold);
            System.out.println("Widgets Sales Amount: $" + widgets_sales_amt);
            System.out.println("Commission Amount: $" + commision_amt);
            System.out.println("Monthly Salary: $" + salary);

            System.out.print("Would you like to run the program again? Enter yes to run again or no to end the program: ");
            user_response = in.next();
        }

        System.out.println("Program has ended.");
        in.close();
    }
}
