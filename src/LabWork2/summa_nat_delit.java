package LabWork2;

import java.util.Scanner;
public class summa_nat_delit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), sum = 0;
        while (a!=0) {
            sum = sum + a%10;
            a=a/10;
        }
        System.out.println(sum);
    }
}
