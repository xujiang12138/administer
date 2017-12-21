package com.staff.service;

import com.staff.model.Information;

/**
 * Created by asus on 2017/12/19.
 */
public interface InforService {
    Information getInfor(String account) ;
    boolean changeInfor(Information information,String now,String now2);

}
