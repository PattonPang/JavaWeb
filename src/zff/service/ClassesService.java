package zff.service;

import zff.bean.Classes;

import java.util.List;

public interface ClassesService {
    /**
     * 获取所有的班级信息
     * @return 所有的班级信息
     */
    public List<Classes> getBeanListAll();
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
}
