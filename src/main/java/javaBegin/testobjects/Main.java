package javaBegin.testobjects;

/**
 * Created by Alcom on 03.01.2017.
 */
public class Main {
    public static void main (String [] arg){

        Computer comp = new Computer();

        comp.setName("IBM");
        comp.setRam(1);
        comp.setHdd(350);

        comp.on();
        comp.load();
        comp.off();

    }
}
