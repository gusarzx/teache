
import java.util.Scanner;

public class BDataFromUser {
    public static void main(String[] args) {


        // получение ответа от пользователя "nextLine"
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String username = scan.nextLine();
        System.out.println("Привет, " + username);
        /*
        int num = scan.nextInt();
        byte num1 = scan.nextByte();
        boolean b = scan.nextBoolean();
        */

        // математика
        Scanner scan1 = new Scanner(System.in);
        short num2 = 50, num3 = 33;
        int  res = num2 + num3;
        res += 10;
        System.out.println("Резлутьтат: " + res);

        // калькулятор
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите 1 число: ");
        int num4 = scan.nextInt();
        System.out.println("Введите 2 число: ");
        int num5 = scan.nextInt();

        int pes1 = num4 + num5;
        int pes2 = num4 - num5;
        int pes3 = num4 * num5;
        int pes4 = num4 / num5;

        System.out.println("Результат: ");
        System.out.println(pes1 + "\n" + pes2 + "\n" + pes3 + "\n" + pes4);
        
    }
}
