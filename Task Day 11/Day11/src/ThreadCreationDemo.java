class MyThread extends Thread{

    public void run(){
        System.out.println("Thread created using Thread class");
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread Created using Runnable interface");
    }
}
public class ThreadCreationDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyRunnable runnable = new MyRunnable();

        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();
    }
}
