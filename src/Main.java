public class Main {
    public static void main(String[] args) {
        //Домашняя работа 1
        System.out.println("Домашняя работа 1");
        //Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i < 11; i++) {
            System.out.println("Порядковый номер " + i);
        }

        //Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println("Порядковый номер " + i);
        }

        //Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = (i + 2)) {
            System.out.println("Порядковый номер " + i);
        }

        //Задача 4
        System.out.println("Задача 4");
        for (int i = 10; i > (-11); i--) {
            System.out.println("Порядковый номер " + i);
        }

        //Домашняя работа 2
        System.out.println("Домашняя работа 2");
        //Задание 1
        System.out.println("Задание 1");
        for (int i = 1904; i < 2098; i = (i + 2)) {
            System.out.println(i + " год является високосным!");
        }

        //Задание 2
        System.out.println("Задание 2");
        for (int i = 7; i < 105; i = (i + 7)) {
            System.out.println("Номер " + i);
        }

        //Задание 3
        System.out.println("Задание 3");
        for (int i = 1; i < 1024; i = (i * 2)) {
            System.out.println("Номер " + i);
        }

        //Домашняя работа 3
        System.out.println("Домашняя работа 3");
        //Задача 1
        System.out.println("Задача 1");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13 ; i ++) {
            total += salary;
            System.out.println("Месяц " + i + " итого " + total);
        }

        //Задача 2
        System.out.println("Задача 2");
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 1; i < 13 ; i ++) {
            total1 = total1 + total1/100;
            total1 += salary1;
            System.out.println("Месяц " + i + " итого " + total1);
        }
    }
}