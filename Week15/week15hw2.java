import java.util.*;
class HW {
    public static void main(String a[]) {
        Integer[] nums = {20, 30, 40};
        System.out.println("shifted: " + shiftingLeft(nums));
    }

    public static List<Integer> shiftingLeft(Integer[] values) {
        List<Integer> lnums = new ArrayList<Integer>(Arrays.asList(values));
        int temp = lnums.get(0);
        lnums.remove(0);
        lnums.add(temp);
        return lnums;
    }
}
