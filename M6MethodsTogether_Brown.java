
import java.util.Scanner;
public class M6MethodsTogether_Brown 
{
    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        getArea(k);
        k.close();
        {}
    }
    public static void getArea(Scanner k)
    {
        double area = 23.66;
        System.out.print("Enter the area of a square: ");
        area = k.nextDouble();
        System.out.println("The area is " + area);
    }
}
