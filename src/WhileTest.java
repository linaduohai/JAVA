/**
 * Created by Administrator on 2015/10/25.
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("----------");
//        for (int j = 0; j < 100; j++) {
//            System.out.println(j);
//        }
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);
    }
}
