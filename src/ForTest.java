/**
 * Created by Administrator on 2015/10/25.
 */
public class ForTest {
    public static void main(String[] args) {
//        fori + tab
//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
////                break;//
//                continue;
//            }
//            System.out.println(i);
////            Ctrl + Alt + t
//        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i * j + "\t");
                if (i * j == 49) {
                    break;
                }
            }
            System.out.println();
            if (i == 7) {
                break;
            }
        }
    }
}

