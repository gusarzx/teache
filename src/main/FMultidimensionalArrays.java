public class FMultidimensionalArrays {
    public static void main(String[] args) {
        // массивы данных (многомерные)
        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][] {
                {5, 7},
                {2, 8},
                {4, 3}
        };

        nums[1][1] = 67;
        System.out.println( nums[1][1]);
        String roman[] = {"I", "IV", "V"};
    }
}
