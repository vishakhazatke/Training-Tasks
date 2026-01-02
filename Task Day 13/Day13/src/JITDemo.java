public class JITDemo {

    static int add(int a , int b){

        return a + b;
    }
    public static void main(String[] args) {

        for(int i = 0; i < 100000; i++){

            add(10,20);
        }
    }
}
