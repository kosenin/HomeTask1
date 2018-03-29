import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeTask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два целых числа:");

        try {
            int integerOne = scanner.nextInt();
            int integerTwo = scanner.nextInt();

            multiplication(integerOne, integerTwo);
            composition(integerOne, integerTwo);
            division(integerOne, integerTwo);
            deduction(integerOne, integerTwo);
        } catch (Exception e) {
            System.out.println("И все же числа должны быть целыми, напр. 2 или 3.");
        }


    }

    private static void multiplication(int one, int two) {
        System.out.println("Умножение: " + one * two);
    }

    private static void composition(int one, int two) {
        System.out.println("Сложение: " + (one + two));
    }

    private static void division(int one, int two) {
        if (two != 0) {
            System.out.println("Деление: " + one / two);
        } else
            System.out.println("Нельзя делить на 0");
    }

    private static void deduction(int one, int two) {
        System.out.println("Вычитание: " + (one - two));
    }


}
