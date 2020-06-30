package zff.dao.impl;

import zff.bean.Admins;
import zff.dao.AdminsDao;
import zff.dao.BaseDao;

public class AdminsDaoImpl implements AdminsDao {

    @Override
    public Admins getBean(Admins admins) {
        String sql = "select id,username,passwd as passWd from admins where username=? and passwd=?";
        return BaseDao.getBean(sql, Admins.class, admins.getUsername(),admins.getPassWd());
    }

    @Override
    public Admins getBeanById(Integer id) {
        String sql = "SELECT id,username,passwd AS passWd FROM admins WHERE id = ?";
        return BaseDao.getBean(sql, Admins.class,id);
    }

    @Override
    public boolean update(Admins admins) {
        String sql= "UPDATE admins SET passwd=? WHERE id = ?";
        return BaseDao.update(sql,admins.getPassWd(),admins.getId());
    }
}
