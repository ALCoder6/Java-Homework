class HW {
    public static void main(String a[]) {
        int counter = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 2; j <= 4; j++) {
                for (int k = 3; k <= 4; k++) {
                    System.out.println(i + "" + j + "" + k);
                    counter++;
                }
            }
        }
        System.out.println("there are " + counter + " permutations");
    }
}
