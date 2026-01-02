public class ClassLoaderDemo {
    public static void main(String[] args) {

        ClassLoader cl1 = ClassLoaderDemo.class.getClassLoader();
        System.out.println("ClassLoader of ClassLoaderDemo: " + cl1);

        ClassLoader cl2 = String.class.getClassLoader();
        System.out.println("ClassLoader of String class: " + cl2);
    }
}
