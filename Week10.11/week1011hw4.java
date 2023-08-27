import java.util.*;

class HW
{
    public static void main(String a[]) {
        String arrOfLetters[] = {"q", "q", "u", "q", "n", "u", "n"};

        //String[] arrlistToArry = deletePairOfElements((arrOfLetters)).toArray();

        System.out.println(deletePairOfElements((arrOfLetters)));
    }

    public static List<String> deletePairOfElements(String ogArray[]) {
        //StringBuilder strgButNoDups = new StringBuilder(strg);
        int arrLength = ogArray.length;
        List<String> arrlistOfLetters = new ArrayList<>();
        
        for (int iteration = 0; iteration < arrLength; iteration++) {
            arrlistOfLetters.add(ogArray[iteration]);
        }

        for (int idx1 = 0; idx1 < arrLength; idx1++)
        {
            for (int idx2 = idx1 + 1; idx2 < arrLength; idx2++)
            {
                if (arrlistOfLetters.get(idx1) == arrlistOfLetters.get(idx2)) {
                    
                    arrlistOfLetters.remove(idx2);
                    arrLength--;
                }
            }
        }
        return arrlistOfLetters;
    }
}