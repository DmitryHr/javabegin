package ero.lis.sim.atrib.ero.lis.sim.crfile;

/**
 * Created by Alcom on 26.12.2016.
 */

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class CrFile {
        public void createFile() throws IOException {

            //Создаем переменную типа String, указываем формат даты и передаем текущую дату
            String curDate = new SimpleDateFormat("dd_mm_yyyy").format(new Date()).toString();

            //Создаем обьект sim типа File, указываем где создать и что создать
            File sim = new File("c://Users//Alcom//Desktop", curDate + ".txt");
            PrintWriter simPrint = new PrintWriter(sim);


            try{
                sim.createNewFile();
                System.out.println("Файл создан");
                simPrint.write("text");
                simPrint.flush();
                System.out.println("Текст введен");
            }
            catch(IOException e){
                System.out.print("Ошибка " + e);
            }

        }

}
