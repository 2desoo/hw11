public class Test {
    public static void info(String test) {
        System.out.println(test);
    }

    public static void printYearLeap(int year) {
        info("Task #1");
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        if (leapYear) {
            System.out.println(year + (" год является високосным."));
        } else {
            System.out.println(year + (" год не является високосным."));
        }
    }


    public static void checkDevice(int clientOs, int clientDeviceYear) {
        info("Task #2");
        int iOs = 0;
        int android = 1;
        if (clientOs == iOs && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOs == iOs && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == android && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOs == android && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static int checkDeliveryDistance(int a) {
        info("Task #3");
        int day = 1;
        if (a <= 20) {
            return day;
        } else if (a > 21 && a <= 60) {
            return day + 1;
        } else if (a > 61 && a <= 100) {
            return day + 2;
        } else {
            return -1;
        }
    }

    public static void time(int days) {
        if (days > 0) {
            info("Доставка займёт " + days + " дня.");
        } else {
            info("Доставки нет!");
        }
    }


    public static void task1() {
        printYearLeap(2001);
    }

    public static void task2() {
        checkDevice(0, 2013);
    }

    public static void task3(int deliveryDistance) {
        int deliveryTime = checkDeliveryDistance(deliveryDistance);
        time(deliveryTime);
    }

}
