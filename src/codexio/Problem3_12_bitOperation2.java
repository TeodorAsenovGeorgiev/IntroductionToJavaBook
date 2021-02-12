package codexio;

import java.util.Scanner;

/**
 * 12.Дадено е число n, стойност v (v = 0 или 1) и позиция p. Напишете поредица от операции,
 * които да променят стойността на n,така че битът на позиция p да има стойност v.
 * Пример n=35, p=5, v=0 -> n=3. Още един пример: n=35, p=2, v=1 -> n=39.
 */
public class Problem3_12_bitOperation2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете n: ");
        int n = input.nextInt();
        System.out.println("Въведете p: ");
        int p = input.nextInt();
        System.out.println("Въведете v: (0 или 1)");
        int v = input.nextInt();

     //    n = (v == 0)?n=n&(~(1 << p)):n=n|(1<<p);
         if(v==0){
            n= n & (~(1 << p));
         }else{
             n=n|(1<<p);
         }

        System.out.println(n);

    }
}
