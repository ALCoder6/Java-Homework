class HW
{
    public static void main(String a[])
    {
        int num = 3;

        for (int i = 2; i<=num - 1; i++)
        {
            if (num == 2)
            {
                System.out.println("2 is prime");
                System.exit(0);
            }
            else if (num%i == 0)
            {
                System.out.println(num + " is not prime");
                System.exit(0);
            }    
        }
        System.out.println(num + " is prime");
    }
}