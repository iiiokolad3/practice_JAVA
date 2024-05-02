import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Задача 6
        System.out.println("Задача 6, введите числа: ");
        double num, sum = 0;
        do {
            num = sc.nextDouble();
            sum += num;
        }
        while (num != 0);
        System.out.println(sum);

        // Задача 7
        System.out.println("Задача 7, введите n и x: ");
        int n = sc.nextInt(), x = sc.nextInt();
        int summ = x;
        while (summ < n) {
            summ += x;
        }
        System.out.println(summ);

        // Задача 8
        System.out.println("Задача 8, введите n и x: ");
        int n1 = sc.nextInt(), a = sc.nextInt(), s = a;
        int count = 1;
        while (s < n1) {
            a = sc.nextInt();
            s *= a;
            count++;
        }
        System.out.println(count + " " + s);

        // Задача 9
        System.out.println("Задача 9, введите число: ");
        int n2 = sc.nextInt(), i = 1;
        String star = "*";
        while (i <= n2) {
            System.out.println(star);
            i++;
            star += "*";
        }

        // Задача 10
        System.out.println("Задача 10, введите число: ");
        int n10 = sc.nextInt();
        int i10 = 0;
        String star1 = "*", p = star1, pr;
        int nr = n10 - 1;
        while (i10 < n10) {
            pr = " ".repeat(nr);
            System.out.println(pr + p);
            p = p + star1 + star1;
            i10++;
            nr--;
        }

        System.out.println("Задача 10, второй вариант, введите число: ");
        int i_10 = 1;
        int n_10 = sc.nextInt();
        String star_10 = "*";
        int star2 = 1;
        while (i_10 <= n_10) {
            System.out.println(" ".repeat(n_10-i_10)+star_10.repeat(star2));
            i_10++;
            star2 += 2;
        }
    }
}

