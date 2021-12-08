import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(78);
        numbers.add(10);
        numbers.add(17);
        numbers.add(89);
        numbers.add(16);

        System.out.println("Проверка метода removeAt, в классе ArrayList");
        numbers.print(); // ожидается [45, 78, 10, 17, 89, 16], размер массива равен 6
        numbers.removeAt(3);
        numbers.print(); // ожидается [45, 78, 10, 89, 16], размер массива равен 5

    }
}
