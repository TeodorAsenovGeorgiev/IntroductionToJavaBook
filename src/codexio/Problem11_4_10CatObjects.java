package codexio;

import charpter10.*;

/**
 * Напишете програма, която създава 10 обекта от тип Cat, дава им имена от вида CatN,
 * където Ne уникален пореден номер на обекта, и накрая извиква метода sayMiau()на всеки от тях.
 * За реализацията използвайте вече дефинирания пакет chapter10
 */
public class Problem11_4_10CatObjects {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[10];
        for (int i = 0; i <catArray.length ; i++) {
            catArray[i] = new Cat("name"+Sequence.nextValue(),"Color"+i);
            catArray[i].sayMiau();
        }
    }
}
