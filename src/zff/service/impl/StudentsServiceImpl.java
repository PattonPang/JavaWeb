package zff.service.impl;

import zff.bean.SIstrue;
import zff.bean.Students;
import zff.dao.StudentsDao;
import zff.dao.impl.StudentsDaoImpl;
import zff.service.StudentsService;

import java.util.List;

public class StudentsServiceImpl implements StudentsService {

    StudentsDao studentsDao = new StudentsDaoImpl();

    @Override
    public Students login(Students students) {
        return studentsDao.login(students.getUsername(), students.getPassWd());
    }

    @Override
    public boolean register(Students students){
        return studentsDao.register(students);
    }

    @Override
    public List<Students> getBeanListAll() {
        return studentsDao.getBeanListAll();
    }

    @Override
    public Students getBeanById(Integer id) { return studentsDao.getBeanById(id); }

    @Override
    public boolean add(Students students) { return studentsDao.add(students); }

    @Override
    public boolean update(Students students) { return studentsDao.update(students); }

    @Override
    public boolean deleteStu(String username) {
        return (studentsDao.deleteStu(username)&&
                studentsDao.deleteSCCTQM(username)&&
                studentsDao.deleteSIstrue(username)
        );
    }

    @Override
    public List<SIstrue> getBeanIsListAll(String username) { return studentsDao.getBeanIsListAll(username); }

}
