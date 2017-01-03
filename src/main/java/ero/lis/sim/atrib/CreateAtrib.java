package ero.lis.sim.atrib;

/**
 * Created by Alcom on 26.12.2016.
 */


public class CreateAtrib {
    public String imsi = "250000000006050";
    public String icc = "25000000000000600";
    public String imsi2;
    public String massIss[] = {};

    Long numImsi = Long.valueOf(imsi);
    Long numIcc = Long.valueOf(icc);

    public String createValueAttribute(){
        for(int i=1; i<10; i++){
            numImsi = numImsi + i;
            imsi2 += numImsi + " ";}
            System.out.print(imsi2);
        return imsi2;
    }
}
