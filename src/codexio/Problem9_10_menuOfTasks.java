package codexio;

import java.util.Scanner;

public class Problem9_10_menuOfTasks {

    public static double averageSumOfLineofNums(int...nums){
        double sum =0;
        for (int i = 0; i <nums.length; i++) {
            sum+=nums[i];
        }
        double result = sum/nums.length;
        return result;
    }

    public static double linearEquation(int a,int b){
        double x = -(b/a);
        return x;
    }
    public static boolean validateNum(int num){
        boolean result = num > 0;
        return result;
    }
    public static boolean validateLineofNums(int[] arr){
        boolean result = arr.length>0;
        return result;

    }
    public static boolean validateA(int a){

        boolean result = (a!=0);
        return  result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("За да обърнете последователността на едно число натистете 1");
        System.out.println("За да пресметнете средно аритметично на една редица натиснете 2");
        System.out.println("За да решите линейното уравнение a * x + b = 0  натиснете 3");
        int menuNum = input.nextInt();
        switch (menuNum){
            case 1:
                System.out.println("Вие избрахте да обърнете последователностаа на едно число!");
                System.out.println("Моля въведете число: ");
                int number = input.nextInt();
                if (validateNum(number)){
                    System.out.println("Обърнатото число е: " + (Utils.pritnReverseNumber(number)));break;
                }else System.out.println("Числото не трбява да е отрицателно!");break;
            case 2:
                System.out.println("Вие избрахте да пресметнете средно аритметично на една редица");
                System.out.println("Моля въведете колко ще е дъълга редицата: ");
                int lineLenght = input.nextInt();
                int[] array = new int[lineLenght];
                for (int i = 0; i <lineLenght ; i++) {
                    System.out.println("Моля въведете числo: ");
                    array[i]=input.nextInt();

                }
                if (validateLineofNums(array)){
                    System.out.println("Средното аритметично на редицата е: ");
                    System.out.println( averageSumOfLineofNums(array));
                }else System.out.println("Невалидна поредица!");break;

            case 3:
                System.out.println("Вие избрахте да решите линейното уравнение a * x + b = 0 ");
                System.out.println("Моля въведете а: ");
                int a =input.nextInt();
                System.out.println("Моля въвдете b: ");
                int b = input.nextInt();

                if (validateA(a)){
                    double result = linearEquation(a,b);
                    System.out.print("X= ");
                    System.out.println(result);break;

                }else System.out.println(" А трябва да е разлиично от 0 !");  break;      }
    }
}

