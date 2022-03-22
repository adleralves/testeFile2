package local.adler.testefile2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FluxoEmBytes {
    public static void main(String[] args) {
        
        File arquivo = new File("teste.bin");
        try(OutputStream os = new FileOutputStream(arquivo)) {
            byte[] b = {50,51,52,53};
            String string = "Adler Alves";
            os.write(53);
            os.write(b);
            os.write(string.getBytes());
            os.flush();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        
        try(InputStream is = new FileInputStream(arquivo)) {
            int content;
            while((content = is.read()) != -1) {
                System.out.println(content + " - " + ((char)content));
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}