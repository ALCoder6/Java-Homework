class HW
{
    public static void main(String a[])
    {
        String wordWithSuf = "er";
        String suf = "saucer";
        System.out.println(endsWith(wordWithSuf, suf));
    }

    public static Boolean endsWith(String mainStr, String suffix)
    {
        int sufIdx = suffix.length() - 1;

        for (int checkIdx = mainStr.length() - 1; checkIdx >= mainStr.length() - suffix.length(); checkIdx--)
        {
            if (sufIdx < 0)
            {
                return true;
            }
            else if (mainStr.charAt(checkIdx) != suffix.charAt(sufIdx))
            {
                return false;
            }
            else
            {
                sufIdx--;
            }
        }
        return true;
    }
}
