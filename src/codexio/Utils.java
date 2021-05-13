package codexio;

public final class Utils{
    private Utils(){}
    public static boolean isStringNumeric(String str){
        try {
            Double.parseDouble(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static boolean isNumeric(double num){
        try {
            Double.valueOf(num);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static void printWrongInput(){
        System.out.println("Wrong Iinput");
    }

    public static String pritnReverseNumber(int number){
        String stringNum=String.valueOf(number);
        String output="";
        for (int i = stringNum.length()-1; i >=0 ; i--) {
            output = output+stringNum.charAt(i);
        }
        return output;
    }


    public static String extractCapitals(String s){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
           char ch = s.charAt(i);
            if (Character.isUpperCase(ch)){
                result.append(ch);
            }
        }
        return result.toString();
    }
}
