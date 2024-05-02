import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 100 + 1);
        int CountLives = 10;
        System.out.println("Введите число от 1 до 100: ");

        while (true) {
            try {
                int guess = 0;
                guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Вы угадали!");
                    System.out.println("Количество жизней - " + CountLives);
                    System.out.println("Хотите попробовать еще?");
                    String answer = sc.next();

                    if (Objects.equals(answer, "да")) {
                        number = (int) (Math.random() * 100 + 1);
                    } else break;
                } else {
                    if (guess < number) {
                        System.out.println("Введите большее число");
                    } else {
                        System.out.println("Введите меньшее число");
                    }
                    CountLives -= 1;
                    System.out.println("Количество жизней: " + CountLives);
                    if (CountLives == 0) {
                        System.out.println("Вы проиграли");
                        break;
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число!");
                break;
            }
        }
    }
}