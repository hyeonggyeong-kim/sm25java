package product;

import edu.sm.service.CustService;
import edu.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Delete {

    @Test
    public void insert(){
        System.out.println("delete Test Start ...");
        ProductService productService = new ProductService();
        try {
            productService.remove(1011);
            System.out.println("삭제 정상");
        } catch (Exception e) {
            System.out.println("삭제 오류");
            e.printStackTrace();
        }
    }
}