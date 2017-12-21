package com.staff.service;

import com.staff.Factory.InforServiceFactory;
import com.staff.model.Information;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by asus on 2017/12/19.
 */
public class InforServiceTest {
    private InforService infroService ;
    @Before
    public void setUp() throws Exception {
        infroService = InforServiceFactory.getInforServiceInstance();
    }

    @Test
    public void getInfor() throws Exception {
        Information information = infroService.getInfor("1602753121");
        System.out.println(information);
    }

}