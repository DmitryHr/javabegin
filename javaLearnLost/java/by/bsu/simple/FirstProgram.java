package by.bsu.simple;

/**
 * Created by Alcom on 23.06.2017.
 */
public class FirstProgram {
    public static void main(String [] args){
        SloganAction firstObject = new SloganAction();
        firstObject.printSlogan();
    }
}

class SloganAction{
    void printSlogan(){
        System.out.println("Enebling the Information Age");
    }
}