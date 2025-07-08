package shop.test;

import shop.dto.ItemDto;
import shop.service.ItemService;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        ItemService itemService = new ItemService();

        System.out.println("1. Item Insrt....");
        ItemDto itemDto = new ItemDto(100, "치마", 10000.0);
        itemService.register(itemDto);
        System.out.println("2. Item SelectALL....");
        List<ItemDto> items = null;
        items = itemService.get();
        for (ItemDto item : items) {
            System.out.println(item);
        }




    }
}
