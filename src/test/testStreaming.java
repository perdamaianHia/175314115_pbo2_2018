package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testStreaming {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            File file = new File("test.txt"); // file tujuan
            String data = "Hello World "; // data yang disimpan
            fos = new FileOutputStream(file, true); // object stream
            fos.write(data.getBytes());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(testStreaming.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(testStreaming.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
