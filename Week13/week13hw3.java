class HW {
    public static void main(String a[]) {
        System.out.println("numbers from 1-100 divisible by 3: ");
        numbersDivisibleToHundred(3,1);
        System.out.println("numbers from 1-100 divisible by 5: ");
        numbersDivisibleToHundred(5,1);
        System.out.println("numbers from 1-100 divisible by 3 & 5: ");
        numbersDivisibleToHundred(3,5);
        
    }

    public static void numbersDivisibleToHundred(int divisor1, int divisor2) {
        for (int num = 1; num < 100; num++) {
            if (num % divisor1 == 0 && num % divisor2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("");
    }
}