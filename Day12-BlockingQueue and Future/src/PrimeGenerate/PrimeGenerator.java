package PrimeGenerate;

import java.util.concurrent.*;

public class PrimeGenerator {

    static int i;
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future<Integer> future = null;
        int sum = 0;
        for (i = 1; i <= 5; i++) {
            future = executor.submit(new PrimeTask(((i - 1) * 100) + 1, i * 100));
            try {
                while (true) {
                    if (future.isDone()) {
                        System.out.printf("Sum of primes between %s and %s is : %s%n", ((i - 1) * 100) + 1, i * 100,future.get());
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
        System.out.printf("Total sum is : %s%n",sum);
    }
}
