class HW
{
    public static void main(String a[])
    {
        String strg = "unique letters";
        StringBuilder strgButNoDups = new StringBuilder(strg);


            for (int idx1 = 0; idx1 < strgButNoDups.length(); idx1++)
            {
                for (int idx2 = idx1 + 1; idx2 < strgButNoDups.length(); idx2++)
                {
                    if (strgButNoDups.charAt(idx1) == strgButNoDups.charAt(idx2))
                    {
                        strgButNoDups.deleteCharAt(idx2);
                    }
                }
            }
            
        
        System.out.println(strgButNoDups);
        //System.out.println("No, there is not a duplicate letter in this word.");
    }
}