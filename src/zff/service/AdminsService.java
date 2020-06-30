package zff.service;

import zff.bean.Admins;

public interface AdminsService {
    /**
     * 通过已有对象从数据库中获取数据
     * @param admins 已有对象
     * @return 数据库中的数据
     */
    public Admins login(Admins admins);
    /**
     * 管理员修改自身的资料
     * @param admins 改好资料的管理员
     * @return true表示修改成功
     */
    public boolean update(Admins admins);
}
