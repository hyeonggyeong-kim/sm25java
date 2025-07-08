package shop.app;

import shop.dto.CustDto;
import shop.service.CustService;

import java.util.List;
import java.util.Scanner;

public class CustApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustService service = new CustService();

        while (true) {
            System.out.println("enter Command q, i, s, sa, d, u");
            String cmd = sc.nextLine();

            if (cmd.equals("q")) {
                System.out.println("quit....");
                break;

            } else if (cmd.equals("i")) {
                System.out.println("insert Cust ID");
                String id = sc.nextLine();

                System.out.println("insert Cust Password");
                String pwd = sc.nextLine();

                System.out.println("insert Cust Name");
                String name = sc.nextLine();

                service.register(new CustDto(id, pwd, name));
                System.out.println("Inserted!");

            } else if (cmd.equals("s")) {
                System.out.println("select Cust ID");
                String id = sc.nextLine();

                CustDto cust = service.get(id);
                if (cust != null) {
                    System.out.println(cust);
                } else {
                    System.out.println("Not Found");
                }

            } else if (cmd.equals("sa")) {
                System.out.println("select ALL....");
                List<CustDto> list = service.get();
                if (list.isEmpty()) {
                    System.out.println("No Customers");
                } else {
                    for (CustDto cust : list) {
                        System.out.println(cust);
                    }
                }

            } else if (cmd.equals("d")) {
                System.out.println("delete Cust ID");
                String id = sc.nextLine();

                service.remove(id);
                System.out.println("Deleted!");

            } else if (cmd.equals("u")) {
                System.out.println("update Cust ID");
                String id = sc.nextLine();

                System.out.println("new Cust Password");
                String pwd = sc.nextLine();

                System.out.println("new Cust Name");
                String name = sc.nextLine();

                service.modify(new CustDto(id, pwd, name));
                System.out.println("Updated");

            } else {
                System.out.println("None Command");
            }
        }

        sc.close();
    }
}
