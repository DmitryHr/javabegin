package by.bsu.simple;

import by.bsu.find.bean.Coin;

/**
 * Created by Alcom on 29.06.2017.
 */
public class MainClass {
    public static void main(String [] args){
        Coin ob = new Coin();
        ob.diameter = -0.12;
        ob.setDiameter(ob.diameter);
        ob.setWeight(100);
    }
}
