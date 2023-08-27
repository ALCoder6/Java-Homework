import java.io.*;
import java.util.*;
class HW {
    public static void main(String a[]) throws IOException {
        HashMap<String, Integer> difWords = new HashMap<>();
        File fObj = new File("excerpt.txt");
        Scanner fScan = new Scanner(fObj);

        printingHash(goThroughText(fObj, fScan, difWords));
        findLargestFE(goThroughText(fObj, fScan, difWords));
        findLargestIT(goThroughText(fObj, fScan, difWords));
    }

    public static HashMap<String, Integer> goThroughText(File file, Scanner scan, HashMap<String, Integer> map) {
        while (scan.hasNext()) {
            String token = scan.next();
            token = stripToBase(token);
            if (map.containsKey(token)) {
                int incrVal = map.get(token);
                map.put(token, incrVal + 1);
            }
            else {
                map.put(token, 1);
            }
        }
        return map;
    }   

    public static String stripToBase(String word) {
        String nWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (/*apostrophy*/word.charAt(i) == 39 || /*capital*/(word.charAt(i) >= 65 && word.charAt(i) <= 90) || /*lowercase*/(word.charAt(i) >= 97 && word.charAt(i) <= 122)) {
                nWord += word.charAt(i);
            }
        }
        return nWord;
    }

    public static void findLargestFE(HashMap<String, Integer> map) {
        int greatest = 0;
        String tempKey = "";
        for (Map.Entry<String, Integer> set : map.entrySet()) {
            int temp = set.getValue();
            if (temp > greatest) {
                greatest = temp;
                tempKey = set.getKey();
            }
        }
        System.out.println("\"" + tempKey + "\" appears " + greatest + " times");
    }

    public static void findLargestIT(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        int greatest = 0;
        String tempKey = "";
        while (it.hasNext()) {
            Map.Entry<String, Integer> set = (Map.Entry<String, Integer>) it.next();
            int temp = set.getValue();
            if (temp > greatest) {
                greatest = temp;
                tempKey = set.getKey();
            }
        }
        System.out.println("\"" + tempKey + "\" appears " + greatest + " times");
    }

    public static void printingHash(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> set : map.entrySet()) {
            System.out.println(set.getKey() + " | " + set.getValue());
        }
    }
}