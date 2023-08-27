import java.util.*;
//import java.io.*;
class HW3 {
    public static void main(String a[]) {
        int[] nums = {16, 324, 2, 41, 43, 146, 7};
        System.out.println(oddsFirst(nums).toString());
    }

    public static List<Integer> oddsFirst(int[] values) {
        List<Integer> reordered = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 1) {
                reordered.add(0, values[i]);
            }
            if (values[i] % 2 == 0) {
                reordered.add(values[i]);
            }
        }
        return reordered;
    }
}