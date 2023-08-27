class HW
{
    public static void main(String a[])
    {
        String str = "apple sauce";
        String subStr = "ple";
        System.out.println("does the substring exist in the string? true or false: " + findSubString(str, subStr));
    }

    public static Boolean findSubString(String main, String sub)
    {
        if (main.indexOf(sub) < 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}