package codexio;

/**
 * "C# is not C++ and PHP is not Delphi"-> "Delphi not is PHP and C++ not is C#".
 */
public class Problem13_06_reversWords {
    public static void main(String[] args) {
        String input = "C# is not C++ and PHP is not Delphi";
        String[] arrOutput = input.split("[ ]+");
        String result = "";
        for (int i= arrOutput.length-1;i >= 0 ; i--) {
           result = result.concat(arrOutput[i]+" ");
        }
        System.out.println(result);
    }
}
