package by.bsu.string;

/**
 * Created by Alcom on 05.07.2017.
 */
public class ComparitionString {
    public static void main(String [] args){
        String s1, s2;
        s1 = "Java";
        s2  = s1;
        System.out.println("сравнение ссылок " + (s1 == s2));

        s2 = new String("Java");
        System.out.println("сравнение ссылок " + (s1 == s2));
        System.out.println("сравнение ссылок " + s1.equals(s2));
    }
}
