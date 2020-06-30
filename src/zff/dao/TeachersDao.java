package zff.dao;

import zff.bean.TCC;
import zff.bean.Teachers;

import java.util.List;

/**
 * @author Administrator 老师的数据库操作
 */

public interface TeachersDao {
    /**
     * 老师登录
     * @param teacherId 老师账号
     * @param passWd 登录密码
     * @return 要登录的用户
     */
    public Teachers login(String teacherId, String passWd);
    /**
     * 获取所有的老师信息
     * @return 所有的老师信息
     */
    public List<Teachers> getBeanListAll();
    /**
     * 通过老师id获取课程信息
     * @param id 要查询的老师id
     * @return 一个老师的所有信息
     */
    public Teachers getBeanById(Integer id);
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
    public boolean deleteSIstrue(String username);
    public boolean deleteTCC(String username);
    public boolean deleteTeaMark(String username);
    /**
     * TCC以及其相关关系添加
     * @param tcc 添加的TCC
     * @return true表示添加成功
     */
    public boolean addTCC(TCC tcc);
    public boolean addTeaMark(TCC tcc);
    public boolean addSCCTQM(TCC tcc);
    public boolean updateSCCTQM(TCC tcc);
    public boolean addSIstrue(TCC tcc);
    public boolean updateSIstrue(TCC tcc);
    /**
     * 通过老师用户名获取课程信息
     * @param username 要查询的老师用户名
     * @return 一个老师的所有信息
     */
    public Teachers getBeanByUserName(String username);
}
