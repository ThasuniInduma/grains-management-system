/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package granix.service.custom;

import granix.dto.manageDto;
import granix.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface manageService extends SuperService{
    String addItemToStock(manageDto manageDto) throws Exception;
    ArrayList<manageDto> getAllItem() throws Exception;
}
