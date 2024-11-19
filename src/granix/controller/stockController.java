/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granix.controller;

import granix.dto.stockDto;
import granix.service.ServiceFactory;
import static granix.service.ServiceFactory.ServiceType.STOCK;
import granix.service.custom.stockService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class stockController {
    stockService stockService = (stockService) ServiceFactory.getInstance().getService(STOCK);
    
    public String addStock(stockDto stockDto) throws Exception {
        return stockService.addStock(stockDto);
    }
    public ArrayList<stockDto> getAllStock() throws Exception {
        return stockService.getAllStock();
    }

    public String updateStock(stockDto stockDto) throws Exception {
        return stockService.updateStock(stockDto);
    }

    public String deleteStock(String id) throws Exception {
        return stockService.deleteStock(id);
    }

    public stockDto getStock(String id) throws Exception {
        return stockService.getStock(id);
    }
   
}
