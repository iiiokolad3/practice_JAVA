package LabWork2;

import java.util.Scanner;
public class Summ_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        int count = 0, summ = 0;
        while (true) {
           number = sc.nextInt();
           if (number != 0) {
               summ += number;
               count++;
           } else break;
        }
        System.out.println(summ / count);
    }
}
