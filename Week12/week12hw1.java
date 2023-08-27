import java.lang.Math;
class HW {
    public static void main(String a[]) {
        double decimal = 7685376;
        int larPowOfDeci = largestPowerOf16(decimal);

        //for each power starting from larPow to 0
        for (int descendingPows = larPowOfDeci; descendingPows >= 0; descendingPows--) {
            //initialize number of times 16 to a certain power goes into decimal int
            //we can cast to int because it drops the decimal, conviently finding the floor
            int numPerPow = (int)(decimal/Math.pow(16, descendingPows));
            //adjust with function if numPerPow is more than 9
            if (numPerPow >= 10) {
                System.out.print(adjustingToHexiVal(numPerPow));
            }
            //otherwise print normally
            else {
                System.out.print(numPerPow);
            }
            //as we find the numPerPow for each power, we take out the amount we count until we got the the 0th power and it prints 0-F
            decimal = decimal - numPerPow*Math.pow(16, descendingPows);
        }
    }

    public static int largestPowerOf16(double num) {
        int larPow = 0;
        
        //starting from 0, increases the power until max
        while (num/Math.pow(16, larPow) >= 1) {
            larPow++;
        }
        //subtracts the extra one counted in the previous while loop
        if (larPow > 0) {
            larPow--;
        }

        return larPow;
    }

    public static char adjustingToHexiVal(double powsOf16) {
        //turns numbers 10-16 to A-F
        return (char)(powsOf16 + 55);
    }
}
