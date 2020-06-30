package zff.dao.impl;

import zff.bean.SCCTQM;
import zff.bean.SIstrue;
import zff.bean.TCC;
import zff.bean.TeaMark;
import zff.dao.BaseDao;
import zff.dao.SIstrueDao;

import java.util.List;

public class SIstrueDaoImpl implements SIstrueDao {
    @Override
    public boolean updatet(SIstrue sIstrue) {
        String sql = "UPDATE sistrue SET istrue = 1 WHERE class_id = ? AND course_id = ?";
        return BaseDao.update(sql, sIstrue.getClassId(), sIstrue.getCourseId());
    }

    @Override
    public boolean updatef(SIstrue sIstrue) {
        String sql = "UPDATE sistrue SET istrue = 0 WHERE class_id = ? AND course_id = ?";
        return BaseDao.update(sql, sIstrue.getClassId(), sIstrue.getCourseId());
    }

    @Override
    public boolean updateSCCTQM(SCCTQM scctqm) {
        String sql = "UPDATE scctqm SET q1mark = ?,q2mark = ?,q3mark = ?,q4mark = ?,q5mark = ?,q_sum = ? " +
                "WHERE student_id = ? AND class_id = ? AND course_id = ? AND teacher_id = ?";
        return BaseDao.update(sql, scctqm.getQ1mark(), scctqm.getQ2mark(), scctqm.getQ3mark(),
                scctqm.getQ4mark(), scctqm.getQ5mark(), scctqm.getqSum(), scctqm.getStuId(),
                scctqm.getClassId(), scctqm.getCourseId(), scctqm.getTeaId());
    }

    @Override
    public boolean updatefStu(SIstrue sIstrue) {
        String sql = "UPDATE sistrue SET istrue = 0 WHERE student_id = ? " +
                "AND class_id = ? AND course_id = ? AND teacher_id = ?";
        return BaseDao.update(sql, sIstrue.getStuId(),sIstrue.getClassId(), sIstrue.getCourseId(), sIstrue.getTeaId());
    }

    @Override
    public boolean updateTeaMarkq1(TeaMark teaMark) {
        String sql = "UPDATE teamark SET q1mark = " +
                "(SELECT AVG(q1mark) FROM scctqm WHERE class_id = ? AND course_id = ?) " +
                "WHERE class_id = ? AND course_id = ?";
        return BaseDao.update(sql,teaMark.getClassId(),teaMark.getCourseId(),teaMark.getClassId(),teaMark.getCourseId());
    }
    @Override
    public boolean updateTeaMarkq2(TeaMark teaMark) {
        String sql = "UPDATE teamark SET q2mark = " +
                "(SELECT AVG(q2mark) FROM scctqm WHERE class_id = ? AND course_id = ?) " +
                "WHERE class_id = ? AND course_id = ?";
        return BaseDao.update(sql,teaMark.getClassId(),teaMark.getCourseId(),teaMark.getClassId(),teaMark.getCourseId());
    }
    @Override
    public boolean updateTeaMarkq3(TeaMark teaMark) {
        String sql = "UPDATE teamark SET q3mark = " +
                "(SELECT AVG(q3mark) FROM scctqm WHERE class_id = ? AND course_id = ?) " +
                "WHERE class_id = ? AND course_id = ?";
        return BaseDao.update(sql,teaMark.getClassId(),teaMark.getCourseId(),teaMark.getClassId(),teaMark.getCourseId());
    }
    @Override
    public boolean updateTeaMarkq4(TeaMark teaMark) {
        String sql = "UPDATE teamark SET q4mark = " +
                "(SELECT AVG(q4mark) FROM scctqm WHERE class_id = ? AND course_id = ?) " +
                "WHERE class_id = ? AND course_id = ?";
        return BaseDao.update(sql,teaMark.getClassId(),teaMark.getCourseId(),teaMark.getClassId(),teaMark.getCourseId());
    }
    @Override
    public boolean updateTeaMarkq5(TeaMark teaMark) {
        String sql = "UPDATE teamark SET q5mark = " +
                "(SELECT AVG(q5mark) FROM scctqm WHERE class_id = ? AND course_id = ?) " +
                "WHERE class_id = ? AND course_id = ?";
        return BaseDao.update(sql,teaMark.getClassId(),teaMark.getCourseId(),teaMark.getClassId(),teaMark.getCourseId());
    }
    @Override
    public boolean updateTeaMarkqSum(TeaMark teaMark) {
        String sql = "UPDATE teamark SET allmark = " +
                "(SELECT AVG(q_sum) FROM scctqm WHERE class_id = ? AND course_id = ?) " +
                "WHERE class_id = ? AND course_id = ?";
        return BaseDao.update(sql,teaMark.getClassId(),teaMark.getCourseId(),teaMark.getClassId(),teaMark.getCourseId());
    }

    @Override
    public List<TeaMark> getBeanListByTea(TeaMark teaMark) {
        String sql = "SELECT teacher_id AS teaId,class_id AS classId,course_id AS courseId," +
                "q1mark,q2mark,q3mark,q4mark,q5mark,allmark AS allMark FROM teamark WHERE teacher_id = ?";
        return BaseDao.getBeanList(sql,TeaMark.class,teaMark.getTeaId());
    }

    @Override
    public List<TeaMark> getBeanListAll() {
        String sql = "SELECT teacher_id AS teaId,class_id AS classId,course_id AS courseId," +
                "q1mark AS q1Mark,q2mark AS q2Mark,q3mark AS q3Mark,q4mark AS q4Mark,q5mark AS q5Mark," +
                "allmark AS allMark FROM teamark";
        return BaseDao.getBeanList(sql,TeaMark.class);
    }

    @Override
    public boolean delTCC(TCC tcc) {
        String sql = "DELETE FROM tcc WHERE teacher_id = ? AND class_id = ? AND course_id = ?";
        return BaseDao.update(sql,tcc.getTeaId(),tcc.getClassId(),tcc.getCourseId());
    }
    @Override
    public boolean delSCCTQM(TCC tcc) {
        String sql = "DELETE FROM scctqm WHERE teacher_id = ? AND class_id = ? AND course_id = ?";
        return BaseDao.update(sql,tcc.getTeaId(),tcc.getClassId(),tcc.getCourseId());
    }
    @Override
    public boolean delSIstrue(TCC tcc) {
        String sql = "DELETE FROM sistrue WHERE teacher_id = ? AND class_id = ? AND course_id = ?";
        return BaseDao.update(sql,tcc.getTeaId(),tcc.getClassId(),tcc.getCourseId());
    }
    @Override
    public boolean delTeaMark(TCC tcc) {
        String sql = "DELETE FROM teamark WHERE teacher_id = ? AND class_id = ? AND course_id = ?";
        return BaseDao.update(sql,tcc.getTeaId(),tcc.getClassId(),tcc.getCourseId());
    }

    @Override
    public TeaMark getBeanByTea(TeaMark teaMark) {
        String sql = "SELECT teacher_id AS teaId,class_id AS classId,course_id AS courseId," +
                "q1mark AS q1Mark,q2mark AS q2Mark,q3mark AS q3Mark,q4mark AS q4Mark,q5mark AS q5Mark," +
                "allmark AS allMark FROM teamark WHERE teacher_id = ? AND class_id = ? AND course_id = ?";
        return BaseDao.getBean(sql,TeaMark.class,teaMark.getTeaId(),teaMark.getClassId(),teaMark.getCourseId());
    }
}
