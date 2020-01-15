
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Stream_Reading_Writing {

    public static void main(String[] args) {

        try {

            // Output Stream Write
            FileOutputStream f = new FileOutputStream("C:\\Users\\RZK Technology\\Desktop\\File_Reading_Writing\\File.txt");
            String s1 = "Welcome to Codesdope";
            byte b1[] = s1.getBytes();
            //System.out.println(b1);
            f.write(b1);
            f.close();

            //input Stream Read
            FileInputStream fi = new FileInputStream("C:\\Users\\RZK Technology\\Desktop\\File_Reading_Writing\\File.txt");
            int n = 0;
            while ((n = fi.read()) != -1) {
                System.out.print((char) n);
            }
            fi.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
