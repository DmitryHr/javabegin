package javaBegin.testobjects;

/**
 * Created by Alcom on 03.01.2017.
 */
public class Main {
    public static void main (String [] arg){

        Computer comp = new Computer();

        comp.name="IBM";
        comp.hdd=350;

        comp.on();
        comp.load();
        comp.off();

    }
}
