/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granix.dao.custom.impl;

import granix.dao.CrudUtil;
import granix.dao.custom.ItemDao;
import granix.entity.ItemEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ItemDaoImpl implements ItemDao{
    @Override
    public boolean add(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO item VALUES(?,?)", t.getId(),t.getName());
    }

    @Override
    public boolean update(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE item SET Name = ?, Type = ? WHERE id = ?",t.getName(),t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM item WHERE id = ?",id);
    }

    @Override
    public ItemEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM item WHERE id = ?", id);
        
        while (rst.next()) {            
            ItemEntity itemEntity = new ItemEntity(rst.getString(1),
                    rst.getString(2));
            return itemEntity;
        }
        return null;
    }

    @Override
    public ArrayList<ItemEntity> getAll() throws Exception {
        ArrayList<ItemEntity> itemEntitys = new ArrayList<>();
        
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM item");
        while (rst.next()) {            
            ItemEntity itemEntity = new ItemEntity(rst.getString(1),
                    rst.getString(2));
            itemEntitys.add(itemEntity);
        }
         return itemEntitys;
    }
}
