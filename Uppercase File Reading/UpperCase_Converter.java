package file_handler;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperCase_Converter extends FileReader {

    public UpperCase_Converter(File file) throws FileNotFoundException {
        super(file);
    }

    public void ReadFile() throws FileNotFoundException {

        UpperCase_Converter up = new UpperCase_Converter(new File("E:\\uppercase.txt"));

    }

    @Override
    public int read() throws IOException {

        FileReader fr = new FileReader("E:\\uppercase.txt");
         int i;
        while ((i = fr.read()) != -1) {
            //System.out.print(i);

            if ((i >= 97 && i <= 122)) {

                i -= 32;

            } else {

            }
            System.out.print((char) i);

        }
        fr.close();

        return i;

    }

}

class Application {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        UpperCase_Converter up = new UpperCase_Converter(new File("E:\\uppercase.txt"));
        up.read();

    }

}
