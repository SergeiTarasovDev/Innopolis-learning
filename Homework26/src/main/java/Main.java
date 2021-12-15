public class Main {

    public static void main(String[] args) {
        NumbersUtil numbersUtil = new NumbersUtil();

        int a = 21;
        int b = 49;

        int gcd = numbersUtil.gcd(a, b);

        if (gcd < 0) {
            System.out.println("Введены некорректные значения");
        } else {
            System.out.println("Наименьший общий делитель для " + a + " и " + b + " равен: " + gcd);
        }

    }
}
