package Thread;

public class MainExtend {
    public static void main(String[] args) {
        System.out.println("Going inside main method: " + Thread.currentThread().getName());
        MultithreadingLearningExtend myThread = new MultithreadingLearningExtend();
        myThread.start();
        System.out.println("Finish main method: " + Thread.currentThread().getName());
    }
}
