class HW
{
    public static void main(String a[])
    {
        int nums[] = {1};
        printArray(nums);
    }

    public static void printArray(int[] values)
    {
        int semiCounter = 0;

        for (int i = 0; i < values.length; i++)
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