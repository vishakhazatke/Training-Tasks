class Test {

    synchronized void waiting() {
        try {
            System.out.println(Thread.currentThread().getName() + " waiting");
            wait();
            System.out.println(Thread.currentThread().getName() + " resumed");
        }
        catch (InterruptedException e){
        }
        System.out.println("Resumed");
    }

    synchronized void notifyOne(){
        System.out.println("notify() called");
        notify();
    }

    synchronized void notifyEveryone(){
        System.out.println("notifyAll() called");
        notifyAll();
    }
}
public class ThreadCommunicationDemo {
    public static void main(String[] args) throws InterruptedException {

        Test t = new Test();

        Thread t1 = new Thread(){
          public void run(){
              t.waiting();
          }
        };

        Thread t2 = new Thread(){
            public void run(){
                t.waiting();
            }
        };

        Thread t3 = new Thread(){
            public void run(){
                t.notifyOne();
            }
        };

        Thread t4 = new Thread(){
            public void run(){
                t.notifyEveryone();
            }
        };

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        Thread.sleep(1000);

        t3.start();

        Thread.sleep(1000);
        t4.start();
    }
}
