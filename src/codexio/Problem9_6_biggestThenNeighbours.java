package codexio;

public class Problem9_6_biggestThenNeighbours {
   // static int index = Integer.MIN_VALUE;
    public static int biggestThenNeighbours(int...elements){

        for (int i = 1; i <elements.length-1; i++) {
              if (elements[i]>elements[i+1]&&elements[i]>elements[i-1]){
              return  i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[]arr={1,2,1,4,5,6};
        int result = biggestThenNeighbours(arr);
        System.out.println(result);
    }
}
