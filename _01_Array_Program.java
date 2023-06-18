package Roman_Rumi.ArrayPractice;

import java.util.Scanner;

public class _01_Array_Program {
    public static String take_and_display_array(int[] arrays) {
//        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("[");
//        System.out.println("Enter Ten(10) Elements For Array ::");
        for (int i = 0; i < arrays.length; i++) {
//            arrays[i] = sc.nextInt();
            if (i != (arrays.length - 1))
                str.append(arrays[i]).append(", ");
            else
                str.append(arrays[i]).append("]");
        }
        return str.toString();
    }

  /*  public static void main(String[] args) {
        int[] arrays = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(take_and_display_array(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        for (int i = 0; i < new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}.length; i++)
        System.out.print(take_and_display_array(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})[i] + " ");
        System.out.println(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}.);
    }*/
}

