package ThreadAssignment;

import org.junit.Test;
import  java.util.*;
import java.util.concurrent.Executors;

public class Main {
    int i = 0;
   // Executor executor =  Executors.newFixedThreadPool(5);
    @Test
    public void testThread() {
        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                (this.i)++;

        }});

        threadA.start();
        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("Value of I:" + i);

        }});
        threadB.start();
    }
}