package Roman_Rumi.ArrayPractice;

public class _05_Array_Program {

    public static int[] check_array(int[] array) {
        int largest = 0, smallest = 0, largest1 = 0;
        for (int arrays : array) {
            if (arrays > largest) largest = arrays;
            largest1 = largest;
        }
        for (int arrays : array) {
            if (arrays < largest1)
                smallest = arrays;
           largest1 = smallest;
        }
        return new int[]{largest, smallest};
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println(check_array(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})[i]);
        }
    }
}
