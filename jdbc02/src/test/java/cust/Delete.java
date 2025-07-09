package cust;

import edu.sm.dto.Cust;
import edu.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Delete {

    @Test
    public void insert(){
        System.out.println("delete Test Start ...");
        CustService custService = new CustService();
        try {
            custService.remove("id56");
            System.out.println("삭제 정상");
        } catch (Exception e) {
            System.out.println("삭제 오류");
            e.printStackTrace();
        }
    }
}