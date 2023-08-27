public class week1011hw5 {
    public static void main(String a[]) {
        String binary1 = "10";
        String binary2 = "11";
        int decimal1 = Integer.parseInt(binary1,2);
        int decimal2 = Integer.parseInt(binary2,2);
        int total = decimal1 + decimal2;

        System.out.println(Integer.toBinaryString(total));
    }

    // public static int intValOfBinary(int binary) {
    //     String[] arrOfBinary = binary.split(" ");
    //     int totalIntSum = 0;
        
    //     for (int iteration = arrOfBinary.length - 1; iteration >= 0; iteration--) {
    //         int power = arrOfBinary.length - iteration;
    //     }
    // }
}
