package shop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main Application...");
        SmService<CustDto, String> smService;
        smService = new CustService();
        System.out.println("1. Cust Register...");
        CustDto custDto = new CustDto("id01", "pwd01", "이말숙");
        smService.register(custDto);
        System.out.println("end Main Application...");
    }
}
