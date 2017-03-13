package javaBegin.testobjects;

/**
 * Created by Alcom on 03.01.2017.
 */
public class Computer {
    private String name;
    private int ram;
    private int hdd;
    private double weigth;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getRam(){
        return ram;
    }

    public void setRam(int newRam) {
        String strInt = Integer.toString(newRam);

        if ((newRam > 0) & (strInt.matches("[0-9]"))) {
            System.out.println("Soccess");}

        else {
            System.out.println("Передано отрицательное значение " + newRam + " или строковый параметр");
            }
        }





    public int getHdd(){
        return hdd;
    }

    public void setHdd(int newHdd){
        if(newHdd>0){
            hdd = newHdd;
        }else{
            System.out.print("Передано отрицательное значение " + newHdd);
        }

    }


    public void on(){ System.out.println("Я включаюсь. Моя модель " + name);}

    public void off(){
        System.out.println("Я вылючаюсь");
    }

    public void load(){
        System.out.println("Я загружаюсь. Мой обьем жесткого диска равен  " + hdd + " гб");
    }


}
