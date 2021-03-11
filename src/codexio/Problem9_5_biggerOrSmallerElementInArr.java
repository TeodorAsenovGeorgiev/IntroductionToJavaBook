package codexio;

/**
 * Напишете метод, който проверява дали елемент, намиращ се на дадена позиция  от  масив,
 * е  по-голям,  или  съответно  по-малък  от  двата  му съседа.
 */
public class Problem9_5_biggerOrSmallerElementInArr {
    public static void compareElementsinArr(int position,int...elements){

        if(elements[position]>elements[position-1]&&elements[position]>elements[position+1]){
            System.out.println("Bigger");
        }if (elements[position]<elements[position-1]&&elements[position]<elements[position+1]){
            System.out.println("Smaller");
        }else System.out.println("Equal");

    }

    public static void main(String[] args) {
        compareElementsinArr(1,2,2,2,4,5);
    }
}
