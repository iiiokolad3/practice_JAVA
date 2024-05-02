import java.util.Scanner;

public class CW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // задача 1
        // вводим длину массива, далее заполняем его и в конце на что умножаем
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int j = 0; j < n; j++) {
            System.out.println(a[j] * x);
        }
        // задача 2
        // кубы чисел
        int a_2 = sc.nextInt(), b = sc.nextInt(), n_2 = 1001;

        int[] c = new int[n_2];

        for (int i = 0; i < n_2; i++) {
            c[i] = (int) Math.pow(i, 3);
        }
        System.out.println(c[a_2] + "\n" + c[b]);
    }
}
