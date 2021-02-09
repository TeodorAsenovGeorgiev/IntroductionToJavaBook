package codexio;

/**
 * 5.Декларирайте две променливи от тип String със стойности "Hello" и "World". Декларирайте променлива от тип Object.
 * Присвоете на тази променлива стойността, която се получава от конкатенацията на двете стрингови променливи
 * (добавете интервал, ако е необходимо).
 * Отпе-чатайте променливата от тип Object.
 * Декларирайте променлива от тип String и присвоете на последната променливата от тип Object
 */
public class Problem2_5_stringInObject {
    public static void main(String[]args) {
        String one = "Hello";
        String two = "World";
        Object obj  = one + " " + two;
        System.out.println(obj);
    }
}
