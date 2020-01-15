
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class File_Reading {

    public static void main(String[] args) {

        String Line;
        try {

            // File Writer
            FileWriter f = new FileWriter(new File("C:\\Users\\RZK Technology\\Desktop\\File_Reading_Writing\\File.txt"));
            BufferedWriter bw = new BufferedWriter(f);
            bw.write("Hai I am Ruzaik I am Java Developer");
            bw.flush();

            
            
            //File Reader
            FileReader r = new FileReader(new File("C:\\Users\\RZK Technology\\Desktop\\File_Reading_Writing\\File.txt"));
            BufferedReader br = new BufferedReader(r);

            while ((Line = br.readLine()) != null) {

                System.out.println(Line);

            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
