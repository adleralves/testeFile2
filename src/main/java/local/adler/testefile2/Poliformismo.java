/*
opção interessante para ler dados de um arquivo via InputStream é a classe
java.util.Scanner bem conhecida para ler dados do teclado, mas em vez de passar
o System.in como parâmetro do construtor passamos o FileInputStream, como é bom
o polimorfismo
 */
package local.adler.testefile2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Poliformismo {
    public static void main(String[] args) {
        File arquivo = new File("teste.bin");
        try(InputStream in = new FileInputStream(arquivo)) {
            Scanner scan = new Scanner(in);
            while(scan.hasNext()) {
                System.out.println(scan.nextLine());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}