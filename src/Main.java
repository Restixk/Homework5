import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int clientOSage = 2015;
        if (clientOS == 0 && clientOSage > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientOSage <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS != 0 && clientOSage > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS != 0 && clientOSage <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        int year = 400;
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " Это високосный год");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " Это високосный год");
        } else {
            System.out.println(year + " Это не високосный год");
        }
        int deliveryDistance = 106;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + day);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = day + 1;
            System.out.println("Потребуется дней " + day);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = day + 2;
            System.out.println("Потребуется дней " + day);
        }
        if (deliveryDistance > 100 ){
            System.out.println("Доствки нет");
        }
        int monthNumber = 17;
        switch (monthNumber){
            case 1 :
                System.out.println("Зима");
                break;
            case 2 :
                System.out.println("Зима");
                break;
            case 3 :
                System.out.println("Весна");
                break;
            case 4 :
                System.out.println("Весна");
                break;
            case 5 :
                System.out.println("Весна");
                break;
            case 6 :
                System.out.println("Лето");
                break;
            case 7 :
                System.out.println("Лето");
                break;
            case 8 :
                System.out.println("Лето");
                break;
            case 9 :
                System.out.println("Весна");
                break;
            case 10 :
                System.out.println("Весна");
                break;
            case 11 :
                System.out.println("Весна");
                break;
            case 12 :
                System.out.println("Зима");
                break;
            default:
                System.out.println("Нет такого месяца");

        }

    }
}
