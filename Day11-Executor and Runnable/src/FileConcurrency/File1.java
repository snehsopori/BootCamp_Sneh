package FileConcurrency;

import java.io.*;

public class File1 implements Runnable{
    public void run() {
        InputStream fis = null;
        try{
            fis = new FileInputStream("test.txt");
            int b1 = fis.read();
            while(b1 != -1){
                System.out.printf("%s",(char)b1);
                b1 = fis.read();
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