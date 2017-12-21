package com.staff.Factory;

import com.staff.dao.InforDAO;
import com.staff.impl.InforDAOImpl;

/**
 * Created by asus on 2017/12/19.
 */
public class InforDAOFactory {
    public static InforDAO getInforDAOInstance(){
        return  new InforDAOImpl();
    }
}
