package zff.service;

import zff.bean.SIstrue;
import zff.bean.Students;

import java.util.List;

public interface StudentsService {
    /**
     * 学生登录
     * @param students 学生对象
     * @return 要登录的用户
     */
    public Students login(Students students);
    /**
     * 学生注册
     * @param students 要注册的学生
     * @return true表示注册成功
     */
    public  boolean register(Students students);
    /**
     * 获取所有的学生信息
     * @return 所有的学生信息
     */
    public List<Students> getBeanListAll();
    /**
     * 通过学生id获取课程信息
     * @param id 要查询的学生id
     * @return 一个学生的所有信息
     */
    public Students getBeanById(Integer id);
    /**
     * 添加一个学生
     * @param students 添加的学生
     * @return true表示添加成功
     */
    public boolean add(Students students);
    /**
     * 学生信息更新
     * @param students 更新过的学生
     * @return true表示修改成功
     */
    public boolean update(Students students);
    /**
     * 学生信息以及相关信息的删除
     * @param username 要删除的学生用户名
     * @return true表示删除成功
     */
    public boolean deleteStu(String username);
    /**
     * 获取该学生需要评教的信息
     * @param username 要查询的学生用户名
     * @return 该学生需要评教的信息
     */
    public List<SIstrue> getBeanIsListAll(String username);
}
