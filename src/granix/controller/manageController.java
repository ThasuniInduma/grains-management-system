/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granix.controller;


import granix.dto.manageDto;
import granix.service.ServiceFactory;
import static granix.service.ServiceFactory.ServiceType.MANAGE;
import granix.service.custom.manageService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class manageController {
    manageService manageService = (manageService) ServiceFactory.getInstance().getService(MANAGE);
            
    public String addItemToStock(manageDto manageDto) throws Exception {
        return manageService.addItemToStock(manageDto);
    }

    public ArrayList<manageDto> getAllItem() throws Exception {
        return manageService.getAllItem();
    }
}
