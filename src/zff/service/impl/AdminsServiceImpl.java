package zff.service.impl;

import zff.bean.Admins;
import zff.dao.AdminsDao;
import zff.dao.impl.AdminsDaoImpl;
import zff.service.AdminsService;

public class AdminsServiceImpl implements AdminsService {

    AdminsDao adminDao = new AdminsDaoImpl();

    @Override
    public Admins login(Admins admins) {
        return adminDao.getBean(admins);
    }

    @Override
    public boolean update(Admins admins) {
        return adminDao.update(admins);
    }
}
