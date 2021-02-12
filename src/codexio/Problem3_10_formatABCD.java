package codexio;

import java.util.Scanner;

/**
 * 10.Напишете програма, която приема за вход четирицифрено числовъв формат abcd и след това извършва следните действия върху него:
 * -Пресмята сбора от цифрите на числото.
 * -Разпечатва на конзолата цифрите в обратен ред: dcba.
 * -Поставя последната цифра, на първо място: dabc.
 * -Разменя мястото на втората и третата цифра: acbd.
 *
 * 10.За да вземете отделните цифри на числото, можете да го делите на 10 и да взимате остатъка 4 последователни пъти
 */
public class Problem3_10_formatABCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете четирицифрено число: ");
        int abcd = input.nextInt();
        int d = abcd % 10;
        int c = (abcd/10)%10;
        int b = ((abcd/100)%10);
        int a = ((abcd/1000)%10);
      System.out.println(a+b+c+d);
      System.out.print(d);System.out.print(c);System.out.print(b);System.out.print(a);
      System.out.println();
      System.out.print(a);System.out.print(c);System.out.print(b);System.out.print(d);

    }
}
