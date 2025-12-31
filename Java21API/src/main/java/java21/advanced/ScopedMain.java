package java21.advanced;

public class ScopedMain {
    public static void main(String[] args) {
        var runnable1 = new ScopedRunnable(1L);
        var thread1 = new Thread(runnable1);
        var runnable2 = new ScopedRunnable(2L);
        var thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }    
}
