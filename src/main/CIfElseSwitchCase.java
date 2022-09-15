import java.util.Scanner;

public class CIfElseSwitchCase {
    public static void main(String[] args) {

        // условыне конструкции if-else (! - значит нет) (|| - если одно условия)
        // (&& - два условия)
        int a = 15, b = 20;
        char sym1 = 'A', sym2 = 'A';
        boolean isHasCar = true;
        if (isHasCar && a == b) {
            System.out.println("Да, верно");

            // вторая проверка (всегда между If и False)
        } else if (a == b) {
            System.out.println("Second Test");

        } else if (a <= b) {
            System.out.println("2 Test");

            // если основное условие не верно
        } else {
            System.out.println("Нет, не верно");
        }

        // искомая строка ".equals"
        Scanner scanneer = new Scanner(System.in);
        System.out.print("Введите роль: ");
        String role = scanneer.nextLine();
        System.out.print("Введите пароль: ");
        String pass = scanneer.nextLine();
        if (role.equals("Admin") && pass.equals("55")) {
            System.out.println("Все пользователи");
        } else {
            System.out.println("Привет, как вас зовут?");
            String name = scanneer.nextLine();
        }

        // если одну переменную нужно проверить на множество значений
        Scanner scanneer1 = new Scanner(System.in);
        int num = scanneer1.nextInt();
        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 10:
                System.out.println("Number is 10");
                break;
            default:
                System.out.println("Default");
        }

        // сложный калькулятор
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите 1 число: ");
        int nume = scanner1.nextInt();


        System.out.println("Введите 2 число: ");
        int nume1 = scanner1.nextInt();

        int res;

        System.out.println("Действие: ");
        String action = scanner1.nextLine();
        try {
            action = scanner1.nextLine();
        } catch (Exception ex){
            System.out.println("Что то пошло не так");
        }

        switch (action) {
            case "+":
                res = nume + nume1;
                System.out.println("Результат: " + res);
                break;


            case "-":
                res = nume - nume1;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = nume * nume1;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if (nume1 == 0)
                    System.out.println("Error");
                else {
                    res = nume / nume1;
                    System.out.println("Результат: " + res);
                }
                break;
            default:
                System.out.println("Что-то не так");
        }


    }
}
