package Thread;

public class MainImplement{
    public static void main(String[] args) {
        System.out.println("Going inside main method: " + Thread.currentThread().getName());
        MultithreadingLearningImplement runnableObj = new MultithreadingLearningImplement();
        Thread thread = new Thread(runnableObj);
        thread.start();
        System.out.println("Finish main method: " + Thread.currentThread().getName());
    }
}
