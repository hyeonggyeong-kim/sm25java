package cust;

import edu.sm.dto.Cust;
import edu.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Insert {

    @Test
    public void insert(){
        System.out.println("insert Test Start ...");
        CustService custService = new CustService();
        Cust cust = Cust.builder()
                .custId("id99")
                .custPwd("pwd01")
                .custName("고말고")
                .build();
        try {
            custService.register(cust);
            System.out.println("등록 정상");
        } catch (Exception e) {
            System.out.println("등록 오류");
            e.printStackTrace();
        }
    }
}