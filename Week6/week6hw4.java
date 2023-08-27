class HW
{
    public static void main(String a[])
    {
        String word = "apple sauce";
        char[] charArray = new char[word.length()];

        for (int letter = 0; letter < word.length(); letter++)
        {
            charArray[letter] = word.charAt(letter);
        }

        for (int idx1 = 0; idx1 < word.length(); idx1++)
        {
            for (int idx2 = idx1 + 1; idx2 < word.length(); idx2++)
            {
                if (charArray[idx1] == charArray[idx2])
                {
                    System.out.println("Yes, there is a duplicate letter in this word.");
                    System.exit(0);
                }
            }
        }
        System.out.println("No, there is not a duplicate letter in this word.");
    }
}