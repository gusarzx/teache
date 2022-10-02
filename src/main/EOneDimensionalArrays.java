import java.util.Scanner;

public class EOneDimensionalArrays {
    public static void main(String[] args) {
        // массивы данных (одномерные)
        int[] nums = new int[5];
        nums[0] = 45;
        nums[1] = 32;
        nums[2] = 1;
        nums[3] = 9;
        nums[4] = 3;
        int res = nums[2] + nums[3];
        System.out.println(res);

        float[] nums2 = new float[]{5.0f, 6.45f, 89.984f};
        //       System.out.println(nums2[1]);
        // показать весь массив
        for (int q = 0; q < nums2.length; q++) {
            System.out.println("Elements: " + nums2[q]);
        }

        // элементы массив с помощью пользователя
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);

        for (int z = 0; z < arr.length; z++) {
            System.out.print("Введите число: ");
            int value = scanner.nextInt();
            arr[z] = value;
        }

        int min = arr[0];
        for (int z = 0; z < arr.length; z++) {
            if (arr[z] < min)
                min = arr[z];
        }
        System.out.println("Minimal: " + min);
    }
}
