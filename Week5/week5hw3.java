class HW
{
    public static void main(String a[])
    {
        int nums[] = {1,2,3,4,5};
        printReverse(nums);
    }

    public static void printReverse(int[] values)
    {
        int semiCounter = 0;
        
        for (int i = values.length - 1; i >= 0; i--)
        {
            System.out.print(values[i]);
            while (semiCounter < values.length - 1)
            {
                System.out.print(";");
                semiCounter++;
                break;
            }
        }
    }
}