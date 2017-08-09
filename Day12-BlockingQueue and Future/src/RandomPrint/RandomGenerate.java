package RandomPrint;

import java.util.concurrent.*;

public class RandomGenerate {
    public static void main(String[] args) throws Exception{
        BlockingQueue<Integer> queue = new LinkedBlockingQueue();
        Consumer consumer = new Consumer(queue);
        Producer producer = new Producer(queue);

        Thread thread1 = new Thread(consumer);
        Thread thread2 = new Thread(producer);
        thread1.start();
        thread2.start();
    }
}
