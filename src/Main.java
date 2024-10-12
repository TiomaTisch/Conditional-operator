import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("_______Задание 1________");

        Random rn = new Random();
        boolean clientOS = rn.nextBoolean();
        if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("_______Задание 2________");

        boolean clientDeviceYear =
                Integer.parseInt(System.console().readLine("Enter the year of manufacture of your phone model: ")) >= 2015;

        if (clientDeviceYear) {
            if (clientOS) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        else {
            if (clientOS) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

        System.out.println("_______Задание 3________");

        int year = Integer.parseInt(System.console().readLine("Enter the year: "));
        if (year < 1584) {
            System.out.println( year + " Тогда небыло такого понятия как високосный год");
        }
        if (year % 100 == 0 && year % 400 != 0 && year % 4 == 0) {
            System.out.println( year + " не високосный год");
        } else {
            System.out.println( year + " високосный год");
        }

        System.out.println("_______Задание 4________");

        int deliveryDistance = Integer.parseInt(System.console().readLine("Specify the approximate distance from you to the office: "));
        byte deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        if (deliveryDistance > 100) {
            deliveryDay++;
        }
        if ( deliveryDay <= 3){
            System.out.println("Потребуется дней: " + deliveryDay);
        }
        else {
            System.out.println("Доставки нет");
        }

        System.out.println("_______Задание 5________");

        byte monthNumber = Byte.parseByte(System.console().readLine("Enter a number: "));

        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Это Зима");
                break;
            case 3, 4, 5:
                System.out.println("Это Весна");
                break;
            case 6, 7, 8:
                System.out.println("Это Лето");
                break;
            case 10, 11, 9:
                System.out.println("Это Осень");
                break;
            default:
                System.out.println("Нет такого месяца!!!");
        }
    }
}