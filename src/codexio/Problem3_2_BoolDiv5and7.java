package codexio;

/**
 * 2.Напишете булев израз, който да проверява дали дадено цяло число се дели на 5 и на 7 без остатък
 */
public class Problem3_2_BoolDiv5and7 {
    public static void main (String[]args){
        int input = 35;
        boolean divisionFive=((input%5)==0);
        boolean divisionSeven= (input%7 == 0);
        boolean chekDiv = (divisionFive && divisionSeven);
        System.out.println(chekDiv);
    }
}
