/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granix.service.custom.impl;

import granix.dao.DaoFactory;
import granix.dao.custom.stockDao;
import granix.dto.stockDto;
import granix.entity.stockEntity;
import granix.service.custom.stockService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class stockServiceImpl implements stockService{
    stockDao stockDao = (stockDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.STOCK);

    @Override
    public String addStock(stockDto dto) throws Exception {
        stockEntity stockEntity = new stockEntity(dto.getId(), dto.getName(), dto.getType());
        
        if(stockDao.add(stockEntity)){
            return "successfully added";
        }else{
            return "fail";
        }
    }

    @Override
    public String updateStock(stockDto dto) throws Exception {
        stockEntity stockEntity = new stockEntity(dto.getId(), dto.getName(), dto.getType());
        
        if(stockDao.update(stockEntity)){
            return "successfully updated";
        }else{
            return "fail";
        }
    }

    @Override
    public String deleteStock(String id) throws Exception {
        if (stockDao.delete(id)) {
            return "Successfully Delete";
        } else {
            return "Fail";
        }
    }

    @Override
    public stockDto getStock(String id) throws Exception {
        stockEntity entity = stockDao.get(id);
        return new stockDto(entity.getId(),entity.getName(),entity.getType());
    }

    @Override
    public ArrayList<stockDto> getAllStock() throws Exception {
        ArrayList<stockDto> stockDtos = new ArrayList<>();
        ArrayList<stockEntity> stockEntitys = stockDao.getAll();
        
        for (stockEntity entity : stockEntitys) {
            stockDto dto = new stockDto(entity.getId(),entity.getName(),entity.getType());
            stockDtos.add(dto);
        }
        return stockDtos;
    
    }
    
}
