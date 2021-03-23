package codexio;

import java.util.Random;

/**
 * Използвайте класа java.util.Random и неговия метод nextInt().
 */
public class Problem11_5_randomAdds {
  public static   Random rnd = new Random();
  public static String[] praisePhrases = {"Продуктът е отличен.", "Това е страхотен продукт.", "Постоянно ползвам този продукт.",
            "Това е най-добрият продукт от тази категория."};
  public static    String[] praiseEvents = {"Вече се  чувствам  добре.", "Успях да  се променя.",
            "Той направи чудо.", "Не мога да повярвам, но вече се чувствам страхотно.", "Опитайте и вие. Аз съм много доволна."};
  public static String[] firstNameAuthor = {"Диана", "Петя", "Стела", "Елена", "Катя"};
  public static   String[] secondNameAuthor = {"Иванова", "Петрова", "Кирова"};
  public static String[] city =  {"София", "Пловдив", "Варна", "Русе", "Бургас"};

  public static void randomPhrases (String[]arr){
        System.out.println(arr[rnd.nextInt(arr.length)]);
}

    public static void main(String[] args) {

        randomPhrases(praiseEvents) ;
        randomPhrases(praisePhrases);
        randomPhrases(firstNameAuthor);
        randomPhrases(secondNameAuthor);
        randomPhrases(city);

    /*   System.out.println(praisePhrases[rnd.nextInt(praisePhrases.length)]);
       System.out.println(praiseEvents[rnd.nextInt(praiseEvents.length)]);
       System.out.println(firstNameAuthor[rnd.nextInt(firstNameAuthor.length)]);
        System.out.println(secondNameAuthor[rnd.nextInt(secondNameAuthor.length)]);
        System.out.println(city[rnd.nextInt(city.length)]);*/
    }
}
