class MyThread extends Thread {

    public MyThread(ThreadGroup mainGroup, String name) {
        super(mainGroup, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Передаёт привет " + Thread.currentThread().getName());
            }
        } catch (InterruptedException err) {
        } finally {
            System.out.printf("%s завершён\n", Thread.currentThread().getName());
        }
    }
}