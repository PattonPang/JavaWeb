package zff.service.impl;

import zff.bean.TCC;
import zff.bean.Teachers;
import zff.dao.TeachersDao;
import zff.dao.impl.TeachersDaoImpl;
import zff.service.TeachersService;

import java.util.List;

public class TeachersServiceImpl implements TeachersService {

    TeachersDao teacherDao = new TeachersDaoImpl();

    @Override
    public Teachers login(Teachers teachers) {
        return teacherDao.login(teachers.getUsername(), teachers.getPassWd());
    }

    @Override
    public List<Teachers> getBeanListAll() {
        return teacherDao.getBeanListAll();
    }

    @Override
    public boolean add(Teachers teachers) { return teacherDao.add(teachers); }

    @Override
    public boolean update(Teachers teachers) {
        return teacherDao.update(teachers);
    }

    @Override
    public boolean deleteTeacher(String username) {
        return (teacherDao.deleteTeacher(username)&&
                teacherDao.deleteSIstrue(username)&&
                teacherDao.deleteTCC(username)&&
                teacherDao.deleteTeaMark(username)
        );
    }

    @Override
    public boolean addTCC(TCC tcc) {
        boolean bool = teacherDao.addTCC(tcc);
        if(bool){
            teacherDao.addTeaMark(tcc);
            teacherDao.addSCCTQM(tcc);
            teacherDao.updateSCCTQM(tcc);
            teacherDao.addSIstrue(tcc);
            teacherDao.updateSIstrue(tcc);
        }
        return bool;
    }

}
