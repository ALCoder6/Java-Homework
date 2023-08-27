class HW
{
    public static void main(String a[])
    {
        int nums[][] = new int[3][];

        nums[0] = new int[4];
        nums[0][0] = 2;
        nums[0][1] = 3;
        nums[0][2] = 5;
        nums[0][3] = 7;
        
        nums[1] = new int[2];
        nums[1][0] = 11;
        nums[1][1] = 15;

        nums[2] = new int[2];
        nums[2][0] = 113;
        nums[2][1] = 269;

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                System.out.print(nums[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}