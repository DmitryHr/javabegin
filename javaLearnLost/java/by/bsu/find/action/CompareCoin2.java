package by.bsu.find.action;

import by.bsu.find.bean.Coin;

/**
 * Created by Alcom on 02.07.2017.
 */
public class CompareCoin2 {
    public int compareDiameter2(Coin first, Coin second){
        int result = 0;
        double delta = first.getDiameter() - second.getDiameter();
        if(delta > 0){
            result = 1;
        }else if (delta < 0){
            result = -1;
        }
        return result;
    }
}
