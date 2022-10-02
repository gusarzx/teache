public class DForWhileDowhile {

    public static void main(String[] args) {
        // цикл for
        for (int i = 0; i <= 10; i++) {
            System.out.println("Element: " + i);
        }
        // посложнее
        for (float q = 100; q > 10; q /= 2) {
            System.out.println("Element2: " + q);
        }

        // цикл while
        int w = 0;
        while (w < 10) {
            System.out.println("Element3: " + w);
            w++;
        }

        // цикл DoWhile
        int e = 0;
        do {
            System.out.println("Element4: " + e);
            e++;
        } while (e < 10);

        // операторы цикла for
        for (int t = 5; t < 25; t += 2) {
            if (t % 3 == 0)
                continue; // не показывыает то что  кратно 3

            if (t >= 17)
               break; // показываетс до соответствующего момента
            System.out.println("Element5: " + t);
        }
    }
}