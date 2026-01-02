public class JVMDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int sum = a + b;

        System.out.println("The addition of two number is: " + sum);
    }
}

/***
 * Firstly javac compiler compiles the JVMDemo.java source file into JVMDemo.class file which is bytecode
 *
 * Class Loader loads the JVMDemo.class file into JVM
 *
 * In this a , b, sum are stored in stack memory
 *
 * Execution engine like interpreter read the code line by line and execute the code line by line and gives us output
 *
 */