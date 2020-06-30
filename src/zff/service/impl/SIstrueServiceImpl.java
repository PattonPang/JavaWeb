package zff.service.impl;

import zff.bean.SCCTQM;
import zff.bean.SIstrue;
import zff.bean.TCC;
import zff.bean.TeaMark;
import zff.dao.SIstrueDao;
import zff.dao.impl.SIstrueDaoImpl;
import zff.service.SIstrueService;

import java.util.List;

public class SIstrueServiceImpl implements SIstrueService {

    SIstrueDao sIstrueDao = new SIstrueDaoImpl();

    @Override
    public boolean updatet(SIstrue sIstrue) { return sIstrueDao.updatet(sIstrue); }

    @Override
    public boolean updatef(SIstrue sIstrue) { return sIstrueDao.updatef(sIstrue); }

    @Override
    public boolean updateSCCTQM(SCCTQM scctqm) { return sIstrueDao.updateSCCTQM(scctqm); }

    @Override
    public boolean updatefStu(SIstrue sIstrue) {
        return sIstrueDao.updatefStu(sIstrue);
    }

    @Override
    public boolean updateTeaMark(TeaMark teaMark) {
        return (sIstrueDao.updateTeaMarkq1(teaMark)&&
                sIstrueDao.updateTeaMarkq2(teaMark)&&
                sIstrueDao.updateTeaMarkq3(teaMark)&&
                sIstrueDao.updateTeaMarkq4(teaMark)&&
                sIstrueDao.updateTeaMarkq5(teaMark)&&
                sIstrueDao.updateTeaMarkqSum(teaMark)
        );
    }

    @Override
    public List<TeaMark> getBeanListByTea(TeaMark teaMark) { return sIstrueDao.getBeanListByTea(teaMark); }

    @Override
    public List<TeaMark> getBeanListAll() {
        return sIstrueDao.getBeanListAll();
    }

    @Override
    public boolean delTCC(TCC tcc) {
        return (sIstrueDao.delTCC(tcc)&&
                sIstrueDao.delSCCTQM(tcc)&&
                sIstrueDao.delSIstrue(tcc)&&
                sIstrueDao.delTeaMark(tcc)
        );
    }

    @Override
    public TeaMark getBeanByTea(TeaMark teaMark) {
        return sIstrueDao.getBeanByTea(teaMark);
    }
}
