package charpter10.examples;

import charpter10.Cat;
import charpter10.Sequence;

public class Call {
    public static void main(String[] args) {
        Cat neibourCat = new Cat("Tom","Green");
        neibourCat.sayMiau();

        System.out.printf("Sequence[1..3] %d, %d, %d", Sequence.nextValue(), Sequence.nextValue(), Sequence.nextValue());
    }
}
