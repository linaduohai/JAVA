/**
 * Created by Administrator on 2015/10/25.
 */
public class CompareTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 != s2);
    }
}