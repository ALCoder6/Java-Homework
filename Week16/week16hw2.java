class HW2 {
    public static void main(String a[]) {
        String[][] digitsToWords = {
            {"0","1","2","3","4","5","6","7","8","9"},
            {"zero","one","two","three","four","five","six","seven","eight","nine",}
        };
        int value = 2577635;
        int sum = sumOfDigits(value);
        int digits = howManyDigits(sum);
        System.out.println(value + " -> " + sum);
        while (sum > 0) {
            System.out.print(digitsToWords[1][(int)(sum/(Math.pow(10,(digits - 1))))] + " ");
            sum = sum - (int)((int)(sum/(Math.pow(10,(digits - 1)))) * (Math.pow(10,(digits - 1))));
            digits--;
        }
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num%10;
            num = num/10;
        }
        return sum;
    }

    public static int howManyDigits(int sum) {
        int digit = 1;
        while (sum/Math.pow(10,digit) >= 1) {
            digit++;
        }
        return digit;
    }
}