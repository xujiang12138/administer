package com.staff.dao;

import com.staff.Factory.PublicDAOFactory;
import com.staff.model.Public;
import com.staff.model.PublicSave;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by asus on 2017/12/21.
 */
public class PublicDAOTest {
    private PublicDAO publicDAO ;
    @Before
    public void setUp() throws Exception {
        publicDAO = PublicDAOFactory.getPublicDAOInstance();
    }

    @Test
    public void getAll() throws Exception {
        List<Public> list =publicDAO.getAll();
        System.out.println(list);
    }

    @Test
    public void getAll2() throws Exception {
        List<PublicSave> list = publicDAO.getAll2();
        System.out.println(list);
    }

}