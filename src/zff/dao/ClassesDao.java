package zff.dao;

import zff.bean.Classes;

import java.util.List;

public interface ClassesDao {
    /**
     * 获取所有的班级信息
     * @return 所有的班级信息
     */
    public List<Classes> getBeanListAll();
    /**
     * 通过班级id获取班级信息
     * @param id 编号
     * @return 一个班级的所有信息
     */
    public Classes getBeanById(Integer id);
    /**
     * 通过班级号获取班级信息
     * @param classId 班级号
     * @return 一个班级的所有信息
     */
    public Classes getBeanByclassId(Integer classId);
    /**
     * 添加一个班级
     * @param classes 添加的班级
     * @return true表示添加成功
     */
    public boolean add(Classes classes);
    /**
     * 班级信息更新
     * @param classes 更新过的班级
     * @return true表示修改成功
     */
    public boolean update(Classes classes);
    /**
     * 班级以及相关数据删除
     * @param classId 要删除的班级id
     * @return true表示删除成功
     */
    public boolean deleteClass(Integer classId);
    public boolean deleteSCCTQM(Integer classId);
    public boolean deleteSIstrue(Integer classId);
    public boolean deleteStu(Integer classId);
    public boolean deleteTCC(Integer classId);
    public boolean deleteTeaMark(Integer classId);
}
