for (int letteridx = strg.length() - 1; letteridx >= 0; letteridx--)
{
    public static void main(String a[])
    {
        String strg = "applesauce";
        StringBuilder strgButBackwards = new StringBuilder();

        for (int letteridx = strg.length() - 1; letteridx >= 0; letteridx--)
        {
            strgButBackwards.append(strg.charAt(letteridx));
        }

        System.out.println(strgButBackwards);
    }
}