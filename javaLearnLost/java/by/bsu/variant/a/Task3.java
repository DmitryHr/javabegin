package by.bsu.variant.a;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Alcom on 05.09.2017.
 */
public class Task3 {

    Scanner in = new Scanner(System.in);
    int consInt;

    public static void main(String [] args){
        Task3 t3 = new Task3();
        System.out.print("Input number and press INTER: ");
        t3.inputNumber();
        t3.randomNumbers();

    }

    protected void inputNumber(){
        Scanner in = new Scanner(System.in);
        consInt = in.nextInt();
    }

    public void randomNumbers(){
        Random rnd = new Random();
        for(int i=0; i<consInt; i++) {
            int numb = rnd.nextInt(99);
            System.out.print(numb + " ");
        }

        for(int i=0; i<consInt; i++) {
            int numb = rnd.nextInt(99);
            System.out.println(numb);
        }
    }


}
