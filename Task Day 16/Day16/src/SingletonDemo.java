public class SingletonDemo {

    private static SingletonDemo instance;

    private SingletonDemo(){
        System.out.println("Singleton object created");
    }

    public static SingletonDemo getInstance(){
        if(instance == null){
            instance = new SingletonDemo();
        }
        return instance;
    }
    public static void main(String[] args) {

        SingletonDemo s1 = SingletonDemo.getInstance();
        SingletonDemo s2 = SingletonDemo.getInstance();

        System.out.println(s1 == s2);
    }
}
