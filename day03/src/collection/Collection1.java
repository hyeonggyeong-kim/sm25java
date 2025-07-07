package collection;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {
        // list, set, map
        List<String> list = new ArrayList(5);
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("a");
        list.remove("a");
        // System.out.println(list);
        for(String str:list){
            System.out.println(str);
        }

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        for(Integer i:list1){
            System.out.println(i);
        }
    }
}
