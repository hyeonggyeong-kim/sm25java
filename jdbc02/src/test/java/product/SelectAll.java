package product;

import edu.sm.dto.Cust;
import edu.sm.dto.Product;
import edu.sm.service.CustService;
import edu.sm.service.ProductService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SelectAll {
    @Test
    public void selectAll(){
        ProductService productService = new ProductService();
        List<Product> lists = null;

        try {
            lists = productService.get();
            lists.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("조회 실패");
        }
    }
}