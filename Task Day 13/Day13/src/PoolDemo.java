public class PoolDemo {
    public static void main(String[] args) {

        //Runtime constant pool
        int a = 10;
        int b = 10;

        //String constant pool
        String s1 = "Java";
        String s2 = "Java";

        //Heap
        String s3 = new String("Java");

        System.out.println(a == b);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
