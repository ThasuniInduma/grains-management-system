/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package granix.service.custom;

import granix.dto.stockDto;
import granix.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface stockService extends SuperService{
    String addStock(stockDto stockDto) throws Exception;
    String updateStock(stockDto stockDto) throws Exception;
    String deleteStock(String id) throws Exception;
    stockDto getStock(String id) throws Exception;
    ArrayList<stockDto> getAllStock() throws Exception;
   
}
