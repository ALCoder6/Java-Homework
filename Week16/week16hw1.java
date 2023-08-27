import java.util.*;
import java.io.*;
class HW1 {
    public static void main(String a[]) throws IOException {
        File fileObject = new File ("studentScores.txt");
        FileWriter fr = new FileWriter(fileObject);
        int[][] scores = {
            {90,91,92,93,94,95,96,97,98,99},
            {80,81,82,83,84,85,86,87,88,89}
        };
        fr.write("og:");
        fr.write("\n" + Arrays.toString(scores[0]));
        fr.write("\n" + Arrays.toString(scores[1]));
        fr.write("\n" + "full year:");
        fr.write("\n" + Arrays.toString(solveFullYear(scores)));
        fr.write("\n" + "sem 1 average:");
        fr.write("\n" + averageScore(scores, 0));
        fr.write("\n" + "sem 2 average:");
        fr.write("\n" + averageScore(scores, 1));
        fr.close();
    }

    public static int[] solveFullYear(int[][] arr) {
        int[] newFullYears = new int[10];
        for (int i = 0; i < 10; i++) {
            newFullYears[i] = arr[0][i] + arr[1][i];
        }
        return newFullYears;
    }

    public static int averageScore(int[][] arr, int row) {
        int average = 0;
        for (int i = 0; i < 10; i++) {
            average = average + arr[row][i];
        }
        return average/10;
    }
}