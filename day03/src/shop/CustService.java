package shop;

import java.util.List;

public class CustService implements SmService<CustDto, String>{

    SmRepository<CustDto, String> smRepository;

    @Override
    public void register(CustDto custDto) {
        smRepository = new CustMySQLRepository();
    }

    @Override
    public void modify(CustDto custDto) {
        System.out.println("CustService : 기본정보 저장");
        smRepository.insert(custDto);
        System.out.println("CustService : SMS 전송");
        System.out.println("CustService : EMAIL 전송");
        System.out.println("CustService : 회원가입 완료");
    }

    @Override
    public void remove(String s) {

    }

    @Override
    public List<CustDto> get() {
        return List.of();
    }

    @Override
    public CustDto get(String s) {
        return null;
    }
}
