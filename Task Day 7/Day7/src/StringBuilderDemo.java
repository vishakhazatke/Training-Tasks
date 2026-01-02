public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        System.out.println(sb.capacity());

        sb.append(" Programming");
        System.out.println(sb);

        sb.insert(4, " Language");
        System.out.println(sb);

        sb.delete(4, 13);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
