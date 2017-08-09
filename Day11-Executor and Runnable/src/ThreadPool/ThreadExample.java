package ThreadPool;

import org.junit.Test;

import java.util.concurrent.*;

public class ThreadExample implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i < 500 ; i++) {
            sum += i;
        }
        System.out.printf("Sum of 1 to 500 no. is: %s%n",sum);
    }
}