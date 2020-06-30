package zff.service.impl;

import zff.bean.Classes;
import zff.dao.ClassesDao;
import zff.dao.impl.ClassesDaoImpl;
import zff.service.ClassesService;

import java.util.List;

public class ClassesServiceImpl implements ClassesService {

    private ClassesDao classesDao = new ClassesDaoImpl();

    @Override
    public List<Classes> getBeanListAll() {
        return classesDao.getBeanListAll();
    }

    @Override
    public boolean add(Classes classes) {
        return classesDao.add(classes);
    }

    @Override
    public boolean update(Classes classes) {
        return classesDao.update(classes);
    }

    @Override
    public boolean deleteClass(Integer classId) {
        return (classesDao.deleteClass(classId)&&
                classesDao.deleteSCCTQM(classId)&&
                classesDao.deleteSIstrue(classId)&&
                classesDao.deleteStu(classId)&&
                classesDao.deleteTCC(classId)&&
                classesDao.deleteTeaMark(classId)
        );
    }
}
