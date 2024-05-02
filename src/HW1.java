import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Задача 1
        System.out.println("Задача 1, введите количество пирожков: ");
        int count = sc.nextInt();
        if (count >= 22){
            System.out.print(count-10);
        }
        else{
            System.out.print(count/2);
        }

        // Задача 2
        System.out.println("Задача 2, введите h, m и x: ");
        int h = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
        if ((h*60*60 + m*60) >= x) {
            System.out.print("Успел");
        }
        else {
            System.out.print("Опоздал");
        }

        // Задача 3
        System.out.println("Задача 3, введите 3 числа: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
        System.out.println(Math.max(Math.max(num1, num2), num3));

        // Задача 4
        System.out.println("Задача 4, введите год: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        // Задача 5
        System.out.println("Задача 5, введите a, b: ");
        int a = sc.nextInt(), b = sc.nextInt();
        if (a != 0) {
            System.out.println(1);
        } else if (b != 0) {
            System.out.println(0);
        } else {
            System.out.println("inf");
        }

        // Задача 6
        System.out.println("Задача 6, введите a, b, c: ");
        int a1 = sc.nextInt(), b1 = sc.nextInt(), c1 = sc.nextInt();
        float D = b1*b1 - 4*a1*c1;
        if (D < 0) {
            System.out.println(0);
        } else if (D == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

        // Задача 7
        System.out.println("Задача 7, введите a, b, с: ");
        int a2 = sc.nextInt(), b2 = sc.nextInt(), c2 = sc.nextInt();
        if ((a2 < b2 + c2) & (b2 < a2 + c2) & (c2 < a2 + b2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // Задача 8
        System.out.println("Задача 8, введите координаты слона и другой фигуры: ");
        int slonX = sc.nextInt(), slonY = sc.nextInt();
        int chessX = sc.nextInt(), chessY = sc.nextInt();
        if ((chessX == slonX - 2 && chessY == slonY - 2) || (chessX == slonX + 2 && chessY == slonY + 2) || (chessX == slonX - 2 && chessY == slonY + 2) || (chessX == slonX + 2 && chessY == slonY - 2)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        // Задача 9
        System.out.println("Задача 9 'про котлеты', введите k, m и n: ");
        int k = sc.nextInt(), minutes = sc.nextInt(), n = sc.nextInt();
        int totalTime = 0;
        while (n > 0)
        {
            if (n - k > 0) totalTime += (minutes * 2) / k;
            else totalTime += minutes * 2;
            n -= k;
        }
        System.out.println(totalTime);

        //Задача 10
        System.out.println("Задача 10, введите число: ");
        int arabicNumber = sc.nextInt();
        int []A = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String []R = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String romanNumber = "";
        int useCount;
        for (int i = 0; i < A.length; i++)
        {
            useCount = arabicNumber / A[i];
            for (int j = 0; j < useCount; j++)
            {
                romanNumber += R[i];
            }
            arabicNumber -= useCount * A[i];
        }
        System.out.println(romanNumber);
    }
}
