package zff.service.impl;

import zff.bean.Courses;
import zff.dao.CoursesDao;
import zff.dao.impl.CoursesDaoImpl;
import zff.service.CoursesService;

import java.util.List;

public class CoursesServiceImpl implements CoursesService {

    CoursesDao courseDao = new CoursesDaoImpl();

    @Override
    public List<Courses> getBeanListAll() {
        return courseDao.getBeanListAll();
    }

    @Override
    public boolean add(Courses courses) {
        return courseDao.add(courses);
    }

    @Override
    public boolean update(Courses courses) {
        return courseDao.update(courses);
    }

    @Override
    public boolean deleteCourse(Integer courseId) {
        return (
                courseDao.deleteCourse(courseId)&&
                courseDao.deleteSCCTQM(courseId)&&
                courseDao.deleteSIstrue(courseId)&&
                courseDao.deleteTCC(courseId)&&
                courseDao.deleteTeaMark(courseId)
        );
    }
}
