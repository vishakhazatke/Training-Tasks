public class StringMethodsDemo {
    public static void main(String[] args) {

        String s = "  Java Programming  ";

        System.out.println(s.charAt(2));
        System.out.println(s.length());
        System.out.println(s.substring(2,6));
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("a"));

        System.out.println(s.equals("java programming"));
        System.out.println(s.equalsIgnoreCase("java programming"));

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());

        System.out.println(s.replace("Java", "Python"));

        String words[] = s.trim().split(" ");
        System.out.println(words[0]);

        String s2 = s.concat(" Language");
        System.out.println(s);
        System.out.println(s2);
    }
}
