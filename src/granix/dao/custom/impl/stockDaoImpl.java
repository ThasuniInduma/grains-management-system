/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granix.dao.custom.impl;

import granix.dao.CrudUtil;
import granix.dao.custom.stockDao;
import granix.db.DBConnection;
import granix.entity.stockEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;

/**
 *
 * @author ASUS
 */
public class stockDaoImpl implements stockDao{
    @Override
    public boolean add(stockEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO stock VALUES(?,?,?)", t.getId(),t.getName(),t.getType());
    }

    @Override
    public boolean update(stockEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE stock SET Name = ?, Type = ? WHERE id = ?",t.getName(),t.getType(),t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM stock WHERE id = ?",id);
    }

    @Override
    public stockEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM stock WHERE id = ?", id);
        
        while (rst.next()) {            
            stockEntity stockEntity = new stockEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3));
            return stockEntity;
        }
        return null;
    }

    @Override
    public ArrayList<stockEntity> getAll() throws Exception {
        ArrayList<stockEntity> stockEntitys = new ArrayList<>();
        
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM stock");
        while (rst.next()) {            
            stockEntity stockEntity = new stockEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3));
            stockEntitys.add(stockEntity);
        }
         return stockEntitys;
    }

    
    
    
    
}
