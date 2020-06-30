package zff.dao.impl;

import zff.bean.Classes;
import zff.dao.BaseDao;
import zff.dao.ClassesDao;

import java.util.List;

public class ClassesDaoImpl implements ClassesDao {

    @Override
    public List<Classes> getBeanListAll() {
        String sql = "SELECT id,class_id AS classId,class_name AS className FROM classes";
        return BaseDao.getBeanList(sql, Classes.class);
    }

    @Override
    public Classes getBeanById(Integer id) {
        String sql = "SELECT id,class_id AS classId,class_name AS className FROM classes WHERE id = ?";
        return BaseDao.getBean(sql, Classes.class, id);
    }

    @Override
    public Classes getBeanByclassId(Integer classId) {
        String sql = "SELECT id,class_id AS classId,class_name AS className FROM classes WHERE class_id = ?";
        return BaseDao.getBean(sql, Classes.class, classId);
    }

    @Override
    public boolean add(Classes classes) {
        String sql = "INSERT INTO classes SET class_id = ?,class_name = ?";
        return BaseDao.update(sql,classes.getClassId(),classes.getClassName());
    }

    @Override
    public boolean update(Classes classes) {
        String sql = "UPDATE classes SET class_id=?,class_name=? WHERE id = ?";
        return BaseDao.update(sql, classes.getClassId(),classes.getClassName(),classes.getId());
    }

    @Override
    public boolean deleteClass(Integer classId) {
        String sql = "DELETE FROM classes WHERE class_id = ?";
        return BaseDao.update(sql,classId);
    }
    @Override
    public boolean deleteSCCTQM(Integer classId) {
        String sql = "DELETE FROM scctqm WHERE class_id = ?";
        return BaseDao.update(sql,classId);
    }
    @Override
    public boolean deleteSIstrue(Integer classId) {
        String sql = "DELETE FROM sistrue WHERE class_id = ?";
        return BaseDao.update(sql,classId);
    }
    @Override
    public boolean deleteStu(Integer classId) {
        String sql = "DELETE FROM students WHERE class_id = ?";
        return BaseDao.update(sql,classId);
    }
    @Override
    public boolean deleteTCC(Integer classId) {
        String sql = "DELETE FROM TCC WHERE class_id = ?";
        return BaseDao.update(sql,classId);
    }
    @Override
    public boolean deleteTeaMark(Integer classId) {
        String sql = "DELETE FROM teamark WHERE class_id = ?";
        return BaseDao.update(sql,classId);
    }
}
