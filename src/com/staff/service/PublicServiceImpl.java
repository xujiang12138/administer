package com.staff.service;

import com.staff.Factory.PublicDAOFactory;
import com.staff.dao.PublicDAO;
import com.staff.model.Public;
import com.staff.model.PublicSave;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by asus on 2017/12/21.
 */
public class PublicServiceImpl implements PublicService {
    private PublicDAO publicDAO = PublicDAOFactory.getPublicDAOInstance();
    @Override
    public List<Public> getAll() throws SQLException {
        List<Public> list = publicDAO.getAll();
        return  list;
    }

    @Override
    public List<PublicSave> getAll2() throws SQLException {
        List<PublicSave> list = publicDAO.getAll2();
        return  list;
    }
}
