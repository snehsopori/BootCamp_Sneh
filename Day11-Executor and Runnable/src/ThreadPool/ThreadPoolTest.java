package ThreadPool;

import org.junit.Test;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

    @Test
    public void testThreadPool() {
        ThreadExample threadExample = new ThreadExample();
        Executor executor = Executors.newCachedThreadPool();// for increasing or shrinking the no. of threads(workers)
        for (int i = 0; i < 500; i++) {
            executor.execute(threadExample);
        }
    }
}