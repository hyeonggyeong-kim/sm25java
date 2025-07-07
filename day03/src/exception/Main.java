package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Input Number..?");
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        try{
            num = scanner.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Please enter a number.");
            return;
        }
        int a[] = null;
        try{
            a = new int[num];
        }catch(Exception e){
            System.out.println("Please enter a Positive Number.");
            return;
        }
        for (int i = 0; i <= a.length; i++) {
            System.out.printf("%d", a[i]);
        }
    }
}