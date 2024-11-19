/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granix.dao.custom.impl;

import granix.dao.CrudUtil;
import granix.dao.custom.userDao;
import granix.entity.userEntity;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class userDaoImpl implements userDao{
    @Override
    public boolean add(userEntity t) throws Exception {
    
    return CrudUtil.executeUpdate("INSERT INTO user(name, email, mobile, password) VALUES(?,?,?,?)", t.getName(), t.getEmail(),t.getMobile(),t.getPassword());    }
    
    @Override
    public boolean update(userEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public userEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<userEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
