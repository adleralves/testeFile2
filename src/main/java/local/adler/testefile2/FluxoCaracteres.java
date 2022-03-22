/*
A classe FileReader nos fornece o método read que lê um único caractere do
arquivo e retorna o número inteiro de seu código na tabela unicode, ou se for
o final do arquivo ele retornará -1.
*/

package local.adler.testefile2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FluxoCaracteres {
    public static void main(String[] args) {
        
        File arquivo = new File("teste.txt");
        
        try( FileReader fr = new FileReader(arquivo)) {
            int c = fr.read();
            while(c!=-1){
                System.out.println((char)c);
                c = fr.read();
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}