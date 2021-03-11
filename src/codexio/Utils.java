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
}
