public class Main {

    public static void printYearLeap(int year) {
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        if (leapYear) {
            System.out.println(year + (" год является високосным."));
        } else {
            System.out.println(year + (" год не является високосным."));
        }
    }

    public static void checkDevice(int clientOs, int clientDeviceYear) {
        int iOs = 0;
        int android = 1;
        if (clientOs == iOs && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOs == iOs && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == android && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOs == android && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static void checkDeliveryDistance(int deliveryDistance, int day) {
        if (deliveryDistance <= 20) {
            day++;
            System.out.println("Доставка займёт " + day + " день.");
        } else if (deliveryDistance > 21 && deliveryDistance <= 60) {
            day += 2;
            System.out.println("Доставка займёт " + day + " дня.");
        } else if (deliveryDistance > 61 && deliveryDistance <= 100) {
            day += 3;
            System.out.println("Доставка займёт " + day + " дня.");
        } else {
            System.out.println("Доставки нет!");
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        printYearLeap(2001);
    }

    private static void task2() {
        checkDevice(0, 2013);
    }

    private static void task3() {
        checkDeliveryDistance(101, 0);
    }
}