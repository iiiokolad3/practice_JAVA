package LabWork2;

import java.util.Scanner;
public class morning_run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        int count = 1;

        while (x < y) {
            x = x*1.1;
            //System.out.println(x);
            count++;
        }
        System.out.println(count);
    }
}
