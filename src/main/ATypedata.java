public class ATypedata {

    public static void main(String[] args) {

        //вывод данных (sout)
        System.out.println("Переменные и типы данных");

        /* целые числа
        byte - от - 128 до 127 (1 байт)
        short - от - 32768 до 32767 (2 байта)
        int - от - 2147483648 до 2147483647 (4 байта)
        long - от 9223372036854775808 до 9223372036854775807 (8 байт)
         */
        int age = 24;
        System.out.println("Возвраст: " + age + ".");

        age = 45;
        System.out.println(age);

        /* числа с точкой
        float - на конце "f"
        double
        char - оидн символ в ''
         */
        float num = 4.4338758f;
        System.out.println(num);

        /* символы
        char - оидн символ
        string - сколько хочешь
         */
        char ch = '?';
        System.out.println(ch);

        String user_name = "Egor";
        System.out.println(user_name);

    }

}

