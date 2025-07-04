package array;

import java.util.Arrays;
import java.util.Random;

public class array5 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random rand = new Random();

        for (int i = 0; i < 5; ) { 
            int num = rand.nextInt(10) + 1;

            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[i] = num;
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.stream(arr).max().getAsInt());
        System.out.println(Arrays.stream(arr).min().getAsInt());
        System.out.println(Arrays.stream(arr).average().getAsDouble());
    }
}