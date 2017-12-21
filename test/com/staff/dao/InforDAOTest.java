package com.staff.dao;

import com.staff.Factory.InforDAOFactory;
import com.staff.model.Information;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by asus on 2017/12/19.
 */
public class InforDAOTest {
    private InforDAO inforDAO;
    @Before
    public void setUp() throws Exception {
        inforDAO = InforDAOFactory.getInforDAOInstance();
    }

    @Test
    public void getInfor() throws Exception {
        Information information = inforDAO.getInfor("1602753121");
        System.out.println(information);
    }

    @Test
    public void updateInfor() throws Exception {
        Information information = inforDAO.getInfor("1602753121");
        information.setTelephone("15464689687");
        int n = inforDAO.updateInfor(information);
        assertEquals(1,n);
    }

}