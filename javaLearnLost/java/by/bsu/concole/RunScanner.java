package by.bsu.concole;

import java.util.Scanner;

public class RunScanner {
    public static void main(String [] args){
        System.out.println("Input you name and press Enter: ");
        Scanner scan = new Scanner(System.in); //создали обьект scan типа Scanner
        String name = scan.next();
        System.out.println("Hello, " + name);
        scan.close();
    }
}
