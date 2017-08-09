package FileConcurrency;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by baglen on 7/31/2017.
 */
public class File2 implements Runnable {
    public void run() {
        InputStream fis = null;
        try{
            fis = new FileInputStream("test2.txt");
            int b2 = fis.read();
            while(b2 != -1){
                System.out.printf("%s",(char)b2);
                b2 = fis.read();
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(fis != null){
                    fis.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}