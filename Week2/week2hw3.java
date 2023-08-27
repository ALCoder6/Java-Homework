import java.util.Scanner;
class HW
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Radius: ");
        int radius = scan.nextInt();
        double area = radius*radius*22/ (double) 7;
        System.out.println(area);
    }
}