class HW
{
    public static void main(String a[])
    {
        int nums[] = {1,2,3,4,5,1};
        System.out.println(checkDuplicateNum(nums));
    }

    public static boolean checkDuplicateNum(int[] values)
    {
        for (int currentIdx = 0; currentIdx < values.length - 1; currentIdx++)
        {
            for (int checkingVal = currentIdx + 1; checkingVal < values.length; checkingVal++)
            {
                if (values[currentIdx] == values[checkingVal])
                    return true;
            }
        }
        return false;
    }
}