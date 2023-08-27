class HW
{
    public static void main(String a[])
    {
        int nums[] = {1,3,5,7,9};
        if (nums.length == 0)
            System.out.println("please enter a valid number");
        else
            System.out.println(findMaxNum(nums));
    }

    public static int findMaxNum(int[] values)
    {
        int largestVal = values[0];

        for (int i = 0; i < values.length - 1; i++)
        {
            if (largestVal <= values[i + 1])
                largestVal = values[i + 1];
        }
        return largestVal; 
    }
}