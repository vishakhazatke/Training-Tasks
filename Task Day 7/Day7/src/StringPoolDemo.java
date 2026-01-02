public class StringPoolDemo {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = new String("Java");

        String s3 = s2.intern();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
