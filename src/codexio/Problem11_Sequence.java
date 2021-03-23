package codexio;

public class Problem11_Sequence {
    //static field
    private static  int currentValue = -1;
    //Intentionally deny instantiation of this class
    //private constructor
    private Problem11_Sequence(){
    }

    //Static method
    public static int nextValue(){
        currentValue++;
        return currentValue;
    }

}
