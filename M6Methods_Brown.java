
/**
 * M6Methods_Brown
 */
import java.util.Scanner;
public class M6Methods_Brown 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in); 
        runProgram(in);
        in.close(); 
    }

    public static void runProgram(Scanner in) {
        System.out.println("Method Project");
        String keep_going = "yes";
        while (keep_going.equalsIgnoreCase("yes")) {
            displayMenu(in);
            System.out.println();
            System.out.print("Do you want to run the program again? Enter yes or no: ");
            keep_going = in.next();
            System.out.println();
        }
        System.out.println("Program has terminated!");
    }

    public static void displayMenu(Scanner in) {
        System.out.println();
        System.out.println("Menu");
        System.out.println();
        System.out.println("1) M6HW1: ");
        System.out.println("2) M6HW2: ");
        System.out.println("3) M6HW3: ");
        System.out.println("4) Exit: ");
        System.out.println();
        System.out.print("Selection: ");

        switch (in.nextInt()) {
            case 1:
                getM6HW1();
                displayMenu(in);
                break;
            case 2:
                System.out.println("");
                System.out.println("You picked M6HW2");
                System.out.println("");
                displayMenu(in);
                break;
            case 3:
                System.out.println("");
                System.out.println("You picked M6HW3");
                System.out.println("");
                displayMenu(in);
                break;
            case 4:
                System.out.println("");
                System.out.println("Exiting the program");
                break;
            default:
                System.out.println("");
                System.out.println("Unrecognized option..Try again");
                System.out.println("");
                displayMenu(in);
                break;
        }
    }

    public static void getM6HW1() {
        System.out.println("");
        System.out.println("");
        System.out.println("You picked M6HW1");
        System.out.println("");
        // add your code here for M6HW1
    }
}