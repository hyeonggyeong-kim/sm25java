package shop.app;

import shop.dto.ItemDto;
import shop.service.ItemService;

import java.util.List;
import java.util.Scanner;

public class ItemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemService service = new ItemService();

        while (true) {
            System.out.println("enter Command q, i, s, sa, d, u");
            String cmd = sc.nextLine();

            if (cmd.equals("q")) {
                System.out.println("quit....");
                break;

            } else if (cmd.equals("i")) {
                System.out.println("insert Item ID");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("insert Item Name");
                String name = sc.nextLine();

                System.out.println("insert Item Price");
                double price = sc.nextDouble();
                sc.nextLine();

                service.register(new ItemDto(id, name, price));
                System.out.println("Inserted!");

            } else if (cmd.equals("s")) {
                System.out.println("select Item ID");
                int id = sc.nextInt();
                sc.nextLine();

                ItemDto item = service.get(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Not Found");
                }

            } else if (cmd.equals("sa")) {
                System.out.println("select ALL....");
                List<ItemDto> list = service.get();
                if (list.isEmpty()) {
                    System.out.println("No Items");
                } else {
                    for (ItemDto item : list) {
                        System.out.println(item);
                    }
                }

            } else if (cmd.equals("d")) {
                System.out.println("delete Item ID");
                int id = sc.nextInt();
                sc.nextLine();

                service.remove(id);
                System.out.println("Deleted!");

            } else if (cmd.equals("u")) {
                System.out.println("update Item ID");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("new Item Name");
                String name = sc.nextLine();

                System.out.println("new Item Price");
                double price = sc.nextDouble();
                sc.nextLine();

                service.modify(new ItemDto(id, name, price));
                System.out.println("Updated");

            } else {
                System.out.println("None Command");
            }
        }
        sc.close();
    }
}
