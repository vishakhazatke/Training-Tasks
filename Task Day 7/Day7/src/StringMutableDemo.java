import java.awt.desktop.SystemSleepEvent;

public class StringMutableDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Developer");
        System.out.println(sb);

        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Programmer");
        System.out.println(sbf);
    }
}
