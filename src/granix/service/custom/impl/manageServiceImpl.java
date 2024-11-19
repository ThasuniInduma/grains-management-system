/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granix.service.custom.impl;

import granix.dao.DaoFactory;
import granix.dao.custom.manageDao;
import granix.dto.manageDto;
import granix.entity.manageEntity;
import granix.service.custom.manageService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class manageServiceImpl implements manageService{
    manageDao manageDao = (manageDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MANAGE);

    public String addItemToStock(manageDto dto) throws Exception {

        manageEntity ce = new manageEntity(dto.getName(),
                dto.getQty(),
                dto.getBrand());

        if (manageDao.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }

    }

    @Override
    public ArrayList<manageDto> getAllItem() throws Exception {
        ArrayList<manageDto> manageDtos = new ArrayList<>();
        ArrayList<manageEntity> manageEntitys = manageDao.getAll();
        
        for (manageEntity entity : manageEntitys) {
            manageDto dto = new manageDto(entity.getName(),
                entity.getQty(),
                entity.getBrand());
            manageDtos.add(dto);
        }
        return manageDtos;
    }

    
}
