package com.cdk.IOCar;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

public class Car {
    public static void main(String[] args) {
        HashSet<String> hash = createData();

        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Java Training\\AssignmentsSubmit\\Entertain.txt");
            Iterator itr = hash.iterator();
            while(itr.hasNext()) {
                writer.write((String) itr.next());
                writer.write('\n');
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static HashSet<String> createData() {
        HashSet<String> hash = new HashSet<>();
        hash.add("Mercedes");
        hash.add("BMW");
        hash.add("AUDI");
        hash.add("SUZUKI");
        hash.add("Hero");
        hash.add("Toyota");
        hash.add("Chevrolet");
        hash.add("Tesla");
        hash.add("Ford");
        hash.add("Fiat");
        hash.add("Honda");
        hash.add("Maruti");
        hash.add("Buggati");
        hash.add("Porshe");
        hash.add("Aston Martin");
        hash.add("Mercedes");
        hash.add("BMW");
        hash.add("AUDI");
        hash.add("SUZUKI");
        return hash;
    }
}
