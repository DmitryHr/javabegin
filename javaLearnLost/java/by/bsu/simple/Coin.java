package by.bsu.simple;

/**
 * Created by Alcom on 29.06.2017.
 */
public class Coin {
    public double diameter;
    private double weight;

    public double getDiameter(){
        return diameter;
    }
    public void setDiameter(double value){
        if(value > 0){
            diameter = value;
            System.out.println("diameter " + diameter);
        }else{
            System.out.println(diameter +" отрицательное число");
        }
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double value){
        weight = value;
    }

}
