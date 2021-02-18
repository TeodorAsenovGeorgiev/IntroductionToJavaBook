package codexio;

import java.util.Arrays;

/**
 * 3.Да  се  напише  програма,  която  сравнява  два  масива  от  тип char лексикографски(буква по буква)
 * и проверява кой от двата е по-рано в лексикографската подредба.
 */
public class Problem7_3_comparesArraysLexicographically {
    public static void main(String[] args) {

        char[] firstArray = {'a', 'b', 'c','d'};
        int firstArrayLength = firstArray.length;
        char[] secondArray = {'a', 'b', 'c','d','a'};
        int secondArrayLength = secondArray.length;
        int minLength = Math.min(firstArrayLength,secondArrayLength);

        int compare = Arrays.compare(firstArray,secondArray);//тук правя сравнение с готова функиция и ако резултатът по-долу съвпада с този, всичко е ОК
        if (compare<0){
            System.out.println("!Първият масив е по - рано");/// Отговорите се различават по ! в началото на стринга, който ще излезе на екрана.
        }else  if (compare>0){
            System.out.println("!Вторият масив е по-рано");

        }else if (compare == 0){
            System.out.println("!Масивите са еднакви");
        }
/////////////////////////////////////////////// от тук започва задачата

        if (firstArrayLength > secondArrayLength){
            System.out.println("Вторият масив е по-рано");
        }else if(firstArrayLength == secondArrayLength){
            for (int i = 0; i <minLength-1 ; i++) {
                if (firstArray[i] > secondArray[i]){
                    System.out.println("Вторият масив е по-рано");
                }else if (secondArray[i] > firstArray[i]){
                    ;
                }else {
                    System.out.println("Масивите са еднакви");
                    return;

                }

            }

        }else System.out.println("Първият масив е по - рано");

    }
}
