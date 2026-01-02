class ThreadDemo implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThreadLifeCycleDemo {
    public static void main(String[] args) throws Exception {

        ThreadDemo t1 = new ThreadDemo();
        Thread t2 = new Thread(t1);

        System.out.println("Before start : " + t2.getState());

        t2.start();
        System.out.println("After start : " + t2.getState());

        Thread.sleep(1000);
        System.out.println("During sleep: " + t2.getState());

        t2.join();
        System.out.println("After finish: " + t2.getState());
    }
}
