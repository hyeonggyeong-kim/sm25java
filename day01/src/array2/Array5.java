package array2;

import java.util.Arrays;
import java.util.Random;

public class Array5 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = rand.nextInt(10) + 1;
                if (i == 0 && j == 0) {
                    arr[i][j] = num;
                } else {
                    boolean flag = true;
                    point:
                    for(int k = 0; k<=i; k++){
                        for(int n : arr[k]){
                            if(n == num){
                                flag = false;
                                j--;
                                break point;
                            }
                        }
                    }
                    if(flag){
                        arr[i][j] = num;
                    }
                }
            }
        }
        for (int n[] : arr) {
            for (int num : n) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}