package ero.lis.sim.atrib.ero.lis.sim.crfile;

/**
 * Created by Alcom on 26.12.2016.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
public class CrFile {

    //Создаем переменную типа String, указываем формат даты и передаем текущую дату
    String curDate = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss_SSS").format(new Date()).toString();

    //Создаем обьект sim типа File, указываем где создать и что создать
    File sim = new File("c://Users//Alcom//Desktop", curDate + ".txt");
    PrintWriter simPrint;
    public String s;

    public void createFile() throws IOException {
        if(sim.createNewFile()){
            System.out.println("Файл " + curDate + ".txt " + "создан");
            }
            else {
            System.out.println("File alredy exists");
            }
        }

    public void writeFile(String valueAttribute){
        try{
            simPrint = new PrintWriter(sim);
            simPrint.write(valueAttribute);
            simPrint.flush();
        }

        catch (IOException e){
            System.out.println("Ошибка" + e);
        }
    }

}
