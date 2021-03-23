package codexio;

public class Problem11_1_timeFrom01_01_1970_ToNow {
    public static void main(String[] args) {
        long Time = System.currentTimeMillis();
        long secs = Time/1000;
        long mins = secs / 60;
        long hours = mins / 60;
        long days = hours/24;

        System.out.printf("%d Days, %d hours, %d minutes after 01-01-1970", days,hours,mins);
    }


}
