/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granix.dao;

import granix.dao.custom.impl.ItemDaoImpl;
import granix.dao.custom.impl.manageDaoImpl;
import granix.dao.custom.impl.stockDaoImpl;
import granix.dao.custom.impl.userDaoImpl;

/**
 *
 * @author ASUS
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case STOCK:
                return new stockDaoImpl();
            case ITEM:
                return new ItemDaoImpl();
            case USER:
                return new userDaoImpl();   
            case MANAGE:
                return new manageDaoImpl();
            default:
                return null;
        }
    }

    
    public enum DaoTypes{
        //CUSTOMER, CAR, USER, CATEGORY
        USER,STOCK,ITEM,MANAGE
    }
}
