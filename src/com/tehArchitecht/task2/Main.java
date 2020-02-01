package com.tehArchitecht.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- ТОВАР 1");
        demonstrateClass1();

        System.out.println();
        System.out.println("--- ТОВАР 2");
        demonstrateClass2();

        System.out.println();
        System.out.println("--- КОМНАТА");
        demonstrateClass3();

        System.out.println();
        System.out.println("--- РАБОТНИК");
        demonstrateClass4();

        System.out.println();
        System.out.println("--- ПРАВИЛЬНАЯ ДРОБЬ");
        demonstrateClass5();
    }

    private static void demonstrateClass1() {
        System.out.println();
        Product1 p1 = new Product1();
        System.out.println(p1);
        System.out.println("Выпущен " + p1.yearsSinceRelease() + " лет назад");
        System.out.println("Была ли увеличена цена: " + p1.increasePrice());
        System.out.println("Информация после обновления:");
        System.out.println(p1);

        System.out.println();
        Product1 p2 = new Product1("Хлеб", 30, 2020);
        System.out.println(p2);
        System.out.println("Выпущен " + p2.yearsSinceRelease() + " лет назад");
        System.out.println("Была ли увеличена цена: " + p2.increasePrice());
        System.out.println("Информация после обновления:");
        System.out.println(p2);

        System.out.println();
        Product1 p3 = new Product1("Вода", 50, 2015);
        System.out.println(p3);
        System.out.println("Выпущен " + p3.yearsSinceRelease() + " лет назад");
        System.out.println("Была ли увеличена цена: " + p3.increasePrice());
        System.out.println("Информация после обновления:");
        System.out.println(p3);
    }

    private static void demonstrateClass2() {
        System.out.println();
        Product2 p4 = new Product2();
        System.out.println(p4);
        System.out.println("Цена в долларах: " + p4.priceInDollars());

        System.out.println();
        Product2 p5 = new Product2("Вода", 50, "Белый Ключ");
        System.out.println(p5);
        System.out.println("Цена в долларах: " + p5.priceInDollars());
    }

    private static void demonstrateClass3() {
        System.out.println();
        Room r1 = new Room();
        System.out.println(r1);
        System.out.println("Площадь стен (вместе с окнами и дверьми): " + r1.totalWallArea());
        System.out.println("Площадь стен без окна и двери: " + r1.wallAreaExcludingWindowsAndDoors());

        System.out.println();
        Room r2 = new Room(5.5, 3.0, 3.3);
        System.out.println(r2);
        System.out.println("Площадь стен (вместе с окнами и дверьми): " + r2.totalWallArea());
        System.out.println("Площадь стен без окна и двери: " + r2.wallAreaExcludingWindowsAndDoors());
    }

    private static void demonstrateClass4() {
        System.out.println();
        Employee e1 = new Employee();
        System.out.println(e1);
        System.out.println("Возраст: " + e1.age());

        System.out.println();
        Employee e2 = new Employee("Швабрин", "Уброщик", 20_000.0, 1980);
        System.out.println(e2);
        System.out.println("Возраст: " + e2.age());

        System.out.println();
        Employee e3 = new Employee("Котов", "Программист", 70_000.0, 1991);
        System.out.println(e3);
        System.out.println("Возраст: " + e3.age());

        System.out.println();
        Employee.increaseSalaryAll();
        System.out.println("Информация после увеличения оклада: ");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }

    private static void demonstrateClass5() {
        System.out.println();
        ProperFraction f1 = new ProperFraction();
        System.out.println(f1);
        System.out.println("Значение дроби в процентах: " + f1.toPercentage());
        System.out.println("Сумма цифр значения знаменателя и числителя: " + f1.sumOfDigits());

        System.out.println();
        System.out.println("Попытка создать неправильную дробь через ProperFraction.");
        try {
            ProperFraction f2 = new ProperFraction(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        System.out.println();
        ProperFraction f3 = new ProperFraction(2, 5);
        System.out.println(f3);
        System.out.println("Значение дроби в процентах: " + f3.toPercentage());
        System.out.println("Сумма цифр значения знаменателя и числителя: " + f3.sumOfDigits());

        System.out.println();
        ProperFraction f4 = new ProperFraction(3, -42);
        System.out.println(f4);
        System.out.println("Значение дроби в процентах: " + f4.toPercentage());
        System.out.println("Сумма цифр значения знаменателя и числителя: " + f4.sumOfDigits());
    }
}
