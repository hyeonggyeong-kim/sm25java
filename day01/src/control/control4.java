package control;

public class control4 {
    public static void main(String[] args) {
        // 1~10까지의 숫자중 짝수의 합과 평균을 구하시오
        // for
        int sum = 0;
        double avg = 0.0;
        double count = 0.0;
        for (int i = 1; i <= 12; i++){
            if(i%2==0){
                sum += i;
            }
            count++;
            avg = sum/count;
        }
        System.out.println(sum);
        System.out.println(avg);
    }
}
