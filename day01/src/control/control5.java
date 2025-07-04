package control;

public class control5 {
    public static void main(String[] args) {
        // 1~10까지의 숫자중 짝수의 합과 평균을 구하시오
        // while
        int sum = 0;
        double avg = 0.0;
        int num = 1;
        double cnt = 0.0;
        while (num <= 10){
            if(num%2==0){
                sum += num;
                cnt++;
            }
            num++;
        }
        avg = sum*1.0/cnt;
        System.out.printf("%d, %5.2f \n", sum, avg);
    }
}
