package FileConcurrency;

public class TestFile {
    public static void main(String[] args) {

        File1 taskA = new File1();
        File2 taskB = new File2();
        Thread threadA = new Thread(taskA);
        threadA.start();
        Thread threadB = new Thread(taskB);
        threadB.start();
    }
}