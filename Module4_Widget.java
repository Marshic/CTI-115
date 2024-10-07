/**
 * Module4_Widget
 */
import java.util.Scanner;
public class Module4_Widget
{

    public static void main(String[] args) 
    {
       //variables
       int quarter1, quarter2, quarter3, quarter4, annual_Widgets;
       double salesTax, salesAmount, total;
       final double TAX = .07, PRICE = 4.79;
       // create scanner variable to hold input form the keyboard
       Scanner keyboard = new Scanner(System.in);
       
       //input
       System.out.print("Enter sales for quarter one: ");
       quarter1 = keyboard.nextInt();
       System.out.print("Enter sales for quarter two: ");
       quarter2 = keyboard.nextInt();
       System.out.print("Enter sales for quarter three: ");
       quarter3 = keyboard.nextInt();
       System.out.print("Enter sales for quarter four: ");
       quarter4 = keyboard.nextInt();

       // calculations
        annual_Widgets = quarter1 + quarter2 + quarter3 + quarter4;
        salesAmount = annual_Widgets * PRICE;
        salesTax = salesAmount * TAX;
        total = salesAmount + salesTax;



        // output
        System.out.println("Annual Widgets Sold: " + annual_Widgets);
        System.out.println("Widgets Sales: " + salesAmount);
        System.out.println("Sales Tax Collected: " + salesTax);
        System.out.println("Total Amount: " + total);
        keyboard.close();





       // System.out.println("10/7/24");
    }
}