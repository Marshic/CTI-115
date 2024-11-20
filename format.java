public class format 
{
    public static void main(String[] args) 
    {
        double num = 1234567.1234567890;
        String number = String.format(String.format("%,.2f",num));
        System.out.println(number);
    }
}
