package by.bsu.find.run;

import by.bsu.find.bean.Coin;
import by.bsu.find.action.CompareCoin2;
/**
 * Created by Alcom on 30.06.2017.
 */
public class Runner {
    public static void main(String [] args){
        Coin ob1 = new Coin();
        ob1.setDiameter(0.11);
//        ob1.setDiameter(0.12);
//        ob1.setWeight(150);

        Coin ob2 = new Coin();
        ob2.setDiameter(0.21);
//        ob2.setWeight(170);

        CompareCoin2 ca = new CompareCoin2();
        System.out.println(ca.compareDiameter2(ob1, ob2));
    }
}
