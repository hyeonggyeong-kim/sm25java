package edu.sm.service;

import edu.sm.dto.Cust;
import edu.sm.frame.SmRepository;
import edu.sm.repository.CustRepository;

import java.util.List;

public class CustService implements SmRepository<Cust, String> {

    CustRepository custRepository;
    public CustService() {
        this.custRepository = new CustRepository();
    }

}
