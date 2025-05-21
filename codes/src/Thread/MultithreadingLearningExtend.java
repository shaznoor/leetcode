package Thread;

public class MultithreadingLearningExtend extends Thread{
    @Override
    public void run() {
        System.out.println("Code executed by Thread: " + Thread.currentThread().getName());
    }
}
