/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granix.service.custom.impl;

import granix.dao.DaoFactory;
import granix.dao.custom.ItemDao;
import granix.dto.ItemDto;
import granix.entity.ItemEntity;
import granix.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ItemServiceImpl implements ItemService{
    ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String addItem(ItemDto dto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(dto.getId(), dto.getName());
        
        if(itemDao.add(itemEntity)){
            return "successfully added";
        }else{
            return "fail";
        }
    }

    @Override
    public String updateItem(ItemDto dto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(dto.getId(), dto.getName());
        
        if(itemDao.update(itemEntity)){
            return "successfully updated";
        }else{
            return "fail";
        }
    }

    @Override
    public String deleteItem(String id) throws Exception {
        if (itemDao.delete(id)) {
            return "Successfully Delete";
        } else {
            return "Fail";
        }
    }

    @Override
    public ItemDto getItem(String id) throws Exception {
        ItemEntity entity = itemDao.get(id);
        return new ItemDto(entity.getId(),entity.getName());
    }

    @Override
    public ArrayList<ItemDto> getAllItem() throws Exception {
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
        ArrayList<ItemEntity> itemEntitys = itemDao.getAll();
        
        for (ItemEntity entity : itemEntitys) {
            ItemDto dto = new ItemDto(entity.getId(),entity.getName());
            itemDtos.add(dto);
        }
        return itemDtos;
    
    }
    
}
