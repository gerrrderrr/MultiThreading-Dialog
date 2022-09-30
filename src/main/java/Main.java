public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("main");

        Thread myThread1 = new MyThread(mainGroup, "Первый поток");
        Thread myThread2 = new MyThread(mainGroup, "Второй поток");
        Thread myThread3 = new MyThread(mainGroup, "Третий поток");
        Thread myThread4 = new MyThread(mainGroup, "Четвёртый поток");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        int timeout = 15;
        for (int i = 1; i <= timeout; i++) {
            if (i == timeout) {
                mainGroup.interrupt();
            }
            Thread.sleep(1000);
        }
    }
}
