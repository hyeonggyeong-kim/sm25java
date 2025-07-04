package control;

public class control3 {
    public static void main(String[] args) {
        // 1~10까지 합과 평균을 구하시오
        // while
        int sum = 0;
        double avg = 0.0;
        int num = 0;
        while (num <= 10){
            sum += num;
            num++;
        }
        avg = sum*1.0 / num;
        System.out.printf("%d,%5.2f",sum, avg);

    }
}
