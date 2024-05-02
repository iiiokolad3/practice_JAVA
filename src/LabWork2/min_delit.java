package LabWork2;

import java.util.Scanner;
public class min_delit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = 2;

        while (a >= b) {
            if (a % b == 0) {
                System.out.println(b);
                break;
            }
            b++;
        }
    }
}
