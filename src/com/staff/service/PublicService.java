package com.staff.service;

import com.staff.model.Public;
import com.staff.model.PublicSave;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by asus on 2017/12/21.
 */
public interface PublicService {
    List<Public> getAll() throws SQLException;
    List<PublicSave> getAll2() throws SQLException;
}
