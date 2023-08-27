class HW
{
    public static void main(String a[])
    {
        int nums[] = {1,2,3,4,5,6,193};
        System.out.println(averageCal(nums));
    }

    public static double averageCal(int[] values)
    {
        double sum = 0;
        double ave;

        for (int increment = 0; increment < values.length; increment++)
        {
            sum = sum + values[increment];
        }

        ave = sum/values.length;
        return ave;
    }
}