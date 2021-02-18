package codexio;

/**
 * .Да се напише програма, която чете два масива от конзолата и проверявадали са еднакви.
 */
public class Problem7_2_arraysCompare {
    public static void main(String[] args) {
        char[] firstArray = {'a', 'b', 'c'};
        char[] secondArray = {'a', 'b',};
        boolean isEqual = true;

        if (firstArray.length != secondArray.length){
            isEqual = false;
            System.out.println("Масивите са различни!");
            return;
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i]!=secondArray[i]){
                isEqual = false;
            }

        }
        if (isEqual){
            System.out.println("Масивите са еднакви!");
        }else {
            System.out.println("Масивите са различни!");
        }


    }

    }

