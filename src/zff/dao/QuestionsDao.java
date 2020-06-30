package zff.dao;

import zff.bean.Questions;

import java.util.List;

public interface QuestionsDao {
    /**
     * 获取所有的问题
     * @return 所有的课问题
     */
    public List<Questions> getBeanListAll();
    /**
     * 通过问题id获取问题
     * @param id 要查询的问题id
     * @return 一个问题的所有信息
     */
    public Questions getBeanById(Integer id);
    /**
     * 问题更新
     * @param questions 更新过的问题
     * @return true表示修改成功
     */
    public boolean update(Questions questions);
}
