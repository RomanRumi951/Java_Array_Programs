package Roman_Rumi.ArrayPractice;

import java.util.Scanner;

public class _03_Array_Program {
    public static int[] check = new int[5];
    public static int[] check_Array_Elements(int[] array) {
        int i = 0, j = 0, k = 0, l = 0, m = 0;
        for (int arrays : array) {
            if (arrays < 0)
                i++;
            else if (arrays > 0)
                j++;
            else if (arrays == 0)
                k++;
            if (arrays % 2 == 0 && arrays != 0)
                l++;
            else if (arrays % 2 != 0)
                m++;
        }
        return new int[]{i, j, k, l, m};
    }

    public static void array_Input() {
        System.out.println("Enter Any 5 Integer Elements :: ");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("1. Values Less Than Zero \t 2. Values Greater Than Zero \t 3. Values Equals Zero \t 3. Even Numbers \t 3. Odd Numbers.");
        for (int i = 0; i <check.length; i++) System.out.print(check_Array_Elements(array)[i]+"\t\t\t\t\t\t\t\t");
    }

    public static void main(String[] args) {
        array_Input();
    }
}
