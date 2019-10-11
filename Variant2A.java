package com.helena;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;


public class Variant2A {
    public static void main(String[] args) {
        //1 задача Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        int n;
        int[] a;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        n = in.nextInt();
        a = new int[n];

        System.out.println("Введите числа в количестве: " + n);
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        String str;
        int sum = 0;
        Integer[] myArray = new Integer[a.length];
        ArrayList numLength = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            str = Integer.toString(a[i]);
            int t = str.length();
            sum = t + sum;
            myArray[i] = str.length();
            numLength.add(t);
        }


        System.out.println("Массив исходный: " + Arrays.toString(a));
        System.out.println("Массив длин чисел: " + numLength.toString());

        Collections.sort(numLength);
        System.out.println("Массив длин чисел в порядке возрастания: " + numLength.toString());

        int max = (int) numLength.get(numLength.size() - 1);
        int min = (int) numLength.get(0);

        int minInd = Arrays.asList(myArray).indexOf(min);
        int maxInd = Arrays.asList(myArray).indexOf(max);

        for (int i = 0; i < a.length; i++) {
            if (i == minInd) {
                System.out.println("Самое короткое число: " + a[i] + ", его длина: " + min);
            } else if (i == maxInd) {
                System.out.println("Самое длинное число: " + a[i] + ", его длина: " + max);
            }
        }


        //  2. задача . Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины
        System.out.println("Числа в порядке возрастания длины: ");
        for (int i = 0; i < numLength.size(); i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (numLength.get(i) == myArray[j]) {
                    int indexMyArray = Arrays.asList(myArray).indexOf(myArray[j]);
                    //  System.out.println("Индексы в порядке возрастания длины: " + indexMyArray);
                    for (int g = 0; g < a.length; g++) {
                        if (g == indexMyArray) {
                            System.out.println(a[g] + ", его длина " + numLength.get(i));
                        }
                    }

                }
            }
        }


        System.out.println("Числа в порядке убывания длины: ");
        for (int i = numLength.size() - 1; i >= 0; i--) {
            for (int j = myArray.length - 1; j >= 0; j--) {
                if (numLength.get(i) == myArray[j]) {
                    int indexMyArray = Arrays.asList(myArray).indexOf(myArray[j]);
                    for (int g = 0; g < a.length; g++) {
                        if (g == indexMyArray) {
                            System.out.println(a[g] + ", его длина " + numLength.get(i));
                        }
                    }

                }
            }
        }

        //3 задача - Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
        int aver = sum / numLength.size();
        System.out.println("Сумма длин чисел: " + sum);
        System.out.println("Средняя длина: " + aver);

        System.out.println("Числа, длина которых больше средней:");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > aver) {
                int indexMyArray = Arrays.asList(myArray).indexOf(myArray[i]);
                for (int g = 0; g < a.length; g++) {
                    if (g == indexMyArray) {
                        System.out.println(a[g] + ", его длина " + myArray[i]);
                    }
                }
            }

        }
        System.out.println("Числа, длина которых меньше средней:");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < aver) {
                int indexMyArray = Arrays.asList(myArray).indexOf(myArray[i]);
                for (int g = 0; g < a.length; g++) {
                    if (g == indexMyArray) {
                        System.out.println(a[g] + ", его длина " + myArray[i]);
                    }
                }
            }

        }
    }
}

