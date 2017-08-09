package RandomPrint;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class RandomGenerateNumbersLambda {
    public static void main(String[] args) throws Exception {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue();

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 50; i++) {
                try {
                    queue.put((int) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            while (true){
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
