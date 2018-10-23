package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class teStream1 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            File file = new File("Test.txt"); // siapkan file sumber
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;
            while ((dataInt = fis.read()) != -1) {
                hasilBaca = hasilBaca + (char) dataInt;
            }
            System.out.println(hasilBaca);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(teStream1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(teStream1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(teStream1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
