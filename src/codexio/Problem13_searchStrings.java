package codexio;

public class Problem13_searchStrings {
    public static void main(String[] args) {
        String msg = "Stand up, Stand up, Balkan supermen! Stand up.";
        int index = msg.indexOf("up");
        while (index != -1){
            System.out.println("up found on index " + index);
            index = msg.indexOf("up",index+1);
        }

        char[] ch = msg.toCharArray();
        for (int i = 0; i < msg.length(); i++) {
            System.out.printf("msg[%d] = %c%n",i,msg.charAt(i));
        }

try {

    msg.getChars(3,msg.length(),ch,1);

}catch (StringIndexOutOfBoundsException e){
       System.out.print(e.getMessage());
}
    }
}
