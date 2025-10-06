//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int clientOS = 0; // iOS = 0, Android = 1
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        int year = 2006;
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }


        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance <= 60) {
            days +=1 ;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance <=100) {
            days +=2;
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки свыше 100км нет");
        }

        int monthNumber = 12;
        switch (monthNumber) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("Зима");
                break;
            case 3 :
            case 4 :
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }


        }
}