public class NumbersUtil {

    public int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException();
        }

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}
