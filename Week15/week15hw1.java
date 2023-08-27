import java.io.*;
class week15hw1 {
    public static void main(String a[]) throws IOException {
        System.out.println("original -----------------------------------------");
        RandomAccessFile textFile = new RandomAccessFile ("text.txt", "rw");
        String printingToken = textFile.readLine();
        while (printingToken != null) {
            System.out.println(printingToken);
            printingToken = textFile.readLine();
        }
        textFile.seek(0);

        System.out.println("edited -------------------------------------------");
        File newTextFile = new File ("text2.txt");
        FileWriter textWriter = new FileWriter(newTextFile);
        String movingToken = textFile.readLine();
        while (movingToken != null) {
            if (movingToken.contains("//") && movingToken.indexOf("//") == 0) {
                movingToken = textFile.readLine();
                continue;
            }
            else if (movingToken.contains("//")) {
                movingToken = movingToken.substring(0, movingToken.indexOf("//"));
            }
            else if (movingToken.contains("/*")) {
                movingToken = movingToken.substring(0, movingToken.indexOf("/*"));
                System.out.println(movingToken);
                textWriter.write("\n" + movingToken);
                movingToken = textFile.readLine();
                while (!movingToken.contains("*/")) {
                    movingToken = textFile.readLine();
                }
                if (movingToken.indexOf("*/") == movingToken.length() - 2) {
                    movingToken = textFile.readLine();
                    continue;
                }
                else if (movingToken.indexOf("*/") == 0) {
                    movingToken = movingToken.substring(3);
                    continue;
                }
                movingToken = movingToken.substring(movingToken.indexOf("*/") + 3);
            }
            System.out.println(movingToken);
            textWriter.write("\n" + movingToken);
            movingToken = textFile.readLine();
        }
        textWriter.close();
        textFile.close();
    }
}
