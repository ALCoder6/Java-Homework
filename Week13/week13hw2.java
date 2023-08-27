class HW {
    public static void main(String a[]) {
        
        int digit = 5;
        int tenDigit = digit + digit*10;
        int hundredDigit = digit + digit*10 + digit*100;
        int sum = digit + tenDigit + hundredDigit;
        
        System.out.println(digit + " + " + tenDigit + " + " + hundredDigit + " = " + sum);
    }
}
