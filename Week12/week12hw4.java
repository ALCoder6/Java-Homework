class HW {
    public static void main(String a[]) {
        String phrase = " UR=C{o<jdxa'.KSAAKJdsailkmazls/q;.}";
        int letters = 0;
        int numbers = 0;
        int spaces = 0;
        int other = 0;

        //for every character in the string
        for (int i = 0; i < phrase.length(); i++) {
            //set variable to be that character at the index of i
            char movingChar = phrase.charAt(i);

            //check ascii values and filter them to each catagory
            if ((int)movingChar == 32) {
                spaces++;
            }
            else if ((int)movingChar >= 48 && (int)movingChar <= 57) {
                numbers++;
            }
            //use && with two <= and >= boundaries and || for multiple devided sections
            //(uppercase is from 65 to 90 while lowercase is from 97 to 122)
            else if ((int)movingChar >= 65 && (int)movingChar <= 90 || (int)movingChar >= 97 && (int)movingChar <= 122) {
                letters++;
            }
            else {
                other++;
            }
        }

        System.out.println("letters: " + letters);
        System.out.println("numbers: " + numbers);
        System.out.println("spaces: " + spaces);
        System.out.println("other: " + other);
    }
}
