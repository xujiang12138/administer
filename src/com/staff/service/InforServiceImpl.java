package com.staff.service;

import com.staff.Factory.InforDAOFactory;
import com.staff.dao.InforDAO;
import com.staff.model.Information;

import java.sql.SQLException;

/**
 * Created by asus on 2017/12/19.
 */
public class InforServiceImpl implements InforService {
    private InforDAO inforDAO = InforDAOFactory.getInforDAOInstance();
    @Override
    public Information getInfor(String account) {
        Information information = null;
        try {
             information = inforDAO.getInfor(account);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  information;
    }

    @Override
    public boolean changeInfor(Information information, String now,String now2) {
        information.setTelephone(now);
        information.setEducation(now2);
        try {
            inforDAO.updateInfor(information);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true ;
    }
}
