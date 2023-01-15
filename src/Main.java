public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();


    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int a = 0; a <= 17; a = a + 2) {
            System.out.println("Итерация цикла " + a);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int a = 10; a >= -10; a = a - 1) {
            System.out.println("Итерация цикла " + a);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int g = 1904; g < 2096; g = g + 4) {
            System.out.println(g + " Год является высокосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int s = 7; s <= 98; s = s + 7) {
            System.out.println(s);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int d = 1; d <= 512; d = d * 2) {
            System.out.println(d);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int accumulation = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i = i + 1) {
            total = total + accumulation;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int accumulation = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i = i + 1) {
            total = total + total / 100;
            total = total + accumulation;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }
}

