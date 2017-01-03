package com.dhjava;

/**
 * Hello world!
 *
 */
import ero.lis.sim.*;
import ero.lis.sim.atrib.ero.lis.sim.crfile.CrFile;
import ero.lis.sim.atrib.*;

import java.io.IOException;

public class Main
{

    public static void main( String[] args )
    {
        CrFile cf = new CrFile();
        CreateAtrib crAtt = new CreateAtrib();
        try{
            cf.createFile();
            cf.writeFile(crAtt.createValueAttribute());
        }
            catch(IOException e) {
            System.out.println("Ошибка" + e);
        }

    }
}
