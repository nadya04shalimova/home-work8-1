import java.time.LocalDate;

public class hw {


    //Задача 2
    public static int getClientPhoneSettings(String osName, int Year) {
        int currentYear = LocalDate.now().getYear();
        ;
        if (osName.equals("Android") && Year <= currentYear) {
            System.out.println("Установите облегченную версию для Андроид по ссылке");
        } else if (osName.equals("Android") && Year >= currentYear) {
            System.out.println("Установите версию для Андроид по ссылке");
        } else if (osName.equals("iOS") && Year <= currentYear) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        } else {
            System.out.println("Установите версию для iOS");
        }
        return Year;

    }

    // Задача 1
    public static void visYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + "год не является высокосным");
        }
    }

    //Задача 3
    public static int getClientDeliveryDays(int deliveryDistanse) {
        int interval = 40;
        int startInterval = 20;
        int deliveryDays=1;
        if (deliveryDistanse <= startInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistanse - startInterval) / interval) + 1;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
        return deliveryDays;

    }


        public static void main (String[] args){
            String osName = "Android";
            int Year = 2020;
            int currentYear = LocalDate.now().getYear();
            int phoneSettings = getClientPhoneSettings(osName, Year);
            System.out.println();
            int a = 2016;
            visYear(a);
            System.out.println();
            int deliveryDistanse = 95;
            deliveryDistanse = getClientDeliveryDays(deliveryDistanse);

        }

    }




