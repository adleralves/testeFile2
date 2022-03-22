package local.adler.testefile2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UsandoFileWriter {
    public static void main(String[] args) {
        
        File arquivo = new File("teste.txt");
        
        try( FileWriter fw = new FileWriter(arquivo)) {
            fw.write('2');
            fw.write("25");
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}