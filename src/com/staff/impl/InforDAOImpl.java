package com.staff.impl;

import com.staff.dao.InforDAO;
import com.staff.model.Information;
import com.staff.utils.JDBCUtil;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by asus on 2017/12/19.
 */
public class InforDAOImpl implements InforDAO {
    private JDBCUtil jdbcUtil = JDBCUtil.getInitJDBCUtil();
    @Override
    public Information getInfor(String account) throws SQLException {
        String sql ="SELECT * FROM t_information WHERE account = ? ";
        Map<String,Object> map = jdbcUtil.executeQuerySingle(sql,new Object[]{account});
        if(map.size()!= 0){
            Information information = new Information(map.get("account").toString(),map.get("name").toString(),
                    (Integer) map.get("departmentID"),map.get("education").toString(),
                    map.get("gender").toString(),(Date) map.get("birthday"),(byte[]) map.get("avatar"),
                    map.get("telephone").toString(),map.get("address").toString(),(Date) map.get("entryTime"));
                return information;
        }else{
            return null;
        }
    }

    @Override
    public int updateInfor(Information information) throws SQLException {
        String sql ="UPDATE t_information SET name= ? , education=? ,  telephone =?  WHERE account =?  ";
        Object[] params ={information.getName(),information.getEducation(), information.getTelephone(),information.getAccount()};
        int n = jdbcUtil.executeUpdate(sql , params);
        return  n ;
    }
}
