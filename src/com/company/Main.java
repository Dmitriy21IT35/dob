package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Введите числа:");
        int size = input.nextInt();
        int [] mas1 = new int[size];
        for (int i = 0; i < size; i++) {
            Scanner input1 = new Scanner(System.in);
            mas1[i] = input1.nextInt();

        }
        System.out.println(Arrays.toString(mas1));
        int sr = 0;
        for (int i = 0; i < size; i++) {
            sr += mas1[i];
        }
        sr=size;
        System.out.println("Среднее:"+sr);

        int min = mas1[0];
        for(int i=0;i<size;i++){
            if (min>mas1[i]){
                min=mas1[i];
            }
        }
        System.out.println("Минимальное значение:"+min);
        int sum = min + sr;
        System.out.println("Сумма ср и минимального значения:"+sum);

    }
}

