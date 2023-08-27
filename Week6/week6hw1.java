class HW
{
    public static void main(String a[])
    {
        int nums[][][] = new int[3][4][2];
        int value = 1;

        for (int xVal = 0; xVal < 3; xVal++)
        {
            for (int yVal = 0; yVal < 4; yVal++)
            {
                for (int zVal = 0; zVal < 2; zVal++)
                {
                    nums[xVal][yVal][zVal] = value;
                    value++;
                }
            }
        }

        for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 4; y++)
            {
                for (int z = 0; z < 2; z++)
                {
                    System.out.print(nums[x][y][z] + " ");
                }
                System.out.println("");
            }
            System.out.println();
        }
    }
}