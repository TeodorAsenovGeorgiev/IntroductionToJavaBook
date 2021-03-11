package codexio;

import java.util.Scanner;


public class Problem9_1_printName {

    public static void printNames(String name){
        if (Utils.isStringNumeric(name)){
            System.out.println("Wrong Name!");
        }else System.out.println("Hello " + name) ;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.next();
        printNames(name);

    }
}
