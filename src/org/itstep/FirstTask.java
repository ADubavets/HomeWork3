package org.itstep;

public class FirstTask {
    public static void main(String[] args) {
        //Задание 1. Найти сумму ряда (x<1)
        //Пример 2.3
        double x = 0.75;
        double sum = 0.0;
        double eps = 1e-10;
        int b1 = 1;
        int b2 = 4;
        double a = (float) x * b1 / b2;
        int i = 1;
        while (Math.abs(a) > eps) {
            sum += a;
            System.out.println("Calculation " + i + ": sum = " + sum);
            b1 += 4;
            b2 += 4;
            a *= (float) (-x) * b1 / b2;
            i++;
        }
        double control = (float) 1 - 1 / Math.pow((1 + x),1.0/4.0);
        System.out.printf("Task 2.3: x = %f; sum = %f; control = %f %n",x,sum,control);
        System.out.println(" ");
        //Пример 2.6:
        x = 0.52;
        a = (float) 1 / (x * x);
        sum = 0;
        i = 1;
        while (Math.abs(a) > eps) {
            sum += a;
            int j = 1;
            double d = 1;
            do {
                d *= (j + 1);
                j++;
            }
            while (j < (2 * i + 2));
            System.out.println("Calculation " + i + ": sum = " + sum);
            a *= (float) Math.pow(-1,i+1) * Math.pow(x,(2 * i)) / d;
            i++;
        }
        control = (float) Math.cos(x) / (x * x) + 0.5;
        System.out.printf("Task 2.6: x = %f; sum = %f; control = %f %n",x,sum,control);
        System.out.println(" ");
        //Пример 2.9:
        x = 0.3;
        sum = 0.0;
        b1 = 1;
        b2 = 2;
        a = (float) x * 0.5;
        i = 1;
        while (Math.abs(a) > eps) {
            sum += a;
            System.out.println("Calculation " + i + ": sum = " + sum);
            b1 += 2;
            b2 += 2;
            a *= (float) (-x) * b1 / b2;
            i++;
        }
        control = (float) 1 - 1 / Math.pow((1 + x),1.0/2.0);
        System.out.printf("Task 2.9: x = %f; sum = %f; control = %f %n",x,sum,control);
        System.out.println(" ");
        //Пример 2.12:
        x = 0.05;
        b1 = 2;
        a = (float) b1 * x;
        double d = 1;
        sum = 0;
        i = 1;
        while (Math.abs(a) > eps) {
            sum += a;
            System.out.println("Calculation " + i + ": sum = " + sum);
            d *= (i + 1);
            b1 += 1;
            a *= (float) (-x) * b1 / d;
            i++;
        }
        control = (float) x * Math.pow(Math.E,-x) - Math.pow(Math.E,-x) + 1;
        System.out.printf("Task 2.12: x = %f; sum = %f; control = %f %n",x,sum,control);
    }
}
