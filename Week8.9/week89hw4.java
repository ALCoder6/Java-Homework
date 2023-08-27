class HW
{
    public static void main(String a[])
    {
        String bigWord = "applesauce";
        String smallWord = "ples";

        System.out.println(lastIndexOf(bigWord,smallWord));
    }

    public static int lastIndexOf(String mainStr, String subStr)
    {
        //int mainLeng = mainStr.length()
        //int subLeng = subStr.length()

        int begIdx = mainStr.length() - subStr.length();
        int endIdx = mainStr.length();
        String checkSection = mainStr.substring(begIdx, endIdx);

        for (int iteration = mainStr.length() - subStr.length() - 1; iteration >= 0; iteration--)
        {
            if (checkSection.equals(subStr))
            {
                return begIdx;
            }
            else
            {
                begIdx--;
                endIdx--;
                checkSection = mainStr.substring(begIdx, endIdx);
            }
        }
        return -1;
    }
}
