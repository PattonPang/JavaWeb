package zff.dao.impl;

import zff.bean.Questions;
import zff.dao.BaseDao;
import zff.dao.QuestionsDao;

import java.util.List;

public class QuestionsDaoImpl implements QuestionsDao {
    @Override
    public List<Questions> getBeanListAll() {
        String sql = "SELECT id,question,mark20,mark15,mark10,mark5,mark0 FROM questions";
        return BaseDao.getBeanList(sql,Questions.class);
    }

    @Override
    public Questions getBeanById(Integer id) {
        String sql = "SELECT id,question,mark20,mark15,mark10,mark5,mark0 FROM questions WHERE id = ?";
        return BaseDao.getBean(sql,Questions.class,id);
    }

    @Override
    public boolean update(Questions questions) {
        String sql = "UPDATE questions SET question=?,mark20=?,mark15=?,mark10=?,mark5=?,mark0=? WHERE id = ?";
        return BaseDao.update(sql,questions.getQuestion(),questions.getMark20(),questions.getMark15(),questions.getMark10(),questions.getMark5(),questions.getMark0(),questions.getId());
    }
}
