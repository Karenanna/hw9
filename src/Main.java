public class Main {
    public static void main(String[] args) {
        // Задание 1.1;
        System.out.println("Задание 1.1");
        int money = 15000;
        int total = 0;
        int months = 1;
        while (total <= 2_459_000) {
            total = total += money;
            total = total + total / 100;
            months++;
            System.out.println("Месяц " + months + "сумма накоплений равнв" + total + " рублей.");
        }
        // Задание 1.2;
        System.out.println("Задание 1.2");
        int num = 0;
        while (num < 10) {
            num++;
            System.out.printf(" %d ", num);
        }
        System.out.printf("часть 2,  ");
        for (; num > 0; --num) {
            System.out.printf("%d ", num);
        }
        // Задание 1.3;
        System.out.println("Задание 1.3");
        int countryPopulation = 12_000_000;
        int born = 17000;
        int died = 8000;
        int year = 1;
        for (int i = 1; i <= 10; i++) {
            countryPopulation += born - died;
            System.out.println("Год" + year + "численность населения состовляет  %" + countryPopulation);
            year++;
        }
        // Задание 2.1;
        System.out.println("Задание 2.1");
        int sum = 15000;
        int monthNum = 1;
        while (sum <= 12_000_000) {
            sum *= 1.07;
            System.out.printf("месяц %d, сумма %d \n", monthNum, sum);
            monthNum++;
        }
        // Задание 2.2;
        System.out.println("Задание 2.2");
        int sum1 = 15000;
        int monthNum1 = 1;
        while (sum1 <= 12_000_000) {
            sum1 *= 1.07;
            if (monthNum1 % 6 == 0) {
                System.out.printf("месяц %d, сумма %d \n", monthNum1, sum1);
            }
            monthNum1++;
        }
        // Задание 2.3;
        System.out.println("Задание 2.3");
        int sum2 = 15000;
        for (int i = 1; i < 9 * 12; i += 6) {
            int sumBefore = sum2;
            sum2 *= 1 + 0.07 * 6;
            System.out.printf("месяц %d, сумма %d \n", i, sum2 - sumBefore);
        }
        // Задание 2.4;
        System.out.println("Задание 2.4");
        int firstFriday = 1;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница," + currentFriday + "ое число." + "Надо подготовить отчет.");
        }
        // Задание 3.1;
        System.out.println("Задание 3.1");
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int i = beginning; i < ending; ++i) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}

