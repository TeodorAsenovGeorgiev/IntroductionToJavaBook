package codexio;

/**
 * Декларирайте две променливи от тип int. Заадайте им стойности 5 и 10.Разменете стойностите им и ги отпечатайте
 */
public class Problem2_10_switchValues {

    public static void main(String[]args){
        Integer var1 = 5;
        Integer var2 = 10;
        Integer temp = var1;
        var1 = var2;
        var2 = temp;
        System.out.println(var1);
        System.out.println(var2);

    }
}
