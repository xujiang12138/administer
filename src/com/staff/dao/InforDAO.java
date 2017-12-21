package com.staff.dao;

import com.staff.model.Information;

import java.sql.SQLException;

/**
 * Created by asus on 2017/12/19.
 */
public interface InforDAO {
    Information getInfor(String account)throws SQLException ;
    int updateInfor(Information information) throws SQLException;
}
