/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granix.dao.custom.impl;

import granix.dao.CrudUtil;
import granix.dao.custom.manageDao;
import granix.entity.manageEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class manageDaoImpl implements manageDao{
    @Override
    public boolean add(manageEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO manage(name, qty, brand) VALUES(?,?,?)",
                t.getName(),
                t.getQty(),
                t.getBrand());
    }

    @Override
    public boolean update(manageEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public manageEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<manageEntity> getAll() throws Exception {
        ArrayList<manageEntity> manageEntitys = new ArrayList<>();
        
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM manage");
        while (rst.next()) {            
            manageEntity manageEntity = new manageEntity(rst.getString(2),
                    rst.getDouble(3),
                    rst.getString(4));
            manageEntitys.add(manageEntity);
        }
         return manageEntitys;
    }
}
