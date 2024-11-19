/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granix.service.custom.impl;

import granix.dao.DaoFactory;
import granix.dao.custom.userDao;
import granix.dto.userDto;
import granix.entity.userEntity;
import granix.service.custom.userService;

/**
 *
 * @author ASUS
 */
public class userServiceImpl implements userService{
    userDao userDao = (userDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);

    @Override
    public String createAccount(userDto dto) throws Exception {
        userEntity userEntity = new userEntity(dto.getName(),  dto.getEmail(), dto.getMobile(), dto.getPassword());
        
        if(userDao.add(userEntity)){
            return "successfully added";
        }else{
            return "fail";
        }
    }
}
