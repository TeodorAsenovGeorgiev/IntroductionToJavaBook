package charpter10;

public class Sequence {
    //static field
    private static  int currentValue = -1;
    //Intentionally deny instantiation of this class
    //private constructor
    private Sequence(){
    }

    //Static method
    public static int nextValue(){
        currentValue++;
        return currentValue;
    }
}
