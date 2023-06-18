package Roman_Rumi.ArrayPractice;

import java.util.Scanner;
public class _06_Array_Program {

    public static int first_array_size, second_array_size;

    public static void array_lengths(int[] arrays) {
        first_array_size = arrays.length / 2;
        second_array_size = arrays.length - first_array_size;
    }

    public static int[][] split_main_array(int[] arrays) {

        int div = arrays.length / 2;
        int[] array1 = new int[div];
        int[] array2 = new int[arrays.length - div];
        for (int i = 0; i < div; i++) {
            array1[i] = arrays[i];
        }
        // System.arraycopy(arrays, 0, array1, 0, div);
        for (int i = 0, j = div; j < arrays.length; i++, j++) {
            array2[i] = arrays[j];
        }
        return new int[][]{array1, array2};
    }

    public static void main(String[] args) {
        System.out.print("How Many Values Do You Want To Store In An Array :: ");
        int sizeof_array = new Scanner(System.in).nextInt();
        int[] main_array = new int[sizeof_array];
        System.out.println("Enter Any " + sizeof_array + " Integer Values :: ");
        for (int i = 0; i < sizeof_array; i++) {
            main_array[i] = new Scanner(System.in).nextInt();
        }
        array_lengths(main_array);
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.println("First Array");
                for (int j = 0; j < first_array_size; j++) {
                    System.out.println(split_main_array(main_array)[i][j]);
                }
            }
            if (i == 1) {
                System.out.println("Second Array");
                for (int j = 0; j < second_array_size; j++) {
                    System.out.println(split_main_array(main_array)[i][j]);
                }
            }
        }
    }
}
