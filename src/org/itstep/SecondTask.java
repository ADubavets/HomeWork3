package org.itstep;

public class SecondTask {
    static int size = 10;
    static int [] arr = new  int [size];
    public static void main(String[] args) {
        /* Задание 4.3: Даны действительные числа с1, с2, с3, ..., сn. Найти произведение суммы чисел с нечетными
        индексами и суммы чисел с четными индексами. */
        FileLoader();
        PrintArr();
        System.out.println("The final product of the numbers: " + (SumOfOdd() * SumOfEven()));
        
    }

    public static void PrintArr() {
        for (int elem:arr) {
            System.out.print(elem + " ");
        }
        System.out.println(" ");
    }

    public static int SumOfEven() {
        int sum = 0;
        for (int i = 0; i < 10; i++) if (i % 2 == 0) sum += arr[i];
        System.out.println("The sum of numbers with even indexes: " + sum);
        return sum;
    }

    public static int SumOfOdd() {
        int sum = 0;
        for (int i = 0; i < 10; i++) if (i % 2 == 1) sum += arr[i];
        System.out.println("The sum of numbers with odd indexes: " + sum);
        return sum;
    }

    public static void FileLoader() {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + i * 2;
        }
    }
}
