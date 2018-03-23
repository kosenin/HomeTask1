import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeTask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");

        try {
            int integerOne = scanner.nextInt();
            int integerTwo = scanner.nextInt();

            System.out.println("Сложение: " + (integerOne + integerTwo));
            System.out.println("Вычитание: " + (integerOne - integerTwo));
            System.out.println("Умножение: " + integerOne * integerTwo);
            System.out.println("Деление: " + integerOne / integerTwo);
            System.out.println("Остаток от деления: " + integerOne % integerTwo);

        } catch (InputMismatchException i) {
            System.out.println("Ошибка. Перезапустите программу и введите целое число");
        }

    }
}
