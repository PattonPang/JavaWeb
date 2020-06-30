package zff.dao;

import zff.bean.SCCTQM;
import zff.bean.SIstrue;
import zff.bean.TCC;
import zff.bean.TeaMark;

import java.util.List;

public interface SIstrueDao {
    /**
     * 是否可以评教信息更新为可评教
     * @param sIstrue 更新过的是否可以评教
     * @return true表示修改成功
     */
    public boolean updatet(SIstrue sIstrue);
    /**
     * 是否可以评教信息更新为不可评教
     * @param sIstrue 更新过的是否可以评教
     * @return true表示修改成功
     */
    public boolean updatef(SIstrue sIstrue);
    /**
     * 更新学生的评教信息
     * @param scctqm 更新学生的评教信息
     * @return true表示修改成功
     */
    public boolean updateSCCTQM(SCCTQM scctqm);
    /**
     * 是否可以评教信息更新为不可评教
     * @param sIstrue 更新学生的评教信息
     * @return true表示修改成功
     */
    public boolean updatefStu(SIstrue sIstrue);
    /**
     * 更新分数及其相关数据的更新
     * @param teaMark 更新分数
     * @return true表示修改成功
     */
    public boolean updateTeaMarkq1(TeaMark teaMark);
    public boolean updateTeaMarkq2(TeaMark teaMark);
    public boolean updateTeaMarkq3(TeaMark teaMark);
    public boolean updateTeaMarkq4(TeaMark teaMark);
    public boolean updateTeaMarkq5(TeaMark teaMark);
    public boolean updateTeaMarkqSum(TeaMark teaMark);
    /**
     * 通过TeaMark中的老师id获取分数信息
     * @param teaMark 要查询的老师评教分数
     * @return 一个老师的所有信息
     */
    public List<TeaMark> getBeanListByTea(TeaMark teaMark);
    /**
     * 获取所有老师的分数
     * @return 所有老师的分数
     */
    public List<TeaMark> getBeanListAll();
    /**
     * 老师关系信息及其相关数据的删除
     * @param tcc 要删除的老师关系
     * @return true表示删除成功
     */
    public boolean delTCC(TCC tcc);
    public boolean delSCCTQM(TCC tcc);
    public boolean delSIstrue(TCC tcc);
    public boolean delTeaMark(TCC tcc);
    /**
     * 通过老师id，班级id，课程id获取老师分数
     * @param teaMark 要查询的老师评教分数
     * @return 一个老师一个班级一个课程的分数
     */
    public TeaMark getBeanByTea(TeaMark teaMark);
}
