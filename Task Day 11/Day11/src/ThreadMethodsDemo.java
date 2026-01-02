class MyThreadDemo extends Thread{

    public void run() {

        System.out.println("run() method started");
        for(int i = 1; i <= 5; i++){

            System.out.println(Thread.currentThread().getName() + " executing step " + i);

            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }

            Thread.yield();
        }

        System.out.println("run() method ended");
    }
}
public class ThreadMethodsDemo {
    public static void main(String[] args) {

        MyThreadDemo t1 = new MyThreadDemo();
        MyThreadDemo t2 = new MyThreadDemo();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        try{
            t1.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        t2.interrupt();
        System.out.println("Main thread ends");
    }
}