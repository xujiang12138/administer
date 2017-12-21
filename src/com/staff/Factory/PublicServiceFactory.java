package com.staff.Factory;

import com.staff.service.PublicService;
import com.staff.service.PublicServiceImpl;

/**
 * Created by asus on 2017/12/21.
 */
public class PublicServiceFactory {
    public  static PublicService getPublicServiceInstance(){
        return  new PublicServiceImpl();
    }
}
