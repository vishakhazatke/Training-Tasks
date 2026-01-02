public class GCDemo {
    public static void main(String[] args) {

        GCDemo obj = new GCDemo();
        obj = null;

        System.gc();
        System.out.println("Garbage Collector called");
    }
}
