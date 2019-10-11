package com.helena;

import java.util.Scanner;

public class Variant1A {
    public static void main(String[] args) {

        //  1 задача Приветствовать любого пользователя при вводе его имени через командную строку
        String name;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите свое имя: ");
        name = in.next();
        System.out.println("Привет, " + name);

        // 2 задача Отобразить в окне консоли аргументы командной строки в обратном порядке
        int n;
        int[] a;
        Scanner arg = new Scanner(System.in);
        System.out.print("Введите количество аргументов: ");
        n = in.nextInt();
        a = new int[n];
        System.out.println("Введите аргументы: ");
        for(int i=0; i<n; i++) {
            a[i] = arg.nextInt();
        }
        System.out.println("Аргументы в обратном порядке: ");
        for (int j = a.length - 1; j >= 0; j--)
            System.out.println(a[j]);

        // 3 задача - Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        int m;
        int[] b;

        Scanner numRand = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        m = numRand.nextInt();
        b = new int[m];

        System.out.println("Случайные числа с переходом на новую строку:");
        for (int i = 0; i < m; i++) {
            b[i] = ((int) (Math.random() * 200) - 100);
            System.out.println(b[i]);
        }
        System.out.println("Случайные числа без перехода:");
        for (int i = 0; i < m; i++) {
            b[i] = ((int) (Math.random() * 200) - 100);
            if(i<m-1) {
            System.out.print(b[i] + " ");
            }
             else {
                System.out.println(b[i]);
            }
        }

        //4 задача Ввести пароль из командной строки и сравнить его со строкой-образцом
        String example = "123";
        String password;
        Scanner pas = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        password = pas.next();

        if(password.equals(example)) {
            System.out.println("Пароль верный");
        } else {
            System.out.println("Пароль не верный");
        }

        //5 задача Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
        int p;
        int[] c;
        Scanner num = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        p = num.nextInt();
        c = new int[p];
        System.out.println("Введите числа в количестве " + p);
        for(int i=0; i<p; i++) {
            c[i] = num.nextInt();
        }

        int sum = 0;
        int mult = 1;

        for(int i=0; i<n; i++) {
               sum += c[i];
            mult *= c[i];
        }
        System.out.println("Сумма чисел равна " + sum);
        System.out.println("Произведение чисел равно " + mult);

        // 6 задача. Вывести фамилию разработчика, дату и время получения задания, а также дату и время сдачи задания
        String devSurname = "Даниш";
        String dateTimeStart = "04.10.2019 14:00";
        String dateTimeEnd = "04.10.2019 15:00";
        System.out.println("Фамилия разработчика: " + devSurname + ", " +
                "дата и время получения задания: " + dateTimeStart + ", " +
                "дата и время завершения задания: " + dateTimeEnd);
    }
}