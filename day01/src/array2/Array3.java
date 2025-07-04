package array2;

import java.util.Arrays;
import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        //5행 5열의 배열에
        // 1~100까지의 random 한 숫자를 입력 한다.
        // 단, 중복 되서 들어가면 안된다.
        // 최종 배열을 출력
        int arr[][] = new int[5][5];
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num = rand.nextInt(100) + 1;
                int count = 0;
                for (int n = 0; n < 5; n++) {
                    for (int k = 0; k < 5; k++) {
                        if (n > i || (n == i && k >= j))
                            break;
                        if (arr[n][k] == num) {
                            count++;
                        }
                    }
                    if (count > 0) break;
                }
                if (count > 0)
                {
                    j--;
                } else{
                    arr[i][j] = num;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
