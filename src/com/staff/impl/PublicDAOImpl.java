package com.staff.impl;

import com.staff.dao.PublicDAO;
import com.staff.model.Public;
import com.staff.model.PublicSave;
import com.staff.utils.JDBCUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by asus on 2017/12/21.
 */
public class PublicDAOImpl implements PublicDAO {
    private JDBCUtil jdbcUtil = JDBCUtil.getInitJDBCUtil();
    @Override
    public List<Public> getAll() throws SQLException {
        String sql ="SELECT * FROM t_public" ;
        List<Object> list = jdbcUtil.excuteQuery(sql,null);
        return getPublicList(list);
    }

    @Override
    public List<PublicSave> getAll2() throws SQLException {
        String sql = "SELECT * FROM t_publicsave";
        List<Object> list = jdbcUtil.excuteQuery(sql,null);
        return getPublicSaveList(list);
    }

    private List<Public> getPublicList(List<Object> list) {
        List<Public> arrayList= new ArrayList<>();
        for (Object object : list) {
            Map<String, Object> map = (Map<String, Object>) object;
            Public aPublic = new Public(map.get("name").toString(),map.get("content").toString(),map.get("account").toString());
            aPublic.setId((Integer) map.get("id"));
            arrayList.add(aPublic);
        }
        return arrayList;
    }

    private List<PublicSave> getPublicSaveList(List<Object> list){
        List<PublicSave> publicSaves = new ArrayList<>();
        for(Object object:list){
            Map<String,Object>map =  (Map<String,Object>) object;
            PublicSave publicSave = new PublicSave(map.get("account").toString(),map.get("content").toString(),(java.sql.Date) map.get("saveTime"));
            publicSave.setId((Integer) map.get("id"));
            publicSaves.add(publicSave);
        }
        return publicSaves;
    }
}
