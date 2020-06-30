package zff.dao;

import zff.bean.Courses;

import java.util.List;

public interface CoursesDao {
    /**
     * 获取所有的课程信息
     * @return 所有的课程信息
     */
    public List<Courses> getBeanListAll();
    /**
     * 添加一个课程
     * @param courses 添加的课程
     * @return true表示添加成功
     */
    public boolean add(Courses courses);
    /**
     * 课程信息更新
     * @param courses 更新过的课程
     * @return true表示修改成功
     */
    public boolean update(Courses courses);
    /**
     * 课程及相关数据删除
     * @param courseId 要删除的课程id
     * @return true表示删除成功
     */
    public boolean deleteCourse(Integer courseId);
    public boolean deleteSCCTQM(Integer courseId);
    public boolean deleteSIstrue(Integer courseId);
    public boolean deleteTCC(Integer courseId);
    public boolean deleteTeaMark(Integer courseId);
    /**
     * 通过课程id获取课程信息
     * @param id 要查询的课程id
     * @return 一个课程的所有信息
     */
    public Courses getBeanById(Integer id);
}
