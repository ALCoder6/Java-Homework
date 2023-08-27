import java.util.Scanner;
class HW
{
    public static void main(String a[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of primes you would like to print: ");
        int numOfPrimes = scan.nextInt();
        int primesPrinted = 0;
        int currentNum = 2;

        System.out.println("These are the first " + numOfPrimes + " prime numbers: ");

        while (primesPrinted < numOfPrimes)    
        {
            if (IsPrime(currentNum)) 
            {
                System.out.println(currentNum);
                primesPrinted++;
            }
            currentNum++;
        }
            
    }

    public static boolean IsPrime(int num)
    {
        for (int i = 2; i<=num - 1; i++)
        {
            if (num == 2)
            {
                System.out.println("2");
                System.exit(0);
            }
            else if (num%i == 0)
            {
                return false;
            }    
        }
        return true;
    }
}