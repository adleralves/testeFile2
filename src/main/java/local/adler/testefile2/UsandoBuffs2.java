package local.adler.testefile2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UsandoBuffs2 {
    public static void main(String[] args) {
        File arquivo = new File("arquivo2.txt");
        try(FileWriter fw = new FileWriter(arquivo)) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("teste");
            bw.newLine();
            bw.write("teste2");
            bw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        try (FileReader fr = new FileReader(arquivo)) {
            BufferedReader br = new BufferedReader(fr);
            String content;
            while((content = br.readLine())!= null) {
                System.out.println(content);
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}