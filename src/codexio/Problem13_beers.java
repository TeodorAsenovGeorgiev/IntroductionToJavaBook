package codexio;

public class Problem13_beers {


    public static void main(String[] args) {
        String listOfBeers = "Amstel, Zagorka, Tuborg, Becks.";
        String [] beersArr = listOfBeers.split("[ ,.]+");
        String newListOfBeers=  listOfBeers.replace("Amstel","Kameniza");
      //newListOfBeers.replaceAll();
        System.out.println(newListOfBeers);
    }
}
