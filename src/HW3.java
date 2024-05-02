import java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // задача 1
        System.out.println("Задача 1. Введите количество (n) карточек, затем (n-1) цифр до n: ");
        int n1 = sc.nextInt(), s1 = 0, s2 = 0;
        int number = 0;

        for (int i = 1; i <= n1; i++) {
            s1 += i;
        }
        for (int i = 0; i < (n1 - 1); i++) {
            number = sc.nextInt();
            s2 += number;
        }
        System.out.println(s1-s2);


        // задача 2
        System.out.println("Задача 2. Найдите произведение цифр числа: ");
        int a = 1;

        for (int n2 = sc.nextInt(); n2 > 0; n2 /= 10) {
            a = a * (n2 % 10);
        }
        System.out.println(a);


        // задача 3
        System.out.println("Задача 3. Найти количество максимумов:" +
                "\nCчитываются числа пока не 0:");
        int max = 0, t = 0;

        for (int i = sc.nextInt(); i != 0; i = sc.nextInt()) {
            if (max < i) {
                max = i;
                t = 0; // начинаем заново с 0
            }
            if (max == i) {
                t++;
            }
        }
        System.out.println(t);

        // задача 4
        System.out.println("Задача 4. Найти средний возраст. Вводится количество людей, затем пары типа \n{Имя} \n{Возраст}");
        int n4 = sc.nextInt();
        double sum = 0;

        for (int i = 0; i < n4; i++) {
            String name = sc.next();
            sum += sc.nextInt();
        }
        System.out.println(sum / n4);
    }
}



