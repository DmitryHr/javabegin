package by.bsu.find.action;

import by.bsu.find.bean.Coin;
public class CompareCoin {
    public void compareDiameter(Coin first, Coin second){
        double delta = first.getDiameter() - second.getDiameter();
        if (delta > 0){
            System.out.println("первая монета больше второй на " + delta);
        } else if (delta == 0){
            System.out.println("монеты имеют одинаковый размер");
        } else{
            System.out.println("Вторая монета больше перврй на " + -delta);
        }
    }
}
