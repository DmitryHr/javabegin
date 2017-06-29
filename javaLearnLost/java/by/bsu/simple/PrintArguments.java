package by.bsu.simple;
import javafx.scene.Parent;

import java.util.regex.*;

/**
 * Created by Alcom on 23.06.2017.
 */
public class PrintArguments {
    public static void main(String [] args){

        for(String str : args){
            System.out.printf("Argument -> %n " + str);
        }
    }


}
