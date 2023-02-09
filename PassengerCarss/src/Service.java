import java.io.IOException;
import java.util.Scanner;

public class Service extends Replacement {
    boolean choiceEnd = false;
    String choice;
    int price;
    int money;
    int result;
    boolean moneyCheck = false;

    public void go() {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите сколько у вас денег (Именно цифрами! пример: 5000) >> ");
        try {
            money = input.nextInt();
            moneyCheck = true;
        } catch (Exception e) {
            System.out.println("Вы ввели неправильное значение! Перезапустите программу!");
            System.exit(0);
        }
        if (money <= 1000) {
            System.out.println("У вас не хватает денег, приходите попозже");
            System.exit(0);
        }
        System.out.print("""
                Добро пожаловать в нашу автомастерскую "Весёлые колёса" """);

        while (!choiceEnd) {
            System.out.print("""
                                        
                    Вам на выбор предоставлено несколько услуг:
                    1. Починка бокового крыла                   Цена: 1000
                    2. Починка лобового стекла                  Цена: 2000
                    3. Починка тормозов                         Цена: 3000
                    4. Починка рулевой рейки                    Цена: 4000
                    5. Починка зеркал                           Цена: 5000
                    6. Починка фонарей                          Цена: 6000
                    7. Покраска автомобиля                      Цена: 7000
                    8. Замена колёс                             Цена: 8000
                    9. Замена поршней                           Цена: 9000
                    10. Калибровка бортового компьютера         Цена: 10000
                                        
                    Введите номер услуги (Если хотите закончить выбор услуг введите: 0) >> """);
            choice = input.next();

            switch (choice) {
                case "1":
                    price = price + 1000;
                    System.out.println("Вы выбрали: Починка бокового крыла\nИтоговая цена составляет: " + price);
                    break;
                case "2":
                    price = price + 2000;
                    System.out.println("Вы выбрали: Починка лобового стекла\nИтоговая цена составляет: " + price);
                    break;
                case "3":
                    price = price + 3000;
                    System.out.println("Вы выбрали: Починка тормозов\nИтоговая цена составляет: " + price);
                    break;
                case "4":
                    price = price + 4000;
                    System.out.println("Вы выбрали: Починка рулевой рейки\nИтоговая цена составляет: " + price);
                    break;
                case "5":
                    price = price + 5000;
                    System.out.println("Вы выбрали: Починка зеркал\nИтоговая цена составляет: " + price);
                    break;
                case "6":
                    price = price + 6000;
                    System.out.println("Вы выбрали: Починка фонарей\nИтоговая цена составляет: " + price);
                    break;
                case "7":
                    price = price + 7000;
                    System.out.println("Вы выбрали: Покраска автомобиля\nИтоговая цена составляет: " + price);
                    break;
                case "8":
                    price = price + 8000;
                    System.out.println("Вы выбрали: Замена колёс\nИтоговая цена составляет: " + price);
                    break;
                case "9":
                    price = price + 9000;
                    System.out.println("Вы выбрали: Замена поршней\nИтоговая цена составляет: " + price);
                    break;
                case "10":
                    price = price + 10000;
                    System.out.println("Вы выбрали: Калибровка бортового компьютера\nИтоговая цена составляет: " + price);
                    break;
                case "0":
                    choiceEnd = true;
                    break;
                default:
                    System.out.println("Вы ввели не то значение, повторите попытку!");
            }

            System.out.println("Выбор завершён, итоговая цена: " + price);

            result = replacement(money, price);
            if (result >= 0) {
                System.out.println("Ваша сдача составляет: " + result);
            } else {
                System.out.println("Вы должны нашему автосервису: " + (-result));
            }
        }
    }
}