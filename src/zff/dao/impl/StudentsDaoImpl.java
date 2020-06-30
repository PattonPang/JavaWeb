package zff.dao.impl;

import zff.bean.SIstrue;
import zff.bean.Students;
import zff.dao.BaseDao;
import zff.dao.StudentsDao;

import java.util.List;

public class StudentsDaoImpl implements StudentsDao {

    @Override
    public Students login(String username, String passWd) {
        String sql = "select id,username,passwd as passWd,student_name as stuName,class_id as classId from " +
                "students where username=? and passwd=?";
        return BaseDao.getBean(sql, Students.class, username,passWd);
    }

    @Override
    public boolean register(Students students) {
        String sql = "INSERT INTO students(username,passwd,student_name,class_id) VALUES(?,?,?,?)";
        return BaseDao.update(sql,students.getUsername(),students.getPassWd(),students.getStuName(),
                students.getClassId());
    }

    @Override
    public List<Students> getBeanListAll() {
        String sql = "SELECT id,username,passwd AS passWd,student_name AS stuName,class_id AS classId FROM students";
        return BaseDao.getBeanList(sql,Students.class);
    }

    @Override
    public Students getBeanById(Integer id) {
        String sql = "SELECT id,username,passwd AS passWd,student_name AS stuName,class_id AS classId FROM students WHERE id = ?";
        return BaseDao.getBean(sql,Students.class,id);
    }

    @Override
    public boolean add(Students students) {
        String sql = "INSERT INTO students SET username = ?,passwd = ?,student_name = ?,class_id = ?";
        return BaseDao.update(sql,students.getUsername(),students.getPassWd(),students.getStuName(),students.getClassId());
    }

    @Override
    public boolean update(Students students) {
        String sql = "UPDATE students SET student_name = ?, passwd = ? WHERE id = ?";
        return BaseDao.update(sql,students.getStuName(),students.getPassWd(),students.getId());
    }

    @Override
    public boolean deleteStu(String username) {
        String sql = "DELETE FROM students WHERE student_id = ?";
        return BaseDao.update(sql,username);
    }
    @Override
    public boolean deleteSCCTQM(String username) {
        String sql = "DELETE FROM scctqm WHERE student_id = ?";
        return BaseDao.update(sql,username);
    }
    @Override
    public boolean deleteSIstrue(String username) {
        String sql = "DELETE FROM sistrue WHERE student_id = ?";
        return BaseDao.update(sql,username);
    }

    @Override
    public List<SIstrue> getBeanIsListAll(String username) {
        String sql = "SELECT id,student_id AS stuId,class_id AS classId,course_id AS courseId," +
                "teacher_id AS teaId,istrue AS isTrue FROM sistrue WHERE student_id = ? AND istrue = 1";
        return BaseDao.getBeanList(sql, SIstrue.class,username);
    }
}
