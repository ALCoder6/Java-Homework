import java.util.Scanner;
class HW
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int row = scan.nextInt();
        int counter = 0;

        while (counter < row)
        {
            for (int i = 0; i <= counter; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
            counter++;
        }
    }
}