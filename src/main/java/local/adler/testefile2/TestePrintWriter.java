/*
Outra classe muito interessante para escrever caracteres em um arquivo é 
PrintWriter pois possui vários métodos que permitem uma melhor formatação 
dos dados escritos, lembrando que a classe PrintWriter é uma subclasse de 
Writer então os dados serão escritos na forma de caracteres.
 */
package local.adler.testeFile2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TestePrintWriter {
    public static void main(String[] args) {
        File arquivo = new File("print.txt");
        try(PrintWriter pw = new PrintWriter(arquivo)) {
            pw.println(true);
            pw.println(10);
            pw.println(10.20);
            pw.println("teste");
            pw.printf("String: %s | Double: %.2f | Inteiro: %5d ", "teste", 10f, 200);
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}