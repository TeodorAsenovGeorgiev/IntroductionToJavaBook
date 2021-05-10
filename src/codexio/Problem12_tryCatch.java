package codexio;

import java.io.*;
import java.util.ArrayList;

public class Problem12_tryCatch {
    public static void  readFile(String fileName) {


       try {
           var list = new ArrayList<String>();
           list.add("pesho");
           FileInputStream fis = new FileInputStream(fileName);
           BufferedReader in = new BufferedReader(new InputStreamReader(fis));
           String tmp = null;
           while ((tmp = in.readLine()) != null){
               System.out.println(tmp);
           }
           in.close();
           fis.close();
       } catch (FileNotFoundException e){
           e.printStackTrace();
           System.out.println("The file \"" + fileName + "\" does not exist! Unable to read it.");
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
    public static void main(String[] args) {

            readFile("C:\\tedu6ko\\tedis.txt") ;

    }

}
