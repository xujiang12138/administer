package com.staff.Factory;

import com.staff.service.InforService;
import com.staff.service.InforServiceImpl;

/**
 * Created by asus on 2017/12/19.
 */
public class InforServiceFactory {
    public static  InforService getInforServiceInstance(){
        return  new InforServiceImpl();
    }
}
