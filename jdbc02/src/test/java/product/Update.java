package product;

import edu.sm.dto.Cust;
import edu.sm.dto.Product;
import edu.sm.service.CustService;
import edu.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Update {

    @Test
    public void insert(){
        System.out.println("Update Test Start ...");
        ProductService productService = new ProductService();
        Product product = Product.builder().productName("바지22").productId(1003).productPrice(100).discountRate(0.2).cateId(10).productImg("bb.jpg").build();

        try {
            productService.modify(product);
            System.out.println("수정 정상");
        } catch (Exception e) {
            System.out.println("수정 오류");
            e.printStackTrace();
        }
    }
}