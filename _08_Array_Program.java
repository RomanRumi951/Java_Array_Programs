package Roman_Rumi.ArrayPractice;

import java.util.Enumeration;
import java.util.Vector;

public class _08_Array_Program {
    public static void main(String[] args) {
        int[] array = {0, 1, 3, 4};
        Vector<Integer> v = new Vector<>();
        int count;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    count = 1;
                }
            }
            if (count != 1) {
                v.add(array[i]);
            }
        }
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
    }
}
