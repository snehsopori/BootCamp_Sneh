package PrimeGenerateUsingTest;

import java.util.concurrent.Callable;

import static java.lang.Math.sqrt;

public class PrimeTask implements Callable<Integer> {
    int a,b;

    public PrimeTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Integer call() {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i == 1) { continue; }
            boolean counter = false;
            for (int j = 2; j <= sqrt(i); j++) {
                if (i % j == 0) {
                    counter = true;
                    break;
                }
            }
            if (counter == false) {
                sum += i;
            }
        }
        return sum;
    }
}
