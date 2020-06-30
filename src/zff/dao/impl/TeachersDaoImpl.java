package zff.dao.impl;

import zff.bean.TCC;
import zff.bean.Teachers;
import zff.dao.BaseDao;
import zff.dao.TeachersDao;

import java.util.List;

public class TeachersDaoImpl implements TeachersDao {
    @Override
    public Teachers login(String username, String passWd) {
        String sql = "SELECT id,username,passwd as passWd,teacher_name AS teaName FROM teachers WHERE username = ? AND passwd = ?";
        return BaseDao.getBean(sql, Teachers.class, username,passWd);
    }

    @Override
    public List<Teachers> getBeanListAll() {
        String sql = "SELECT id,username,teacher_name AS teaName FROM teachers";
        return BaseDao.getBeanList(sql,Teachers.class);
    }

    @Override
    public Teachers getBeanById(Integer id) {
        String sql = "SELECT id,username,teacher_name AS teaName FROM teachers WHERE id = ?";
        return BaseDao.getBean(sql,Teachers.class,id);
    }

    @Override
    public boolean add(Teachers teachers) {
        String sql = "INSERT INTO teachers SET username = ?,passwd = ?,teacher_name = ?";
        return BaseDao.update(sql,teachers.getUsername(),teachers.getPassWd(),teachers.getTeaName());
    }

    @Override
    public boolean update(Teachers teachers) {
        String sql = "UPDATE teachers SET teacher_name = ?,passwd = ? WHERE id = ?";
        return BaseDao.update(sql,teachers.getTeaName(),teachers.getPassWd(),teachers.getId());
    }

    @Override
    public boolean deleteTeacher(String username) {
        String sql = "DELETE FROM teachers WHERE username = ?";
        return BaseDao.update(sql,username);
    }
    @Override
    public boolean deleteSIstrue(String username) {
        String sql = "DELETE FROM sistrue WHERE teacher_id = ?";
        return BaseDao.update(sql,username);
    }
    @Override
    public boolean deleteTCC(String username) {
        String sql = "DELETE FROM tcc WHERE teacher_id = ?";
        return BaseDao.update(sql,username);
    }
    @Override
    public boolean deleteTeaMark(String username) {
        String sql = "DELETE FROM teamark WHERE teacher_id = ?";
        return BaseDao.update(sql,username);
    }

    @Override
    public boolean addTCC(TCC tcc) {
        String sql = "INSERT INTO tcc (teacher_id,class_id,course_id) SELECT ?,?,? " +
                "FROM DUAL WHERE NOT EXISTS (" +
                "SELECT teacher_id,class_id,course_id FROM tcc " +
                "WHERE teacher_id = ? AND class_id = ? AND course_id = ?)";
        return BaseDao.update(sql,tcc.getTeaId(),tcc.getClassId(),tcc.getCourseId(),tcc.getTeaId(),tcc.getClassId(),tcc.getCourseId());
    }
    @Override
    public boolean addTeaMark(TCC tcc) {
        String sql = "INSERT INTO teamark (teacher_id,class_id,course_id) VALUE (?,?,?)";
        return BaseDao.update(sql,tcc.getTeaId(),tcc.getClassId(),tcc.getCourseId());
    }
    @Override
    public boolean addSCCTQM(TCC tcc) {
        String sql = "INSERT INTO scctqm (student_id,class_id) SELECT student_id,class_id FROM students WHERE class_id = ?";
        return BaseDao.update(sql,tcc.getClassId());
    }
    @Override
    public boolean updateSCCTQM(TCC tcc) {
        String sql = "UPDATE scctqm SET course_id = ?,teacher_id= ? WHERE course_id IS NULL";
        return BaseDao.update(sql,tcc.getCourseId(),tcc.getTeaId());
    }

    @Override
    public boolean addSIstrue(TCC tcc) {
        String sql = "INSERT INTO sistrue (student_id,class_id) SELECT student_id,class_id FROM students WHERE class_id = ?";
        return BaseDao.update(sql,tcc.getClassId());
    }

    @Override
    public boolean updateSIstrue(TCC tcc) {
        String sql = "UPDATE sistrue SET course_id = ?,teacher_id= ? WHERE course_id IS NULL";
        return BaseDao.update(sql,tcc.getCourseId(),tcc.getTeaId());
    }

    @Override
    public Teachers getBeanByUserName(String username) {
        String sql = "SELECT id,username,teacher_name AS teaName FROM teachers WHERE username = ?";
        return BaseDao.getBean(sql,Teachers.class,username);
    }
}
