import java.sql.SQLOutput;

public class IFunctions {
    public static void main(String[] args) {
        // функции (методы)
//        info("Hello");
//        String java = "Java";
//        info(java);
//        info("");
////
//        short num = 7;
//        int result1 = summa((short) 5, num);
//
//        short num2 = 10;
//        int result2 = summa((short) 4, num2);
//        info(String.valueOf(result2));
//    }
//
//    public static int summa(short a, short b) {
//        int res = a + b;
//        String result = "Результат: " + res;
//        info(result);
//        return res;
//    }
//
//    // если функция ничего не возвращает, то ставится void (если хотим получить ответ то int, Stringer и так далее)
//    public static void info(String word) {
//        System.out.print(word);
//        System.out.println("!");
//    }

        byte[] nums1 = new byte[]{5, 6, 8};

        int summ1 = summaArray(nums1);
        System.out.println("Сумма 1: " + summ1);
    }

    public static int summaArray(byte[] arr) {
        int summa = 0;
        for (byte i = 0; i < arr.length; i++)
            summa += arr[i];

            return summa;
        }
    }
