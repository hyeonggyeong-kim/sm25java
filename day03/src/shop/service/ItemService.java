package shop.service;

import shop.dto.ItemDto;
import shop.frame.SmRepository;
import shop.frame.SmService;
import shop.repository.ItemMySQLRepository;

import java.util.List;

public class ItemService implements SmService<ItemDto, Integer> {

    SmRepository<ItemDto, Integer> smRepository;

    public ItemService() {
        smRepository = new ItemMySQLRepository();
    }

    @Override
    public void register(ItemDto itemDto) {
        smRepository.insert(itemDto);
    }

    @Override
    public void modify(ItemDto itemDto) {
        smRepository.update(itemDto);
    }

    @Override
    public void remove(Integer integer) {
        smRepository.delete(integer);
    }

    @Override
    public List<ItemDto> get() {
        return smRepository.selectAll();
    }

    @Override
    public ItemDto get(Integer integer) {
        return smRepository.select(integer);
    }
}