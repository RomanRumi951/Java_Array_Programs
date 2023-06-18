package Roman_Rumi.ArrayPractice;

public class _07_Array_Program {

    public static int sub_str_pos(String str1, String str2) {
        int i = 0, count = 0;
        do {
            count = 0;
            if (str2.charAt(0) == str1.charAt(i)) {
                count++;
                for (int j = 1; j < str2.length() && (i + j) < str1.length(); j++) {
                    if (str2.charAt(j) == str1.charAt(i + j)) {
                        count++;
                    }
                    if (count == str2.length()) {
                        return i;
                    }
                }
            }
            i++;
        } while (i < str1.length());
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(sub_str_pos("butsasad", "sad"));
    }
}


/*
main array = [0,1,1,2,0,1,3,4,4];
ans array = [2,3];
*/
