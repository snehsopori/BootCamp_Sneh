package com.cdk.IOMovie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Entertainment {
    public static void main(String[] args) {
        InputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Java Training\\AssignmentsSubmit\\Entertainment.txt");
            int b = fis.read();
            while (b != -1) {
                System.out.print((char)b);
                b = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
