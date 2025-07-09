package product;

import edu.sm.dto.Cust;
import edu.sm.dto.Product;
import edu.sm.service.CustService;
import edu.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Select {
    @Test
    public void select(){
        System.out.println("Select1 Test Start ...");

        ProductService productService = new ProductService();
        Product product = null;
        try {
            product = productService.get(1001);
            System.out.println(product);
        } catch (Exception e) {
            System.err.println("조회 실패");
        }
    }

}