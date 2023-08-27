import java.util.Arrays;

class HW
{
    public static void main(String a[])
    {
        int nums[] = {1,2,5,3,8,6};

        Arrays.sort(nums);
        System.out.println("the largest number elements in the array can make is: ");
        for (int indexGoingBackwards = nums.length - 1; indexGoingBackwards >= 0; indexGoingBackwards--)
            System.out.print(nums[indexGoingBackwards]);









        // int numOfNums = nums.length;
        // int idxOfMaxNum = ArrayUtils.indexOf(nums, findMaxNum(nums));

        // if (nums.length == 0)
        //     System.out.println("please enter valid numbers");
        // else {
        //     for (int counter = 0; counter < numOfNums; counter++) {
        //         System.out.print(findMaxNum(nums));
        //         nums = deleteOneNum(nums, idxOfMaxNum);
        //     }
        // }
    }

    // public static int findMaxNum(int[] values) {
    //     int largestVal = values[0];

    //     for (int i = 0; i < values.length - 1; i++)
    //     {
    //         if (largestVal <= values[i + 1])
    //             largestVal = values[i + 1];
    //     }
    //     return largestVal; 
    // }

    // public static int[] deleteOneNum(int[] values, int deleteMeIdx) {
    //     int[] newValues = new int [values.length - 1];
    //     int j = deleteMeIdx;
    //     for (int i = 0, k = 0; i < values.length - 1; i++) {
    //         if(i != j) {
    //             newValues[k] = values[i];
    //             k++;
    //         }
    //     }
    //     return newValues;
    // }
}