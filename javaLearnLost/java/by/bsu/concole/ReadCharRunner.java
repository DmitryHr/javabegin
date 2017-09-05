package by.bsu.concole;

/**
 * Created by Alcom on 10.08.2017.
 */
public class ReadCharRunner {
        public  static void main(String [] args){
            int x;
            try{
                System.out.print("Input char ");
                x = System.in.read();
                char c = (char)x;
                System.out.println("Key char " +c+ " = "+x);

            }catch (java.io.IOException e){
                System.out.println("Input error "+ e);
            }
        }
}
