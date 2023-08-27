import java.lang.Math;
class HW {
    public static void main(String a[]) {
        int numOfSides = 7;
        int lengthOfSide = 6;

        if (numOfSides == 0) {
            System.out.println("please use an acceptable value for the polygon's number of sides");
        }
        else {
        System.out.println(numOfSides*Math.pow(lengthOfSide, 2)/(4*Math.tan(Math.PI/numOfSides)));
        }
    }
}
