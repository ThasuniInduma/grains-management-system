/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granix.controller;

import granix.dto.userDto;
import granix.service.ServiceFactory;
import static granix.service.ServiceFactory.ServiceType.USER;
import granix.service.custom.userService;

/**
 *
 * @author ASUS
 */
public class userController {
    userService userService = (userService) ServiceFactory.getInstance().getService(USER);
    
    public String createAccount(userDto userDto) throws Exception {
        return userService.createAccount(userDto);
    }
}
