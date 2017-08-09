package PrimeGenerateUsingTest;

import java.util.concurrent.*;

public class PrimeGenerator {
    int i;
    int a;

    public PrimeGenerator(int a) {
        this.a = a;
    }

    public int prime() {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future<Integer> future = null;
        int sum = 0;
        for (i = a; i < (a + 5); i++) {
            future = executor.submit(new PrimeTask(((i - 1) * 100) + 1, i * 100));
            try {
                while (true) {
                    if (future.isDone()) {
                        sum += future.get();
                        break;
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Thread got interrupted!!!");
            } catch (ExecutionException e) {
                System.out.println("Task can not be executed!!!");
            } catch (CancellationException e) {
                System.out.println("Task already got cancelled!!!");
            }
        }
        return sum;
    }
}
