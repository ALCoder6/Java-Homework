class EXRSE
{
    public static void main(String a[])
    {
        // String names[] = {"Angela", "Sophia", "Allie", "Sonia"};
        // String group[] = new String[4];
        
        // for (int i = 0; i <= 3; i++)
        // {
        //     group[i] = names[i] + " OK";
        // }

        // for (int i = 0; i <= 3; i++)
        // {
        //     System.out.println(group[i]);
        // }

        int nums[] = {1,2,3,4,5};

        System.out.println(sum(nums));

    }

    public static int sum(int nums[])
    {
        int sum = 0;

        for (int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }
        return sum;
    }

}