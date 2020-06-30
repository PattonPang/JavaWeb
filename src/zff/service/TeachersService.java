package zff.service;

import zff.bean.TCC;
import zff.bean.Teachers;

import java.util.List;

public interface TeachersService {
    /**
     * 老师登录
     * @param teachers 老师对象
     * @return 要登录的用户
     */
    public Teachers login(Teachers teachers);
    /**
     * 获取所有的老师信息
     * @return 所有的老师信息
     */
    public List<Teachers> getBeanListAll();
    /**
     * 添加一个老师
     * @param teachers 添加的老师
     * @return true表示添加成功
     */
    public boolean add(Teachers teachers);
    /**
     * 老师信息更新
     * @param teachers 更新过的老师
     * @return true表示修改成功
     */
    public boolean update(Teachers teachers);
    /**
     * 老师信息以及相关数据的删除
     * @param username 要删除的老师用户名
     * @return true表示删除成功
     */
    public boolean deleteTeacher(String username);
    /**
     * TCC以及其相关关系添加
     * @param tcc 添加的TCC
     * @return true表示添加成功
     */
    public boolean addTCC(TCC tcc);
}
