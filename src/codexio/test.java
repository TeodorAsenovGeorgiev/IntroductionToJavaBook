package codexio;

import java.util.Arrays;
public class test {
    public static double getRectangeArea(double width,double height){
      double area = width*height;
        return area;
    }
    public static void printLogo(){
        System.out.println("Sun Microsystems");
        System.out.println("www.sun.com");
    }
    public static void printAnyLogo(String logo){
        System.out.println(logo);
    }

    public static void printTotalAumoutForBooks(double...prices){
        double totalAmount = 0;
        for(double singleBookprice : prices){
            totalAmount+= singleBookprice;
        }

        System.out.println("Total: " + totalAmount);
    }
    public static  long calcSum(int...elements){
        long sum = 0;
        for (int element:elements){
            sum+=element;
        }
        return sum;
    }

    public static void main(String[] args) {

           // double[] booksPrices = {1.0,2.0,3.0};
          //  printTotalAumoutForBooks(booksPrices);
            //printLogo();
            //printAnyLogo("Codexio");
           // System.out.println(getRectangeArea(55,5));
        long sum = calcSum(5,4,2,5,152,5);
        System.out.println(sum);

    }
}


//        Scanner input = new Scanner(System.in);
//        System.out.print("n = ");
//        int n = input.nextInt();
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row ; col++) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }

//        int num = 1;
//        int sum = 1;
//        System.out.print("The sum 1");
//        while(num < n)
//        {
//            num++;
//            sum *= num;
//            System.out.printf("*%d", num);
//        }
//        System.out.printf("= %d%n", sum);

