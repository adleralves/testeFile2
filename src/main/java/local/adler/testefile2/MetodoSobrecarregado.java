package local.adler.testefile2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MetodoSobrecarregado {
    public static void main(String[] args) {
        
        File arquivo = new File("teste.txt");
        try(FileReader fr = new FileReader(arquivo)) {
            char[] c = new char[4];
            fr.read(c);
            System.out.println(c);
        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}