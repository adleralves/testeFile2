package local.adler.testeFile2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsandoBuffs {
    public static void main(String[] args) {
        
        File arquivo = new File("arquivo.txt");
        try( FileOutputStream fo = new FileOutputStream( arquivo ) ){
            BufferedOutputStream bos = new BufferedOutputStream(fo);             
            bos.write( "teste".getBytes());
            bos.write("\n".getBytes() ); //inserindo um caractere de nova linha
            bos.write( "teste2".getBytes());
            bos.flush();  

        }catch(IOException ex){
            ex.printStackTrace();
        }

        try( FileInputStream fi = new FileInputStream(arquivo)){
            BufferedInputStream bis = new BufferedInputStream(fi);

            int content;
            while( ( content = bis.read() ) != -1){
                System.out.println( content  + " - " + ( (char) content) );
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}