class HW
{
    public static void main(String a[])
    {
        String str1 = "rotator";
        String str2 = "deed";

        System.out.println("is the string a palindrome? true or false: " + isPalindrome(str1));
    }

    public static Boolean isPalindrome(String checkString)
    {    
        int idx1 = 0;
        int idx2 = checkString.length() - 1;

        for (int iterations = 0; iterations < checkString.length()/2; iterations++)
        {
            if (checkString.charAt(idx1) != checkString.charAt(idx2))
            {
                return false;
            }
            else 
            {
                idx1++;
                idx2--;
            }
        }
        return true;
    }
}