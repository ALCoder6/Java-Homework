class HW {
    public static void main(String a[]) {
        int[] values1 = {1, 3, -5, 4};
        int[] values2 = {1, 4, -5, 2};
        int[] products = multiplyTwoArr(values1, values2);
        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i] + " ");
        }
    }

    public static int[] multiplyTwoArr(int[] values1, int[] values2) {
        int[] results = new int[values1.length];
        results[0] = values1[0] * values2[0];
        results[1] = values1[1] * values2[1];
        results[2] = values1[2] * values2[2];
        results[3] = values1[3] * values2[3];
        return results;
    }
}
