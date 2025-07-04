package control;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class control7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter Command: (arr1, arr2, arr3)");
            String cmd = sc.nextLine();
            if(cmd.equals("q")){
                System.out.println("(Quit...)");
                break;
            }else if(cmd.equals("arr1")){
                // 1~10까지의 숫자를 하나 입력받는다
                System.out.println("Enter Number(1~10): ");
                String num1 = sc.nextLine();
                System.out.println("Enter Number(2~10): ");
                String num2 = sc.nextLine();
                System.out.printf("Input Number %s %s \n", num1, num2);
                System.out.printf("Plus: %s \n", num1 + num2);
                // String값을 Integer로 변환
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                System.out.printf("Add : %d \n", n1 + n2);
            }else if(cmd.equals("arr2")){
                // 한개의 1~10까지의 숫자를 입력 받는다.
                // 해당 사이즈의 1차원 배열을 생성한다.
                // 배열에 랜덤하게 1~10까지의 값을 입력 한다. 중복 되지 않게 입력
                // 1. 배열값을 출력
                // 2. 배열값의 합과 평균을 출력
                // 3. 최대, 최소 값 출력

                System.out.println("Enter Number(1~10): ");
                String num = sc.nextLine();
                int arr1 = Integer.parseInt(num);
                Random rand = new Random();



                int arr[] = new int [arr1];
                for(int i = 0; i<arr.length; i++) {
                    int randNum = rand.nextInt(10) + 1;
                    boolean flag = false;
                    for (int j = 0; j < i; j++) {
                        if (arr[j] == randNum) {
                            flag = true;
                            break;
                        }
                    }
                    if(flag){
                        i--;
                    }else{
                        arr[i] = randNum;
                    }
                }
                System.out.println(Arrays.toString(arr));

                int sum = 0;
                double avg = 0.0;
                for(int i = 0; i < arr.length; i++){
                    sum += arr[i];
                }
                avg = Double.valueOf(sum)/ arr.length;
                System.out.printf("Sum : %d \navg :%5.2f \n", sum, avg);
                int min = arr[0];
                int max = arr[0];
                for(int randNum : arr){
                    if(randNum < min){min = randNum;}
                    if(randNum > max){max = randNum;}
                }
                System.out.printf("최솟값 : %d \n최댓값 : %d \n", min, max);
            }else if(cmd.equals("arr3")) {
                // 두개의 1~5까지의 숫자를 입력 받는다.
                // 해당 사이즈의 2차원 배열을 생성 한다.
                // 배열에 랜덤하게 1~50까지의 값을 입력 한다. 중복 되지 않게 입력
                // 1. 배열값을 출력
                // 2. 배열값이 합과 평균을 출력
                // 3. 최대, 최소 값 출력
                System.out.println("Enter Number(1~5): ");
                String num = sc.nextLine();
                int arr1 = Integer.parseInt(num);
                Random rand = new Random();

                int arr[][] = new int[arr1][arr1];
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                        int randNum = rand.nextInt(50) + 1;
                        boolean flag = false;
                        for (int x = 0; x < arr1; x++) {
                            for (int y = 0; y < arr1; y++) {
                                if (arr[x][y] == randNum) {
                                    flag = true;
                                    break;
                                }
                            }
                            if (flag) break;
                        }
                        if (flag) { // 중복 있으면 같은 칸(j--)에서 다시
                            j--;
                            continue;
                        }
                        arr[i][j] = randNum;
                    }
                }

// 배열 출력
                System.out.println("배열 값:");
                for (int i = 0; i < arr1; i++) {
                    for (int j = 0; j < arr1; j++) {
                        System.out.printf("%3d ", arr[i][j]);
                    }
                    System.out.println();
                }
                int min = arr[0][0];
                int max = arr[0][0];
                int sum = 0;
                for(int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                        sum += arr[i][j];
                        if(arr[i][j] < min){min = arr[i][j];}
                        if(arr[i][j] > max){max = arr[i][j];}
                    }
                }
                double avg = Double.valueOf(sum)/ (arr.length*arr.length);
                System.out.printf("Sum : %d \navg :%5.2f \n", sum, avg);
                System.out.printf("최솟값 : %d \n최댓값 : %d \n", min, max);

            }else {
                System.out.println("Invalid Command");
            }
        }
        sc.close();
    }
}
