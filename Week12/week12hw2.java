import java.lang.Math;
class HW {
    public static void main(String a[]) {
        int ogNum = 145683;
        int numOfDigits = String.valueOf(ogNum).length();
        int totalSum = 0;
        
        //for every digit in the number
        for (int i = numOfDigits - 1; i > 0; i--) {
            //initialize digitToAdd as the original number divided by the biggest power of ten
            int digitToAdd = (int)(ogNum/(Math.pow(10, i)));
            //add that number to the total sum
            totalSum = totalSum + digitToAdd;
            //take out that place so the next round of the for loop will be different
            ogNum = ogNum - digitToAdd*(int)(Math.pow(10, i));
        }
        //for loop went until 0 because x/0 is undefined, so add the final units place number here
        totalSum = totalSum + ogNum;
        System.out.println(totalSum);
    }
}
