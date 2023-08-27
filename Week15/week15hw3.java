import java.util.*;
class HW {
    public static void main(String a[]) {
        int[] nums = {20, 90, 50, 40, 30, 80};
        System.out.println(largestNum3Vals(nums));
    }

    public static int largestNum3Vals(int[] values) {
        int first = values[0];
        int last = values[values.length - 1];
        if (values.length % 2 == 0) {
            int middle1 = values[values.length/2];
            int middle2 = values[values.length/2 + 1];
            List<Integer> threeVals = new ArrayList<>(Arrays.asList(first, last, middle1, middle2));
            return Collections.max(threeVals);
        }
        else {
            int middle = values[values.length/2];
            List<Integer> threeVals = new ArrayList<>(Arrays.asList(first, last, middle));
            return Collections.max(threeVals);
        }
    }
}
