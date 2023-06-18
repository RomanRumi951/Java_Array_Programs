package Roman_Rumi.ArrayPractice;

import java.util.Arrays;

public class _02_Array_Program
{
    public static int search_num_in_array(int[] arrays, int target)
    {
        int i = Arrays.stream(arrays).filter(array -> array == target).findFirst().orElse(0);
        System.out.println(i);
        return i;
    }
}
