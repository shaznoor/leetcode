package Thread;

public class MultithreadingLearningImplement implements Runnable{
    @Override
    public void run() {
        System.out.println("Code executed by Thread: " + Thread.currentThread().getName());
    }
}

