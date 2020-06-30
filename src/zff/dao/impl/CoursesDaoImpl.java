package zff.dao.impl;

import zff.bean.Courses;
import zff.dao.BaseDao;
import zff.dao.CoursesDao;

import java.util.List;

public class CoursesDaoImpl implements CoursesDao {

    @Override
    public List<Courses> getBeanListAll() {
        String sql = "SELECT id,course_id AS courseId,course_name AS courseName FROM courses";
        return BaseDao.getBeanList(sql, Courses.class);
    }

    @Override
    public boolean add(Courses courses) {
        String sql = "INSERT INTO courses SET course_id = ?,course_name = ?";
        return BaseDao.update(sql,courses.getCourseId(),courses.getCourseName());
    }

    @Override
    public boolean update(Courses courses) {
        String sql = "UPDATE courses SET course_id=?,course_name=? WHERE id = ?";
        return BaseDao.update(sql, courses.getCourseId(),courses.getCourseName(),courses.getId());
    }

    @Override
    public boolean deleteCourse(Integer courseId) {
        String sql = "DELETE FROM courses WHERE course_id = ?";
        return BaseDao.update(sql,courseId);
    }
    @Override
    public boolean deleteSCCTQM(Integer courseId) {
        String sql = "DELETE FROM scctqm WHERE course_id = ?";
        return BaseDao.update(sql,courseId);
    }
    @Override
    public boolean deleteSIstrue(Integer courseId) {
        String sql = "DELETE FROM sistrue WHERE course_id = ?";
        return BaseDao.update(sql,courseId);
    }
    @Override
    public boolean deleteTCC(Integer courseId) {
        String sql = "DELETE FROM tcc WHERE course_id = ?";
        return BaseDao.update(sql,courseId);
    }
    @Override
    public boolean deleteTeaMark(Integer courseId) {
        String sql = "DELETE FROM teamark WHERE course_id = ?";
        return BaseDao.update(sql,courseId);
    }

    @Override
    public Courses getBeanById(Integer id) {
        String sql = "SELECT id,course_id AS courseId,course_name AS courseName FROM courses WHERE id = ?";
        return BaseDao.getBean(sql, Courses.class, id);
    }
}
