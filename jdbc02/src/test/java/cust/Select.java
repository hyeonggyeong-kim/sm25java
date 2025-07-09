package cust;

import edu.sm.dto.Cust;
import edu.sm.service.CustService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Select {
    @Test
    public void select(){
        CustService custService = new CustService();
        Cust cust = null;
        try {
            cust = custService.get("id77");
            System.out.println(cust);
        } catch (Exception e) {
            System.err.println("조회 실패");
            e.printStackTrace();
        }
    }
}