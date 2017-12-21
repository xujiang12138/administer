package com.staff.Factory;

import com.staff.dao.PublicDAO;
import com.staff.impl.PublicDAOImpl;

/**
 * Created by asus on 2017/12/21.
 */
public class PublicDAOFactory {
    public  static PublicDAO getPublicDAOInstance(){
        return new PublicDAOImpl() ;
    }
}
