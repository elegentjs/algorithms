package win.elegentjs.algorithms.first;

/**
 * 打印斐波那契数列
 */
public class FibnqTest {

    public static void main(String[] args) {
        int f = 0;
        int g = 1;

        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
