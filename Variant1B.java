package com.helena;

import java.util.Scanner;
import java.util.Arrays;


public class Variant1B {
    public static void main(String[] args) {

        //Ввести с консоли n целых чисел. На консоль вывести:

        //1 задача Четные и нечетные числа
        int n;
        int[] array;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        n = in.nextInt();
        array = new int[n];
        System.out.println("Введите числа в количестве: " + n);
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Четные: ");
        for (int j = 0; j < n; j++) {
            if (array[j] % 2 == 0) {
                System.out.println(array[j] + " ");
            }
        }
        System.out.println("Нечетные: ");
        for (int j = 0; j < n; j++) {
            if (array[j] % 2 != 0) {
                System.out.println(array[j] + " ");
            }
        }

        // 2 задача Наибольшее и наименьшее число.
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            max = Math.max(max, array[j]);
            min = Math.min(min, array[j]);
        }
        System.out.println("Максимальный элемент в массиве array: " + max);
        System.out.println("Миниимальный элемент в массиве array: " + min);

        //3 задача Числа, которые делятся на 3 или на 9
        System.out.println("Числа, которые делятся на 3 или на 9: ");
        for (int j = 0; j < n; j++) {
            if (array[j] % 9 == 0 || array[j] % 3 == 0) {
                System.out.println(array[j] + " ");
            }
        }
        //4 задача Числа, которые делятся на 5 и на 7
        System.out.println("Числа, которые делятся на 5 и на 7: ");
        for (int j = 0; j < n; j++) {
            if (array[j] % 5 == 0 && array[j] % 7 == 0) {
                System.out.println(array[j] + " ");
            }
        }

        //5 задача Элементы, расположенные методом пузырька по убыванию модулей.
        int[] b;
        b = new int[n];
        int[] d;
        d = new int[n];
        for (int j = 0; j < n; j++) {
            b[j] = Math.abs(array[j]);
        }
        Arrays.sort(b); // для краткости применю sort
        System.out.println("Числа по убыванию модулей: ");
        for (int j = b.length - 1; j >= 0; j--) {
            System.out.println(b[j]);
            d[j] = b[b.length - 1 - j];
        }
        System.out.print("Числа по убыванию модулей в массиве: ");
        System.out.println(Arrays.toString(d));

        //6 задача Все трехзначные числа, в десятичной записи которых нет одинаковых цифр
        String str;
        System.out.println("Трехзначные числа, где нет одинаковых цифр: ");
        for (int j = 0; j < n; j++) {
            str = Integer.toString(array[j]);
            if (str.length() == 3 && str.charAt(0) != str.charAt(1) && str.charAt(0) != str.charAt(2) && str.charAt(1) != str.charAt(2)) {
                System.out.println(array[j]);
            }
        }


        //9 Отсортированные числа в порядке возрастания и убывания.
        int[] c;
        c = new int[n];
        System.out.println("Числа в порядке возрастания: ");
        for (int j = 0; j < n; j++) {
            c[j] = array[j];
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));

        System.out.println("Числа в порядке убывания: ");
        int p;
        int r = c.length / 2;
        for (int j = 0; j < r; j++) {
            p = c[c.length - 1 - j];
            c[c.length - 1 - j] = c[j];
            c[j] = p;
        }
        System.out.println(Arrays.toString(c));


    }

}


