public class StringImmutabilityDemo {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";

        s1.concat(" language");

        System.out.println(s1);
        System.out.println(s2);
    }
}
