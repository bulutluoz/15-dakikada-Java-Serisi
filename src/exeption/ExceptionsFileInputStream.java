package exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsFileInputStream {
    public static void main(String[] args)  {

        String dosyaYolu="src/exeption/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k=0;
            while( (k=fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Her durumda calisir");
        }

    } }



