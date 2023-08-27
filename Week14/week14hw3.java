class HW {
    public static void main(String a[]) {
        String value = "3524";
        System.out.println(value + " is of type " + value.getClass().getSimpleName());
        char[] valsInCharArr = value.toCharArray();
        int valButInt = 0;
        int timesOfTen = 1;

        for (int i = valsInCharArr.length - 1; i >= 0; i--) {
            char element = valsInCharArr[i];
            if (element < 48 || element > 57) {
                System.out.println("please use a valid string made of numbers");
                System.exit(0);
            }
            valButInt = valButInt + (element - 48)*timesOfTen;
            timesOfTen = timesOfTen*10;
        }
        System.out.println(valButInt + " is of type " + ((Object)valButInt).getClass().getSimpleName());
    }
}
