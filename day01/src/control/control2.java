package control;

public class control2 {
    public static void main(String[] args) {
        // 1~10까지의 합과 평균을
        // for문을 이용하여 구하시오.
        int sum = 0;
        double avg = 0.0;
        double count = 0.0;
        for (int i = 1; i <= 12; i++){
            sum += i;
            count++;
        }
        avg = Double.valueOf(sum)/count;
        System.out.printf("%d, %5.2f", sum, avg);
    }
}
