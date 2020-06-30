package zff.dao;

import zff.bean.Admins;

public interface AdminsDao {
    /**
     * 通过已有对象从数据库中获取数据
     * @param admins 已有对象
     * @return 数据库中的数据
     */
    public Admins getBean(Admins admins);
    /**
     * 管理员修改自身的资料
     * @param admins 改好资料的管理员
     * @return true表示修改成功
     */
    public boolean update(Admins admins);

    /**
     * 通过id查询管理员的全部信息
     * @param id 管理员的id
     * @return  被查询管理员的id
     */
    public Admins getBeanById(Integer id);
}
