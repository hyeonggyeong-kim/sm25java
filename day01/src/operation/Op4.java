package operation;

public class Op4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        // 3수의 최대 값과 최소 값을 구하시오
        int min = 0;
        int max = 0;
        max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        min = (a < b) ? ((a < c) ? a : c) : ((b > c) ? b : c);
        System.out.printf("최대값 : %d\n", max);
        System.out.printf("최소값 : %d\n", min);
        // if
        if (b > max) max = b;
        if (c > max) max = c;
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.printf("최대값 : %d\n", max);
        System.out.printf("최소값 : %d\n", min);
    }
}