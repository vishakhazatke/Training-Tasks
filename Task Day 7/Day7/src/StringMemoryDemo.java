public class StringMemoryDemo {

    public static void main(String[] args) {

        String s1 = "Java";  // String Pool
        String s2 = "Java";  // same String Pool
        String s3 = new String("Java"); // Heap

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
