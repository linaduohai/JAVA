/**
 * Created by Administrator on 2015/10/25.
 */
public class DataTest {
        public static void main(String[] args) {
            byte b = 127;
            char c = '\u4e00';// character table unicode
            short s = 100;
            int i = 1000;
            long l = 999999L;
            float f = 1.23f;
            double d = 123.456;
            String str = "asdf";// ×Ö·û´®Ö±½ÓÁ¿
            String str2 = null;
            System.out.println(Byte.MIN_VALUE + ":" + Byte.MAX_VALUE);
            System.out.println((int) Character.MIN_VALUE + ":" + (int) Character.MAX_VALUE);
            System.out.println(Short.MIN_VALUE + ":" + Short.MAX_VALUE);
            System.out.println(Integer.MIN_VALUE + ":" + Integer.MAX_VALUE);
            System.out.println(Long.MIN_VALUE + ":" + Long.MAX_VALUE);
            System.out.println(Float.MIN_VALUE + ":" + Float.MAX_VALUE);
            System.out.println(Double.MIN_VALUE + ":" + Float.MAX_VALUE);
            System.out.println(str2);
            System.out.println((int) c + "test...");// 40891 - 19968 + 1
        }
    }
