class week89hw2
{
    public static void main(String a[])
    {
        String strStatement = "CAPITAL TO lowercase!@# z";
        StringBuilder strButNoCapital = new StringBuilder(strStatement);

        System.out.println(stringToLower(strButNoCapital));
    }

    public static StringBuilder stringToLower(StringBuilder str)
    {
        for (int charIdx = 0; charIdx < str.length(); charIdx++) 
        {
            if (Character.isUpperCase(str.charAt(charIdx)) == true) 
            {
                str.replace(charIdx, charIdx + 1, Character.toString(Character.toLowerCase(str.charAt(charIdx)))) ;
            }
        }
        return str;
    }
}
