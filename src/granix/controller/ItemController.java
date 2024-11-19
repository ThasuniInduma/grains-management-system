/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granix.controller;

import granix.dto.ItemDto;
import granix.service.ServiceFactory;
import static granix.service.ServiceFactory.ServiceType.ITEM;
import granix.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ItemController {
    ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ITEM);
    
    public String addItem(ItemDto itemDto) throws Exception {
        return itemService.addItem(itemDto);
    }
    public ArrayList<ItemDto> getAllItem() throws Exception {
        return itemService.getAllItem();
    }

    public String updateItem(ItemDto itemDto) throws Exception {
        return itemService.updateItem(itemDto);
    }

    public String deleteItem(String id) throws Exception {
        return itemService.deleteItem(id);
    }

    public ItemDto getItem(String id) throws Exception {
        return itemService.getItem(id);
    }
}
