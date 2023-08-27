import java.util.Scanner;
class HW
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first positive number: ");
        int firstNum = scan.nextInt();
        System.out.println("Enter the second positive number: ");
        int lastNum = scan.nextInt();
        int sum = 0;

        for (int currentNum = firstNum; currentNum <= lastNum; currentNum++)
            {
                if (IsOdd(currentNum))
                    sum = sum + currentNum;
            }
        
        System.out.println(sum);
    }

    public static boolean IsOdd(int num)
    {
        if (num%2 == 1)
            return true;
        else
            return false; 
    }

}