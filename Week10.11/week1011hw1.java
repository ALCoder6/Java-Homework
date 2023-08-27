class HW
{
    public static void main(String a[]) {
        char theStuff[] = {'b','c','d'};
        isLetterMissing(theStuff);
    }

    public static void isLetterMissing(char letters[]) {
        for (int elementIdx = 0; elementIdx < letters.length - 1; elementIdx++){
            if (letters[elementIdx + 1] - letters[elementIdx] != 1) {
                char printThis = (char)(letters[elementIdx] + 1);
                System.out.println("the missing letter is: " + printThis);
                return;
            }
        }
        System.out.println("the array has no missing letters");
        return;
    }
}
