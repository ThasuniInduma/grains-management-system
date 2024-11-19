/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package granix.service.custom;

import granix.dto.ItemDto;
import granix.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface ItemService extends SuperService{
    String addItem(ItemDto itemDto) throws Exception;
    String updateItem(ItemDto itemDto) throws Exception;
    String deleteItem(String id) throws Exception;
    ItemDto getItem(String id) throws Exception;
    ArrayList<ItemDto> getAllItem() throws Exception;
    
}
