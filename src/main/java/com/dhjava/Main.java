package com.dhjava;

/**
 * Hello world!
 *
 */

import ero.lis.sim.atrib.CreateAtrib;
import ero.lis.sim.atrib.ero.lis.sim.crfile.CrFile;

import java.io.IOException;

public class Main
{

    public static void main( String[] args )
    {
        //checkOne();
        //checkColOneFor();
        checkColWhele();
    }

    static void checkOne(){
        int one = 1;
        if(one == 1){
            System.out.println("Один");
        }
        else
            System.out.println("Ошибка");

    }

    static void checkColOneFor(){

        int colOne = 0;
        String one = "1";
        String strNum = "11111001";
        int length_str = strNum.length();

        for(int i = 0; i< length_str; i++){

            if(strNum.charAt(i) == '1'){
                colOne = colOne + 1;
            }

        }
        System.out.println(colOne);
    }

    static void checkColWhele(){
        int i = -1;
        int colOne = 0;
        String strNum = "21111001";

        while(i < strNum.length()+2){
            if(strNum.charAt(i) == '1'){
                colOne = colOne + 1;
                i++;
                System.out.println("i=" + i + " :" + strNum.charAt(i) + " -- " + colOne);
            }
            i++;
            System.out.println("i=" + i  + " :" + strNum.charAt(i) + " -- " + colOne);
        }

        System.out.println(colOne);
    }
}
