class week1011hw3
{
    public static void main(String a[]) {
        String numbers[] = {"6","7","3","5","1"};
        String numbersWithInsertMe[] = insertElement(numbers, "5", 2);

        for (int iteration = 0; iteration < numbersWithInsertMe.length; iteration++){
            System.out.print(numbersWithInsertMe[iteration]);
        }
    }

    public static String[] insertElement(String originalArray[], String insertMe, int positionOfInsertMe){
        //note: positionOfInsertMe should be entered assuming 0 is the index of the first place
        int newLength = originalArray.length + 1; 
        String[] movedArray = new String[newLength]; //initializing the new array with the to be inserted element

        for (int movingIdx = 0; movingIdx < originalArray.length; movingIdx++){
            if (movingIdx == positionOfInsertMe){ //if the current position is the position we want insertMe to be inserted, do something different
                movedArray[positionOfInsertMe] = insertMe; //set insertMe into its desired position
                break; //break to next part of the code at line 28
                
            }
            else{
                 movedArray[movingIdx] = originalArray[movingIdx]; //copy over the number normally
            }
        }
        
        //continuation after the specified position of the inserted element has passed
        //code takes the next number from the original array and sets it to the position one after insertMe
        for (int postNullMovingIdx = positionOfInsertMe; postNullMovingIdx < originalArray.length; postNullMovingIdx++){
            movedArray[postNullMovingIdx + 1] = originalArray[postNullMovingIdx];
        }

        return movedArray;
    }
}
