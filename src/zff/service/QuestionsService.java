package zff.service;

import zff.bean.Classes;
import zff.bean.Questions;

import java.util.List;

public interface QuestionsService {
    /**
     * 获取所有的问题
     * @return 所有的课问题
     */
    public List<Questions> getBeanListAll();
    /**
     * 问题更新
     * @param questions 更新过的问题
     * @return true表示修改成功
     */
    public boolean update(Questions questions);
}
