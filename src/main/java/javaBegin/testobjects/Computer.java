package javaBegin.testobjects;

/**
 * Created by Alcom on 03.01.2017.
 */
public class Computer {
    public String name;
    public int ram;
    public int hdd;
    public double weigth;

    public void on(){
        System.out.println("Я включаюсь. Моя модель " + name);
    }

    public void off(){
        System.out.println("Я вылючаюсь");
    }

    public void load(){
        System.out.println("Я загружаюсь. Мой обьем жесткого диска равен  " + hdd + " гб");
    }


}
