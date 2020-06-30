package zff.service.impl;

import zff.bean.Questions;
import zff.dao.QuestionsDao;
import zff.dao.impl.QuestionsDaoImpl;
import zff.service.QuestionsService;

import java.util.List;

public class QuestionsServiceImpl implements QuestionsService {
    QuestionsDao questionsDao = new QuestionsDaoImpl();
    @Override
    public List<Questions> getBeanListAll() {
        return questionsDao.getBeanListAll();
    }

    @Override
    public boolean update(Questions questions) {
        return questionsDao.update(questions);
    }
}
