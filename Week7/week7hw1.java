import java.util.Arrays;
class HW
{
    public static void main(String a[])
    {
        int array1[] = {1,7,5,3,9};
        int array2[] = {2,8,6,4};
                
        //Arrays.sort(array1);
        //Arrays.sort(array2);
        
        int[] array3 = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        //source array, position to start copying, destination array, position to start copying to, length of the copied array

        Arrays.sort(array3);
        for (int idx = 0; idx < array3.length; idx++)
        {
            System.out.print(array3[idx]);
            System.out.print(" ");
        }
    }
}