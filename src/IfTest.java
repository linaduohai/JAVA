/**
 * Created by Administrator on 2015/10/25.
 */
public class IfTest {
    public static void main(String[] args) {
 /*       int grade = 75;
        if (grade >= 85) {
            System.out.println("��....");
        } else if (grade >= 60) {
            System.out.println("��...");
        } else if (grade >= 75) {
            System.out.println("��");
        } else {
            System.out.println("��");
        }*/
        char c = '��';
        String s = "��";// JDK 1.7
        int i = 1;
        boolean b = true;
        switch (i) {// int char String
            case 1:
                System.out.println("85~100");
                break;
            case 2:
                System.out.println("75~85");
                break;
            case 3:
                System.out.println("60~75");
                break;
            default:
                System.out.println("0~60");
                break;// default ��� break һ��Ҫд
        }
        if (c == 'a') {
            System.out.println("test1...");// style
//            break;
        }
        System.out.println("test2...");
    }
}