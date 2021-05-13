package codexio;

public class Problem13_Catalog {
    public static void main(String[] args) {
        String catalog = "MicrowaveOven: 170, \n"+"AudioSystem: 125, \n"+"TV: 315, \n"+"Refrigerator: 400";
        System.out.println(catalog);

        String[] products = catalog.split("[\\d\\s,:]+");
        String[] prices = catalog.split("\\D+");
    }
}
