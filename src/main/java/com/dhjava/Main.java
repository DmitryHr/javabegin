package com.dhjava;

/**
 * Hello world!
 *
 */
import ero.lis.sim.*;
import ero.lis.sim.atrib.ero.lis.sim.crfile.CrFile;

import java.io.IOException;

public class Main
{
    public static void main( String[] args )
    {
        CrFile cf = new CrFile();
        try{
            cf.createFile();
        }
            catch(IOException e) {
            System.out.println("Ошибка" + e);
        }

    }
}
