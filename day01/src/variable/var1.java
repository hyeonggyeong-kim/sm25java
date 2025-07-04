package variable;

public class var1 {
    public static void main(String[] args) {
        // 정수 기본 타입 int, long을 사용할 때 그냥 쓰면 int로 들어가기에 숫자뒤에 L를 붙여줘야됨
        int inputNum = 2100000000; // 32bit 4byte
        long longNUM = 2100000000000000000L; // 64bit 8byte

        byte b1 = 100;
        byte b2 = 100;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        int num1 = 1500000000;
        int num2 = 1500000000;
        int result = num1 + num2;
        System.out.println(result);



        // 실수 double
        float f1 = 1000000000000.0F;
        float f2 = 1000000000000.0F;
        float f3 = f1 + f2;
        // float f4 = 1000000000000.0D;
        System.out.printf("%f", f3);
        double d1 = 10000000.0;
    }
}
